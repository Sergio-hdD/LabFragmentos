package com.sergio.labfragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class PrimerFragment : Fragment() {

    var listener : PrimerFragmentInterfaz? =  null
    lateinit var btnMostrarContenido : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.primer_fragment, container, false)
        btnMostrarContenido = view.findViewById(R.id.btnMostrarContenido) //Como está en un fragment lo traemos desde view
        btnMostrarContenido.setOnClickListener {
            listener?.mostrarContenido()
        }
        return view
    }

}