package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PantallaUnoFragment : Fragment(R.layout.fragment_pantalla_uno) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIrDos = requireView().findViewById<Button>(R.id.btnIrPantallaDos)

        btnIrDos.setOnClickListener(){
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaDosFragment)
        }
    }

}