package com.example.dumnofood.ui.home

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dumnofood.R
import com.example.dumnofood.databinding.FragmentHomeBinding
import com.example.dumnofood.DonateFoodActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemArrayList: ArrayList<item>

    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var desk : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        (activity as AppCompatActivity).supportActionBar?.hide()
        // button donatefood //

        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.btnDonatefood.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), DonateFoodActivity::class.java)
            startActivity(intent)
        }


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(itemArrayList)
        recyclerView.adapter = adapter

        val speedScroll = 8000
        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var count = 0
            var flag = true
            override fun run() {

                if (count < adapter.itemCount) {
                    if (count == adapter.itemCount - 1) {
                        flag = false
                    } else if (count == 0) {
                        flag = true
                    }
                    if (flag){
                        count++
                    } else{

                        count --
                    }
                    recyclerView.smoothScrollToPosition(count)
                    handler.postDelayed(this, speedScroll.toLong())
                }
            }
        }
        handler.postDelayed(runnable, speedScroll.toLong())


    }

    private fun dataInitialize() {
        itemArrayList = arrayListOf<item>()

        imageId = arrayOf(
            R.drawable.foodimg,
            R.drawable.foodimg1,
            R.drawable.foodimg2

        )
        heading = arrayOf(
            "Mirna",
            "risa",
            "ina"

        )
        desk = arrayOf(
            "1",
            "2",
            "3"

        )

        for(i in imageId.indices){
            val desk = item(imageId[i],heading[i])
            itemArrayList.add(desk)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}