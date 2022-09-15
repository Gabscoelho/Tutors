package br.com.fiap.tutors.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SeachBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = null
            )
        },
        placeholder = { Text(text = "Pesquisar um Tutors...") },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface
        ),
        onValueChange = {},
        modifier = modifier
            .heightIn(min = 56.dp)
            .fillMaxWidth()
    )
}

@Preview
@Composable
private fun SearchBarPreview() {
    SeachBar()
}