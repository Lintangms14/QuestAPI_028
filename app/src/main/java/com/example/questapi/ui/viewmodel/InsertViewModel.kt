package com.example.questapi.ui.viewmodel

data class InsertUiEvent(
    val nim: String = "",
    val nama: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val kelas: String = "",
    val angkatan: String = "",
)

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent()
)