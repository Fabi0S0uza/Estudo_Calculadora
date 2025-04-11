package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var numero1EditText = findViewById<EditText>(R.id.numero1EditText)
        var numero2EditText = findViewById<EditText>(R.id.numero2EditText)
        var somarButton = findViewById<Button>(R.id.somarButton)
        var subtrairButton = findViewById<Button>(R.id.subtrairButton)
        var multiplicarButton = findViewById<Button>(R.id.multiplicarButton)
        var dividirButton = findViewById<Button>(R.id.dividirButton)
        var textoResul = findViewById<TextView>(R.id.resultadoTextView)
        var numero1Str = numero1EditText.text.toString()
        var numero2Str = numero2EditText.text.toString()
        var clearButton = findViewById<Button>(R.id.btn_Clear)

        somarButton.setOnClickListener{
            numero1Str = numero1EditText.text.toString()
            numero2Str = numero2EditText.text.toString()

            if (numero1Str.isEmpty() || numero2Str.isEmpty()){
                Toast.makeText(this,"Por favor insira ambos os números", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else{
                var soma = numero1Str.toInt() + numero2Str.toInt()
                textoResul.text = "Resultado: $soma"
            }

        }

        multiplicarButton.setOnClickListener{

            numero1Str = numero1EditText.text.toString()
            numero2Str = numero2EditText.text.toString()

            if (numero1Str.isEmpty() || numero2Str.isEmpty()){
                Toast.makeText(this, "Por favor insira ambos os números", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else{
                var multiplic = numero1Str.toInt() * numero2Str.toInt()
                textoResul.text = "Resultado: $multiplic"
            }
        }

        subtrairButton.setOnClickListener{
            numero1Str = numero1EditText.text.toString()
            numero2Str = numero2EditText.text.toString()

            if (numero1Str.isEmpty() || numero2Str.isEmpty()){
                Toast.makeText(this, "Por favor insira ambos os números", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else{
                var subtr = numero1Str.toInt() - numero2Str.toInt()
                textoResul.text = "Resultado: $subtr"
            }
        }

        dividirButton.setOnClickListener{
            numero1Str = numero1EditText.text.toString()
            numero2Str = numero2EditText.text.toString()
            if (numero1Str.isEmpty() || numero2Str.isEmpty()){
                Toast.makeText(this,"Por favor insira ambos os números", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else{
                var div = numero1Str.toInt() / numero2Str.toInt()
                textoResul.text = "Resultado: $div"
            }


    }

        clearButton.setOnClickListener {
            // Clear the text from the EditTexts
            numero1EditText.text.clear()
            numero2EditText.text.clear()

            // Reset the result text to a default value
            textoResul.text = "Resultado: "
        }
}}