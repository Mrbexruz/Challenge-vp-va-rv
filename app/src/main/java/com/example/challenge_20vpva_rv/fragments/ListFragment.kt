package com.example.challenge_20vpva_rv.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.challenge_20vpva_rv.R
import com.example.challenge_20vpva_rv.adapter.UserAdapter
import com.example.challenge_20vpva_rv.databinding.FragmentListBinding
import com.example.challenge_20vpva_rv.utils.MyData
import com.example.challenge_20vpva_rv.utils.MyData.userAdapter

class ListFragment : Fragment() {
    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userAdapter = UserAdapter(MyData.list)
        binding.rv.adapter = userAdapter


        return binding.root
    }
}