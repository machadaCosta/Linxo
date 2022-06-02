package io.chill.linxo.data.remote

import io.chill.linxo.data.Album
import io.chill.linxo.data.Photo
import io.chill.linxo.data.User
import retrofit2.http.GET

interface FakeAPIService {
    @GET("/albums")
    suspend fun getAlbums(): List<Album>

    @GET("/users")
    suspend fun getUsers(): List<User>

    @GET("/photos")
    suspend fun getPhotos(): List<Photo>
}