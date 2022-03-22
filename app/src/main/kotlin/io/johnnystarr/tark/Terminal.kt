package io.johnnystarr.tark

class Terminal {
    companion object {
        fun write(str: String) {
            println(Util.colorize(str))
        }
    }
}