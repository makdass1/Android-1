package com.mustafaakdas.kotlinlearning

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mustafaakdas.kotlinlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




        }
    fun MySum (view:View){
         var a =binding.editTextText.text.toString().toDoubleOrNull()
         var b =binding.editTextText2.text.toString().toDoubleOrNull()
        if(a!=null && b!=null)
        {var sonuc= a+b
            binding.textView.setText("sonuc= ${sonuc}")}
        else{
            binding.textView.setText("Lütfen Gecerli Sayı Giriniz")
        }
    }
    fun MyMinues(view:View){
         var a =binding.editTextText.text.toString().toDoubleOrNull()
         var b =binding.editTextText2.text.toString().toDoubleOrNull()
        if(a!=null && b!=null)
        {var sonuc= a-b
            binding.textView.setText("sonuc= ${sonuc}")}
        else{
            binding.textView.setText("Lütfen Gecerli Sayı Giriniz")
        }
    }
    fun MyCarp(view:View){
        var a =binding.editTextText.text.toString().toDoubleOrNull()
        var b =binding.editTextText2.text.toString().toDoubleOrNull()
        if(a!=null && b!=null)
        {var sonuc= a*b
            binding.textView.setText("sonuc= ${sonuc}")}
        else{
            binding.textView.setText("Lütfen Gecerli Sayı Giriniz")
        }
    }
    fun MyBol(view:View){
        var a =binding.editTextText.text.toString().toDoubleOrNull()
        var b =binding.editTextText2.text.toString().toDoubleOrNull()
        if(a!=null && b!=null)
        {var sonuc= a/b
            binding.textView.setText("sonuc= ${sonuc}")}
        else{
            binding.textView.setText("Lütfen Gecerli Sayı Giriniz")
        }
    }

    }
