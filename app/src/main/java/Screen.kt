package com.example.unidad1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BanderaItalia() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (verde, blanco, rojo) = createRefs()

        Box(
            modifier = Modifier
                .background(Color(0xFF009246))
                .constrainAs(verde) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(blanco.start)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(blanco) {
                    start.linkTo(verde.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(rojo.start)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color(0xFFCE2B37))
                .constrainAs(rojo) {
                    start.linkTo(blanco.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )
    }
}