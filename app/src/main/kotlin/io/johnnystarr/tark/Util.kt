package io.johnnystarr.tark

class Util {
    companion object {
        fun colorize(str: String) : String {
            var colorized: String = str
            val colors: Map<String, String> = mapOf(
                "{x" to "\u001b[0;30m",
                "{r" to "\u001b[0;31m",
                "{g" to "\u001b[0;32m",
                "{y" to "\u001b[0;33m",
                "{b" to "\u001b[0;34m",
                "{m" to "\u001b[0;35m",
                "{c" to "\u001b[0;36m",
                "{w" to "\u001b[0;37m",
                "{X" to "\u001b[1;30m",
                "{R" to "\u001b[1;31m",
                "{G" to "\u001b[1;32m",
                "{Y" to "\u001b[1;33m",
                "{B" to "\u001b[1;34m",
                "{M" to "\u001b[1;35m",
                "{C" to "\u001b[1;36m",
                "{W" to "\u001b[1;37m"
            )

            for (color in colors) {
                colorized = colorized.replace(color.key, color.value)
            }

            return colorized
        }
    }
}