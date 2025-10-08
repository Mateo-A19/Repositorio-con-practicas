package com.example.unidad1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BanderaBrasil() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (fondo, rombo, circulo) = createRefs()

        Box(
            modifier = Modifier
                .background(Color(0xFF009739))
                .constrainAs(fondo) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .size(300.dp, 200.dp)
                .rotate(0f)
                .background(Color(0xFFFEDF00))
                .constrainAs(rombo) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color(0xFF002776))
                .constrainAs(circulo) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                }
        )
    }
}
