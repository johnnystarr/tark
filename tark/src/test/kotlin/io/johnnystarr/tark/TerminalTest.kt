package io.johnnystarr.tark

import kotlin.test.Test
import kotlin.test.assertEquals

class TerminalTest {
    @Test fun appVersion() {
        assertEquals("\u001b[0;30m", Terminal.colorize("{x"))
        assertEquals("\u001b[0;31m", Terminal.colorize("{r"))
        assertEquals("\u001b[0;32m", Terminal.colorize("{g"))
        assertEquals("\u001b[0;33m", Terminal.colorize("{y"))
        assertEquals("\u001b[0;34m", Terminal.colorize("{b"))
        assertEquals("\u001b[0;35m", Terminal.colorize("{m"))
        assertEquals("\u001b[0;36m", Terminal.colorize("{c"))
        assertEquals("\u001b[0;37m", Terminal.colorize("{w"))
        assertEquals("\u001b[1;30m", Terminal.colorize("{X"))
        assertEquals("\u001b[1;31m", Terminal.colorize("{R"))
        assertEquals("\u001b[1;32m", Terminal.colorize("{G"))
        assertEquals("\u001b[1;33m", Terminal.colorize("{Y"))
        assertEquals("\u001b[1;34m", Terminal.colorize("{B"))
        assertEquals("\u001b[1;35m", Terminal.colorize("{M"))
        assertEquals("\u001b[1;36m", Terminal.colorize("{C"))
        assertEquals("\u001b[1;37m", Terminal.colorize("{W"))
    }
}