package io.chill.linxo.albums

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import io.chill.linxo.databinding.FragmentAlbumsBinding
import io.chill.linxo.util.getViewModelFactory

class AlbumsFragment : Fragment() {

    private var _binding: FragmentAlbumsBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<AlbumsViewModel> { getViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // view binding in fragment
        _binding = FragmentAlbumsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Create the adapter with click Listener
        val albumAdapter = AlbumsAdapter(AlbumListener { albumId ->
            // action from nav_graph.xml with arguments
            val action = AlbumsFragmentDirections.actionAlbumFragmentToGalleryFragment(albumId)
            findNavController().navigate(action)
        })
        // Initialize the recyclerview of albums
        binding.albumsRecyclerview.adapter = albumAdapter
        viewModel.list.observe(viewLifecycleOwner) {
            albumAdapter.submitList(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}