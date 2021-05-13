package com.example.santiagoFajardo

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapaMetales : AppCompatActivity(), OnMapReadyCallback {

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

        val coordenada152= LatLng(-34.857445,-54.943698)
        val marker152 = MarkerOptions().position(coordenada152).title("Metales").snippet("Ruta 39 KM 9.400 Villa Hípica").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker152)

        val coordenada153= LatLng(-34.781277,-54.943698)
        val marker153 = MarkerOptions().position(coordenada153).title("Metales").snippet("km 80.2 de la ruta Interbalnearia,ecopunto").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker153)


        val coordenada155= LatLng(-34.662355,-56.223565)
        val marker155 = MarkerOptions().position(coordenada155).title("Metales").snippet("Ecopunto Progreso Av.José Artigas esq Cerro Largo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker155)

        val coordenada156= LatLng(-34.774244,-55.758337)
        val marker156 = MarkerOptions().position(coordenada156).title("Metales").snippet("Ecopunto Atlántida Roger Balet 46").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker156)

        val coordenada157= LatLng(-34.842856,-56.008696)
        val marker157 = MarkerOptions().position(coordenada157).title("Metales").snippet("Ecopunto Shangrila G. Zolessi, Ciudad de la Costa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker157)

        val coordenada158= LatLng(-34.649221,-56.062394)
        val marker158 = MarkerOptions().position(coordenada158).title("Metales").snippet("Ecopunto Sauce Av. Artigas y Constitución").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker158)

        val coordenada159= LatLng(-34.725985,-56.201433)
        val marker159 = MarkerOptions().position(coordenada159).title("Metales").snippet("Ecopunto Las Piedras Bulevar del Bicentenario 318, 12400 Parque Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker159)

        val coordenada160= LatLng(-34.778827,-55.839301)
        val marker160 = MarkerOptions().position(coordenada160).title("Metales").snippet("Ecopunto Salinas Av Julieta esq.Yaguareté").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker160)

        val coordenada161= LatLng(-34.763033,-55.725038)
        val marker161 = MarkerOptions().position(coordenada161).title("Metales").snippet("Ecopunto Parque del Plata frente a la Escuela N°153,calle D entre 7 y 8").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker161)

        val coordenada162= LatLng(-34.746347,-55.681650)
        val marker162 = MarkerOptions().position(coordenada162).title("Metales").snippet("Ecopunto La Floresta Larrobla 16, 15300 La Floresta").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker162)

        val coordenada164= LatLng(-34.816196,-56.038485)
        val marker164 = MarkerOptions().position(coordenada164).title("Metales").snippet("Ecopunto Nicolich Jacarandá, Los Paraísos y Los Tilos, frente a la escuela 155").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker164)

        val coordenada165= LatLng(-34.781206,-55.403078)
        val marker165 = MarkerOptions().position(coordenada165).title("Metales").snippet("Ecopunto Jaureguiberry Ruta IB y Av.Gral.José Gervasio Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker165)

        val coordenada166= LatLng(-32.319688,-58.078483)
        val marker166 = MarkerOptions().position(coordenada166).title("Metales").snippet("Liceo 2 - Centro de Entrega Voluntaria (CEV) - José Pedro Varela, 60000 Paysandú").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker166)

        val coordenada167= LatLng(-34.886699,-54.977396)
        val marker167 = MarkerOptions().position(coordenada167).title("Metales").snippet("ANCAP DE CERRO PELADO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker167)

        val coordenada168= LatLng(-34.898801,-54.966626)
        val marker168 = MarkerOptions().position(coordenada168).title("Metales").snippet("SUPER 'EL DORADO' DE CNO. LUSSICH").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        map.addMarker(marker168)



        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordenada156, 20f),
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
                HomeActivity.REQUEST_CODE_LOCATION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {when(requestCode){
        HomeActivity.REQUEST_CODE_LOCATION -> if (grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED){
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
            Toast.makeText(this,"acepta los permisos y activa la localizacion", Toast.LENGTH_SHORT).show()
        }
    }
    }

}