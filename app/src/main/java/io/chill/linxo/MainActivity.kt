package io.chill.linxo

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import io.chill.linxo.albums.AlbumsAdapter
import io.chill.linxo.databinding.FragmentAlbumsBinding
import io.chill.linxo.util.getViewModelFactory

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> { getViewModelFactory() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val binding = ActivityMainBinding.inflate(layoutInflater)
        val binding = FragmentAlbumsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize the recyclerview of albums
        var albumAdapter = AlbumsAdapter()
        binding.albumsRecyclerview.adapter = albumAdapter
        viewModel.list.observe(this) {
            for (album in it)
                albumAdapter.submitList(it)
            //Timber.i("This is an album from server: $album")
        }
    }
}