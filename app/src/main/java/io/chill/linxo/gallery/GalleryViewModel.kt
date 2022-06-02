package io.chill.linxo.gallery

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import io.chill.linxo.data.FakeRepository
import io.chill.linxo.data.Photo

class GalleryViewModel(
    private val repo: FakeRepository,
    private val savedStateHandle: SavedStateHandle
) :
    ViewModel() {
    /* The right way, in MAD architecture, to get arguments from fragment
    * via savedStateHandle, persistent trough the lifecycle view model,
    * specially when user switch between app.
     */
    val albumId = savedStateHandle.getLiveData<Int>("albumId")

    // the list of photos for compose UI
    private var _list = emptyList<Photo>().toMutableStateList()
    val list: List<Photo>
        get() = _list

    private fun getGallery(): List<Photo> {
        return albumId.value?.let { repo.getGallery(it) }!!
    }

    fun setAlbumId(albumId: Int) {
        savedStateHandle["albumId"] = albumId
        _list = getGallery().toMutableStateList()
    }

}