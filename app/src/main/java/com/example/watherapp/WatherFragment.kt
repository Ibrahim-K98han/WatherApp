package com.example.watherapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.watherapp.viewModel.LocationViewModel

class WatherFragment : Fragment() {

    private val locationViewModel:LocationViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        locationViewModel.locationLiveData.observe(viewLifecycleOwner){
            Toast.makeText(
                requireActivity(),
                "${it.latitude}, ${it.longitude}",
                Toast.LENGTH_SHORT
            ).show()
        }
        return inflater.inflate(R.layout.fragment_wather, container, false)
    }

}