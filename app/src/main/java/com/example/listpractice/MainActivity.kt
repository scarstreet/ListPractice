package com.example.listpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val itemList = ArrayList<Item>().apply {
        repeat(43) {
            add(Item("1",R.drawable.box1))
            add(Item("2",R.drawable.box2))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ItemAdapter(itemList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }
}