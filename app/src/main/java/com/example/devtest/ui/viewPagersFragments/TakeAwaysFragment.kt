package com.example.devtest.ui.viewPagersFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.devtest.R
import com.example.devtest.databinding.FragmentTakeAwaysBinding
import com.example.devtest.databinding.TakeAwayViewBinding
import com.example.devtest.ui.adapter.FoodAdapter
import com.example.devtest.ui.model.FoodModel

class TakeAwaysFragment : Fragment() {

    private val list: MutableList<FoodModel> = mutableListOf()
    private var _binding: FragmentTakeAwaysBinding? = null
    private val binding get() = _binding
    private val viewModel: TakeAwaysViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTakeAwaysBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        addToList()
    }

    private fun addToList() {
        list.clear()
        list.add(
            FoodModel(
                R.drawable.burgers, "Spend 25\$, save 5\$", "Burger Craze",
                "  OPEN", "4.6", "(601)", "American", "Burgers",
                "Free", "10$", "15-20min", " 1,5 km away", true
            )
        )

        list.add(
            FoodModel(
                R.drawable.pizza, "Spend 25\$, save 5\$", "Vegetarian Pizza",
                "  OPEN", "4.6", "(601)", "Italian", "Pizza",
                "Free", "10$", "15-20min", " 0.8 km away", false
            )
        )
    }

    private fun initRecycler() {
        binding?.recycler?.apply {
            val adapter: FoodAdapter = FoodAdapter(list)
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }
    }


}