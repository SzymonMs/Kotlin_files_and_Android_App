package com.example.android.navigation


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.view.MotionEvent
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {
    var is_polish=true
    private lateinit var txt: TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)
        binding.playButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }
        binding.zegarButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameOverFragment)
        }

        binding.jezyki.setOnClickListener(){

            is_polish=!is_polish
            if(is_polish) {

                binding.playButton.text=getString(R.string.btnplayPL)
                binding.jezyki.text=getString(R.string.jezykiPL)
                binding.appText.text=getString(R.string.AppNamePL)
                binding.zegarButton.text=getString(R.string.zegarPL)
            }
            if(!is_polish) {

                binding.playButton.text=getString(R.string.btnplayENG)
                binding.jezyki.text=getString(R.string.jezykiENG)
                binding.appText.text=getString(R.string.AppNameENG)
                binding.zegarButton.text=getString(R.string.zegarENG)
            }
        }
        return binding.root
    }
}
