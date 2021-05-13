package com.example.santiagoFajardo

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

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
        val coordenada1= LatLng(-34.449525,-56.080112)
        val marker1 = MarkerOptions().position(coordenada1).title("Aceites Domiciliarios Usados").snippet("Juan B. Durante y Rogelio Martínez, Municipio San Antonio")
        map.addMarker(marker1)

        val coordenada2= LatLng(-34.773011,-55.754397)
        val marker2 = MarkerOptions().position(coordenada2).title("Aceites Domiciliarios Usados").snippet("Roger Balet y Calle 1, Municipio de Atlántida")
        map.addMarker(marker2)

        val coordenada3= LatLng(-34.769616,-55.761266)
        val marker3 = MarkerOptions().position(coordenada3).title("Aceites Domiciliarios Usados").snippet("Gral Artigas y calle 22, Supermercado Disco Atlántida")
        map.addMarker(marker3)

        val coordenada4= LatLng(-34.763019,-55.777725)
        val marker4 = MarkerOptions().position(coordenada4).title("Aceites Domiciliarios Usados").snippet("Calle 15 y 18, Villa Argentina Norte")
        map.addMarker(marker4)

        val coordenada5= LatLng(-34.922740,-56.159124)
        val marker5 = MarkerOptions().position(coordenada5).title("Aceites Domiciliarios Usados").snippet("Ellauri y Solano Garcia")
        map.addMarker(marker5)

        val coordenada6= LatLng(-34.743549,-55.765810)
        val marker6 = MarkerOptions().position(coordenada6).title("Aceites Domiciliarios Usados").snippet("Monseñor José Orzali y Las Archiras, Carnicería Progreso")
        map.addMarker(marker6)

        val coordenada7= LatLng(-34.898311,-56.166918)
        val marker7 = MarkerOptions().position(coordenada7).title("Aceites Domiciliarios Usados").snippet("Av. 18 de Julio 1360, Intendencia de Montevideo")
        map.addMarker(marker7)

        val coordenada8= LatLng(-34.875003,-56.230092)
        val marker8 = MarkerOptions().position(coordenada8).title("Aceites Domiciliarios Usados").snippet("Humboldt 3900, Refineria La Teja")
        map.addMarker(marker8)

        val coordenada9= LatLng(-34.906524,-56.1861123)
        val marker9 = MarkerOptions().position(coordenada9).title("Aceites Domiciliarios Usados").snippet("Avenida 18 de Julio 1360, IMM")
        map.addMarker(marker9)

        val coordenada10= LatLng(-34.897013,-56.171132)
        val marker10 = MarkerOptions().position(coordenada10).title("Aceites Domiciliarios Usados").snippet("Dr. Joaquín Requena 1701")
        map.addMarker(marker10)

        val coordenada11= LatLng(-34.871941,-56.213436)
        val marker11 = MarkerOptions().position(coordenada11).title("Aceites Domiciliarios Usados").snippet("Capurro y Juan María Gutiérrez, Escuela n° 47 Capurro")
        map.addMarker(marker11)

        val coordenada12= LatLng(-34.865143,-56.209099)
        val marker12 = MarkerOptions().position(coordenada12).title("Aceites Domiciliarios Usados").snippet("Avda. Agraciada y Francisco Gómez, Supermercado Devoto")
        map.addMarker(marker12)

        val coordenada13= LatLng(-34.862815,-56.150595)
        val marker13 = MarkerOptions().position(coordenada13).title("Aceites Domiciliarios Usados").snippet("Av. José Pedro Varela y Pres. Ing. José Serrato, Cutcsa")
        map.addMarker(marker13)

        val coordenada14= LatLng(-34.877682,-56.143965)
        val marker14 = MarkerOptions().position(coordenada14).title("Aceites Domiciliarios Usados").snippet("Asilo 3579, Centro Comunal Zona 6")
        map.addMarker(marker14)

        val coordenada15= LatLng(-34.846088,-55.301020)
        val marker15 = MarkerOptions().position(coordenada15).title("Aceites Domiciliarios Usados").snippet("Misiones y Ruta 10 (Parada 9), Supermercado Los Macaquitos")
        map.addMarker(marker15)

        val coordenada16= LatLng(-32.318772,-58.085560)
        val marker16 = MarkerOptions().position(coordenada16).title("Aceites Domiciliarios Usados").snippet("Sarandí y Montevideo")
        map.addMarker(marker16)

        val coordenada17= LatLng(-34.760345,-55.737988)
        val marker17 = MarkerOptions().position(coordenada17).title("Aceites Domiciliarios Usados").snippet("Toscas – km 48 de ruta Interbalnearia Estación ANCAP – Las Toscas")
        map.addMarker(marker17)

        val coordenada18= LatLng(-34.781410,-55.403952)
        val marker18 = MarkerOptions().position(coordenada18).title("Aceites Domiciliarios Usados").snippet("Calle 1, Jaureguiberry Escuela Sustentable")
        map.addMarker(marker18)

        val coordenada19= LatLng(-34.846053,-55.301091)
        val marker19 = MarkerOptions().position(coordenada19).title("Aceites Domiciliarios Usados").snippet("Misiones esq. Ruta 10 (Parada 9) Supermercado Los Macaquitos Piriápolis")
        map.addMarker(marker19)

        val coordenada20= LatLng(-34.839391,-55.265068)
        val marker20 = MarkerOptions().position(coordenada20).title("Aceites Domiciliarios Usados").snippet("Ruta 37 esq. Jandro Guerra Centro comunal Pueblo Obrero Piriápolis")
        map.addMarker(marker20)

        val coordenada21= LatLng(-34.865556,-55.269403)
        val marker21 = MarkerOptions().position(coordenada21).title("Aceites Domiciliarios Usados").snippet("Avda. Piria y Buenos Aires Supermercado Devoto Piriápolis")
        map.addMarker(marker21)

        val coordenada22= LatLng(-32.318719,-58.085276)
        val marker22 = MarkerOptions().position(coordenada22).title("Aceites Domiciliarios Usados").snippet("Sarandí esquina Montevideo Mercado Municipal")
        map.addMarker(marker22)

        val coordenada23= LatLng(-34.875091,-56.230102)
        val marker23 = MarkerOptions().position(coordenada23).title("Aceites Domiciliarios Usados").snippet("Humboldt 3900 Refinería de la Teja Municipio A")
        map.addMarker(marker23)

        val coordenada25= LatLng(-34.897319,-56.171175)
        val marker25 = MarkerOptions().position(coordenada25).title("Aceites Domiciliarios Usados").snippet("Joaquín Requena 1701 Plaza Seregni y sede Municipio B")
        map.addMarker(marker25)

        val coordenada26= LatLng(-34.871448,-56.213500)
        val marker26 = MarkerOptions().position(coordenada26).title("Aceites Domiciliarios Usados").snippet("Capurro y Juan María Gutiérrez Escuela N°47 Capurro Municipio C")
        map.addMarker(marker26)

        val coordenada28= LatLng(-34.865128,-56.209805)
        val marker28 = MarkerOptions().position(coordenada28).title("Aceites Domiciliarios Usados").snippet("Avda. Agraciada y Francisco Gómez Supermercado Devoto Municipio C")
        map.addMarker(marker28)

        val coordenada29= LatLng(-34.861669,-56.149577)
        val marker29 = MarkerOptions().position(coordenada29).title("Aceites Domiciliarios Usados").snippet("Av. José Pedro Varela casi Serrato CUTCSA Municipio C")
        map.addMarker(marker29)

        val coordenada30= LatLng(-34.922956,-56.159136)
        val marker30 = MarkerOptions().position(coordenada30).title("Aceites Domiciliarios Usados").snippet("Ellauri 400 esquina Solano García Centro Comunal Zonal 5 Municipio CH")
        map.addMarker(marker30)

        val coordenada31= LatLng(-34.877925,-56.143973)
        val marker31 = MarkerOptions().position(coordenada31).title("Aceites Domiciliarios Usados").snippet("Asilo 3579 esquina Pernas Centro Comunal Zonal 6 Municipio E")
        map.addMarker(marker31)

        val coordenada32= LatLng(-34.895068,-56.099330)
        val marker32 = MarkerOptions().position(coordenada32).title("Aceites Domiciliarios Usados").snippet("Aconcagua 5062 esquina Michigan Centro Comunal Zonal 7 Municipio E")
        map.addMarker(marker32)

        val coordenada33= LatLng(-34.878244,-56.089072)
        val marker33 = MarkerOptions().position(coordenada33).title("Aceites Domiciliarios Usados").snippet("Av Bolivia s/n - Estadio Charrúa Centro Comunal Zonal 8 y sede Municipio E")
        map.addMarker(marker33)

        val coordenada34= LatLng(-34.858791,-56.133339)
        val marker34 = MarkerOptions().position(coordenada34).title("Aceites Domiciliarios Usados").snippet("8 de Octubre 4700 esquina Marcos Sastre Centro Comunal Zonal 9 y sede Municipio F")
        map.addMarker(marker34)

        val coordenada35= LatLng(-34.857023,-56.132775)
        val marker35 = MarkerOptions().position(coordenada35).title("Aceites Domiciliarios Usados").snippet("8 de Octubre 4786 esquina Vicenza Disco Curva de Maroñas Municipio F")
        map.addMarker(marker35)

        val coordenada36= LatLng(-34.829502,-56.113779)
        val marker36 = MarkerOptions().position(coordenada36).title("Aceites Domiciliarios Usados").snippet("Rambla Blanco Acevedo y Florencia Plaza Alba Roballo Municipio F")
        map.addMarker(marker36)



        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordenada1, 20f),
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