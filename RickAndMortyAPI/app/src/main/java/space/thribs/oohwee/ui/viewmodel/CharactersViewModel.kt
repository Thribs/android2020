package space.thribs.oohwee.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import space.thribs.oohwee.data.model.character.Character
import space.thribs.oohwee.data.repository.RickAndMortyRepository

class CharactersViewModel : ViewModel() {
    private val _characters = MutableLiveData<List<Character>>()
    val characters: LiveData<List<Character>>
    get() = _characters

    private val rickAndMortyRMRepository = RickAndMortyRepository()

    fun getCharacters() = CoroutineScope(Dispatchers.IO).launch {
        _characters.postValue(
            rickAndMortyRMRepository.getCharactersResponse().characters
        )
    }
}