package com.example.led

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var bitmap: Bitmap
    var is_polish=false
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Fragments
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val btnFragment1:Button =findViewById(R.id.btnFragment1)
        val btnFragment2:Button =findViewById(R.id.btnFragment2)
        val btnAngielski:Button=findViewById(R.id.btnAngielski)
        val btnKamera:Button=findViewById(R.id.btnCamera)
        val btnSensor:Button=findViewById(R.id.btnSensor)
        val imgView:ImageView=findViewById(R.id.colorPicker)
        val myColorValues:TextView = findViewById(R.id.displayValues)
        imgView.isDrawingCacheEnabled = true
        imgView.buildDrawingCache(true)
        imgView.setOnTouchListener { v, event ->
            if(event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE){
                bitmap =imgView.drawingCache
                val pixel = bitmap.getPixel(event.x.toInt(),event.y.toInt())

                val r = Color.red(pixel)
                val g = Color.green(pixel)
                val b = Color.blue(pixel)
                val hex =  "#"+Integer.toHexString(pixel)
                myColorValues.setText("RGB: $r, $g, $b \nHex: $hex")
            }
            true
        }

        btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstFragment)
                //addToBackStack(null)
                commit()
            }
        }
        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,secondFragment)
                //addToBackStack(null)
                commit()
            }
        }
        btnAngielski.setOnClickListener(){
            is_polish=!is_polish
        if(is_polish) {
            btnFragment1.text = "Author"
            btnFragment2.text = "Hello"
            btnAngielski.text = "Polish"
            btnKamera.text = "Camera"
            btnSensor.text = "Sensor"
        }
            if(!is_polish) {
                btnFragment1.text = "Autor"
                btnFragment2.text = "Witam"
                btnAngielski.text="Angielski"
                btnKamera.text = "Kamera"
                btnSensor.text = "Sensor"
            }

        }



    }

}