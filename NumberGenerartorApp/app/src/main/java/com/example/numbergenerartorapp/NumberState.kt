package com.example.numbergenerartorapp

sealed class NumberState {
    object Idle : NumberState()
    object Loading : NumberState()
    data class Success(val number: Int) : NumberState()
    data class Error(val message: String) : NumberState()
}
