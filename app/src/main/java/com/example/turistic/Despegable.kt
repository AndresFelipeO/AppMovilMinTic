package com.example.turistic

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
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
        //imageLugar.setImageResource(lugar.imang)
val ubic=findViewById<CardView>(R.id.Ubicación)
        ubic.setOnClickListener( {
            launchMap()
        })

        val prueba=findViewById<Button>(R.id.button1)
        prueba.setOnClickListener {
            Log.d("Lugar","")
            launchMap()
        }

    }
    private fun launchMap() {
        val gmmIntentUri = Uri.parse("geo:37.7749,-122.4194")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        mapIntent.resolveActivity(packageManager)?.let {
            startActivity(mapIntent)
        }
    }
}