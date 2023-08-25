package br.com.igorbag.meuprimeiroappdio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // O desafio sera criar uma valor dentro do string.xml
        // E trocar o texto do xml e tornar internacional (Ingles, Espanhol, etc...)
    }
}
