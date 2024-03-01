package com.example.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController

//Ho ten: Vuong Kim Hoang
//MSSV: 20215584
class Question2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_question2, container, false)
        val ansC: RadioButton = view.findViewById(R.id.ans_C)

        ansC.setOnClickListener {
            Toast.makeText(requireActivity(), "Correct answer", Toast.LENGTH_SHORT).show()
        }
        val button = view.findViewById<Button>(R.id.next2)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_question2_to_question3)
        }

        return view
    }

}