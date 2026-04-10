package com.example.calculadoraimc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPesoKg = findViewById<EditText>(R.id.edtPesoKG)
        val edtAlturaM = findViewById<EditText>(R.id.edtAlturaM)
        val calcular = findViewById<Button>(R.id.btnCalcular)
        val resultado = findViewById<TextView>(R.id.txtResultado)
        var imc: Double

        calcular.setOnClickListener {
            val pesoKg = edtPesoKg.text.toString().toDouble()
            val alturaM = edtAlturaM.text.toString().toDouble()
            imc = pesoKg / (alturaM * alturaM)
            resultado.text = "Tu IMC es: ${"%.2f".format(imc)}"
        }
    }
}