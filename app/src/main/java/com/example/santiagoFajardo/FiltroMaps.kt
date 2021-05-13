package com.example.santiagoFajardo

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_filtro_maps.*


// Cada filtro con su boton que nos manda a los mapas
class FiltroMaps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_maps)

        //actionBar()
        plasticoBtn()
        papelYcartonBtn()
        metales()
        plastico()
        vidrio()
        pilas()
    }
    //item info
    private fun iconoinfo(menuItem: MenuItem){
        val id = R.drawable.ic_baseline_compost_24
        menuItem.icon = ContextCompat.getDrawable(this,id)
    }

    //introducimos el toolbar los botones y el titulo
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_filtro, menu)
        val actionBar = supportActionBar
        actionBar!!.title = "Filtro"
        actionBar.setDisplayHomeAsUpEnabled(true)

        iconoinfo(menu?.findItem(R.id.informacion)!!)
        return super.onCreateOptionsMenu(menu)
    }


    // le damos funcionalidad al boton de informacion (nos redirecciona)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.informacion ->{
                startActivity(Intent(this, Main_Tips::class.java))

            }
        }
        return super.onOptionsItemSelected(item)
    }


    private fun actionBar(){
        val actionBar = supportActionBar
        actionBar!!.title = "Filtro"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    private fun plasticoBtn(){
        botonAceite.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun papelYcartonBtn(){
        botonPapel.setOnClickListener {
            val intent = Intent(this,MapaCartonPapel::class.java)
            startActivity(intent)
        }
    }
    private fun metales(){
        botonMetales.setOnClickListener {
            val intent = Intent(this,MapaMetales::class.java)
            startActivity(intent)
        }
    }

    private fun plastico(){
        botonPlastico.setOnClickListener {
            val intent = Intent(this,MapaPlastico::class.java)
            startActivity(intent)
        }
    }

    private fun vidrio(){
        botonVidrios.setOnClickListener {
            val intent = Intent(this,MapaVidrios::class.java)
            startActivity(intent)
        }
    }

    private fun pilas(){
        botonPilas.setOnClickListener {
            val intent = Intent(this,MapaPilas::class.java)
            startActivity(intent)
        }
    }


}