package io.chill.linxo.data

data class Album(
    val id: Int,
    val title: String,
    var author: String?,
    val userId: Int
)