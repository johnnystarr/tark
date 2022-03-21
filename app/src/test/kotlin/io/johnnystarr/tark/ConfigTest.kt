package io.johnnystarr.tark

import kotlin.test.Test
import kotlin.test.assertEquals

class ConfigTest {
    @Test fun appVersion() {
        val app = App()
        assertEquals("0.0.1", Config.VERSION)
    }
}
