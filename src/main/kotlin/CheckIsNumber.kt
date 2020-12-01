import java.lang.Integer.parseInt

fun checkIsNumber(number: String): Boolean {

    try {

        var num = parseInt(number)
        return true

    } catch (e: NumberFormatException) {

        print("\n" + "Invalid response")
        return false

    }

}