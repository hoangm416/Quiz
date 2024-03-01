package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

//Ho ten: Vuong Kim Hoang
//MSSV: 20215584
class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val button = view.findViewById<Button>(R.id.next)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_welcome_to_question1)
        }
        return view
    }

}