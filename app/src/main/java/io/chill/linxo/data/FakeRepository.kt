package io.chill.linxo.data

import io.chill.linxo.data.remote.FakeRemoteDataSource

class FakeRepository(private val fakeDataSource: FakeRemoteDataSource) {
    suspend fun getAlbums() = fakeDataSource.getAlbums()
}