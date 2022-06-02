package io.chill.linxo.data

import io.chill.linxo.data.remote.FakeRemoteDataSource

class FakeRepository(private val fakeDataSource: FakeRemoteDataSource) {

    private var albumList = emptyList<Album>()

    // Creating an Hash Map with an estimated capacity
    // (this capacity can be changed by adding elements)
    private var authorList = HashMap<Int, String>(10)

    private var photoList = emptyList<Photo>()

    private var galleryList = HashMap<Int, List<Photo>>(100)

    /* v0: suspend fun getAlbums() = fakeDataSource.getAlbums()
    * v1: get the album list for UI
    *  that is to say the author name (user name in the Fake API)
    * is added to each Album object.
    */
    suspend fun getAlbums(): List<Album> {
        getAuthors()
        albumList = fakeDataSource.getAlbums()
        for (album in albumList) {
            album.author = getAuthor(album.userId)
        }
        // sort alphabetically the list before return it
        return albumList.sortedBy { it.title }
    }

    private suspend fun getAuthors() {
        for (user in fakeDataSource.getAuthors())
            authorList[user.id] = user.name
    }

    private fun getAuthor(id: Int) = authorList[id]

    fun getGallery(albumId: Int): List<Photo>? {
        if (galleryList[albumId].isNullOrEmpty())
            galleryList[albumId] = photoList.filter { it.albumId == albumId }
        return galleryList[albumId]
    }

    suspend fun getPhotos() {
        if (photoList.isEmpty())
            photoList = fakeDataSource.getPhotos()
    }
}