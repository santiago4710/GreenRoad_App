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
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapaCartonPapel : AppCompatActivity(), OnMapReadyCallback {

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

    // cuando el mapa ya a sido creado significa
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        PermisoRequestLocation()
        crearMarcador() // crearemos un marcador
    }

    private fun crearMarcador() {

        val coordenada49= LatLng(-32.359566,-57.199344)
        val marker49 = MarkerOptions().position(coordenada49).title("Cartón y Papel").snippet("Dr.Angel Olazabal 335/GuichonDr.Angel Olazabal 335/Guichon").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker49)

        val coordenada50= LatLng(-32.125850,-55.009867)
        val marker50 = MarkerOptions().position(coordenada50).title("Cartón y Papel").snippet("Alberto Gallinal/Las TOscas de Caraguata").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker50)

        val coordenada51= LatLng(-33.510269,-57.799952)
        val marker51 = MarkerOptions().position(coordenada51).title("Cartón y Papel").snippet("O rcoyen s/n Palmitas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker51)

        val coordenada52= LatLng(-33.232748,-54.387806)
        val marker52 = MarkerOptions().position(coordenada52).title("Cartón y Papel").snippet("Manuel Freire 1370").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker52)

        val coordenada54= LatLng(-34.781277,-54.943698)
        val marker54 = MarkerOptions().position(coordenada54).title("Cartón y Papel").snippet("km 80.2 de la ruta Interbalnearia,ecopunto").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker54)

        val coordenada55= LatLng(-34.720187,-55.675291)
        val marker55 = MarkerOptions().position(coordenada55).title("Cartón y Papel").snippet("Ecopunto Canelones/Larrob 16 La Floresta").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker55)

        val coordenada56= LatLng(-34.66355,-56.223565)
        val marker56 = MarkerOptions().position(coordenada56).title("Cartón y Papel").snippet("Ecopunto Progreso Av.José Artigas esq Cerro Largo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker56)

        val coordenada57= LatLng(-34.774244,-55.758337)
        val marker57 = MarkerOptions().position(coordenada57).title("Cartón y Papel").snippet("Ecopunto Atlántida Roger Balet 46").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker57)

        val coordenada58= LatLng(-34.842856,-56.008696)
        val marker58 = MarkerOptions().position(coordenada58).title("Cartón y Papel").snippet("Ecopunto Shangrila G. Zolessi, Ciudad de la Costa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker58)

        val coordenada59= LatLng(-34.649221,-56.062394)
        val marker59 = MarkerOptions().position(coordenada59).title("Cartón y Papel").snippet("Ecopunto Sauce Av. Artigas y Constitución").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker59)

        val coordenada60= LatLng(-34.725985,-56.201433)
        val marker60 = MarkerOptions().position(coordenada60).title("Cartón y Papel").snippet("Ecopunto Las Piedras Bulevar del Bicentenario 318, 12400 Parque Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker60)

        val coordenada61= LatLng(-34.778827,-55.839301)
        val marker61 = MarkerOptions().position(coordenada61).title("Cartón y Papel").snippet("Ecopunto Salinas Av Julieta esq.Yaguareté").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker61)

        val coordenada62= LatLng(-34.763033,-55.725038)
        val marker62 = MarkerOptions().position(coordenada62).title("Cartón y Papel").snippet("Ecopunto Parque del Plata frente a la Escuela N°153,calle D entre 7 y 8").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker62)

        val coordenada63= LatLng(-34.746347,-55.681650)
        val marker63 = MarkerOptions().position(coordenada63).title("Cartón y Papel").snippet("Ecopunto La Floresta Larrobla 16, 15300 La Floresta").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker63)

        val coordenada65= LatLng(-34.816196,-56.038485)
        val marker65 = MarkerOptions().position(coordenada65).title("Cartón y Papel").snippet("Ecopunto Nicolich Jacarandá, Los Paraísos y Los Tilos, frente a la escuela 155").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker65)

        val coordenada66= LatLng(-34.781206,-55.403078)
        val marker66 = MarkerOptions().position(coordenada66).title("Cartón y Papel").snippet("Ecopunto Jaureguiberry Ruta IB y Av.Gral.José Gervasio Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker66)

        val coordenada67= LatLng(-32.319688,-58.078483)
        val marker67 = MarkerOptions().position(coordenada67).title("Cartón y Papel").snippet("Liceo 2 - Centro de Entrega Voluntaria (CEV) - José Pedro Varela, 60000 Paysandú").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker67)

        val coordenada68= LatLng(-32.346072,-58.096109)
        val marker68 = MarkerOptions().position(coordenada68).title("Cartón y Papel").snippet("Escuela n° 25; Chacras de San Felix").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker68)

        val coordenada69= LatLng(-32.304461,-58.086584)
        val marker69 = MarkerOptions().position(coordenada69).title("Cartón y Papel").snippet("Escuelas n° 33 y n° 107; Luis Batlle Berres 1550").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker69)

        val coordenada70= LatLng(-32.316411,-58.068600)
        val marker70 = MarkerOptions().position(coordenada70).title("Cartón y Papel").snippet("Escuelas n°42 y n°100; Joaquin Suarez 1091Escuelas n°42 y n°100; Joaquin Suarez 1091").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker70)

        val coordenada71= LatLng(-32.320224,-58.059471)
        val marker71 = MarkerOptions().position(coordenada71).title("Cartón y Papel").snippet("Escuelas n°11 y n° 98; Roger Ballet 2239").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker71)

        val coordenada72= LatLng(-32.299108,-58.076200)
        val marker72 = MarkerOptions().position(coordenada72).title("Cartón y Papel").snippet("Escuelas n°57 y n° 102; Vizconde de Maua 1950").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker72)

        val coordenada73= LatLng(-32.280044,-58.068823)
        val marker73 = MarkerOptions().position(coordenada73).title("Cartón y Papel").snippet("Escuela n° 111; Asunción y Venezuela s/n").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker73)

        val coordenada74= LatLng(-32.280044,-58.068823)
        val marker74 = MarkerOptions().position(coordenada74).title("Cartón y Papel").snippet("Escuela n° 112; Joaquin Suarez 579").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker74)

        val coordenada75= LatLng(-32.332814,-58.071840)
        val marker75 = MarkerOptions().position(coordenada75).title("Cartón y Papel").snippet("Escuela n° 114; Av.José de San Martín 1700").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker75)

        val coordenada76= LatLng(-32.315593,-58.092953)
        val marker76 = MarkerOptions().position(coordenada76).title("Cartón y Papel").snippet("Liceo 1 y 5; 18 de Julio y Silván Fernández.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker76)

        val coordenada77= LatLng(-32.294513,-58.054573)
        val marker77 = MarkerOptions().position(coordenada77).title("Cartón y Papel").snippet("Escuela n° 15; Enrique Chaplin 2359").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker77)

        val coordenada78= LatLng(-32.261426,-58.083515)
        val marker78 = MarkerOptions().position(coordenada78).title("Cartón y Papel").snippet("Polo Tecnológico; José P.Varela y Sarandí").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker78)

        val coordenada79= LatLng(-32.316935,-58.079026)
        val marker79 = MarkerOptions().position(coordenada79).title("Cartón y Papel").snippet("Colegio del Rosario; Florida y Vizconde de Mauá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker79)

        val coordenada80= LatLng(-32.320290,-58.070042)
        val marker80 = MarkerOptions().position(coordenada80).title("Cartón y Papel").snippet("Mafalda; Sarandí casi Bulevar Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker80)

        val coordenada81= LatLng(-32.315537,-58.060319)
        val marker81 = MarkerOptions().position(coordenada81).title("Cartón y Papel").snippet("Caif 'Enanitos'; Ciudad de Young y Proyectada 12").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker81)

        val coordenada82= LatLng(-32.333570,-58.076018)
        val marker82 = MarkerOptions().position(coordenada82).title("Cartón y Papel").snippet("Caif 'Sta.Mónica'; Dr.Felippone y Benito Chaín").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker82)

        val coordenada83= LatLng(-32.322306,-58.090000)
        val marker83 = MarkerOptions().position(coordenada83).title("Cartón y Papel").snippet("Escuela Padre Lamas; Independencia y Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker83)

        val coordenada84= LatLng(-32.269913,-58.054146)
        val marker84 = MarkerOptions().position(coordenada84).title("Cartón y Papel").snippet("Melchora Cuenca UTU; Avenida de las Américas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker84)

        val coordenada85= LatLng(-32.323971,-58.083551)
        val marker85 = MarkerOptions().position(coordenada85).title("Cartón y Papel").snippet("Departamento de Servicios; Río Negro casi Luis A.de Herrera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker85)

        val coordenada86= LatLng(-32.316447,-58.076669)
        val marker86 = MarkerOptions().position(coordenada86).title("Cartón y Papel").snippet("Colegio Liberty; Cerrito casi Uruguay").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker86)

        val coordenada87= LatLng(-32.313289,-58.095405)
        val marker87 = MarkerOptions().position(coordenada87).title("Cartón y Papel").snippet("Escuela n°1;Zelmar Michelini y Uruguay").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker87)

        val coordenada88= LatLng(-32.314230,-58.085446)
        val marker88 = MarkerOptions().position(coordenada88).title("Cartón y Papel").snippet("Escuela n° 94; Treinta y Tres Orientales casi Charrúas.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker88)

        val coordenada89= LatLng(-32.322880,-58.047435)
        val marker89 = MarkerOptions().position(coordenada89).title("Cartón y Papel").snippet("Escuela n°93; Trebol").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker89)

        val coordenada90= LatLng(-32.317459,-58.087427)
        val marker90 = MarkerOptions().position(coordenada90).title("Cartón y Papel").snippet("Estacion ESSO; L.Gomez y Setembrino Pereda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker90)

        val coordenada91= LatLng(-32.314050,-58.083180)
        val marker91 = MarkerOptions().position(coordenada91).title("Cartón y Papel").snippet("Charruas y 19 de abril").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker91)

        val coordenada92= LatLng(-32.321142,-58.059280)
        val marker92 = MarkerOptions().position(coordenada92).title("Cartón y Papel").snippet("Estacion Petrobras;Republica Argentina y Limite Este").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker92)

        val coordenada93= LatLng(-32.317095,-58.082705)
        val marker93 = MarkerOptions().position(coordenada93).title("Cartón y Papel").snippet("Confiteria Las Familias;18 de julio y Luis Alberto de Herrera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker93)

        val coordenada94= LatLng(-32.319164,-58.081794)
        val marker94 = MarkerOptions().position(coordenada94).title("Cartón y Papel").snippet("Palacio Municipal;Sarandi y Zorrilla de San Martin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker94)

        val coordenada95= LatLng(-32.314896,-58.070268)
        val marker95 = MarkerOptions().position(coordenada95).title("Cartón y Papel").snippet("Super TATA;Washington y Bulevar Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker95)

        val coordenada96= LatLng(-32.296742,-58.077429)
        val marker96 = MarkerOptions().position(coordenada96).title("Cartón y Papel").snippet("Barriol7;Zorrila de San Martin casi purificadora(n°6)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker96)

        val coordenada97= LatLng(-32.294148,-58.083490)
        val marker97 = MarkerOptions().position(coordenada97).title("Cartón y Papel").snippet("Barrio covisan 6; Setembrino Pereda y Batalla de Las Piedras(n°7)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker97)

        val coordenada98= LatLng(-32.298663,-58.075374)
        val marker98 = MarkerOptions().position(coordenada98).title("Cartón y Papel").snippet("Barrio covisan 9; Vizconde de maúa e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker98)

        val coordenada99= LatLng(-32.296824,-58.077461)
        val marker99 = MarkerOptions().position(coordenada99).title("Cartón y Papel").snippet("Barrio covisan 10; Zorrilla de San Martin casi Purificadora(n°6)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker99)

        val coordenada102= LatLng(-32.300010,-58.072572)
        val marker102 = MarkerOptions().position(coordenada102).title("Cartón y Papel").snippet("Barrio Covipay; Juntal y Éxodo(N°4)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker102)

        val coordenada103= LatLng(-32.294346,-58.075181)
        val marker103 = MarkerOptions().position(coordenada103).title("Cartón y Papel").snippet("Barrio CoviAM;Vizconde de maúa y Yapeyú (n°8)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker103)

        val coordenada104= LatLng(-32.299111,-58.073748)
        val marker104 = MarkerOptions().position(coordenada104).title("Cartón y Papel").snippet("Barrio CoviOSE; Cerrito e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker104)

        val coordenada105= LatLng(-32.298226,-58.080000)
        val marker105 = MarkerOptions().position(coordenada105).title("Cartón y Papel").snippet("Barrio CoviHEL; paralela a DR.Roldan e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker105)

        val coordenada106= LatLng(-32.301455,-58.075925)
        val marker106 = MarkerOptions().position(coordenada106).title("Cartón y Papel").snippet("Barrio Paycap; Vizconde de Maúa y Andresito(n°3)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker106)

        val coordenada108= LatLng(-32.349404,-58.100402)
        val marker108 = MarkerOptions().position(coordenada108).title("Cartón y Papel").snippet("Caif San Felix; Barrio San Felix").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker108)

        val coordenada109= LatLng(-32.331933,-58.071092)
        val marker109 = MarkerOptions().position(coordenada109).title("Cartón y Papel").snippet("Carcel Departamental; Avda Jose de San Martin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker109)

        val coordenada110= LatLng(-32.380623,-58.054291)
        val marker110 = MarkerOptions().position(coordenada110).title("Cartón y Papel").snippet("EEMAC- Ruta 3").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker110)

        val coordenada111= LatLng(-32.308933,-58.063561)
        val marker111 = MarkerOptions().position(coordenada111).title("Cartón y Papel").snippet("Escuela n°89; Proyectada 26 Norte").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker111)

        val coordenada112= LatLng(-34.886699,-54.977396)
        val marker112 = MarkerOptions().position(coordenada112).title("Cartón y Papel").snippet("ANCAP DE CERRO PELADO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker112)

        val coordenada113= LatLng(-34.898801,-54.966626)
        val marker113 = MarkerOptions().position(coordenada113).title("Cartón y Papel").snippet("SUPER EL 'DORADO' DE CNO. LUSSICH").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        map.addMarker(marker113)


        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordenada80, 20f),
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
        HomeActivity.REQUEST_CODE_LOCATION -> if (grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
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