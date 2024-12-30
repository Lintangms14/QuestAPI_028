package com.example.questapi.ui.view

import com.example.questapi.ui.navigasi.DestinasiNavigasi

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = "Detail Data Mahasiswa"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}