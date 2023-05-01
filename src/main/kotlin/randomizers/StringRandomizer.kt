package randomizers

import kotlin.random.Random

class StringRandomizer {
    companion object {
        fun numericString(length: Int): String {
            var result = ""
            for (i in 1..length) {
                result += Random.nextInt(10);
            }
            return result
        }
    }
}