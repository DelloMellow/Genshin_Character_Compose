package com.example.genshincharacterusingcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.genshincharacterusingcompose.model.Character
import com.example.genshincharacterusingcompose.ui.screen.detail.CharacterDetailScreen

@Composable
fun GenshinCharacterDetail(

) {
    val mContext = LocalContext.current
    val intent = (mContext as DetailActivity).intent
    val id = intent.getStringExtra("id")
    val name = intent.getStringExtra("name")
    val photoUrl = intent.getStringExtra("photoUrl")
    val star = intent.getStringExtra("star")
    val element = intent.getStringExtra("element")
    val weapon = intent.getStringExtra("weapon")
    val description = intent.getStringExtra("description")
    CharacterDetailScreen(character = Character(id!!, name!!, photoUrl!!, star!!, element!! ,weapon!!, description!!))
}