package com.android.primeiroapp_curso_kaiqueocanha

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()


        buttonCalcular.setOnClickListener() {

            var peso = edtPeso.text.toString().toDouble()
            var altura = edtAltura.text.toString().toDouble()

            if (edtPeso.text.toString().isEmpty() || edtAltura.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }

            var resultado = peso / (altura * altura)

            Resultado.text = "Seu IMC é %.2f.".format(resultado)
        }
    }
}



