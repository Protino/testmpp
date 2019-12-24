package sample.data

import kotlinx.serialization.Serializable

@Serializable
data class Image(
    val alignment: String,
    val hOffset: Int,
    val name: String,
    val src: String,
    val vOffset: Int
)