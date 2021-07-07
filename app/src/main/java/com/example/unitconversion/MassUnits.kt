package com.example.unitconversion

class MassUnits: Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {
        if (fromUnit == "Tonne" && toUnit == "Tonne") {
            return inputValue
        } else if (fromUnit == "Tonne" && toUnit == "Kilogram") {
            return inputValue * 1000
        } else if (fromUnit == "Tonne" && toUnit == "Gram") {
            return inputValue * 1e+6
        } else if (fromUnit == "Tonne" && toUnit == "Milligram") {
            return inputValue * 1e+9
        } else if (fromUnit == "Kilogram" && toUnit == "Tonne") {
            return inputValue / 1000
        } else if (fromUnit == "Kilogram" && toUnit == "Kilogram") {
            return inputValue
        } else if (fromUnit == "Kilogram" && toUnit == "Gram") {
            return inputValue * 1000
        } else if (fromUnit == "Kilogram" && toUnit == "Milligram") {
            return inputValue * 1e+6
        } else if (fromUnit == "Gram" && toUnit == "Tonne") {
            return inputValue / 1e+6
        } else if (fromUnit == "Gram" && toUnit == "Kilogram") {
            return inputValue / 1000
        } else if (fromUnit == "Gram" && toUnit == "Gram") {
            return inputValue
        } else if (fromUnit == "Gram" && toUnit == "Milligram") {
            return inputValue * 1000
        } else if (fromUnit == "Milligram" && toUnit == "Tonne") {
            return inputValue / 1e+9
        } else if (fromUnit == "Milligram" && toUnit == "Kilogram") {
            return inputValue / 1e+6
        } else if (fromUnit == "Milligram" && toUnit == "Gram") {
            val result = inputValue / 0.001
            return inputValue
        } else if (fromUnit == "Milligram" && toUnit == "Milligram") {
            return inputValue
        }
        return 0.0
    }

}