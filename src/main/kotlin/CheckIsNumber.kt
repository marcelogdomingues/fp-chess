import java.lang.Integer.parseInt

fun checkIsNumber(number: String): Boolean {

    try {

        parseInt(number)
        return true

    } catch (e: NumberFormatException) {

        print("\n" + "Invalid response" + e.message)
        return false

    }

}