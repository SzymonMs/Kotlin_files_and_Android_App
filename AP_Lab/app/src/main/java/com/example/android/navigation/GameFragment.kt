package com.example.android.navigation

import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    private lateinit var bitmap: Bitmap
    lateinit var bAdapter:BluetoothAdapter
    private var bluet:Boolean=false
    private var REQUEST_CODE_ENABLE_BT=1
    private var DISCOVER=2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var r:Int
        var g:Int
        var b:Int
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)
        bAdapter= BluetoothAdapter.getDefaultAdapter()
        binding.blON.setOnClickListener(){ view : View ->
            if(bAdapter.isEnabled) {
                Toast.makeText(context,"Already on",Toast.LENGTH_SHORT).show()
            }
            else{
                var intent=Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                startActivityForResult(intent,REQUEST_CODE_ENABLE_BT)
            }
            if(!bAdapter.isDiscovering){
                val intent2=Intent(Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE))
                startActivityForResult(intent2,REQUEST_CODE_ENABLE_BT)

            }
        }
        binding.blSe.setOnClickListener { view : View->
            if(bAdapter.isEnabled){
                binding.bltTxt.text="Paired Devices:"
                val devices = bAdapter.bondedDevices
                for(device in devices){
                    val deviceName=device.name
                    val deviceAddress=device
                    binding.bltTxt.append("\nDevice: $deviceName,$device")
                }
            }
        }
        val imgView: ImageView = binding.colorPicker
        val myColorValues: TextView = binding.displayValues
        imgView.isDrawingCacheEnabled = true
        imgView.buildDrawingCache(true)
        imgView.setOnTouchListener { v, event ->
            if(event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE){
                bitmap =imgView.drawingCache
                val pixel = bitmap.getPixel(event.x.toInt(),event.y.toInt())

                r = Color.red(pixel)
                g = Color.green(pixel)
                b = Color.blue(pixel)
                val hex =  "#"+Integer.toHexString(pixel)
                myColorValues.setText("RGB: $r, $g, $b \nHex: $hex")
            }
            true
        }
        binding.toTitle.setOnClickListener(){ view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_titleFragment)
        }
        return binding.root
    }
}
