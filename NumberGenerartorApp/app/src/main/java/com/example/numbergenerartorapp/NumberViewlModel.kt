package com.example.numbergenerartorapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlin.random.Random

class NumberViewlModel : ViewModel() {
    private val _uiState = MutableStateFlow<NumberState>(NumberState.Idle)
    val uiState: StateFlow<NumberState> = _uiState

    fun generateRandomNumber() {
        _uiState.value = NumberState.Loading

        viewModelScope.launch {
            try {
                delay(2000)
                if (Random.nextBoolean()) {
                    val number = Random.nextInt(0, 100)
                    _uiState.value = NumberState.Success(number)
                } else {
                    throw Exception("Erro ao gerar número!")
                }
            } catch (e: Exception) {
                _uiState.value = NumberState.Error(e.message ?: "Erro desconhecido")
            }
        }
    }

    fun reset() {
        _uiState.value = NumberState.Idle
    }
}