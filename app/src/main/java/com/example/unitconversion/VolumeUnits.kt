package com.example.unitconversion

class VolumeUnits: Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {
        if (fromUnit == "Liter" && toUnit == "Liter") {
            return inputValue
        } else if (fromUnit == "Liter" && toUnit == "Milliliter") {
            return inputValue * 1000
        } else if (fromUnit == "Milliliter" && toUnit == "Liter") {
            return inputValue / 1000
        } else if (fromUnit == "Milliliter" && toUnit == "Milliliter") {
            return inputValue
        }
        return 0.0
    }

}