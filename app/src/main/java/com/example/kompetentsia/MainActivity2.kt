package com.example.kompetentsia

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.kompetentsia.databinding.ActivityMain2Binding
import com.example.kompetentsia.databinding.ActivityMainBinding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var binding2: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)
        binding2.delete.setOnClickListener {
            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val rowView: View = inflater.inflate(R.layout.activity_main2, null)
            binding.line!!.removeView(binding.line.parent as View)
            Toast.makeText(applicationContext, "Im work", Toast.LENGTH_SHORT).show()
        }
    }
}