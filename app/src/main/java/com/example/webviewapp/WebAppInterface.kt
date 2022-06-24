package com.example.webviewapp

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(context: Context) {

    private var context = context

    @JavascriptInterface
    fun addition(number1: String, number2: String): String {
        val addition = number1.toFloat() + number2.toFloat()
        Toast.makeText(context, addition.toString(), Toast.LENGTH_SHORT).show()
        return addition.toString()
    }

    @JavascriptInterface
    fun subtraction(number1: String, number2: String): String {
        val subtraction = number1.toFloat() - number2.toFloat()
        Toast.makeText(context, subtraction.toString(), Toast.LENGTH_SHORT).show()
        return subtraction.toString()
    }

    @JavascriptInterface
    fun multiplication(number1: String, number2: String): String {
        val multiplication = number1.toFloat() * number2.toFloat()
        Toast.makeText(context, multiplication.toString(), Toast.LENGTH_SHORT).show()
        return multiplication.toString()
    }

    @JavascriptInterface
    fun division(number1: String, number2: String): String {
        val division = number1.toFloat() / number2.toFloat()
        Toast.makeText(context, division.toString(), Toast.LENGTH_SHORT).show()
        return division.toString()
    }
}