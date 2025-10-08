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
fun BanderaCuba() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (franja1, franja2, franja3, franja4, franja5, triangulo, estrella) = createRefs()

        Box(
            modifier = Modifier
                .background(Color(0xFF002A8F))
                .constrainAs(franja1) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(franja2.top)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(franja2) {
                    start.linkTo(parent.start)
                    top.linkTo(franja1.bottom)
                    end.linkTo(parent.end)
                    bottom.linkTo(franja3.top)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color(0xFF002A8F))
                .constrainAs(franja3) {
                    start.linkTo(parent.start)
                    top.linkTo(franja2.bottom)
                    end.linkTo(parent.end)
                    bottom.linkTo(franja4.top)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(franja4) {
                    start.linkTo(parent.start)
                    top.linkTo(franja3.bottom)
                    end.linkTo(parent.end)
                    bottom.linkTo(franja5.top)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color(0xFF002A8F))
                .constrainAs(franja5) {
                    start.linkTo(parent.start)
                    top.linkTo(franja4.bottom)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color(0xFFCE1126))
                .constrainAs(triangulo) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = androidx.constraintlayout.compose.Dimension.value(200.dp)
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Estrella",
            tint = Color.White,
            modifier = Modifier
                .size(70.dp)
                .constrainAs(estrella) {
                    start.linkTo(triangulo.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(triangulo.end)
                }
        )
    }
}