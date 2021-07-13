package com.example.unitconversion

const val LITRE_TO_MILLITRE = 1000

class VolumeUnits: Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {
        if (fromUnit == "Liter" && toUnit == "Liter") {
            return inputValue
        } else if (fromUnit == "Liter" && toUnit == "Milliliter") {
            return inputValue * LITRE_TO_MILLITRE
        } else if (fromUnit == "Milliliter" && toUnit == "Liter") {
            return inputValue / LITRE_TO_MILLITRE
        } else if (fromUnit == "Milliliter" && toUnit == "Milliliter") {
            return inputValue
        }
        return 0.0
    }

}