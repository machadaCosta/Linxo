package io.chill.linxo.util

import androidx.fragment.app.Fragment
import io.chill.linxo.App

fun Fragment.getViewModelFactory(): ViewModelFactory {
    val repository = App.fakeRepository
    return ViewModelFactory(repository, this)
}