package com.example.alquiler_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.adapter.CarAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // ahora podríamos poner:  binding.recycler. ...
        val miDialogo = MiDialogFragment()
        val manager = LinearLayoutManager(this)

        binding.bGuardar.setOnClickListener{
            miDialogo.show(supportFragmentManager, "MiDialogo")
        }

        binding.bMostrarVehiculos.setOnClickListener(){
            binding.recycler.layoutManager = LinearLayoutManager(this)
            binding.recycler.adapter = CarAdapter(CarProvider.carList)
        }
    }
}