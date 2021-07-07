package com.example.unitconversion

class LengthUnits : Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {

        if(fromUnit == "Kilometre" && toUnit == "Kilometre") {
            return inputValue
        } else if (fromUnit == "Kilometre" && toUnit == "Meter") {
            return inputValue * 1000
        } else if (fromUnit == "Kilometre" && toUnit == "Centimetre") {
            return inputValue * 100000
        } else if (fromUnit == "Kilometre" && toUnit == "Millimetre") {
            return inputValue * 1e+6
        } else if (fromUnit == "Kilometre" && toUnit == "Foot") {
            return inputValue * 3281
        } else if (fromUnit == "Kilometre" && toUnit == "Inch") {
            return inputValue * 39370
        } else if (fromUnit == "Meter" && toUnit == "Meter") {
            return inputValue
        } else if (fromUnit == "Meter" && toUnit == "Kilometer") {
            return inputValue / 1000
        } else if (fromUnit == "Meter" && toUnit == "Centimetre") {
            return inputValue * 100
        } else if (fromUnit == "Meter" && toUnit == "Millimetre") {
            return inputValue * 1000
        } else if (fromUnit == "Meter" && toUnit == "Foot") {
            return inputValue * 3.281
        } else if (fromUnit == "Meter" && toUnit == "Inch") {
            return inputValue * 39.37
        } else if (fromUnit == "Centimetre" && toUnit == "Kilometre") {
            return inputValue / 100000
        } else if (fromUnit == "Centimetre" && toUnit == "Meter") {
            return inputValue * 100
        } else if (fromUnit == "Centimetre" && toUnit == "Centimetre") {
            return inputValue
        } else if (fromUnit == "Centimetre" && toUnit == "Millimetre") {
            return inputValue * 10
        } else if (fromUnit == "Centimetre" && toUnit == "Foot") {
            return inputValue * 30.48
        } else if (fromUnit == "Centimetre" && toUnit == "Inch") {
            return inputValue * 2.54
        } else if (fromUnit == "Millimetre" && toUnit == "Kilometre") {
            return inputValue / 1e+6
        } else if (fromUnit == "Millimetre" && toUnit == "Meter") {
            return inputValue / 1000
        } else if (fromUnit == "Millimetre" && toUnit == "Centimetre") {
            return inputValue / 10
        } else if (fromUnit == "Millimetre" && toUnit == "Millimetre") {
            return inputValue
        } else if (fromUnit == "Millimetre" && toUnit == "Foot") {
            return inputValue / 30.48
        } else if (fromUnit == "Millimetre" && toUnit == "Inch") {
            return inputValue / 2.54
        } else if (fromUnit == "Foot" && toUnit == "Kilometre") {
            return inputValue / 3281
        } else if (fromUnit == "Foot" && toUnit == "Meter") {
            return inputValue / 3.281
        } else if (fromUnit == "Foot" && toUnit == "Centimetre") {
            return inputValue * 30.48
        } else if (fromUnit == "Foot" && toUnit == "Millimetre") {
            return inputValue * 305
        } else if (fromUnit == "Foot" && toUnit == "Foot") {
            return inputValue
        } else if (fromUnit == "Foot" && toUnit == "Inch") {
            return inputValue * 12
        } else if (fromUnit == "Inch" && toUnit == "Kilometre") {
            return inputValue / 5.085e-5
        } else if (fromUnit == "Inch" && toUnit == "Meter") {
            return inputValue / 0.0508
        } else if (fromUnit == "Inch" && toUnit == "Centimetre") {
            return inputValue * 2.54
        } else if (fromUnit == "Inch" && toUnit == "Millimetre") {
            return inputValue * 25.4
        } else if (fromUnit == "Inch" && toUnit == "Foot") {
            return inputValue / 0.166667
        } else if (fromUnit == "Inch" && toUnit == "Inch") {
            return inputValue
        }
        return 0.0
    }
}