package sample.data

import kotlinx.serialization.Serializable

@Serializable
data class Text(
    val alignment: String,
    val `data`: String,
    val hOffset: Int,
    val name: String,
    val onMouseUp: String,
    val size: Int,
    val style: String,
    val vOffset: Int
)