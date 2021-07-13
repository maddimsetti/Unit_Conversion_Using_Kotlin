package com.example.unitconversion

const val TONNE_TO_KILOGRAM = 1000
const val TONNE_TO_GRAM = 1e+6
const val TONNE_TO_MILLIGRAM = 1e+9

const val KILOGRAM_TO_GRAM = 1000
const val KILOGRAM_TO_MILLIGRAM = 1e+6

const val GRAM_TO_MILLIGRAM = 1000

class MassUnits: Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {
        if (fromUnit == "Tonne" && toUnit == "Tonne") {
            return inputValue
        } else if (fromUnit == "Tonne" && toUnit == "Kilogram") {
            return inputValue * TONNE_TO_KILOGRAM
        } else if (fromUnit == "Tonne" && toUnit == "Gram") {
            return inputValue * TONNE_TO_GRAM
        } else if (fromUnit == "Tonne" && toUnit == "Milligram") {
            return inputValue * TONNE_TO_MILLIGRAM
        } else if (fromUnit == "Kilogram" && toUnit == "Tonne") {
            return inputValue / TONNE_TO_KILOGRAM
        } else if (fromUnit == "Kilogram" && toUnit == "Kilogram") {
            return inputValue
        } else if (fromUnit == "Kilogram" && toUnit == "Gram") {
            return inputValue * KILOGRAM_TO_GRAM
        } else if (fromUnit == "Kilogram" && toUnit == "Milligram") {
            return inputValue * KILOGRAM_TO_MILLIGRAM
        } else if (fromUnit == "Gram" && toUnit == "Tonne") {
            return inputValue / TONNE_TO_GRAM
        } else if (fromUnit == "Gram" && toUnit == "Kilogram") {
            return inputValue / KILOGRAM_TO_GRAM
        } else if (fromUnit == "Gram" && toUnit == "Gram") {
            return inputValue
        } else if (fromUnit == "Gram" && toUnit == "Milligram") {
            return inputValue * GRAM_TO_MILLIGRAM
        } else if (fromUnit == "Milligram" && toUnit == "Tonne") {
            return inputValue / TONNE_TO_MILLIGRAM
        } else if (fromUnit == "Milligram" && toUnit == "Kilogram") {
            return inputValue / KILOGRAM_TO_MILLIGRAM
        } else if (fromUnit == "Milligram" && toUnit == "Gram") {
            return inputValue / GRAM_TO_MILLIGRAM
        } else if (fromUnit == "Milligram" && toUnit == "Milligram") {
            return inputValue
        }
        return 0.0
    }

}