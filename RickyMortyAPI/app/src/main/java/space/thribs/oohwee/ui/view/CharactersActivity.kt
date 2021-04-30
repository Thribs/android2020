package space.thribs.oohwee.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import space.thribs.oohwee.R
import space.thribs.oohwee.data.model.CharactersResponse
import space.thribs.oohwee.databinding.ActivityCharactersBinding
import space.thribs.oohwee.ui.view.adapter.CharactersAdapter
import space.thribs.oohwee.ui.viewmodel.CharactersViewModel

class CharactersActivity : AppCompatActivity() {

    private val viewmodel: CharactersViewModel by viewModels()
    private lateinit var binding: ActivityCharactersBinding
    private lateinit var adapter: CharactersAdapter
    private lateinit var recyclerView: RecyclerView
    private val characters = mutableListOf<CharactersResponse.Character>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharactersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewmodel = viewmodel
        binding.lifecycleOwner = this
        binding.characters = characters

        recyclerView = binding.charactersRecyclerView
        adapter = CharactersAdapter(characters)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        viewmodel.getCharacters()
        viewmodel.characters.observe(this, { list ->
            characters.addAll(list)
            adapter.notifyDataSetChanged()
        })
    }
}