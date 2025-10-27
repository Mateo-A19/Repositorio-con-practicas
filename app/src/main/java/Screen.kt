package com.example.unidad1

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConversorTemperatura() {
    var input by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Ingresa la temperatura") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                val celsius = input.toDoubleOrNull()
                resultado = if (celsius != null) {
                    val fahrenheit = (celsius * 9 / 5) + 32
                    "${celsius}°C = ${fahrenheit}°F"
                } else {
                    "Ingresa un numero valido"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Celsius a Fahrenheit")
        }

        Button(
            onClick = {
                val fahrenheit = input.toDoubleOrNull()
                resultado = if (fahrenheit != null) {
                    val celsius = (fahrenheit - 32) * 5 / 9
                    "${fahrenheit}°F = ${celsius}°C"
                } else {
                    "Ingresa un numero valido"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Fahrenheit a Celsius")
        }

        Text(
            text = resultado
        )
    }
}
