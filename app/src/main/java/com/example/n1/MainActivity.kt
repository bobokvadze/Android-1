package com.example.n1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var additionButton : Button
    private lateinit var subtractionButton : Button
    private lateinit var divisionButton : Button
    private lateinit var multiplicationButton : Button
    private lateinit var firstNumber : EditText
    private lateinit var secondNumber : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        additionButton = findViewById(R.id.additionButton)
        subtractionButton = findViewById(R.id.subtractionButton)
        divisionButton = findViewById(R.id.divisionButton)
        multiplicationButton = findViewById(R.id.multiplicationButton)
        firstNumber = findViewById(R.id.firstNumber)
        secondNumber = findViewById(R.id.secondNumber)

        fun roundTheNumber(numInDouble: Double): String {
            return "%.1f".format(numInDouble)
        }

        additionButton.setOnClickListener {
            val result = firstNumber.text.toString().toDouble()+secondNumber.text.toString().toDouble()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Result", roundTheNumber(result).toString())
            startActivity(intent)
            finish()
        }

        subtractionButton.setOnClickListener {
            val result = firstNumber.text.toString().toDouble()-secondNumber.text.toString().toDouble()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Result", roundTheNumber(result).toString())
            startActivity(intent)
            finish()
        }

        divisionButton.setOnClickListener {
            val result = firstNumber.text.toString().toDouble()/secondNumber.text.toString().toDouble()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Result", roundTheNumber(result).toString())
            startActivity(intent)
            finish()
        }

        multiplicationButton.setOnClickListener {
            val result = firstNumber.text.toString().toDouble()*secondNumber.text.toString().toDouble()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Result", roundTheNumber(result).toString())
            startActivity(intent)
            finish()
        }

    }
}