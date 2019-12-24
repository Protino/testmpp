package sample.data

import kotlinx.serialization.Serializable

@Serializable
data class Window(
    val height: Int,
    val name: String,
    val title: String,
    val width: Int
)