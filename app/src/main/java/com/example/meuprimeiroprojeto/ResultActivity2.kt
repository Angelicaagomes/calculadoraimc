package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val tvresult = findViewById<TextView>(R.id.textview_result)
        val tvclassificacao = findViewById<TextView>(R.id.textviewclassificaçao)
        val result = intent.getFloatExtra("extra_result", 0.1f)
        
        tvresult.text = result.toString()



        val classificacao = if (result < 18.5f){
            "Abaixo de peso"
        } else if (result in 18.5f..24.9f) {
              "Peso normal"
        } else if (result in 25f..29.9f) {
             "Excesso de peso"
        } else if (result in 30.0..39.9){
             "Obesidade"
        } else{
            "Obesidade Grave "
                    }
        tvclassificacao.text=getString(R.string.message_classificaçao,classificacao)
}

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}

