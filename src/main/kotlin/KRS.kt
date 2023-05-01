import generators.PhoneNumberGenerator

/**
 * Main API class for generating all random strings
 */
class KRS {
    companion object {
        /**
         * Generates next default phone number. By default now it has 7 country code and random 3-digit operator
         * code starting with 9.
         *
         * @return phone number.
         */
        fun nextPhoneNumber(): String {
            return PhoneNumberGenerator.generatePhoneNumber()
        }
    }
}