package com.example.unitconversion

const val KILOMETRE_TO_METRE = 1000
const val KILOMETRE_TO_CENTIMETRE = 100000
const val KILOMETRE_TO_MILLIMETRE = 1e+6
const val KILOMETRE_TO_FOOT = 3281
const val KILOMETRE_TO_INCH = 39370

const val METER_TO_CENTIMETRE = 100
const val METER_TO_MILLIMETRE = 1000
const val METER_TO_FOOT = 3.281
const val METER_TO_INCH = 39.37

const val FOOT_TO_CENTIMETRE = 30.48
const val FOOT_TO_MILLIMETRE = 305
const val FOOT_TO_INCH = 12

const val INCH_TO_CENTIMETRE = 2.54
const val INCH_TO_MILLIMETRE = 25.4

const val CENTIMETRE_TO_MILLIMETRE = 10

class LengthUnits : Strategy {
    override fun convert(fromUnit: String, toUnit: String, inputValue: Double): Double {

        if(fromUnit == "Kilometre" && toUnit == "Kilometre") {
            return inputValue
        } else if (fromUnit == "Kilometre" && toUnit == "Meter") {
            return inputValue * KILOMETRE_TO_METRE
        } else if (fromUnit == "Kilometre" && toUnit == "Centimetre") {
            return inputValue * KILOMETRE_TO_CENTIMETRE
        } else if (fromUnit == "Kilometre" && toUnit == "Millimetre") {
            return inputValue * KILOMETRE_TO_MILLIMETRE
        } else if (fromUnit == "Kilometre" && toUnit == "Foot") {
            return inputValue * KILOMETRE_TO_FOOT
        } else if (fromUnit == "Kilometre" && toUnit == "Inch") {
            return inputValue * KILOMETRE_TO_INCH
        } else if (fromUnit == "Meter" && toUnit == "Meter") {
            return inputValue
        } else if (fromUnit == "Meter" && toUnit == "Kilometre") {
            return inputValue / KILOMETRE_TO_METRE
        } else if (fromUnit == "Meter" && toUnit == "Centimetre") {
            return inputValue * METER_TO_CENTIMETRE
        } else if (fromUnit == "Meter" && toUnit == "Millimetre") {
            return inputValue * METER_TO_MILLIMETRE
        } else if (fromUnit == "Meter" && toUnit == "Foot") {
            return inputValue * METER_TO_FOOT
        } else if (fromUnit == "Meter" && toUnit == "Inch") {
            return inputValue * METER_TO_INCH
        } else if (fromUnit == "Centimetre" && toUnit == "Kilometre") {
            return inputValue / KILOMETRE_TO_CENTIMETRE
        } else if (fromUnit == "Centimetre" && toUnit == "Meter") {
            return inputValue / METER_TO_CENTIMETRE
        } else if (fromUnit == "Centimetre" && toUnit == "Centimetre") {
            return inputValue
        } else if (fromUnit == "Centimetre" && toUnit == "Millimetre") {
            return inputValue * CENTIMETRE_TO_MILLIMETRE
        } else if (fromUnit == "Centimetre" && toUnit == "Foot") {
            return inputValue / FOOT_TO_CENTIMETRE
        } else if (fromUnit == "Centimetre" && toUnit == "Inch") {
            return inputValue / INCH_TO_CENTIMETRE
        } else if (fromUnit == "Millimetre" && toUnit == "Kilometre") {
            return inputValue / KILOMETRE_TO_MILLIMETRE
        } else if (fromUnit == "Millimetre" && toUnit == "Meter") {
            return inputValue / METER_TO_MILLIMETRE
        } else if (fromUnit == "Millimetre" && toUnit == "Centimetre") {
            return inputValue / CENTIMETRE_TO_MILLIMETRE
        } else if (fromUnit == "Millimetre" && toUnit == "Millimetre") {
            return inputValue
        } else if (fromUnit == "Millimetre" && toUnit == "Foot") {
            return inputValue / FOOT_TO_MILLIMETRE
        } else if (fromUnit == "Millimetre" && toUnit == "Inch") {
            return inputValue / INCH_TO_MILLIMETRE
        } else if (fromUnit == "Foot" && toUnit == "Kilometre") {
            return inputValue / KILOMETRE_TO_FOOT
        } else if (fromUnit == "Foot" && toUnit == "Meter") {
            return inputValue / METER_TO_FOOT
        } else if (fromUnit == "Foot" && toUnit == "Centimetre") {
            return inputValue * FOOT_TO_CENTIMETRE
        } else if (fromUnit == "Foot" && toUnit == "Millimetre") {
            return inputValue * FOOT_TO_MILLIMETRE
        } else if (fromUnit == "Foot" && toUnit == "Foot") {
            return inputValue
        } else if (fromUnit == "Foot" && toUnit == "Inch") {
            return inputValue * FOOT_TO_INCH
        } else if (fromUnit == "Inch" && toUnit == "Kilometre") {
            return inputValue / KILOMETRE_TO_INCH
        } else if (fromUnit == "Inch" && toUnit == "Meter") {
            return inputValue / METER_TO_INCH
        } else if (fromUnit == "Inch" && toUnit == "Centimetre") {
            return inputValue * INCH_TO_CENTIMETRE
        } else if (fromUnit == "Inch" && toUnit == "Millimetre") {
            return inputValue * INCH_TO_MILLIMETRE
        } else if (fromUnit == "Inch" && toUnit == "Foot") {
            return inputValue / FOOT_TO_INCH
        } else if (fromUnit == "Inch" && toUnit == "Inch") {
            return inputValue
        }
        return 0.0
    }
}