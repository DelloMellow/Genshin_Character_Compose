package com.example.genshincharacterusingcompose.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.genshincharacterusingcompose.R
import com.example.genshincharacterusingcompose.model.Character

@Composable
fun CharacterDetailScreen(
    character: Character
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = rememberAsyncImagePainter(character.photoUrl),
            contentDescription = stringResource(id = R.string.character_image),
            modifier = Modifier
                .size(200.dp)
                .align(CenterHorizontally)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = character.name,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            modifier = Modifier.align(CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Rarity: ${character.star}",
            fontSize = 17.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Element: ${character.element}",
            fontSize = 17.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Weapon: ${character.weapon}",
            fontSize = 17.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = character.description,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}
