package com.example.santiagoFajardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpaagerprobando.*
import java.util.ArrayList

class Main_Tips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main__tips)

        val viewPager: ViewPager2= findViewById(R.id.view_pager)


        val fragments: ArrayList<Fragment> = arrayListOf(
            Page1Fragment(),
            Page2Fragment(),
            Page3Fragment(),
            Page4Fragment(),
            Page5Fragment(),
            Page6Fragment()
        )


        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter

        //actionbar
        val actionbar = supportActionBar
        //titulo al actionbar
        actionbar!!.title = "Informacion"
        //Volver para atras boton
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        }
        // volver a la actividad anterior(filtros)
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }
