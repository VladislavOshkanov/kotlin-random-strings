package randomizers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringRandomizerTest {

    @Test
    fun testNumericStringRandomizer() {
        val length = 5
        val result = StringRandomizer.numericString(length)

        assertEquals(length, result.length)
    }
}