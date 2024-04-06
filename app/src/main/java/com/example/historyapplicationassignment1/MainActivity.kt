package com.example.historyapplicationassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // Initialize views
    val fact = findViewById<Button>(R.id.button)
    val age = findViewById<EditText>(R.id.editTextNumber)
    val text = findViewById<TextView>(R.id.textView)
    val answer = findViewById<TextView>(R.id.textView2)
    val clear = findViewById<Button>(R.id.button2)



    fact.setOnClickListener {
        // Initialize age EditText within OnClickListener
        val ageValue = age.text.toString().toIntOrNull()

        // Check if ageValue is not null and between 20-30 or 31-40
        if (ageValue != null) {
            val result = when (ageValue) {
                in 20..30 -> "Mathematician Évariste Galois died at the age of 20 after suffering wounds in a duel."
                in 31..40 -> "Princess Dianaa a memeber of the British royal family died at the age of 36 ruled as a tragic accident."
                in 41..50 -> "Pablo Emilio Escobar Gaviria was Columbian Drug Lord who died at the age of 44 due to a gun shot wound to the head."
                in 51..60 -> "The famous painter Bob Ross died at the age of 52 in 1995."
                in 61..70 -> "Bal Gangadhar Tilak was an Indian nationalist, teacher, and an independence activist who died at the age of 64."
                in 71..80 -> "Mahatma Gandhi was an Indian lawyer and anti-colonial nationalist who died at 78 years old."
                in 81..90 -> "Ruth Bader Ginsburg,was the second woman to serve on the Supreme Court and a pioneering advocate for women’s rights who died at 87 years old."
                in 91..100 -> "Nelson Rolihlahla Mandela was the first president of South Africa who died at the age of 95."
                in 101..110 -> "Luise Rainer a German-American actress who died at age 105."
                in 111..120 -> "Nabi Tajima,Japanese supercentenarian who was the world's oldest living person at the time of her death, living to 117 years."
                else -> "invalid. Please enter valid age" // You can change this to whatever message you want
            }
            // Set the result to textView2
            answer.text = result
        } else {
            // Handle case when input is not a valid number
            answer.text = "Please enter a valid number"
        }
    }

    }
}





