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

class MapaPilas : AppCompatActivity(), OnMapReadyCallback {

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

        val coordenada249= LatLng(-34.910831,-56.163278)
        val marker249 = MarkerOptions().position(coordenada249).title("Pilas").snippet("Avenida Bulevar Artigas y Bulevar España").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker249)

        val coordenada250= LatLng(-34.913934,-56.153285)
        val marker250 = MarkerOptions().position(coordenada250).title("Pilas").snippet("Ellauri y Bulevar España").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker250)

        val coordenada251= LatLng(-34.909752,-56.193189)
        val marker251 = MarkerOptions().position(coordenada251).title("Pilas").snippet("Maldonado y Rio Negro, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker251)

        val coordenada252= LatLng(-34.908135,-56.183071)
        val marker252 = MarkerOptions().position(coordenada252).title("Pilas").snippet("Andrés Martínez Trueba y Canelones, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker252)

        val coordenada253= LatLng(-34.898311,-56.166918)
        val marker253 = MarkerOptions().position(coordenada253).title("Pilas").snippet("Avenida 18 de Julio y Acevedo Díaz, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker253)

        val coordenada254= LatLng(-34.842084,-56.209827)
        val marker254 = MarkerOptions().position(coordenada254).title("Pilas").snippet("Molinos de Raffo y Avenida Millán, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker254)

        val coordenada255= LatLng(-34.851582,-56.208743)
        val marker255 = MarkerOptions().position(coordenada255).title("Pilas").snippet("Av. Islas Canarias y Camino Castro, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker255)

        val coordenada256= LatLng(-34.862863,-56.179120)
        val marker256 = MarkerOptions().position(coordenada256).title("Pilas").snippet("Av. Gral. San Martín y Av. Dr. Luis Alberto de Herrera, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker256)

        val coordenada257= LatLng(-34.863658,-56.233151)
        val marker257 = MarkerOptions().position(coordenada257).title("Pilas").snippet("Gral Agustín Muñoz y Av. Carlos María Ramírez, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker257)

        val coordenada258= LatLng(-34.888905,-56.057251)
        val marker258 = MarkerOptions().position(coordenada258).title("Pilas").snippet("Dr Gabriel Otero y Av Alfredo Arocena, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker258)

        val coordenada259= LatLng(-34.894345,-56.094926)
        val marker259 = MarkerOptions().position(coordenada259).title("Pilas").snippet("Mississipi y Aconcagua, contenedor").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker259)

        val coordenada260= LatLng(-34.895729,-56.099700)
        val marker260 = MarkerOptions().position(coordenada260).title("Pilas").snippet("Orinoco y Michigan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker260)

        val coordenada261= LatLng(-34.923561,-56.157308)
        val marker261 = MarkerOptions().position(coordenada261).title("Pilas").snippet("Solano Garcia esq V.Solino").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker261)

        val coordenada262= LatLng(-34.866615,-56.180454)
        val marker262 = MarkerOptions().position(coordenada262).title("Pilas").snippet("Macro Mercado Casa Central San Martín 3222").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker262)

        val coordenada263= LatLng(-30.921055,-55.539715)
        val marker263 = MarkerOptions().position(coordenada263).title("Pilas").snippet("Macro Mercado Rivera Julio M.Sosa 1726 esq. Guido Machado Brun (Ruta 5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker263)

        val coordenada264= LatLng(-34.823884,-56.102168)
        val marker264 = MarkerOptions().position(coordenada264).title("Pilas").snippet("Macro Mercado Punta de Rieles Cno. Maldonado 6783").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker264)

        val coordenada265= LatLng(-34.869558,-56.022337)
        val marker265 = MarkerOptions().position(coordenada265).title("Pilas").snippet("Macro Mercado Av. al Parque Roosevelt 2495 entre Arizona y Alta Gracia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker265)

        val coordenada266= LatLng(-34.861690,-56.231375)
        val marker266 = MarkerOptions().position(coordenada266).title("Pilas").snippet("Macro Mercado La Teja Carlos María Ramírez 574 entre Ameghino y Laureles").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker266)

        val coordenada267= LatLng(-34.915769,-54.945536)
        val marker267 = MarkerOptions().position(coordenada267).title("Pilas").snippet("Macro Mercado Maldonado Bvar. Artigas s/n esquina 3 de Febrero").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker267)

        val coordenada268= LatLng(-34.839146,-56.262912)
        val marker268 = MarkerOptions().position(coordenada268).title("Pilas").snippet("Macro Mercado Paso de la Arena Luis Batlle Berres 6149").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        map.addMarker(marker268)




        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordenada250, 20f),
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