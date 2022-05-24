package io.chill.linxo.albums

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.chill.linxo.data.Album
import io.chill.linxo.databinding.ItemAlbumBinding

class AlbumsAdapter() : ListAdapter<Album, AlbumsAdapter.ViewHolder>(AlbumDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemAlbumBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAlbum(getItem(position))
    }

    class ViewHolder(val binding: ItemAlbumBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindAlbum(album: Album) {
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