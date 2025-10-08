package com.example.unidad1

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
fun Banderachile() {
    val azulChile = Color(0xFF0052A3)
    val rojoChile = Color(0xFFD52B1E)
    val franjaHeight = 67.dp

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column {

            Row(
                modifier = Modifier.height(franjaHeight)
            ) {
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .fillMaxHeight()
                        .background(azulChile)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color.White)
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(franjaHeight)
                    .background(rojoChile)
            )
        }

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            val centerX = 60.dp.toPx()
            val centerY = 33.5.dp.toPx()
            val starRadius = 20f

            drawStar(
                centerX = centerX,
                centerY = centerY,
                radius = starRadius,
                color = Color.White
            )
        }
    }
}

fun DrawScope.drawStar(
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