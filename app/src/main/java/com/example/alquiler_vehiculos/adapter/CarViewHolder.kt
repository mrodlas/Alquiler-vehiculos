package com.example.alquiler_vehiculos.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Car
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class CarViewHolder (view: View):RecyclerView.ViewHolder(view) {
   val binding = ItemVehiculoBinding.bind(view)
    fun render(carModel : Car){

        binding.tvModelo.text = carModel.modelo
        binding.tvCapacidad.text = carModel.capacidad
        binding.tvPlazas.text = carModel.nPlazas
        Glide.with(binding.CarFoto.context).load(carModel.foto).into(binding.CarFoto)
        binding.CarFoto.setOnClickListener{ Toast.makeText(binding.CarFoto.context, carModel.modelo, Toast.LENGTH_LONG).show()}
    }
}