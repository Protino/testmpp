package sample

import AlfredApiClient
import IODispatcher
import logDebug
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.withContext
import sample.data.SampleData


/**
 * Created by Gurupad Mamadapur on 2019-12-23.
 */

class SampleModel private constructor(private val api: AlfredApiClient) {

    suspend fun getSampleData(): SampleData? {
        return withContext(IODispatcher) {
            try {
                logDebug("SampleModel", "Fetching sample data")
                api.getSampleData().also {
                    logDebug("SampleModel", "Fetched - $it")
                }

            } catch (e: IOException) {
                logDebug("SampleModel", "Exception - $e")
                null
            }
        }
    }

    companion object {
        fun getInstance(): SampleModel {
            return SampleModel(AlfredApiClient)
        }
    }
}