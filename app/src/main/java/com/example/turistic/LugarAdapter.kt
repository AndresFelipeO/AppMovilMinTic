package com.example.turistic

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_lugar.view.*

class LugarAdapter(private val mContext:Context,private val ListaLuagres:List<LugarTuristico>):ArrayAdapter<LugarTuristico>(mContext, 0,ListaLuagres) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layautt=LayoutInflater.from(mContext).inflate(R.layout.item_lugar,parent,false)
        val lugar=ListaLuagres[position]
        layautt.TextoTitulo.text=lugar.nombreLugar
        layautt.textdate.text=lugar.breDescrip
        layautt.textGrados.text="$(lugar.grados)"
        layautt.textEstrellas.text="$(lugar.estrellas)"
        layautt.imageLugar.setImageResource(lugar.imang)

        return  layautt
    }
}