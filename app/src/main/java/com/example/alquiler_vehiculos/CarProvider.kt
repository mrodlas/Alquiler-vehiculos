package com.example.alquiler_vehiculos

class CarProvider {
    companion object{
        val carList = listOf<Car>(
            Car(
                foto = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "Carrozado con trampilla",
                nPlazas = "3 plazas",
                capacidad = "20M3"
            ),
            Car(
                foto = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "Carrozado sin trampilla",
                nPlazas = "3 plazas",
                capacidad = "20M3",
            ),
            Car(
                foto = "https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg",
                modelo = "Furgoneta Grande",
                nPlazas = "3 plazas",
                capacidad = "15M3  ",
            ),
            Car(
                foto = "https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg",
                modelo = "Furgoneta Mediana",
                nPlazas = "3 plazas",
                capacidad = "8M3",
            ),
            Car(
                foto = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg",
                modelo = "Furgoneta Pequeña",
                nPlazas = "2 plazas",
                capacidad = "4M3",
            )
        )
    }
}