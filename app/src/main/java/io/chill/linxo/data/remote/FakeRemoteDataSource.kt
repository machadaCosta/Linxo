package io.chill.linxo.data.remote

import com.squareup.moshi.Moshi
import io.chill.linxo.data.Album
import io.chill.linxo.data.User
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object FakeRemoteDataSource {
    private const val FAKE_URL = "https://jsonplaceholder.typicode.com"

    private val moshi = Moshi.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(FAKE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    private val retrofitService : FakeAPIService by lazy {
        retrofit.create(FakeAPIService::class.java)
    }

    suspend fun getAlbums():List<Album>{
        return retrofitService.getAlbums()
    }

    suspend fun getAuthors():List<User>{
        return retrofitService.getUsers()
    }
}