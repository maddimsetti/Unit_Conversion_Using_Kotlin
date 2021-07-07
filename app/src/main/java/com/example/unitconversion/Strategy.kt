package com.example.unitconversion

interface Strategy {
    fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double
}