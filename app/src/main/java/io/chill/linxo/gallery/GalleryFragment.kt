package io.chill.linxo.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import coil.compose.rememberAsyncImagePainter
import io.chill.linxo.util.getViewModelFactory

class GalleryFragment : Fragment() {

    // Get arguments from previous fragment via navigation concept
    private val arg: GalleryFragmentArgs by navArgs()

    private val viewModel by viewModels<GalleryViewModel> { getViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Set the AlbumId in view model
        viewModel.setAlbumId(arg.albumId)
        // Construct the view with compose
        return ComposeView(requireContext()).apply {
            setContent {
                GalleryScreen(viewModel)
            }
        }
    }

    @Composable
    fun GalleryScreen(viewModel: GalleryViewModel) {
        val photos = viewModel.list
        // LazyVerticalGrid is equivalent to RecyclerView in compose (no need of xml and dapter)
        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 128.dp)) {
            items(photos) { photo ->
                Image(// this painter use coil library to get picture from url
                    painter = rememberAsyncImagePainter(model = photo.thumbnailUrl),
                    contentDescription = null,
                    Modifier.size(128.dp)
                )
            }
        }
    }
}