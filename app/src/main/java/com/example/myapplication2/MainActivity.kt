package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("deneme","3");
        Log.d("deneme","caglar1");

        //Çalışma2 işi
        Log.d("deneme","Çalışma2");
        Log.d("deneme","Çalışma2");
        Log.d("deneme","Çalışma2");
    }
}