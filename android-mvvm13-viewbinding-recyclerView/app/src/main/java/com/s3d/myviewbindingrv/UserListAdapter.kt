package com.s3d.myviewbindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.s3d.myviewbindingrv.databinding.ItemUserBinding

class UserListAdapter (private val users:List<User>): RecyclerView.Adapter<UserListAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       holder.bind(users[position])
    }

    override fun getItemCount()= users.size

    inner class UserViewHolder(private val binding:ItemUserBinding) :RecyclerView.ViewHolder(binding.root) {
        fun bind(user:User) {
            binding.username.text = user.username
            binding.email.text = user.email
        }
    }
}