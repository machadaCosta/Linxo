package io.chill.linxo.util

import androidx.appcompat.app.AppCompatActivity
import io.chill.linxo.App

fun AppCompatActivity.getViewModelFactory(): ViewModelFactory {
    val repository = App.fakeRepository
    return ViewModelFactory(repository, this)
}