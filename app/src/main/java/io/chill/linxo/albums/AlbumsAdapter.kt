package io.chill.linxo.albums

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.chill.linxo.data.Album
import io.chill.linxo.databinding.ItemAlbumBinding

class AlbumsAdapter(val clickListener: AlbumListener) :
    ListAdapter<Album, AlbumsAdapter.ViewHolder>(AlbumDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemAlbumBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAlbum(getItem(position), clickListener)
    }

    class ViewHolder(val binding: ItemAlbumBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindAlbum(album: Album, clickListener: AlbumListener) {
            binding.albumId = album.id
            binding.clickListener = clickListener
            binding.albumName.text = album.title
            binding.albumAuthor.text = album.author
        }
    }
}

class AlbumDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}

class AlbumListener(val clickListener: (albumId: Int) -> Unit) {
    fun onClick(albumId: Int) = clickListener(albumId)
}