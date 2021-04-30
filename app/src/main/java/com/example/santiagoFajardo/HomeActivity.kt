package com.example.santiagoFajardo

import android.Manifest
import android.app.DownloadManager
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity(), OnMapReadyCallback {

    //variable global que la inicializaremos despues para que el mapa no nos falle
    private lateinit var map: GoogleMap

    companion object {
        const val REQUEST_CODE_LOCATION = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        createFragment()

    }

    private fun createFragment() {
        val mapFragment: SupportMapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    // cuando el mapa ya a sido creado significa esto
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        PermisoRequestLocation()
        crearMarcador() // crearemos un marcador
    }

    private fun crearMarcador() {
        val coordinadas= LatLng(-34.449525,-56.080112)
        val marker1 = MarkerOptions().position(coordinadas).title("Aceites Domiciliarios Usados1")
        map.addMarker(marker1)
        val coordinadas2= LatLng(-34.773011,-55.754397)
        val marker2 = MarkerOptions().position(coordinadas2).title("Aceites Domiciliarios Usados")
        map.addMarker(marker2)
        val coordinadas3= LatLng(-34.769616,-55.761266)
        val marker3 = MarkerOptions().position(coordinadas3).title("Aceites Domiciliarios Usados")
        map.addMarker(marker3)
        val coordinadas4= LatLng(-34.763019,-55.754397)
        val marker4= MarkerOptions().position(coordinadas4).title("Aceites Domiciliarios Usados")
        map.addMarker(marker4)
        val coordinadas5= LatLng(-34.922740,-55.777725)
        val marker5 = MarkerOptions().position(coordinadas5).title("Aceites Domiciliarios Usados")
        map.addMarker(marker5)
        val coordinadas6= LatLng(-34.743549,-56.159124)
        val marker6 = MarkerOptions().position(coordinadas6).title("Aceites Domiciliarios Usados")
        map.addMarker(marker6)
        val coordinadas7= LatLng(-34.898311,-55.765810)
        val marker7 = MarkerOptions().position(coordinadas7).title("Aceites Domiciliarios Usados")
        map.addMarker(marker7)
        val coordinadas8= LatLng(-34.875003,-56.166918)
        val marker8 = MarkerOptions().position(coordinadas8).title("Aceites Domiciliarios Usados")
        map.addMarker(marker8)
        val coordinadas9= LatLng(-34.906524,-56.230092)
        val marker9 = MarkerOptions().position(coordinadas9).title("Aceites Domiciliarios Usados")
        map.addMarker(marker9)
        val coordinadas10= LatLng(-34.897013,-56.186123)
        val marker10 = MarkerOptions().position(coordinadas10).title("Aceites Domiciliarios Usados")
        map.addMarker(marker10)
        val coordinadas11= LatLng(-34.871941,-56.171132)
        val marker11 = MarkerOptions().position(coordinadas11).title("Aceites Domiciliarios Usados")
        map.addMarker(marker11)
        val coordinadas12= LatLng(-34.865143,-56.213436)
        val marker12 = MarkerOptions().position(coordinadas12).title("Aceites Domiciliarios Usados")
        map.addMarker(marker12)
        val coordinadas13= LatLng(-34.877682,-56.209099)
        val marker13 = MarkerOptions().position(coordinadas13).title("Aceites Domiciliarios Usados")
        map.addMarker(marker13)
        val coordinadas14= LatLng(-34.846088,-56.150595)
        val marker14 = MarkerOptions().position(coordinadas14).title("Aceites Domiciliarios Usados")
        map.addMarker(marker14)
        val coordinadas15= LatLng(-32.318722,-56.143965)
        val marker15 = MarkerOptions().position(coordinadas15).title("Aceites Domiciliarios Usados")
        map.addMarker(marker15)
        val coordinadas16= LatLng(-34.760345,-55.301020)
        val marker16 = MarkerOptions().position(coordinadas16).title("Aceites Domiciliarios Usados")
        map.addMarker(marker16)


        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinadas, 20f),
            8000,
            null
        ) // zoom animado para un punto x marcado
    }

    // metodo para saber si el permiso esta aceptado la localizacion de la persona
    private fun locacionPersonaPermiso() = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    private fun PermisoRequestLocation() {
        if (!::map.isInitialized) return
        if (locacionPersonaPermiso()) {
            //si
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            map.isMyLocationEnabled = true
        } else {
            //no
            resquestLocationPermission()
        }
    }

//toast si el usuario tiene que ir a configuracion para la localizadion
    private fun resquestLocationPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        ) {
            Toast.makeText(this, "Cambia en ajustes  los permisos de android", Toast.LENGTH_SHORT)
                .show()
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE_LOCATION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {when(requestCode){
        REQUEST_CODE_LOCATION -> if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            map.isMyLocationEnabled =true
        }else{
            Toast.makeText(this,"acepta los permisos y activa la localizacion",Toast.LENGTH_SHORT).show()
        }
    }
    }

}