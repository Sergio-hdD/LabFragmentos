package com.sergio.labfragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var segundoFragment = SegundoFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedor_segundo_fragment, segundoFragment)
            .addToBackStack(null)
            .commit()
    }
}