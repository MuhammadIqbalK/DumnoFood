package com.example.dumnofood.ui.takeout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dumnofood.databinding.FragmentTakeoutBinding

class TakeoutFragment : Fragment() {

    private var _binding: FragmentTakeoutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val takeoutViewModel =
            ViewModelProvider(this).get(TakeoutViewModel::class.java)

        _binding = FragmentTakeoutBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTakeout
        takeoutViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


