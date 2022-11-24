package com.example.dumnofood.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dumnofood.DonateFoodActivity
import com.example.dumnofood.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as AppCompatActivity).supportActionBar?.hide()

        // button donatefood //

        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.btnDonatefood.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), DonateFoodActivity::class.java)
            startActivity(intent)
        }
        return bind.root


        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)


        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}