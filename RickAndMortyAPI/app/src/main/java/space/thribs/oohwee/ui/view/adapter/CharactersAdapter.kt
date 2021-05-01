package space.thribs.oohwee.ui.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import space.thribs.oohwee.R
import space.thribs.oohwee.data.model.character.Character
import space.thribs.oohwee.databinding.ItemCharacterBinding

class CharactersAdapter(
    private val characters: List<Character>
    ): RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    class CharactersViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding: ItemCharacterBinding? =
                DataBindingUtil.getBinding(view)
        val characterImageView: ImageView = view.findViewById(R.id.image_view)
        val nameTextView: TextView = view.findViewById(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder =
        CharactersViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_character, parent, false
            )
        )
    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val character = characters[position]
        Picasso.get().load(character.image).into(holder.characterImageView)
        holder.nameTextView.text = character.name
        holder.binding?.imageView
        holder.binding?.textView
    }

    override fun getItemCount(): Int = characters.size
}