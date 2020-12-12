import java.lang.NullPointerException

fun checkName(number: String) : Boolean {

    var validation = false

    try {
        val trim: String = number.trim()

        val verifyWord = number.split(" ")


        if (trim.isBlank()) {

            print("\n" + "Invalid response." + "\n")

        } else if (wordValidation(verifyWord)) {

            validation = true

        }



    }catch (E: NullPointerException){

        print("\n" + "Invalid response" + "\n")

    }

    return validation

}
