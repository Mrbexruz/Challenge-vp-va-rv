package com.example.challenge_20vpva_rv.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.challenge_20vpva_rv.R
import com.example.challenge_20vpva_rv.databinding.FragmentAddBinding
import com.example.challenge_20vpva_rv.models.User
import com.example.challenge_20vpva_rv.utils.MyData


class AddFragment : Fragment() {
    private val binding by lazy { FragmentAddBinding.inflate(layoutInflater) }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.apply {
            btnSave.setOnClickListener {
                val user =  User (
                    edtName.text.toString(),
                    edtHobby.text.toString()
                )
                MyData.list.add(
                    user
                )
                Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show()
                MyData.userAdapter.notifyItemInserted(MyData.list.size-1)
            }
        }

        return binding.root
    }
}