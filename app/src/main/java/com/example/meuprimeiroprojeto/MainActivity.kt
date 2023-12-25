package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btncalcular:Button= findViewById<Button>(R.id.btncalcular)
        val edtaltura:EditText=findViewById(R.id.edtaltura)
        val edtpeso:EditText=findViewById(R.id.edtpeso)



        btncalcular.setOnClickListener {
            val alturastr=edtaltura.text.toString()
            val pesostr=edtpeso.text.toString()
            if (alturastr.isNotEmpty()&& pesostr.isNotEmpty()) {
                val altura: Float = alturastr.toFloat()
                val alturafinal: Float = altura * altura
                val peso: Float = pesostr.toFloat()
                val result: Float = peso / alturafinal


                val intent = Intent(this, ResultActivity2::class.java)
                    .apply {
                        putExtra("extra_result", result)
                    }
                startActivity(intent)
            } else {Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }
        }
        }
    }
