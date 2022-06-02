package io.chill.linxo.util

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import io.chill.linxo.albums.AlbumsViewModel
import io.chill.linxo.data.FakeRepository
import io.chill.linxo.gallery.GalleryViewModel


class ViewModelFactory constructor(
    private val fakeRepository: FakeRepository, owner: SavedStateRegistryOwner,
    defaultArgs: Bundle? = null
) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {
    override fun <T : ViewModel> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ) = with(modelClass) {
        when {
            isAssignableFrom(AlbumsViewModel::class.java) ->
                AlbumsViewModel(fakeRepository)
            isAssignableFrom(GalleryViewModel::class.java) ->
                GalleryViewModel(fakeRepository, handle)
            else ->
                throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
        }
    } as T
}