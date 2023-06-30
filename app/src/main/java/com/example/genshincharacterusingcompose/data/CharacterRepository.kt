package com.example.genshincharacterusingcompose.data

import com.example.genshincharacterusingcompose.model.Character
import com.example.genshincharacterusingcompose.model.CharacterData

class CharacterRepository {
    fun getCharacters(): List<Character> {
        return CharacterData.characters
    }

    fun searchCharacters(query: String): List<Character> {
        return CharacterData.characters.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}