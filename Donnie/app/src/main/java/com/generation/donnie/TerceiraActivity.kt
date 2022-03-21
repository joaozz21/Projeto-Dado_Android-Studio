package com.generation.donnie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class TerceiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)

        val buttonBack = findViewById<Button>(R.id.back1)
        buttonBack.setOnClickListener {
            finish()
        }
        val buttonRoll = findViewById<Button>(R.id.roll1)
        buttonRoll.setOnClickListener {
            Toast.makeText(this, "Rolou o dado", Toast.LENGTH_SHORT).show()
            rolar(12)
        }
    }

    private fun rolar(lados: Int) {
        val valor = (1..lados).random()
        val resultado = findViewById<TextView>(R.id.resultado1)
        resultado.text = valor.toString()

        val image = dados(valor)
        val imageDado = findViewById<ImageView>(R.id.Dado1)
        imageDado.setImageResource(image)
    }

    private fun dados(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.d12_1
            2 -> R.drawable.d12_2
            3 -> R.drawable.d12_3
            4 -> R.drawable.d12_4
            5 -> R.drawable.d12_5
            6 -> R.drawable.d12_6
            7 -> R.drawable.d12_7
            8 -> R.drawable.d12_8
            9 -> R.drawable.d12_9
            10 -> R.drawable.d12_10
            11 -> R.drawable.d12_11
            else -> R.drawable.d12_12
        }
    }
}