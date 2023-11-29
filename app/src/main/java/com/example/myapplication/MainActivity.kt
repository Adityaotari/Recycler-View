package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity  : AppCompatActivity(){

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private  lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)

        foodList = ArrayList()

         foodList.add(Food(R.drawable.burger , "Burger"))
        foodList.add(Food(R.drawable.sandwich, "Sandwich"))
        foodList.add(Food(R.drawable.chicken_chilli, "Chicken Chilli"))
        foodList.add(Food(R.drawable.chicken_crispy, "Chicken Crispy"))
        foodList.add(Food(R.drawable.paneer_tikka, "Paneer tikka Masala"))
        foodList.add(Food(R.drawable.fried_rice, "Fried Rice"))
        foodList.add(Food(R.drawable.dosa, "Dosa"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))



        foodAdapter= FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

    }
}