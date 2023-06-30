package com.example.genshincharacterusingcompose

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.genshincharacterusingcompose.data.CharacterRepository
import com.example.genshincharacterusingcompose.model.Character
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GenshinCharacterViewModel(private val repository: CharacterRepository): ViewModel() {

    private val _groupedCharacters = MutableStateFlow(
        repository.getCharacters()
            .sortedBy { it.name }
            .groupBy { it.name[0] }
    )
    val groupedCharacter: StateFlow<Map<Char, List<Character>>> get() = _groupedCharacters

    private val _query = mutableStateOf("")
    val query: State<String> get() = _query
    fun search(newQuery: String) {
        _query.value = newQuery
        _groupedCharacters.value = repository.searchCharacters(_query.value)
            .sortedBy { it.name }
            .groupBy { it.name[0] }
    }

    class ViewModelFactory(private val repository: CharacterRepository) :
        ViewModelProvider.NewInstanceFactory() {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(GenshinCharacterViewModel::class.java)) {
                return GenshinCharacterViewModel(repository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}