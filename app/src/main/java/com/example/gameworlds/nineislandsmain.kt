package com.example.gameworlds
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_nineislandsmain.view.*

class nineislandsmain : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view3 = inflater.inflate(R.layout.fragment_nineislandsmain, container, false)
        view3.nine2second.setOnClickListener { Navigation.findNavController(view3).navigate(R.id.action_nineislandsmain_to_SecondFragment) }
        return view3
    }

}