package com.example.mengenalbindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.mengenalbindingview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Kotlin Synthetic
        btnKtSyn.setOnClickListener {
            Log.d("KotlinSyn", "Tombol KotlinSyn di klik")
        }

        //Find View By Id
        val fdById: Button = findViewById(R.id.fdById)
        fdById.setOnClickListener {
            Log.d("FindById", "Tombol FindById di klik")
        }

        //Data Binding
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.dataBin.text = "This is Data Binding"
        dataBin.setOnClickListener {
            Log.d("DataBinding", "Tombol DataBinding di klik")
        }

        //View Data
        viewBin.setOnClickListener {
            Log.d("ViewBin", "Tombol View Binding di klik")
        }
    }
}