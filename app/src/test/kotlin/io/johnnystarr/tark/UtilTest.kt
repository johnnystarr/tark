package io.johnnystarr.tark

import kotlin.test.Test
import kotlin.test.assertEquals

class UtilTest {
    @Test fun appVersion() {
        assertEquals("\u001b[0;30m", Util.colorize("{x"))
        assertEquals("\u001b[0;31m", Util.colorize("{r"))
        assertEquals("\u001b[0;32m", Util.colorize("{g"))
        assertEquals("\u001b[0;33m", Util.colorize("{y"))
        assertEquals("\u001b[0;34m", Util.colorize("{b"))
        assertEquals("\u001b[0;35m", Util.colorize("{m"))
        assertEquals("\u001b[0;36m", Util.colorize("{c"))
        assertEquals("\u001b[0;37m", Util.colorize("{w"))
        assertEquals("\u001b[1;30m", Util.colorize("{X"))
        assertEquals("\u001b[1;31m", Util.colorize("{R"))
        assertEquals("\u001b[1;32m", Util.colorize("{G"))
        assertEquals("\u001b[1;33m", Util.colorize("{Y"))
        assertEquals("\u001b[1;34m", Util.colorize("{B"))
        assertEquals("\u001b[1;35m", Util.colorize("{M"))
        assertEquals("\u001b[1;36m", Util.colorize("{C"))
        assertEquals("\u001b[1;37m", Util.colorize("{W"))
    }
}