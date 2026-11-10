package io.github.jarbear82

import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformJvmTest {
    @Test
    fun `platform name is reported`() {
        assertTrue(getPlatform().name.isNotBlank())
    }
}
