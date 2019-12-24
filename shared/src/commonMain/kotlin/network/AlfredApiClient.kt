import sample.data.SampleData
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.utils.io.core.use

object AlfredApiClient {

    val client = HttpClient {
        install(JsonFeature){
            serializer = KotlinxSerializer()
        }
    }

    suspend fun getSampleData(): SampleData = client.use { client: HttpClient ->
        client.get("https://api.myjson.com/bins/177qlc")
    }
}
