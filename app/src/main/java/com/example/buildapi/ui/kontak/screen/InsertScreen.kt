package com.example.buildapi.ui.kontak.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.buildapi.ui.kontak.viewmodel.InsertUiEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
    insertUiEvent: InsertUiEvent,
    modifier: Modifier,
    onValueChange: (InsertUiEvent) -> Unit = {},
    enabled: Boolean = true
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedTextField(
            value = insertUiEvent.nama,
            onValueChange = {onValueChange(insertUiEvent.copy(nama = it)) },
            label ={ Text(text = "Nama")},
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true,
            )
        OutlinedTextField(
            value = insertUiEvent.email,
            onValueChange = {onValueChange(insertUiEvent.copy(email = it)) },
            label ={ Text(text = "Email")},
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true,
        )
        OutlinedTextField(
            value = insertUiEvent.nohp,
            onValueChange = {onValueChange(insertUiEvent.copy(nohp = it)) },
            label ={ Text(text = "No HP")},
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true,
        )

}
}