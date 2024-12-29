package com.example.questapi.ui.viewmodel

import com.example.questapi.model.Mahasiswa

sealed class HomeUiState{
    data class Succes(val mahasiswa: List<Mahasiswa>): HomeUiState()
    object Error: HomeUiState()
    object Loading: HomeUiState()
}