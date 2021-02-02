package org.geepawhill.base

import tornadofx.*

class MainView : View("My View") {
    override val root = stackpane {
        label {
            text = "Test"
        }
    }
}
