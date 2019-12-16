@file:JsModule("@material-ui/core/Button")

package external

import react.*

@JsName("default")
external val MaterialButton: RClass<MaterialButtonProps>

external interface MaterialButtonProps : RProps {
    var variant: String
    var color: String
    var onClick: () -> Unit
}