package com.example.unidad1

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun Banderabrazil() {
    val verdeBrasil = Color(0xFF009B3A)
    val amarilloBrasil = Color(0xFFFFDF00)
    val azulBrasil = Color(0xFF002776)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(verdeBrasil)
    ) {
        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            val centerX = size.width / 2f
            val centerY = size.height / 2f
            val romboWidth = size.width * 0.7f
            val romboHeight = size.height * 0.55f

            val romboPath = Path().apply {
                moveTo(centerX, centerY - romboHeight / 2f) // Arriba
                lineTo(centerX + romboWidth / 2f, centerY) // Derecha
                lineTo(centerX, centerY + romboHeight / 2f) // Abajo
                lineTo(centerX - romboWidth / 2f, centerY) // Izquierda
                close()
            }

            drawPath(
                path = romboPath,
                color = amarilloBrasil
            )

            val circleRadius = size.height * 0.15f
            drawCircle(
                color = azulBrasil,
                radius = circleRadius,
                center = size.center
            )
        }
    }
}