package com.example.unidad1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val lista = ListaDeContarBilletes()

        val billete20 = Billete(20.0, R.drawable.billete20, "MXN")
        val billete50 = Billete(50.0, R.drawable.billete50, "MXN")
        val billete100 = Billete(100.0, R.drawable.billete100, "MXN")
        val billete200 = Billete(200.0, R.drawable.billete200, "MXN")
        val billete500 = Billete(500.0, R.drawable.billete500, "MXN")
        val billete1000 = Billete(1000.0, R.drawable.billete1000, "MXN")

        lista.agregarBillete(CantidadBillete(3, billete20))
        lista.agregarBillete(CantidadBillete(5, billete50))
        lista.agregarBillete(CantidadBillete(2, billete100))
        lista.agregarBillete(CantidadBillete(1, billete200))
        lista.agregarBillete(CantidadBillete(4, billete500))
        lista.agregarBillete(CantidadBillete(2, billete1000))

        val total = lista.calcularTotal()
        val cantidad = CantidadBillete(5, billete100)

        lista.agregarBillete(cantidad)
        val totalActualizado = lista.calcularTotal()
    }
}