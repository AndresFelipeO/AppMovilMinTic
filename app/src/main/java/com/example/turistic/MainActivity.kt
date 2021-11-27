package com.example.turistic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lugarTuris1=LugarTuristico("Desierto de la Tatacoa","Tegua Travel","Este tour esta creado para todo publico tendras la oportunidad de conocer el rio magdalena, villa vieja ,montar en lancha, disfrutar de la naturaleza, caminar en el desierto de la tatacoa, conocer su morfologia sus piscinas sus 3 desierto sus misterios, poder disfrutar de uno de los cilos con calificacion star light para observar estrellas en el mundo, conocer la gastronomia tipica del huila, sus costumbres y mucho mas","Conoceras el rio magdalena ,montar en lancha, disfrutar de la naturaleza.",32.0,4.0,R.drawable.image)
        val lugarTuris2=LugarTuristico("Catedra de Neiva","","","Bonita catedra para orar en las montañas, asistir a eventos.",28.0,4.0,R.drawable.getlstdpropertyphoto)
        val lugarTuris3=LugarTuristico("Parque San Agustin","","","Podras descubrir toda clase de ruinas antiguas.",29.0,3.5,R.drawable.arqueologia)
        val lugarTuris4=LugarTuristico("La Mano del Gigante","","","Disfruta de los hermosos paisajes, desde una increible vista",32.0,4.0,R.drawable.manogigante)
        val lugarTuris5=LugarTuristico("Edificio Nacional","","","Emblematico edifio de la ciudad de neiva.",28.0,5.0,R.drawable.coloridoenelcentro)

        val ListaLugar= listOf(lugarTuris1,lugarTuris2,lugarTuris3,lugarTuris4,lugarTuris5)
        val adapter=LugarAdapter(this,ListaLugar)
        Lista.adapter=adapter

        Lista.setOnItemClickListener { parent, view, position, id ->
            val intent=Intent(this,Despegable::class.java)
            intent.putExtra("Lugar",ListaLugar[position])
            startActivity(intent)
        }
    }
}