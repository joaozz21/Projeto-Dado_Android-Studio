package com.generation.donnie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class QuartaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta)

        val buttonBack = findViewById<Button>(R.id.back2)
        buttonBack.setOnClickListener {
            finish()
        }
        val buttonRoll = findViewById<Button>(R.id.roll2)
        buttonRoll.setOnClickListener {
            Toast.makeText(this, "Rolou o dado", Toast.LENGTH_SHORT).show()
            rolar(20)
        }
    }

    private fun rolar(lados: Int) {
        val valor = (1..lados).random()
        val resultado = findViewById<TextView>(R.id.resultado2)
        resultado.text = valor.toString()

        val image = dados(valor)
        val imageDado = findViewById<ImageView>(R.id.Dado2)
        imageDado.setImageResource(image)
    }

    private fun dados(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.d20_1
            2 -> R.drawable.d20_2
            3 -> R.drawable.d20_3
            4 -> R.drawable.d20_4
            5 -> R.drawable.d20_5
            6 -> R.drawable.d20_6
            7 -> R.drawable.d20_7
            8 -> R.drawable.d20_8
            9 -> R.drawable.d20_9
            10 -> R.drawable.d20_10
            11 -> R.drawable.d20_11
            12 -> R.drawable.d20_12
            13 -> R.drawable.d20_13
            14 -> R.drawable.d20_14
            15 -> R.drawable.d20_15
            16 -> R.drawable.d20_16
            17 -> R.drawable.d20_17
            18 -> R.drawable.d20_18
            19 -> R.drawable.d20_19
            else -> R.drawable.d20_20
        }
    }
}