package io.johnnystarr.tark

import kotlin.test.Test
import kotlin.test.assertEquals

class ConfigTest {
    @Test fun appVersion() {
        assertEquals("0.0.1", Config.VERSION)
    }
}
