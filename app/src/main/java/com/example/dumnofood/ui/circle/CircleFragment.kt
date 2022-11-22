package com.example.dumnofood.ui.circle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dumnofood.databinding.FragmentCircleBinding


class CircleFragment : Fragment() {

    private var _binding: FragmentCircleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val circleViewModel =
            ViewModelProvider(this).get(CircleViewModel::class.java)

        _binding = FragmentCircleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCircle
        circleViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}