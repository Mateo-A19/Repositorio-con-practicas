package com.example.unidad1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BanderaChile() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (azul, blanco, rojo, estrella) = createRefs()

        Box(
            modifier = Modifier
                .background(Color(0xFF0039A6))
                .constrainAs(azul) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(rojo.top)
                    end.linkTo(blanco.start)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(blanco) {
                    start.linkTo(azul.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(rojo.top)
                    end.linkTo(parent.end)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color(0xFFD52B1E))
                .constrainAs(rojo) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    verticalBias = 1f
                }
        )

        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Estrella",
            tint = Color.White,
            modifier = Modifier
                .size(60.dp)
                .constrainAs(estrella) {
                    start.linkTo(azul.start)
                    top.linkTo(azul.top)
                    bottom.linkTo(azul.bottom)
                    end.linkTo(azul.end)
                }
        )
    }
}