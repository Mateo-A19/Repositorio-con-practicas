package com.example.unidad1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun SpidermanPixelArt() {
    val r = Color(0xFFE23636)
    val a = Color(0xFF2B4C7E)
    val n = Color.Black
    val b = Color.White
    val t = Color.Transparent

    val m = listOf(
        listOf(t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t),
        listOf(t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t),
        listOf(t, t, t, t, t, t, t, n, n, n, n, n, n, n, t, t, t, t, t, t, t),
        listOf(t, t, t, t, t, n, n, r, r, r, r, r, r, r, n, n, t, t, t, t, t),
        listOf(t, t, t, t, n, r, r, r, r, r, r, r, r, r, r, r, n, t, t, t, t),
        listOf(t, t, t, t, n, r, r, r, r, r, r, r, r, r, r, r, n, t, t, t, t),
        listOf(t, t, t, n, r, n, n, r, r, r, r, r, r, r, n, n, r, n, t, t, t),
        listOf(t, t, t, n, n, b, b, n, r, r, r, r, r, n, b, b, n, n, t, t, t),
        listOf(t, t, t, n, b, b, b, b, n, r, r, r, n, b, b, b, b, n, t, t, t),
        listOf(t, t, t, n, b, b, b, b, b, n, r, n, b, b, b, b, b, n, t, t, t),
        listOf(t, t, t, n, b, b, b, b, b, b, n, b, b, b, b, b, b, n, t, t, t),
        listOf(t, t, t, n, b, b, b, b, b, b, n, b, b, b, b, b, b, n, t, t, t),
        listOf(t, t, t, t, n, n, b, b, b, n, r, n, b, b, b, n, n, t, t, t, t),
        listOf(t, t, t, t, n, r, n, n, n, r, r, r, n, n, n, r, n, t, t, t, t),
        listOf(t, t, t, t, t, n, r, r, r, r, r, r, r, r, r, n, t, t, t, t, t),
        listOf(t, t, t, t, t, t, n, n, r, r, r, r, r, n, n, t, t, t, t, t, t),
        listOf(t, t, t, t, t, n, r, r, n, n, n, n, n, r, r, n, t, t, t, t, t),
        listOf(t, t, t, t, n, r, r, r, n, r, n, r, n, r, r, r, n, t, t, t, t),
        listOf(t, t, t, n, a, a, n, a, r, n, n, n, r, a, n, a, a, n, t, t, t),
        listOf(t, t, n, r, r, a, n, a, n, r, n, r, n, a, n, a, r, r, n, t, t),
        listOf(t, t, n, r, r, n, n, r, r, r, r, r, r, r, n, n, r, r, n, t, t),
        listOf(t, t, t, n, n, t, n, a, a, a, a, a, a, a, n, t, n, n, t, t, t),
        listOf(t, t, t, t, t, n, a, a, a, a, a, a, a, a, a, n, t, t, t, t, t),
        listOf(t, t, t, t, t, n, a, a, a, n, n, n, a, a, a, n, t, t, t, t, t),
        listOf(t, t, t, t, n, n, r, r, n, t, t, t, n, r, r, n, n, t, t, t, t),
        listOf(t, t, t, t, n, r, r, r, n, t, t, t, n, r, r, r, n, t, t, t, t),
        listOf(t, t, t, t, n, n, n, n, n, t, t, t, n, n, n, n, n, t, t, t, t),
        listOf(t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t),
        listOf(t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t)
    )

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
    ) {
        val refs = mutableListOf<androidx.constraintlayout.compose.ConstrainedLayoutReference>()
        repeat(m.size * m[0].size) { refs.add(createRef()) }

        var i = 0
        repeat(m.size) { row ->
            repeat(m[row].size) { col ->
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .background(m[row][col])
                        .constrainAs(refs[i]) {
                            start.linkTo(parent.start, margin = (50 + col * 20).dp)
                            top.linkTo(parent.top, margin = (100 + row * 20).dp)
                        }
                )
                i++
            }
        }
    }
}