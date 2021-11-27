package com.example.turistic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_despegable.*

class Despegable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_despegable)

        val lugar=intent.getSerializableExtra("Lugar")as LugarTuristico

        textLugar.text=lugar.nombreLugar
        textDate.text=lugar.descripcion
        textCalificacion.text="${lugar.estrellas}"
        textTemperatura.text="${lugar.grados}"
        ubicacion.text=lugar.nombreSitio
        imageLugar.setImageResource(lugar.imang)

    }
}