package io.chill.linxo.albums

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.chill.linxo.data.Album
import io.chill.linxo.data.FakeRepository
import kotlinx.coroutines.launch

class AlbumsViewModel(private val repo: FakeRepository) : ViewModel() {

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
        // Send the request to get the photos in time
        getGalleries()
    }

    private fun getGalleries() {
        viewModelScope.launch {
            try {
                repo.getPhotos()
            } catch (e: Exception) {
            }
        }
    }

}