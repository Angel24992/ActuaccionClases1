package com.dabxis.actuaccionclases1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dabxis.actuaccionclases1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{
            val celsiusString = binding.ingreseTemperatura.text.toString()
            if (celsiusString.isNotEmpty()){
                val celsius = celsiusString.toDouble()
                val fahrenheit = (celsius * 9 / 5) + 32
                binding.resultado.text = "La temperatura en fahrenheit es: $fahrenheit"
            } else {
                Toast.makeText(this, "Por favor, ingrese una temperatura", Toast.LENGTH_SHORT).show()
            }
        }
    }
}