package com.example.questapi.ui.viewmodel

import com.example.questapi.model.Mahasiswa

sealed class DetailUiState {
    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
    object Error : DetailUiState()
    object Loading : DetailUiState()
}

