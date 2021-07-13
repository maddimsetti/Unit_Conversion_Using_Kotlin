package com.example.unitconversion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class HomeActivity : AppCompatActivity() {

    private lateinit var unitConversionSpinner : Spinner
    lateinit var fromUnitConversionSpinner : Spinner
    lateinit var toUnitConversionSpinner : Spinner
    private lateinit var editText : EditText
    private lateinit var resultView : TextView
    private lateinit var button: Button
    lateinit var  selectedType : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        viewTheSelectedItems()
        onClick()
    }

    private fun viewTheSelectedItems() {
        unitConversionSpinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this, R.array.Conversion, android.R.layout.simple_spinner_dropdown_item
        )

        fromUnitConversionSpinner = findViewById(R.id.spinnerFrom)
        toUnitConversionSpinner = findViewById(R.id.spinnerTo)

        editText = findViewById(R.id.fromUnit)
        resultView = findViewById(R.id.toUnit)

        button = findViewById(R.id.button)

        unitConversionSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            @SuppressLint("ResourceType")
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedType = parent?.getItemAtPosition(position).toString()

                val unitSelection = when (selectedType) {
                    "Select a conversion Type" -> ArrayAdapter.createFromResource(
                        baseContext,
                        R.array.selectAConversionType,
                        android.R.layout.simple_spinner_dropdown_item
                    )
                    "Length" -> ArrayAdapter.createFromResource(
                        baseContext,
                        R.array.LengthUnits,
                        android.R.layout.simple_spinner_dropdown_item
                    )
                    "Mass" -> ArrayAdapter.createFromResource(
                        baseContext,
                        R.array.MassUnits,
                        android.R.layout.simple_spinner_dropdown_item
                    )
                    "Temperature" -> ArrayAdapter.createFromResource(
                        baseContext,
                        R.array.TemperatureUnits,
                        android.R.layout.simple_spinner_dropdown_item
                    )
                    "Volume" -> ArrayAdapter.createFromResource(
                        baseContext,
                        R.array.VolumeUnits,
                        android.R.layout.simple_spinner_dropdown_item
                    )
                    else -> null
                }
//                Toast.makeText(parent?.context, selectedType, Toast.LENGTH_LONG).show()
                fromUnitConversionSpinner.adapter = unitSelection
                toUnitConversionSpinner.adapter = unitSelection

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    private fun onClick() {

        button.setOnClickListener {
//            Toast.makeText(this, "Message Checking", Toast.LENGTH_LONG).show()
            val fromSelectedUnit = fromUnitConversionSpinner.selectedItem.toString()
            val toSelectedUnit = toUnitConversionSpinner.selectedItem.toString()

            var inputValue: Double = editText.text.toString().toDouble()

            var context = when (selectedType) {
                "Length" -> Context(LengthUnits())
                "Mass" -> Context(MassUnits())
                "Temperature" -> Context(TemperatureUnits())
                "Volume" -> Context(VolumeUnits())
                else -> null
            }
            val result = inputValue?.let { it1 ->
                context?.executeStrategy(fromSelectedUnit, toSelectedUnit,
                    it1
                )
            }
            resultView.text = "$result"

        }
    }

}



