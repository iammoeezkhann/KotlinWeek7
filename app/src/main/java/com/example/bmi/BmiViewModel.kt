package com.example.bmi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {
    var heightInput by mutableStateOf("")


    var weightInput by mutableStateOf("")

    var bmi: Double = 0.0
        private set

    fun updateHeightInput(input: String) {
        heightInput = input
        calculateBmi()
    }

    fun updateWeightInput(input: String) {
        weightInput = input
        calculateBmi()
    }

    private fun calculateBmi() {
        val height = heightInput.toFloatOrNull() ?: 0.0f
        val weight = weightInput.toIntOrNull() ?: 0
        bmi = if (weight * height > 0 ) (weight / (height * height)).toDouble() else 0.0
    }
}

