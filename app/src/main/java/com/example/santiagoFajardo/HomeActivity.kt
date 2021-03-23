package com.example.santiagoFajardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

enum class ProviderType{
    BASIC
}

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle = intent.extras
        val email: String? = bundle?.getString("Email")
        val provider: String? = bundle?.getString("provider")
        setup(email?: "",provider ?: "")

        actionBar()
    }

    private fun actionBar(){
        val actionBar = supportActionBar
        actionBar!!.title = "Inicio"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    private fun setup(email:String,provider:String){

        var tittle = "Bienvenidos"
        EmailTextView.text = email
        ProviderTextView.text = provider

        botonSalir.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }

}