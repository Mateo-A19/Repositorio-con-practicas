package com.example.unidad1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Suma() {
    var numero1 by remember { mutableStateOf("") }
    var numero2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            TextField(
                value = numero1,
                onValueChange = { numero1 = it },
                label = { Text("Número 1") },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.8f)
            )

            TextField(
                value = numero2,
                onValueChange = { numero2 = it },
                label = { Text("Número 2") },
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.8f)
            )

            Button(
                onClick = {
                    val n1 = numero1.toIntOrNull() ?: 0
                    val n2 = numero2.toIntOrNull() ?: 0
                    resultado = n1 + n2
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Sumar")
            }

            Text(text = "Resultado: $resultado", modifier = Modifier.padding(8.dp))
        }
    }
}
