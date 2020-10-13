package com.example.alejandragarcia_calculadoralogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnAcceder = findViewById<Button>(R.id.buttonAcceder)
        var btnSalir = findViewById<Button>(R.id.buttonSalir)

    }

    fun acceder(view: View) {
        var nombre = findViewById<EditText>(R.id.editTextNombre).text.toString()
        var apellido = findViewById<EditText>(R.id.editTextApellido).text.toString()



            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Nombre", nombre)
            intent.putExtra("Apellido", apellido)
            startActivity(intent)

    }

    fun salir(view: View) {
        finish()
    }
}