package com.generation.donnie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonBack = findViewById<Button>(R.id.back)
        buttonBack.setOnClickListener {
            finish()
        }
        val buttonRoll = findViewById<Button>(R.id.roll)
        buttonRoll.setOnClickListener {
            Toast.makeText(this, "Rolou o dado", Toast.LENGTH_SHORT).show()
            rolar(6)
        }
    }

    private fun rolar(lados: Int) {
        val valor = (1..lados).random()
        val resultado = findViewById<TextView>(R.id.resultado)
        resultado.text = valor.toString()

        val image = dados(valor)
        val imageDado = findViewById<ImageView>(R.id.Dado)
        imageDado.setImageResource(image)
    }

    private fun dados(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}