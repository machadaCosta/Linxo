package io.chill.linxo.util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.chill.linxo.App

fun AppCompatActivity.getViewModelFactory(): ViewModelFactory {
    val repository = App.fakeRepository
    return ViewModelFactory(repository, this)
}

fun Fragment.getViewModelFactory(): ViewModelFactory {
    val repository = App.fakeRepository
    return ViewModelFactory(repository, this)
}