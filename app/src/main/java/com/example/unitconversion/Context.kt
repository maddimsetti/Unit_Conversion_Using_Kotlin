package com.example.unitconversion

class Context(strategy: Strategy) {
    private val strategy: Strategy = TODO()

    fun exceuteStrategy(fromUnit:String, toUnit: String, inputValue: Double): Double {
            var result: Double = strategy.convert(fromUnit, toUnit, inputValue)
            return result
        }
}