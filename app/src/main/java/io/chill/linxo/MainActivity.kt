package io.chill.linxo

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import io.chill.linxo.databinding.ActivityMainBinding
import io.chill.linxo.util.getViewModelFactory
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> { getViewModelFactory() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.list.observe(this) {
            for (album in it)
                Timber.i("This is an album from server:$album")
        }
    }
}