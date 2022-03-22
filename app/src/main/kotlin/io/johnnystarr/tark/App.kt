package io.johnnystarr.tark

class App {
    val bootMessage: String = "TARK version ${Config.VERSION}"
}

fun main() {
    println(Config.SPLASH)
    println(App().bootMessage)
    println(Util.colorize("{GGreen {bBlue {rRed."))
}
