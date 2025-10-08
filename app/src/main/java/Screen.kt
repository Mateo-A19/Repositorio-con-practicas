package com.example.unidad1

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Banderacuba() {
    val azulCubano = Color(0xFF002A8F)
    val rojoCubano = Color(0xFFCF142B)
    val franjaHeight = 40.dp

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(franjaHeight)
                    .background(azulCubano)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(franjaHeight)
                    .background(Color.White)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(franjaHeight)
                    .background(azulCubano)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(franjaHeight)
                    .background(Color.White)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(franjaHeight)
                    .background(azulCubano)
            )
        }

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {

            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width * 0.4f, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }

            drawPath(
                path = trianglePath,
                color = rojoCubano
            )

            val centerX = size.width * 0.15f
            val centerY = size.height / 2f
            val starRadius = 30f

            drawStar(
                centerX = centerX,
                centerY = centerY,
                radius = starRadius,
                color = Color.White
            )
        }
    }
}
private fun DrawScope.drawStar(
    centerX: Float,
    centerY: Float,
    radius: Float,
    color: Color
) {
    val path = Path()
    val numPoints = 5
    val outerRadius = radius
    val innerRadius = radius * 0.4f

    for (i in 0 until numPoints * 2) {
        val angle = i * PI / numPoints - PI / 2
        val currentRadius = if (i % 2 == 0) outerRadius else innerRadius
        val x = centerX + (currentRadius * cos(angle)).toFloat()
        val y = centerY + (currentRadius * sin(angle)).toFloat()

        if (i == 0) {
            path.moveTo(x, y)
        } else {
            path.lineTo(x, y)
        }
    }
    path.close()

    drawPath(path = path, color = color)
}