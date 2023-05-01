package generators

import randomizers.StringRandomizer

class PhoneNumberGenerator {
    companion object {

        fun generatePhoneNumber(): String {
            val countryCode = "9${StringRandomizer.numericString(2)}";
            return generalPhoneGenerator("7", countryCode, 10)
        }

        fun generalPhoneGenerator(countryCode: String, operatorCode: String, length: Int): String {
            val numberPart = StringRandomizer.numericString(length - countryCode.length - operatorCode.length)
            return "+${countryCode}${operatorCode}${numberPart}"
        }
    }
}
