package br.com.fiap.tutors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.compose.ui.input.key.Key.Companion.Home

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAcessoPrincipal: Button = findViewById<Button>(R.id.btn_acesso)

        btnAcessoPrincipal.setOnClickListener {
            val acesso = Intent(this, br.com.fiap.tutors.Home::class.java)
            startActivity(acesso)

        }
    }
}