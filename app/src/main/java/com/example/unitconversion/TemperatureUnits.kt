package com.example.unitconversion

class TemperatureUnits: Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {
        if (fromUnit == "Celsius" && toUnit == "Celsius") {
            return inputValue
        } else if (fromUnit == "Celsius" && toUnit == "Fahrenheit") {
            return inputValue * (9 / 5) + 32
        } else if (fromUnit == "Celsius" && toUnit == "Kelvin") {
            return inputValue + 273.15
        } else if (fromUnit == "Fahrenheit" && toUnit == "Celsius") {
            return ((inputValue - 32) * (5 / 9))
        } else if (fromUnit == "Fahrenheit" && toUnit == "Fahrenheit") {
            return inputValue
        } else if (fromUnit == "Fahrenheit" && toUnit == "Kelvin") {
            return (((inputValue - 32) * (5 / 9)) + 273.15)
        } else if (fromUnit == "Kelvin" && toUnit == "Celsius") {
            return inputValue - 273.15
        } else if (fromUnit == "Kelvin" && toUnit == "Fahrenheit") {
            return (inputValue - 273.15) * (9 / 5) + 32
        } else if (fromUnit == "Kelvin" && toUnit == "Kelvin") {
            return inputValue
        }
        return 0.0
    }

}