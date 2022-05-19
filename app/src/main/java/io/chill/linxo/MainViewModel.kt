package io.chill.linxo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.chill.linxo.data.Album
import io.chill.linxo.data.FakeRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repo: FakeRepository) : ViewModel() {

    private val _list = MutableLiveData<List<Album>>()
    val list: LiveData<List<Album>>
        get() = _list

    init {
        getAlbums()
    }

    private fun getAlbums() {
        viewModelScope.launch {
            try {
                _list.value = repo.getAlbums()
            } catch (e: Exception) {
                _list.value = emptyList()
            }
        }
    }
}