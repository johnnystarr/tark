package io.johnnystarr.tark

class App {
    val bootMessage: String = "TARK version ${Config.VERSION}"
}

fun main() {
    Terminal.write(Config.SPLASH)
    Terminal.write("{w${App().bootMessage}")
}
