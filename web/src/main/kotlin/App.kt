import external.MaterialButton
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.img

@JsModule("img/logo.svg")
external val logo: dynamic

class App : RComponent<RProps, RState>(){

    override fun RBuilder.render() {

        div{
            img(src = logo) {
            }
        }

        MaterialButton {
            attrs {
                variant = "contained"
                color = "primary"
            }
            +"Nice"
        }
    }
}