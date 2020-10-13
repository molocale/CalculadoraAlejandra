package com.example.alejandragarcia_calculadoralogin

import android.widget.TextView
import java.math.RoundingMode
import java.text.DecimalFormat

class Calculadora {

    var memoria1: String = ""
    var memoria2: String = ""
    var haySigno: Boolean = false
    var signo: String = ""

    //∞
    fun add(entrada: String, editTextResultado: TextView) {

        if (isNumero(entrada) || entrada == ".") {

            if (!haySigno) {

                if (entrada == "." && !memoria1.contains('.') && memoria1 != "∞" && memoria1 != "NaN") {
                    memoria1 += entrada
                    editTextResultado.text = memoria1
                } else if (entrada != "." && memoria1 != "∞" && memoria1 != "NaN") {
                    memoria1 += entrada
                    editTextResultado.text = memoria1
                }

                if (memoria1 == "∞" || memoria1 == "NaN") {
                    memoria1 = entrada
                    editTextResultado.text = memoria1
                }


            } else if (haySigno && memoria1 != "") {

                if (entrada == "." && !memoria2.contains('.')) {
                    memoria2 += entrada
                    editTextResultado.text = memoria1 + " " + signo + " " + memoria2
                } else if (entrada != ".") {
                    memoria2 += entrada
                    editTextResultado.text = memoria1 + " " + signo + " " + memoria2
                }


            }
        } else if (entrada != ".") {
            if (!haySigno && memoria1 != "" && memoria1 != "∞" && memoria1 != "NaN") {
                editTextResultado.text = memoria1 + " " + entrada
                haySigno = true
                signo = entrada
            } else if (haySigno && memoria2 != "" && memoria1 != "") {
                realizarCuenta(editTextResultado, entrada)
            } else if (haySigno && memoria2 == "") {
                signo = entrada
                editTextResultado.text = memoria1 + " " + entrada

            }

            if (memoria1 == "∞" || memoria1 == "NaN") {
                resetear(editTextResultado)
            }


        }
    }


    fun isNumero(entrada: String): Boolean {
        var salida: Boolean
        try {
            entrada.toInt()
            salida = true

        } catch (e: NumberFormatException) {
            salida = false
        }

        return salida

    }


    fun realizarCuenta(editTextResultado: TextView, signoNuevo: String) {
        var resultado = 0.0

        if (memoria2 != "" && memoria1 != "") {

            when (signo) {
                "-" -> resultado = (memoria1.toDouble() - memoria2.toDouble())
                "+" -> resultado = (memoria1.toDouble() + memoria2.toDouble())
                "/" -> resultado = (memoria1.toDouble() / memoria2.toDouble())
                "*" -> resultado = (memoria1.toDouble() * memoria2.toDouble())
            }


            val df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.CEILING

            var resultado2 = df.format(resultado)


            memoria1 = resultado2
            memoria2 = ""
            signo = signoNuevo
            haySigno = signoNuevo != ""

            editTextResultado.text = resultado2 + " " + signo
        }


    }

    fun resetear(editTextResultado: TextView) {

        memoria1 = ""
        memoria2 = ""
        haySigno = false
        signo = ""

        editTextResultado.text = "0"

    }


}