package space.thribs.mvvmarchitectureandroidbeginners.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import space.thribs.mvvmarchitectureandroidbeginners.R
import space.thribs.mvvmarchitectureandroidbeginners.data.model.User
import space.thribs.mvvmarchitectureandroidbeginners.databinding.ItemLayoutBinding

class MainAdapter(
        private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(itemView.context))
        fun bind(user: User) {
            binding.userNameTextView.setText(user.name)
            binding.userEmailTextView.setText(user.email)
            Glide.with(binding.avatarImageView.context)
                    .load(user.avatar)
                    .into(binding.avatarImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.item_layout, parent, false
                )
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    override fun getItemCount(): Int = users.size

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}