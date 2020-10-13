package com.example.alejandragarcia_calculadoralogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var editTextResultado: TextView
    var miCalculadora: Calculadora = Calculadora()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewBienvenido = findViewById<TextView>(R.id.textViewBienvenido)
        val objetoIntent: Intent = intent
        var nombre = objetoIntent.getStringExtra("Nombre")
        var apellido = objetoIntent.getStringExtra("Apellido")
        textViewBienvenido.text = "Bienvenido $nombre $apellido"


        //Bievenida y resultado
        //var textViewBienvenido = findViewById<TextView>(R.id.textViewBienvenido)
        editTextResultado = findViewById<TextView>(R.id.editTextResultado)
        //        //Botones del 0 al 9
        var buttonCero = findViewById<TextView>(R.id.buttonCero)
        var buttonUno = findViewById<TextView>(R.id.buttonUno)
        var buttonDos = findViewById<TextView>(R.id.buttonDos)
        var buttonTres = findViewById<TextView>(R.id.buttonTres)
        var buttonCuatro = findViewById<TextView>(R.id.buttonCuatro)
        var buttonCinco = findViewById<TextView>(R.id.buttonCinco)
        var buttonSeis = findViewById<TextView>(R.id.buttonSeis)
        var buttonSiete = findViewById<TextView>(R.id.buttonSiete)
        var buttonOcho = findViewById<TextView>(R.id.buttonOcho)
        var buttonNueve = findViewById<TextView>(R.id.buttonNueve)
        //Botones operandos
        var buttonMultiplicacion = findViewById<TextView>(R.id.buttonMultiplicacion)
        var buttonDivision = findViewById<TextView>(R.id.buttonDivision)
        var buttonMenos = findViewById<TextView>(R.id.buttonMenos)
        var buttonSuma = findViewById<TextView>(R.id.buttonSuma)
        var buttonIgual = findViewById<TextView>(R.id.buttonIgual)
        var buttonPunto = findViewById<TextView>(R.id.buttonPunto)
        var buttonAC = findViewById<TextView>(R.id.buttonAC)


        buttonCero.setOnClickListener { onClick(buttonCero) }
        buttonUno.setOnClickListener { onClick(buttonUno) }
        buttonDos.setOnClickListener { onClick(buttonDos) }
        buttonTres.setOnClickListener { onClick(buttonTres) }
        buttonCuatro.setOnClickListener { onClick(buttonCuatro) }
        buttonCinco.setOnClickListener { onClick(buttonCinco) }
        buttonSeis.setOnClickListener { onClick(buttonSeis) }
        buttonSiete.setOnClickListener { onClick(buttonSiete) }
        buttonOcho.setOnClickListener { onClick(buttonOcho) }
        buttonNueve.setOnClickListener { onClick(buttonNueve) }
        buttonMultiplicacion.setOnClickListener { onClick(buttonMultiplicacion) }
        buttonDivision.setOnClickListener { onClick(buttonDivision) }
        buttonMenos.setOnClickListener { onClick(buttonMenos) }
        buttonSuma.setOnClickListener { onClick(buttonSuma) }
        buttonIgual.setOnClickListener { onClick(buttonIgual) }
        buttonPunto.setOnClickListener { onClick(buttonPunto) }
        buttonAC.setOnClickListener { onClick(buttonAC) }


    }

    fun multiplicacion(view: View) {}
    fun division(view: View) {}
    fun resta(view: View) {}
    fun suma(view: View) {}
    fun igual(view: View) {}
    fun borrarTodo(view: View) {}
    /*fun uno(view: View) {
        editTextResultado.text = editTextResultado.text.toString() + "1"
    }*/

    fun onClick(v: View) {
        when (v.id) {
            R.id.buttonUno -> {
                miCalculadora.add("1", editTextResultado)
                //editTextResultado.text = editTextResultado.text.toString() + "1"
            }
            R.id.buttonDos -> {
                miCalculadora.add("2", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "2"

            }
            R.id.buttonTres -> {
                miCalculadora.add("3", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "3"

            }
            R.id.buttonCuatro -> {
                miCalculadora.add("4", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "4"

            }
            R.id.buttonCinco -> {
                miCalculadora.add("5", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "5"

            }
            R.id.buttonSeis -> {
                miCalculadora.add("6", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "6"

            }
            R.id.buttonSiete -> {
                miCalculadora.add("7", editTextResultado)

                ///editTextResultado.text = editTextResultado.text.toString() + "7"

            }
            R.id.buttonOcho -> {
                miCalculadora.add("8", editTextResultado)

                ///editTextResultado.text = editTextResultado.text.toString() + "8"

            }
            R.id.buttonNueve -> {
                miCalculadora.add("9", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "9"

            }
            R.id.buttonCero -> {
                miCalculadora.add("0", editTextResultado)

                //ditTextResultado.text = editTextResultado.text.toString() + "0"

            }
            R.id.buttonMultiplicacion -> {
                miCalculadora.add("*", editTextResultado)

                // editTextResultado.text = editTextResultado.text.toString() + "*"

            }
            R.id.buttonDivision -> {
                miCalculadora.add("/", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "/"

            }
            R.id.buttonMenos -> {
                miCalculadora.add("-", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "-"

            }
            R.id.buttonSuma -> {
                miCalculadora.add("+", editTextResultado)
                //editTextResultado.text = editTextResultado.text.toString() + "+"

            }
            R.id.buttonPunto -> {
                miCalculadora.add(".", editTextResultado)

                //editTextResultado.text = editTextResultado.text.toString() + "."

            }
            R.id.buttonAC -> {
                miCalculadora.resetear(editTextResultado)
                //editTextResultado.text = editTextResultado.text.toString() + ""

            }
            R.id.buttonIgual -> {
                miCalculadora.realizarCuenta(editTextResultado, "")
                // editTextResultado.text = editTextResultado.text.toString() + ""

            }


        }

    }
}
