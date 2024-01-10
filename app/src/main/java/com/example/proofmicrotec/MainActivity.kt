package com.example.proofmicrotec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.proofmicrotec.data.GetPokeUseCase
import com.example.proofmicrotec.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
     private var respuesta  =""
    var getPokeUseCase = GetPokeUseCase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
           GlobalScope.launch {
                   respuesta = getPokeUseCase().toString()
                   binding.editTextTextMultiLine.setText(respuesta)
           }
        }

    }
}