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


class MapaVidrios : AppCompatActivity(), OnMapReadyCallback {

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

        val coordenada1 = LatLng(-34.915862,-56.165782)
        val marker1 = MarkerOptions().position(coordenada1).title("Vidrios").snippet("Avda. Herrera y Reissing esq. J. Filgueiras").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker1)

        val coordenada2 = LatLng(-34.456792,-56.387083)
        val marker2 = MarkerOptions().position(coordenada2).title("Vidrios").snippet("Rivera y Nardone/Super El Timon").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker2)

        val coordenada3 = LatLng(-34.781277,-55.403020)
        val marker3 = MarkerOptions().position(coordenada3).title("Vidrios").snippet("km 80.2 de la ruta Interbalnearia,ecopunto").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker3)

        val coordenada4 = LatLng(-34.814949,-56.004881)
        val marker4 = MarkerOptions().position(coordenada4).title("Vidrios").snippet("Ecopunto Canelones/G.Zolessi Shangrila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker4)

        val coordenada5 = LatLng(-34.662355,-56.223565)
        val marker5 = MarkerOptions().position(coordenada5).title("Vidrios").snippet("Ecopunto Progreso Av.José Artigas esq Cerro Largo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker5)

        val coordenada6 = LatLng(-34.774244,-55.758337)
        val marker6 = MarkerOptions().position(coordenada6).title("Vidrios").snippet("Ecopunto Atlántida Roger Balet 46").icon(
            BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker6)

        val coordenada7 = LatLng(-34.842856,-56.008696)
        val marker7 = MarkerOptions().position(coordenada7).title("Vidrios").snippet("Ecopunto Shangrila G. Zolessi, Ciudad de la Costa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker7)

        val coordenada8 = LatLng(-34.649221,-56.062394)
        val marker8 = MarkerOptions().position(coordenada8).title("Vidrios").snippet("Ecopunto Sauce  Av. Artigas y Constitución").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker8)

        val coordenada9 = LatLng(-34.725985,-56.201433)
        val marker9 = MarkerOptions().position(coordenada9).title("Vidrios").snippet("Ecopunto  Las Piedras Bulevar del Bicentenario 318, 12400  Parque Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker9)

        val coordenada10 = LatLng(-34.778827,-55.839301)
        val marker10 = MarkerOptions().position(coordenada10).title("Vidrios").snippet("Ecopunto Salinas Av Julieta esq.Yaguareté").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker10)

        val coordenada11 = LatLng(-34.763033,-55.725038)
        val marker11 = MarkerOptions().position(coordenada11).title("Vidrios").snippet("Ecopunto Parque del Plata  frente a la Escuela N°153,calle D entre 7 y 8").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker11)

        val coordenada12 = LatLng(-34.746347,-55.681650)
        val marker12 = MarkerOptions().position(coordenada12).title("Vidrios").snippet("Ecopunto La Floresta Larrobla 16, 15300 La Floresta").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker12)

        val coordenada13 = LatLng(-34.816196,-56.038485)
        val marker13 = MarkerOptions().position(coordenada13).title("Vidrios").snippet("Ecopunto Nicolich Jacarandá, Los Paraísos y Los Tilos, frente a la escuela 155").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker13)

        val coordenada14 = LatLng(-34.781206,-55.403078)
        val marker14 = MarkerOptions().position(coordenada14).title("Vidrios").snippet("Ecopunto Jaureguiberry Ruta IB y Av.Gral.José Gervasio Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker14)

        val coordenada15 = LatLng(-32.319688,-58.078483)
        val marker15 = MarkerOptions().position(coordenada15).title("Vidrios").snippet("Liceo 2 - Centro de Entrega Voluntaria (CEV) - José Pedro Varela, 60000 Paysandú").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker15)

        val coordenada16 = LatLng(-32.346072,-58.096109)
        val marker16 = MarkerOptions().position(coordenada16).title("Vidrios").snippet("Escuela n° 25; Chacras de San Felix").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker16)

        val coordenada17 = LatLng(-32.304461,-58.086584)
        val marker17 = MarkerOptions().position(coordenada17).title("Vidrios").snippet("Escuelas n° 33 y n° 107; Luis Batlle Berres 1550").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker17)

        val coordenada18 = LatLng(-32.316411,-58.068600)
        val marker18 = MarkerOptions().position(coordenada18).title("Vidrios").snippet("Escuelas n°42 y n°100; Joaquin Suarez 1091").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker18)

        val coordenada19 = LatLng(-32.320224,-58.059471)
        val marker19 = MarkerOptions().position(coordenada19).title("Vidrios").snippet("Escuelas n°11 y n° 98; Roger Ballet 2239").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker19)

        val coordenada20 = LatLng(-32.299108,-58.076200)
        val marker20 = MarkerOptions().position(coordenada20).title("Vidrios").snippet("Escuelas n°57 y n° 102; Vizconde de Maua 1950").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker20)

        val coordenada23 = LatLng(-32.332814,-58.071840)
        val marker23 = MarkerOptions().position(coordenada23).title("Vidrios").snippet("Escuela n° 114; Av.José de San Martín 1700").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker23)

        val coordenada24 = LatLng(-32.315593,-58.092953)
        val marker24 = MarkerOptions().position(coordenada24).title("Vidrios").snippet("Liceo 1 y 5; 18 de Julio y Silván Fernández.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker24)

        val coordenada25 = LatLng(-32.294513,-58.054573)
        val marker25 = MarkerOptions().position(coordenada25).title("Vidrios").snippet("Escuela n° 15; Enrique Chaplin 2359").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker25)

        val coordenada26 = LatLng(-32.261426,-58.083515)
        val marker26 = MarkerOptions().position(coordenada26).title("Vidrios").snippet("Polo Tecnológico; José P.Varela y Sarandí").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker26)

        val coordenada27 = LatLng(-32.316935,-58.079026)
        val marker27 = MarkerOptions().position(coordenada27).title("Vidrios").snippet("Colegio del Rosario; Florida y Vizconde de Mauá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker27)

        val coordenada28 = LatLng(-32.320290,-58.070042)
        val marker28 = MarkerOptions().position(coordenada28).title("Vidrios").snippet("Mafalda; Sarandí casi Bulevar Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker28)

        val coordenada29 = LatLng(-32.315537,-58.060319)
        val marker29 = MarkerOptions().position(coordenada29).title("Vidrios").snippet("Caif 'Enanitos'; Ciudad de Young y Proyectada 12").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker29)

        val coordenada30 = LatLng(-32.333570,-58.076018)
        val marker30 = MarkerOptions().position(coordenada30).title("Vidrios").snippet("Caif 'Sta.Mónica'; Dr.Felippone y Benito Chaín ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker30)

        val coordenada31 = LatLng(-32.322306,-58.090000)
        val marker31 = MarkerOptions().position(coordenada31).title("Vidrios").snippet("Escuela Padre Lamas; Independencia y Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker31)

        val coordenada32 = LatLng(-32.269913,-58.054146)
        val marker32 = MarkerOptions().position(coordenada32).title("Vidrios").snippet("Melchora Cuenca UTU; Avenida de las Américas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker32)

        val coordenada33 = LatLng(-32.323971,-58.083551)
        val marker33 = MarkerOptions().position(coordenada33).title("Vidrios").snippet("Departamento de Servicios; Río Negro casi Luis A.de Herrera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker33)

        val coordenada34 = LatLng(-32.316447,-58.076669)
        val marker34 = MarkerOptions().position(coordenada34).title("Vidrios").snippet("Colegio Liberty; Cerrito casi Uruguay").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker34)

        val coordenada35 = LatLng(-32.313289,-58.095405)
        val marker35 = MarkerOptions().position(coordenada35).title("Vidrios").snippet("Escuela n°1;Zelmar Michelini y Uruguay").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker35)

        val coordenada36 = LatLng(-32.314230,-58.085446)
        val marker36 = MarkerOptions().position(coordenada36).title("Vidrios").snippet("Escuela n° 94; Treinta y Tres Orientales casi Charrúas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker36)

        val coordenada37 = LatLng(-32.322880,-58.047435)
        val marker37 = MarkerOptions().position(coordenada37).title("Vidrios").snippet("Escuela n°93; Trebol").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker37)

        val coordenada38 = LatLng(-32.317459,-58.087427)
        val marker38 = MarkerOptions().position(coordenada38).title("Vidrios").snippet("Estacion ESSO; L.Gomez y Setembrino Pereda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker38)

        val coordenada39 = LatLng(-32.314050,-58.083180)
        val marker39 = MarkerOptions().position(coordenada39).title("Vidrios").snippet("Charruas y 19 de abril").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker39)

        val coordenada40 = LatLng(-32.321142,-58.059280)
        val marker40 = MarkerOptions().position(coordenada40).title("Vidrios").snippet("Estacion Petrobras;Republica Argentina y Limite Este").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker40)

        val coordenada41 = LatLng(-32.317095,-58.082705)
        val marker41 = MarkerOptions().position(coordenada41).title("Vidrios").snippet("Confiteria Las Familias;18 de julio y Luis Alberto de Herrera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker41)

        val coordenada42 = LatLng(-32.319164,-58.081794)
        val marker42 = MarkerOptions().position(coordenada42).title("Vidrios").snippet("Palacio Municipal;Sarandi y Zorrilla de San Martin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker42)

        val coordenada43 = LatLng(-32.314896,-58.070268)
        val marker43 = MarkerOptions().position(coordenada43).title("Vidrios").snippet("Super TATA;Washington y Bulevar Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker43)

        val coordenada44 = LatLng(-32.296742,-58.077429)
        val marker44 = MarkerOptions().position(coordenada44).title("Vidrios").snippet("Barriol7;Zorrila de San Martin casi purificadora(n°6)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker44)

        val coordenada45 = LatLng(-32.294148,-58.083490)
        val marker45 = MarkerOptions().position(coordenada45).title("Vidrios").snippet("Barrio covisan 6; Setembrino Pereda y Batalla de Las Piedras(n°7)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker45)

        val coordenada46 = LatLng(-32.298663,-58.075374)
        val marker46 = MarkerOptions().position(coordenada46).title("Vidrios").snippet("Barrio covisan 9; Vizconde de maúa e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker46)

        val coordenada47 = LatLng(-32.296824,-58.077461)
        val marker47 = MarkerOptions().position(coordenada47).title("Vidrios").snippet("Barrio covisan 10; Zorrilla de San Martin casi Purificadora(n°6)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker47)

        val coordenada48 = LatLng(-32.300010,-58.072572)
        val marker48 = MarkerOptions().position(coordenada48).title("Vidrios").snippet("Barrio Covipay; Juntal y Éxodo(N°4)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker48)

        val coordenada49 = LatLng(-32.294346,-58.075181)
        val marker49 = MarkerOptions().position(coordenada49).title("Vidrios").snippet("Barrio CoviAM;Vizconde de maúa y Yapeyú (n°8)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker49)

        val coordenada50 = LatLng(-32.299111,-58.073748)
        val marker50 = MarkerOptions().position(coordenada50).title("Vidrios").snippet("Barrio CoviOSE; Cerrito e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker50)

        val coordenada51 = LatLng(-32.298226,-58.080000)
        val marker51 = MarkerOptions().position(coordenada51).title("Vidrios").snippet("Barrio CoviHEL; paralela a DR.Roldan e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker51)

        val coordenada52 = LatLng(-32.301455,-58.075925)
        val marker52 = MarkerOptions().position(coordenada52).title("Vidrios").snippet("Barrio Paycap; Vizconde de Maúa y Andresito(n°3)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker52)

        val coordenada53 = LatLng(-32.349404,-58.100402)
        val marker53 = MarkerOptions().position(coordenada53).title("Vidrios").snippet("Caif San Felix; Barrio San Felix").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker53)

        val coordenada54 = LatLng(-32.331933,-58.071092)
        val marker54 = MarkerOptions().position(coordenada54).title("Vidrios").snippet("Carcel Departamental;Avda Jose de San Martin ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker54)

        val coordenada55 = LatLng(-32.380623,-58.054291)
        val marker55 = MarkerOptions().position(coordenada55).title("Vidrios").snippet("EEMAC; Ruta 3").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker55)

        val coordenada56 = LatLng(-32.308933,-58.063561)
        val marker56 = MarkerOptions().position(coordenada56).title("Vidrios").snippet("Escuela n°89; Proyectada 26 Norte").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker56)

        val coordenada57 = LatLng(-34.886699,-54.977396)
        val marker57 = MarkerOptions().position(coordenada57).title("Vidrios").snippet("ANCAP DE CERRO PELADO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker57)

        val coordenada58 = LatLng(-34.898801,-54.966626)
        val marker58 = MarkerOptions().position(coordenada58).title("Vidrios").snippet("SUPER 'EL DORADO' DE CNO. LUSSICH").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        map.addMarker(marker58)

        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordenada25, 20f),
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