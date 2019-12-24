package sample

import logDebug
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * Created by Gurupad Mamadapur on 2019-12-23.
 */
class SamplePresenter private constructor(private val view: SampleView, private val model: SampleModel) {

    private val TAG: String = "SamplePresenter"

    fun getSampleData() {
        GlobalScope.launch(Dispatchers.Main) {
            logDebug(TAG, "Launching")
            model.getSampleData()?.let {
                view.setSampleData(it)
            }
        }
    }

    companion object {

        fun getInstance(view: SampleView): SamplePresenter {
            return SamplePresenter(view, SampleModel.getInstance())
        }
    }
}