package com.example.turistic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lugarTuris1=LugarTuristico("Desierto de la Tatacoa","Huila","Este tour esta creado para todo publico tendras la oportunidad de conocer el rio magdalena, villa vieja ,montar en lancha, disfrutar de la naturaleza, caminar en el desierto de la tatacoa, conocer su morfologia sus piscinas sus 3 desierto sus misterios, poder disfrutar de uno de los cilos con calificacion star light para observar estrellas en el mundo, conocer la gastronomia tipica del huila, sus costumbres y mucho mas","Conoceras el rio magdalena ,montar en lancha, disfrutar de la naturaleza.",32.0,4.0,R.drawable.image)
        val lugarTuris2=LugarTuristico("Catedral de Neiva","Neiva Huila","La Catedral de la Inmaculada Concepción de Neiva es el nombre que recibe un edificio religioso afiliado a la Iglesia católica dedicado a la Virgen María en su advocación de la Inmaculada Concepción, patrona de Neiva desde 1612, año en que, en su tercera fundación, se puso a la ciudad bajo la advocación de Nuestra Señora de la Limpia Concepción del Valle de Neiva.","Bonita catedra para orar en las montañas, asistir a eventos.",28.0,4.0,R.drawable.getlstdpropertyphoto)
        val lugarTuris3=LugarTuristico("Parque Arqueologico San Agustin","San Agustin Huila","El parque arqueológico de San Agustín se encuentra en la cuenca alta del río Magdalena, en el municipio de San Agustín, en el departamento del Huila, a una altitud de 1.730 m s. n. m.","Podras descubrir toda clase de ruinas antiguas.",29.0,3.5,R.drawable.arqueologia)
        val lugarTuris4=LugarTuristico("La Mano del Gigante","Huila","Se encuentra a 1.480 metros sobre el nivel del mar, a una distancia de 6 kilómetros de la Ruta Nacional 45, a 9,3 kilómetros del casco urbano del Municipio de Gigante y a 90 kilómetros de la capital del Huila, el acceso es por el desvío hacia el centro poblado de Potrerillos, la carretera desde este punto es destapada.","Disfruta de los hermosos paisajes, desde una increible vista",32.0,4.0,R.drawable.manogigante)
        val lugarTuris5=LugarTuristico("Edificio Nacional","Huila","El Edificio Nacional de Correos y Telégrafos es un edificio estatal declarado como patrimonio arquitectónico departamental ubicado en la ciudad de Neiva, en el departamento del Huila. ","Emblematico edifio de la ciudad de neiva.",28.0,5.0,R.drawable.coloridoenelcentro)

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