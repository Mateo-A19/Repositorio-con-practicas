package com.example.unidad1

<<<<<<< HEAD
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
=======
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
>>>>>>> 18486cdabd6f1b0045c126492d7b17944f94c457
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
<<<<<<< HEAD
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
=======
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
>>>>>>> 18486cdabd6f1b0045c126492d7b17944f94c457
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
