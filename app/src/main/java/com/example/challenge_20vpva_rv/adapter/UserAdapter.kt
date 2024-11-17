package com.example.challenge_20vpva_rv.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge_20vpva_rv.databinding.ItemEvBinding
import com.example.challenge_20vpva_rv.models.User

class UserAdapter(val list: ArrayList<User> = ArrayList()):RecyclerView.Adapter<UserAdapter.Vh>() {
    inner class Vh (val itemEvBinding : ItemEvBinding): RecyclerView.ViewHolder(itemEvBinding.root){
        fun onBind(user: User){
            itemEvBinding.apply {
                tvName.text = user.name
                tvHobby.text = user.hobby
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.Vh {
        return Vh(ItemEvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: UserAdapter.Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
