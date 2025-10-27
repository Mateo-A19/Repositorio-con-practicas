package com.example.unidad1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Suma() {
    var numero1 by remember { mutableStateOf("") }
    var numero2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            TextField(
                value = numero1,
                onValueChange = { numero1 = it },
                label = { Text("Número 1") },
                singleLine = true,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.8f)
            )

            TextField(
                value = numero2,
                onValueChange = { numero2 = it },
                label = { Text("Número 2") },
                singleLine = true,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(0.8f)
            )

            Button(
                onClick = {
                    val n1 = numero1.toIntOrNull()
                    val n2 = numero2.toIntOrNull()
                    resultado = if (n1 != null && n2 != null) {
                        (n1 + n2).toString()
                    } else {
                        "Ingrese números válidos"
                    }
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Sumar")
            }

            if (resultado.isNotEmpty()) {
                Text(
                    text = "Resultado: $resultado",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}
