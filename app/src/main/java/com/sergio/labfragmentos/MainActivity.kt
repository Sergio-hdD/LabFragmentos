package com.sergio.labfragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), PrimerFragmentInterfaz {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val primer_fragment = supportFragmentManager
                .findFragmentById(R.id.contenedor_primer_fragment) as? PrimerFragment //Castea como PrimerFragment si es que se puede castear
        primer_fragment?.listener = this
    }

    override fun mostrarContenido() {
        val segundoFragment = SegundoFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedor_segundo_fragment, segundoFragment)
            .addToBackStack(null)
            .commit()
    }
}