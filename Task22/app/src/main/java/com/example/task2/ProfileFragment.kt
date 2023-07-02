package com.example.task2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.task2.databinding.FragmentFirstBinding

class ProfileFragment : Fragment(R,layout,fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view : View, savedInstatnceStates: Bundle?){
        super.onViewCreated(view,savedInstatnceStates)
        binding = FragmentProfileBinding.bind(view)
    }

    override fun onDestoyView(){
        super.onDestroyView()
        binding = null
    }
}