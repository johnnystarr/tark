package io.johnnystarr.tark

class App {
    val bootMessage: String = "TARK version ${Config.VERSION}"
}

fun main() {
    println(App().bootMessage)
}
