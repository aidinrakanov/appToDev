package com.example.devtest.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.devtest.databinding.FoodListBinding
import com.example.devtest.ui.model.FoodModel


class FoodAdapter(private val list: MutableList<FoodModel>)
    : RecyclerView.Adapter<FoodAdapter.FoodVH>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodVH {
        val binding = FoodListBinding.inflate(LayoutInflater.
        from(parent.context), parent, false)
        return FoodVH(binding)
    }

    override fun onBindViewHolder(holder: FoodVH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class FoodVH (private var binding: FoodListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(item: FoodModel) {

            binding.cardImage.setImageResource(item.image)
            binding.spendSave.text = item.spend_save
            binding.foodName.text = item.foodName
            binding.openClose.text = item.statusOpenClose
            binding.rating.text = item.rating
            binding.count.text = item.reviewCount
            binding.countryName.text = item.country
            binding.foodType.text = item.foodType
            binding.free.text = item.deliveryCost
            binding.foodCost.text = item.minimum
            binding.distance.text = item.distance
            binding.timeBtn.text = item.time
            if (item.cornerBool){
                binding.cornerImage.visibility =View.VISIBLE
                binding.spendSave.visibility = View.VISIBLE
            }else{
                binding.cornerImage.visibility =View.GONE
                binding.spendSave.visibility = View.GONE
            }

        }
    }
}