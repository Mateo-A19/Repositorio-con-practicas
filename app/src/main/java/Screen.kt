package com.example.unidad1

class ListaDeContarBilletes {
    private val listaBilletes = mutableListOf<CantidadBillete>()

    fun agregarBillete(cantidadBillete: CantidadBillete) {
        listaBilletes.add(cantidadBillete)
    }

    fun obtenerLista(): List<CantidadBillete> {
        return listaBilletes.toList()
    }

    fun limpiarLista() {
        listaBilletes.clear()
    }

    fun calcularTotal(): Double {
        return listaBilletes.sumOf { it.cantidad * it.billete.valor }
    }
}
