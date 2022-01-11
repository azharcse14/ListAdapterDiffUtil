package com.azhar.listadapterdiffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import com.azhar.listadapterdiffutil.Adapter.LanguageAdapter
import com.azhar.listadapterdiffutil.databinding.ActivityMainBinding
import com.azhar.listadapterdiffutil.model.LanguageItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = LanguageAdapter()
        val l1 = LanguageItem(1, "J", "Java")
        val l2 = LanguageItem(2, "K", "Kotlin")
        val l3 = LanguageItem(3, "D", "Dart")
        val l4 = LanguageItem(4, "J", "JavaScript")
        val l5 = LanguageItem(5, "P", "PHP")


        adapter.submitList(listOf(l1, l2, l3, l4, l5))
        binding.recyclerViewId.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewId.setHasFixedSize(true)
        binding.recyclerViewId.adapter = adapter

        //Testing DiffUtil
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val l1 = LanguageItem(1, "J", "Java")
            val l2 = LanguageItem(2, "K", "Kotlin")
            val l7 = LanguageItem(7, "G", "Go")
            val l8 = LanguageItem(8, "R", "Rust")
            val l9 = LanguageItem(9, "P", "Python")


            adapter.submitList(listOf(l1, l2, l7, l8, l9))
        },10000)
    }
}