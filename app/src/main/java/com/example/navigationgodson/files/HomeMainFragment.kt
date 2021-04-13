package com.example.navigationgodson.files

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationgodson.R
import com.example.navigationgodson.databinding.FragmentHomeBinding

class HomeMainFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.btnAction1.setOnClickListener {
            this.findNavController().navigate(R.id.secondPage)
        }
        binding.btnAction2.setOnClickListener {
            this.findNavController().navigate(R.id.secondPage)
        }
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        inflater!!.inflate(R.menu.menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item!!.itemId
        if (id == R.id.settingId){
            this.findNavController().navigate(R.id.settingsIDD)
        }

        return super.onOptionsItemSelected(item)
    }

}