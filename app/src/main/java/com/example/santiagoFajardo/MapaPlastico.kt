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



class MapaPlastico: AppCompatActivity(), OnMapReadyCallback {

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

        val coordenada269= LatLng(-34.784686,-55.839962)
        val marker269 = MarkerOptions().position(coordenada269).title("Plásticos").snippet("Ruta 10 y Sombra del Toro Club Albatros/Salinas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker269)

        val coordenada270= LatLng(-34.764325,-55.722494)
        val marker270 = MarkerOptions().position(coordenada270).title("Plásticos").snippet("Calle 9 y C/ Super Rodi /Parque del Plata").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker270)

        val coordenada271= LatLng(-34.764627,-55.715353)
        val marker271 = MarkerOptions().position(coordenada271).title("Plásticos").snippet("Ferreira y 15/Parque del Plata").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker271)

        val coordenada272= LatLng(-34.757506,-55.675499)
        val marker272 = MarkerOptions().position(coordenada272).title("Plásticos").snippet("Treinta y tres y Manquinon/Kiosko Charo/La Floresta").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker272)

        val coordenada273= LatLng(-34.771541,-55.819541)
        val marker273 = MarkerOptions().position(coordenada273).title("Plásticos").snippet("Interbalnearia y Ambar/Autoservice Estoril/Marindia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker273)

        val coordenada274= LatLng(-34.778259,-55.860102)
        val marker274 = MarkerOptions().position(coordenada274).title("Plásticos").snippet("Interbalnearia km 36.200/Super El Fuerte/Pinamar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker274)

        val coordenada275= LatLng(-34.781086,-55.864883)
        val marker275 = MarkerOptions().position(coordenada275).title("Plásticos").snippet("Abayuba y Arazati/Almacen La Espumita/Pinamar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker275)

        val coordenada276= LatLng(-34.850457,-55.993981)
        val marker276 = MarkerOptions().position(coordenada276).title("Plásticos").snippet("Venecia y Av de las Americas/Antel/Shangrila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker276)

        val coordenada277= LatLng(-34.849752,-55.998881)
        val marker277 = MarkerOptions().position(coordenada277).title("Plásticos").snippet("Av Calcagno E/S.Pena y Av Parque/DEVOTO /Shangrila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker277)


        val coordenada279= LatLng(-34.876045,-56.061923)
        val marker279 = MarkerOptions().position(coordenada279).title("Plásticos").snippet("Maximo Tajes esq. Cont.Bianchi/Contenedor via publica").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker279)

        val coordenada280= LatLng(-34.848057,-56.133696)
        val marker280 = MarkerOptions().position(coordenada280).title("Plásticos").snippet("Av.Belloni esq.Osvaldo Cruz/Contenedor via publica").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker280)

        val coordenada281= LatLng(-34.847915,-56.170083)
        val marker281 = MarkerOptions().position(coordenada281).title("Plásticos").snippet("Av.San Martin esq Chimborazo.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker281)

        val coordenada282= LatLng(-34.859872,-56.215447)
        val marker282 = MarkerOptions().position(coordenada282).title("Plásticos").snippet("Autoservice Nuevo Porvenir/Paso Molino").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker282)

        val coordenada283= LatLng(-34.913775,-56.154138)
        val marker283 = MarkerOptions().position(coordenada283).title("Plásticos").snippet("21 de Setiembre esq Av.Sarmiento/Contenedor via publica").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker283)

        val coordenada284= LatLng(-34.911812,-56.175588)
        val marker284 = MarkerOptions().position(coordenada284).title("Plásticos").snippet("Avda Gonzalo Ramirez y Yaro /Supermercado Frigo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker284)

        val coordenada285= LatLng(-34.869279,-56.148563)
        val marker285 = MarkerOptions().position(coordenada285).title("Plásticos").snippet("Agaces 3698 esq.Gobernador Viana./Villa Espanola").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker285)

        val coordenada286= LatLng(-34.817568,-56.148886)
        val marker286 = MarkerOptions().position(coordenada286).title("Plásticos").snippet("Camino Domingo Arena 4470 y Teodoro Caravia/Autoservice la Ranita").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker286)

        val coordenada287= LatLng(-33.522211,-56.897659)
        val marker287 = MarkerOptions().position(coordenada287).title("Plásticos").snippet("Francisco Fondar esq Avda Brasil/Agromotora Flores").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker287)

        val coordenada288= LatLng(-34.836965,-55.982752)
        val marker288 = MarkerOptions().position(coordenada288).title("Plásticos").snippet("Ruiz Ruiz esq Las Canoas/Escuela 229/Lagomar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker288)

        val coordenada289= LatLng(-34.858059,-56.192390)
        val marker289 = MarkerOptions().position(coordenada289).title("Plásticos").snippet("Avda luis A.de Herrera esq Reyes/Contenedor via publica").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker289)

        val coordenada290= LatLng(-34.864538,-55.269692)
        val marker290 = MarkerOptions().position(coordenada290).title("Plásticos").snippet("Avda Piria y Reconquista/Estacion Petrobras").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker290)

        val coordenada291= LatLng(-34.912529,-54.861345)
        val marker291 = MarkerOptions().position(coordenada291).title("Plásticos").snippet("Liceo La Barra").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker291)

        val coordenada292= LatLng(-34.663937,-54.154617)
        val marker292 = MarkerOptions().position(coordenada292).title("Plásticos").snippet("Av.Solari y Sirio /Supermercado El Dorado").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker292)

        val coordenada293= LatLng(-34.781277,-55.403020)
        val marker293 = MarkerOptions().position(coordenada293).title("Plásticos").snippet("km 80.2 de la ruta Interbalnearia,ecopunto").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker293)

        val coordenada294= LatLng(-34.731474,-55.765928)
        val marker294 = MarkerOptions().position(coordenada294).title("Plásticos").snippet("Ecopunto Canelones/Roger Balet 46-Atlantida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker294)

        val coordenada295= LatLng(-34.662355,-56.223565)
        val marker295 = MarkerOptions().position(coordenada295).title("Plásticos").snippet("Ecopunto Progreso Av.José Artigas esq Cerro Largo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker295)

        val coordenada296= LatLng(-34.774244,-55.758337)
        val marker296 = MarkerOptions().position(coordenada296).title("Plásticos").snippet("Ecopunto Atlántida Roger Balet 46").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker296)

        val coordenada297= LatLng(-34.842856,-56.008696)
        val marker297 = MarkerOptions().position(coordenada297).title("Plásticos").snippet("Ecopunto Shangrila G. Zolessi, Ciudad de la Costa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker297)

        val coordenada298= LatLng(-34.649221,-56.062394)
        val marker298 = MarkerOptions().position(coordenada298).title("Plásticos").snippet("Ecopunto Sauce Av. Artigas y Constitución").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker298)

        val coordenada299= LatLng(-34.725985,-56.201433)
        val marker299 = MarkerOptions().position(coordenada299).title("Plásticos").snippet("Ecopunto Las Piedras Bulevar del Bicentenario 318, 12400 Parque Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker299)

        val coordenada300= LatLng(-34.778827,-55.839301)
        val marker300 = MarkerOptions().position(coordenada300).title("Plásticos").snippet("Ecopunto Salinas Av Julieta esq.Yaguareté").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker300)

        val coordenada301= LatLng(-34.763033,-55.725038)
        val marker301 = MarkerOptions().position(coordenada301).title("Plásticos").snippet("Ecopunto Parque del Plata frente a la Escuela N°153,calle D entre 7 y 8").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker301)

        val coordenada302= LatLng(-34.746347,-55.681650)
        val marker302 = MarkerOptions().position(coordenada302).title("Plásticos").snippet("Ecopunto La Floresta Larrobla 16, 15300 La Floresta").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker302)

        val coordenada304= LatLng(-34.816196,-56.038485)
        val marker304 = MarkerOptions().position(coordenada304).title("Plásticos").snippet("Ecopunto Nicolich Jacarandá, Los Paraísos y Los Tilos, frente a la escuela 155").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker304)

        val coordenada305= LatLng(-34.781206,-55.403078)
        val marker305 = MarkerOptions().position(coordenada305).title("Plásticos").snippet("Ecopunto Jaureguiberry Ruta IB y Av.Gral.José Gervasio Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker305)

        val coordenada306= LatLng(-32.319688,-58.078483)
        val marker306 = MarkerOptions().position(coordenada306).title("Plásticos").snippet("Liceo 2 - Centro de Entrega Voluntaria (CEV) - José Pedro Varela, 60000 Paysandú").icon(
            BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker306)

        val coordenada307= LatLng(-34.866615,-56.180454)
        val marker307 = MarkerOptions().position(coordenada307).title("Plásticos").snippet("Macro Mercado Casa Central San Martín 3222").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker307)

        val coordenada308= LatLng(-30.921055,-55.539715)
        val marker308 = MarkerOptions().position(coordenada308).title("Plásticos").snippet("Macro Mercado Rivera Julio M.Sosa 1726 esq. Guido Machado Brun (Ruta 5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker308)

        val coordenada309= LatLng(-34.823884,-56.102168)
        val marker309 = MarkerOptions().position(coordenada309).title("Plásticos").snippet("Macro Mercado Punta de Rieles Cno. Maldonado 6783").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker309)

        val coordenada310= LatLng(-34.869558,-56.022337)
        val marker310 = MarkerOptions().position(coordenada310).title("Plásticos").snippet("Macro Mercado Av. al Parque Roosevelt 2495 entre Arizona y Alta Gracia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker310)

        val coordenada311= LatLng(-34.861690,-56.231375)
        val marker311 = MarkerOptions().position(coordenada311).title("Plásticos").snippet("Macro Mercado La Teja Carlos María Ramírez 574 entre Ameghino y Laureles").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker311)

        val coordenada312= LatLng(-34.915769,-54.945536)
        val marker312 = MarkerOptions().position(coordenada312).title("Plásticos").snippet("Macro Mercado Maldonado Bvar. Artigas s/n esquina 3 de Febrero").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker312)

        val coordenada313= LatLng(-34.839146,-56.262912)
        val marker313 = MarkerOptions().position(coordenada313).title("Plásticos").snippet("Macro Mercado Paso de la Arena Luis Batlle Berres 6149").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker313)

        val coordenada314= LatLng(-32.346072,-58.096109)
        val marker314 = MarkerOptions().position(coordenada314).title("Plásticos").snippet("Escuela n° 25; Chacras de San Felix").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker314)

        val coordenada315= LatLng(-32.304461,-58.086584)
        val marker315 = MarkerOptions().position(coordenada315).title("Plásticos").snippet("Escuelas n° 33 y n° 107; Luis Batlle Berres 1550").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker315)

        val coordenada316= LatLng(-32.316411,-58.068600)
        val marker316 = MarkerOptions().position(coordenada316).title("Plásticos").snippet("Escuelas n°42 y n°100; Joaquin Suarez 1091").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker316)

        val coordenada317= LatLng(-32.320224,-58.059471)
        val marker317 = MarkerOptions().position(coordenada317).title("Plásticos").snippet("Escuelas n°11 y n° 98; Roger Ballet 2239").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker317)

        val coordenada318= LatLng(-32.299108,-58.076200)
        val marker318 = MarkerOptions().position(coordenada318).title("Plásticos").snippet("Escuelas n°57 y n° 102; Vizconde de Maua 1950").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker318)

        val coordenada319= LatLng(-32.280044,-58.068823)
        val marker319 = MarkerOptions().position(coordenada319).title("Plásticos").snippet("Escuela n° 111; Asunción y Venezuela s/n").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker319)

        val coordenada320= LatLng(-32.280044,-58.068823)
        val marker320 = MarkerOptions().position(coordenada320).title("Plásticos").snippet("Escuela n° 112; Joaquin Suarez 579").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker320)

        val coordenada321= LatLng(-32.332814,-58.071840)
        val marker321 = MarkerOptions().position(coordenada321).title("Plásticos").snippet("Escuela n° 114; Av.José de San Martín 1700").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker321)

        val coordenada322= LatLng(-32.315593,-58.092953)
        val marker322 = MarkerOptions().position(coordenada322).title("Plásticos").snippet("Liceo 1 y 5; 18 de Julio y Silván Fernández.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker322)

        val coordenada323= LatLng(-32.294513,-58.054573)
        val marker323 = MarkerOptions().position(coordenada323).title("Plásticos").snippet("Escuela n° 15; Enrique Chaplin 2359").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker323)

        val coordenada324= LatLng(-32.261426,-58.083515)
        val marker324 = MarkerOptions().position(coordenada324).title("Plásticos").snippet("Polo Tecnológico; José P.Varela y Sarandí").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker324)

        val coordenada325= LatLng(-32.316935,-58.079026)
        val marker325 = MarkerOptions().position(coordenada325).title("Plásticos").snippet("Colegio del Rosario; Florida y Vizconde de Mauá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker325)

        val coordenada326= LatLng(-32.320290,-58.070042)
        val marker326 = MarkerOptions().position(coordenada326).title("Plásticos").snippet("Mafalda; Sarandí casi Bulevar Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker326)

        val coordenada327= LatLng(-32.315537,-58.060319)
        val marker327 = MarkerOptions().position(coordenada327).title("Plásticos").snippet("Caif 'Enanitos'; Ciudad de Young y Proyectada 12").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker327)

        val coordenada328= LatLng(-32.333570,-58.076018)
        val marker328 = MarkerOptions().position(coordenada328).title("Plásticos").snippet("Caif 'Sta.Mónica'; Dr.Felippone y Benito Chaín").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker328)

        val coordenada329= LatLng(-32.322306,-58.090000)
        val marker329 = MarkerOptions().position(coordenada329).title("Plásticos").snippet("Escuela Padre Lamas; Independencia y Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker329)

        val coordenada330= LatLng(-32.269913,-58.054146)
        val marker330 = MarkerOptions().position(coordenada330).title("Plásticos").snippet("Melchora Cuenca UTU; Avenida de las Américas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker330)

        val coordenada331= LatLng(-32.323971,-58.083551)
        val marker331 = MarkerOptions().position(coordenada331).title("Plásticos").snippet("Departamento de Servicios; Río Negro casi Luis A.de Herrera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker331)

        val coordenada332= LatLng(-32.316447,-58.076669)
        val marker332 = MarkerOptions().position(coordenada332).title("Plásticos").snippet("Colegio Liberty; Cerrito casi Uruguay").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker332)

        val coordenada333= LatLng(-32.313289,-58.095405)
        val marker333 = MarkerOptions().position(coordenada333).title("Plásticos").snippet("Escuela n°1;Zelmar Michelini y Uruguay").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker333)

        val coordenada334= LatLng(-32.314230,-58.085446)
        val marker334 = MarkerOptions().position(coordenada334).title("Plásticos").snippet("Escuela n° 94; Treinta y Tres Orientales casi Charrúas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker334)

        val coordenada335= LatLng(-32.322880,-58.047435)
        val marker335 = MarkerOptions().position(coordenada335).title("Plásticos").snippet("Escuela n°93; Trebol").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker335)

        val coordenada336= LatLng(-32.317459,-58.087427)
        val marker336 = MarkerOptions().position(coordenada336).title("Plásticos").snippet("Estacion ESSO; L.Gomez y Setembrino Pereda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker336)

        val coordenada337= LatLng(-32.314050,-58.083180)
        val marker337 = MarkerOptions().position(coordenada337).title("Plásticos").snippet("Charruas y 19 de abril").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker337)

        val coordenada338= LatLng(-32.321142,-58.059280)
        val marker338 = MarkerOptions().position(coordenada338).title("Plásticos").snippet("Estacion Petrobras;Republica Argentina y Limite Este").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker338)

        val coordenada339= LatLng(-32.317095,-58.082705)
        val marker339 = MarkerOptions().position(coordenada339).title("Plásticos").snippet("Confiteria Las Familias;18 de julio y Luis Alberto de Herrera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker339)

        val coordenada340= LatLng(-32.319164,-58.081794)
        val marker340 = MarkerOptions().position(coordenada340).title("Plásticos").snippet("Palacio Municipal;Sarandi y Zorrilla de San Martin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker340)

        val coordenada341= LatLng(-32.314896,-58.070268)
        val marker341 = MarkerOptions().position(coordenada341).title("Plásticos").snippet("Super TATA;Washington y Bulevar Artigas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker341)

        val coordenada342= LatLng(-32.296742,-58.077429)
        val marker342 = MarkerOptions().position(coordenada342).title("Plásticos").snippet("Barriol7;Zorrila de San Martin casi purificadora(n°6)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker342)

        val coordenada343= LatLng(-32.294148,-58.083490)
        val marker343 = MarkerOptions().position(coordenada343).title("Plásticos").snippet("Barrio covisan 6; Setembrino Pereda y Batalla de Las Piedras(n°7)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker343)

        val coordenada344= LatLng(-32.298663,-58.075374)
        val marker344 = MarkerOptions().position(coordenada344).title("Plásticos").snippet("Barrio covisan 9; Vizconde de maúa e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker344)

        val coordenada345= LatLng(-32.296824,-58.077461)
        val marker345 = MarkerOptions().position(coordenada345).title("Plásticos").snippet("Barrio covisan 10; Zorrilla de San Martin casi Purificadora(n°6)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker345)

        val coordenada348= LatLng(-32.300010,-58.072572)
        val marker348 = MarkerOptions().position(coordenada348).title("Plásticos").snippet("Barrio Covipay; Juntal y Éxodo(N°4)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker348)

        val coordenada349= LatLng(-32.294346,-58.075181)
        val marker349 = MarkerOptions().position(coordenada349).title("Plásticos").snippet("Barrio CoviAM;Vizconde de maúa y Yapeyú (n°8)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker349)

        val coordenada350= LatLng(-32.299111,-58.073748)
        val marker350 = MarkerOptions().position(coordenada350).title("Plásticos").snippet("Barrio CoviOSE; Cerrito e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker350)

        val coordenada351= LatLng(-32.298226,-58.080000)
        val marker351 = MarkerOptions().position(coordenada351).title("Plásticos").snippet("Barrio CoviHEL; paralela a DR.Roldan e Intrucciones del año XIII(N°5)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker351)

        val coordenada352= LatLng(-32.301455,-58.075925)
        val marker352 = MarkerOptions().position(coordenada352).title("Plásticos").snippet("Barrio Paycap; Vizconde de Maúa y Andresito(n°3)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker352)

        val coordenada355= LatLng(-32.349404,-58.100402)
        val marker355 = MarkerOptions().position(coordenada355).title("Plásticos").snippet("Caif San Felix; Barrio San Felix").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker355)

        val coordenada356= LatLng(-32.331933,-58.071092)
        val marker356 = MarkerOptions().position(coordenada356).title("Plásticos").snippet("Carcel Departamental;Avda Jose de San Martin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker356)

        val coordenada357= LatLng(-32.380623,-58.054291)
        val marker357 = MarkerOptions().position(coordenada357).title("Plásticos").snippet("EEMAC; Ruta 3").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker357)

        val coordenada358= LatLng(-32.308933,-58.063561)
        val marker358 = MarkerOptions().position(coordenada358).title("Plásticos").snippet("Escuela n°89; Proyectada 26 Norte").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker358)

        val coordenada359= LatLng(-34.467905,-57.844790)
        val marker359 = MarkerOptions().position(coordenada359).title("Plásticos").snippet("Liceo 1 Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker359)

        val coordenada360= LatLng(-34.470365,-57.848919)
        val marker360 = MarkerOptions().position(coordenada360).title("Plásticos").snippet("Club Plaza Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker360)

        val coordenada361= LatLng(-34.471438,-57.850125)
        val marker361 = MarkerOptions().position(coordenada361).title("Plásticos").snippet("olegio 'San Juan Bautista' Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker361)

        val coordenada362= LatLng(-34.468221,-57.843581)
        val marker362 = MarkerOptions().position(coordenada362).title("Plásticos").snippet("Colegio “San Gabriel” Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker362)

        val coordenada363= LatLng(-34.468017,-57.847379)
        val marker363 = MarkerOptions().position(coordenada363).title("Plásticos").snippet("Hospital Evangélico Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker363)

        val coordenada364= LatLng(-34.469196,-57.847688)
        val marker364 = MarkerOptions().position(coordenada364).title("Plásticos").snippet("Escuela 2 Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker364)

        val coordenada366= LatLng(-34.469681,-57.841558)
        val marker366 = MarkerOptions().position(coordenada366).title("Plásticos").snippet("Plaza de Deportes Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker366)

        val coordenada367= LatLng(-34.470751,-57.844552)
        val marker367 = MarkerOptions().position(coordenada367).title("Plásticos").snippet("Ministerio de Salud Zona centro; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker367)

        val coordenada368= LatLng(-34.454205,-57.839380)
        val marker368 = MarkerOptions().position(coordenada368).title("Plásticos").snippet("Gym MEGA Zona Otto Wulff; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker368)

        val coordenada369= LatLng(-34.460311,-57.842678)
        val marker369 = MarkerOptions().position(coordenada369).title("Plásticos").snippet("Club Juventud Zona Otto Wulff; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker369)

        val coordenada372= LatLng(-34.454213,-57.840166)
        val marker372 = MarkerOptions().position(coordenada372).title("Plásticos").snippet("ANCAP Rotonda Zona Otto Wulff; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker372)

        val coordenada373= LatLng( -34.458629,-57.844186)
        val marker373 = MarkerOptions().position(coordenada373).title("Plásticos").snippet("Restaurant Puerto Cañón Zona Otto Wulff; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker373)

        val coordenada374= LatLng(-34.465669,-57.834634)
        val marker374 = MarkerOptions().position(coordenada374).title("Plásticos").snippet("Colonia Shopping Zona Shopping; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker374)

        val coordenada380= LatLng(-34.441174,-57.853149)
        val marker380 = MarkerOptions().position(coordenada380).title("Plásticos").snippet("Liceo 2 Zona Real de San Carlos; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker380)

        val coordenada381= LatLng(-34.438727,-57.855499)
        val marker381 = MarkerOptions().position(coordenada381).title("Plásticos").snippet("Escuela 37 Zona Real de San Carlos; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker381)

        val coordenada382= LatLng(-34.443463,-57.847546)
        val marker382 = MarkerOptions().position(coordenada382).title("Plásticos").snippet("Pandora Box Zona Real de San Carlos; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker382)

        val coordenada385= LatLng(-34.437171,-57.863686)
        val marker385 = MarkerOptions().position(coordenada385).title("Plásticos").snippet("Universidad de la Empresa Zona Real de San Carlos; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker385)

        val coordenada387= LatLng(-34.448028,-57.844338)
        val marker387 = MarkerOptions().position(coordenada387).title("Plásticos").snippet("Micro Macro Zona Real de San Carlos; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker387)

        val coordenada388= LatLng(-34.437284,-57.803379)
        val marker388 = MarkerOptions().position(coordenada388).title("Plásticos").snippet("Escuela 82 Zona El General; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker388)

        val coordenada389= LatLng(-34.440110,-57.804111)
        val marker389 = MarkerOptions().position(coordenada389).title("Plásticos").snippet("Caif “Cuna de mis sueños” Zona El General:; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker389)

        val coordenada390= LatLng(-34.444064,-57.809953)
        val marker390 = MarkerOptions().position(coordenada390).title("Plásticos").snippet("Super MAGICO Zona El General; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker390)

        val coordenada392= LatLng(-34.464179,-57.823785)
        val marker392 = MarkerOptions().position(coordenada392).title("Plásticos").snippet("Escuela 130 Zona Los Nogales; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker392)

        val coordenada393= LatLng(-34.423359,-57.594867)
        val marker393 = MarkerOptions().position(coordenada393).title("Plásticos").snippet("Rotisería 'Lo de Mirta'; Santa Ana; Punto Verde Panda").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker393)

        val coordenada396= LatLng(-34.286780,-57.229663)
        val marker396 = MarkerOptions().position(coordenada396).title("Plásticos").snippet("Municipio de Nueva Helvecia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker396)

        val coordenada398= LatLng(-33.939924,-57.808310)
        val marker398 = MarkerOptions().position(coordenada398).title("Plásticos").snippet("Municipio de Ombúes de Lavalle").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker398)

        val coordenada399= LatLng(-33.874459,-58.407086)
        val marker399 = MarkerOptions().position(coordenada399).title("Plásticos").snippet("Municipio de Nueva Palmira").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker399)

        val coordenada400= LatLng(-34.269193,-57.613263)
        val marker400 = MarkerOptions().position(coordenada400).title("Plásticos").snippet("Municipio de Tarariras").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker400)

        val coordenada401= LatLng(-34.338791,-57.261086)
        val marker401 = MarkerOptions().position(coordenada401).title("Plásticos").snippet("Municipio de Colonia Valdense").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker401)

        val coordenada402= LatLng(-34.435301,-57.439111)
        val marker402 = MarkerOptions().position(coordenada402).title("Plásticos").snippet("Municipio de Juan Lacaze").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker402)

        val coordenada403= LatLng(-34.313088,-57.352669)
        val marker403 = MarkerOptions().position(coordenada403).title("Plásticos").snippet("Municipio de Rosario").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker403)

        val coordenada404= LatLng(-33.876393,-57.372329)
        val marker404 = MarkerOptions().position(coordenada404).title("Plásticos").snippet("Municipio de Florencio Sánchez").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker404)

        val coordenada405= LatLng(-34.788124,-55.380545)
        val marker405 = MarkerOptions().position(coordenada405).title("Plásticos").snippet("Escuela Nro. 14 Timbo 20302 Solís; Municipio de Solis Grande").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker405)

        val coordenada406= LatLng(-34.675849,-55.432449)
        val marker406 = MarkerOptions().position(coordenada406).title("Plásticos").snippet("Escuela Nro. 22 Solís; Municipio de Solis Grande").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker406)

        val coordenada407= LatLng(-34.886699,-54.977396)
        val marker407 = MarkerOptions().position(coordenada407).title("Plásticos").snippet("ANCAP DE CERRO PELADO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker407)

        val coordenada408= LatLng(-34.898801,-54.966626)
        val marker408 = MarkerOptions().position(coordenada408).title("Plásticos").snippet("SUPER 'EL DORADO' DE CNO. LUSSICH").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        map.addMarker(marker408)





        //val marker2 = MarkerOptions().position(coordinadas2).title("punto de reciclaje - segundo")
        //map.addMarker(marker)
        //map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordenada350, 20f),
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