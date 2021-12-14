package com.example.turistic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel =ViewModelProvider(this).get(MainViewModel::class.java)
        observerLiveData()
    }
    private fun observerLiveData(){
        viewModel.getLigares().observe(this,{
            val adapter=LugarAdapter(this,it)
            Lista.adapter=adapter
            Lista.setOnItemClickListener { parent, view, position, id ->
                val intent=Intent(this,Despegable::class.java)
                intent.putExtra("Lugar",it[position])
                startActivity(intent)
            }
        })
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.menuOpcion1)
            startActivity(Intent(this,MenuActivity::class.java))
        return super.onOptionsItemSelected(item)
    }
}