package com.example.genshincharacterusingcompose.model

data class Character(
    val id: String,
    val name: String,
    val photoUrl: String,
    val star: String,
    val element: String,
    val weapon: String,
    val description: String,
)