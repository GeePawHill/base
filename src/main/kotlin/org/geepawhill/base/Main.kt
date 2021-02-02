package org.geepawhill.base

import tornadofx.*

class Main : App(MainView::class, Styles::class)

fun main() {
    launch<Main>()
}