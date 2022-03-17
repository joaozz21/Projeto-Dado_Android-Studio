package com.generation.donnie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d6: Button = findViewById(R.id.buttonD6)
        val d12: Button = findViewById(R.id.buttonD12)
        val d20: Button = findViewById(R.id.buttonD20)

        d6.setOnClickListener {
            rolar(6)
        }
        d12.setOnClickListener {
            rolar(12)
        }
        d20.setOnClickListener {
            rolar(20)
        }
    }

    fun rolar(lados: Int) {
        val valor = (1..lados).random()
        val resultado = findViewById<TextView>(R.id.Resultado)
        resultado.text = valor.toString()

        val image = img(valor)
        val dado = findViewById<ImageView>(R.id.Dado)
        dado.setImageResource(image)
    }

    private fun img(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            7 -> R.drawable.d12_7
            8 -> R.drawable.d12_8
            9 -> R.drawable.d12_9
            10 -> R.drawable.d12_10
            11 -> R.drawable.d12_11
            12 -> R.drawable.d12_12
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