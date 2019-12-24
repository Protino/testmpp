package sample.data

import kotlinx.serialization.Serializable

@Serializable
data class SampleData(
    val debug: String,
    val image: Image,
    val text: Text,
    val window: Window
)