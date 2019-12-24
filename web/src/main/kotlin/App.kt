import sample.SamplePresenter
import sample.SampleView
import sample.data.SampleData
import external.MaterialButton
import react.*


class App : RComponent<RProps, App.AppState>(), SampleView {

    private val presenter = SamplePresenter.getInstance(this)

    override fun componentDidMount() {
        super.componentDidMount()
        presenter.getSampleData()
    }

    override fun RBuilder.render() {

        MaterialButton {
            attrs {
                variant = "contained"
                color = "primary"
            }
            +state.text
        }

        //styledImg(src = "") {  }
    }

    interface AppState : RState {
        var text: String
    }

    override fun setSampleData(data: SampleData) {
        setState {
            text = data.text.name
        }
    }
}