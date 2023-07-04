package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private var currentButton : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.DebugTree()
        currentButton = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView)

        val weight = findViewById<EditText>(R.id.editTextNumberPassword)
        val resultweight = weight.text.toString().toFloatOrNull()
        val name = findViewById<EditText>(R.id.editTextTextPassword)

        val height = findViewById<EditText>(R.id.editTextNumberPassword2)
        //val resultheight = height.text.toString().toIntOrNull()

        val age = findViewById<EditText>(R.id.editTextNumberPassword3)
        //val resultage = age.text.toString().toIntOrNull()

        fun CountResult (weight: Float,height: Int,age: Int, nameLength: Int ) : Float {
            return weight + height + age + nameLength
        }
        currentButton?.setOnClickListener{
            val resultage = age.text.toString().toIntOrNull()
            val resultheight = height.text.toString().toIntOrNull()
            val resultweight = weight.text.toString().toFloatOrNull()
            if ((resultweight != null && resultheight != null && resultage != null && name.text != null) &&
                (resultweight > 0 && resultheight > 0 && resultage> 0 ) &&
                    (resultweight < 250  && resultheight < 250 && resultage < 150))
                textView.text = " Ответ: ${CountResult(resultweight,resultheight, resultage, name.text.toString().length )}"
            else
                textView.text = "Данные введены некорректно"
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}