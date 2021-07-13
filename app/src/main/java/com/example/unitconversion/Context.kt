package com.example.unitconversion

class Context(private val strategy: Strategy) {

    fun executeStrategy(fromUnit: String, toUnit: String, inputValue: Double): Double {
        return strategy.convert(fromUnit, toUnit, inputValue)
    }
}