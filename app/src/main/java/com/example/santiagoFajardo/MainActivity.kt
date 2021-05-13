package com.example.santiagoFajardo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(1800)
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setup()
        forgetPassword()
        entrarSinLogin()
    }


    private fun actionBar(){
        val actionBar = supportActionBar
        actionBar!!.title = "Bienvenidos"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }


    //btn - entrar sin registrarse
    private fun entrarSinLogin(){
        buttonSinLogIn.setOnClickListener {
            val intent = Intent(this,FiltroMaps::class.java)
            startActivity(intent)
        }
    }

    //  btn - Olvidaste la contra?
    private fun forgetPassword(){
        forgot_password.setOnClickListener {
            startActivity(Intent(this@MainActivity, ForgotPassword::class.java))
        }
    }


    private fun setup(){
        var tittle = "Autentificacion"

        //boton de registro y verifca que este ok
        RegisterBotton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() &&  PasswordeditText.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(emailEditText.text.toString()
                    ,PasswordeditText.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        registroOk()
                    }
                    else{
                        mostrarError()
                    }
                }
            }
        }

        //verifica si estamos en la bbdd. boton de acceder
        AccessButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() &&  PasswordeditText.text.isNotEmpty()){

                FirebaseAuth.getInstance().signInWithEmailAndPassword(emailEditText.text.toString()
                    ,PasswordeditText.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        MostrarHome()
                    }
                    else{
                        mostrarError()
                    }
                }
            }
        }
    }

    //Notificacion de error para el log in erroneo
    private fun mostrarError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("ha ocurrido un error, no se ha podido autenticar el usuario")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }


    private fun registroOk(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Bienvenido")
        builder.setMessage("Se ha Registrado correctamente")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    // Entrar cuando el log in este bien
    private fun MostrarHome(){
        val homeIntent = Intent(this,FiltroMaps::class.java).apply {
        }
        startActivity(homeIntent)
    }
}