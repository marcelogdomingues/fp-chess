package pt.ulusofona.fp.chess.checkers

fun checkName(number: String) : Boolean {

    val trim: String = number.trim()

    val verifyWord = number.split(" ")
    var validation = false



    if (trim.isBlank()){

        print("\n" + "Invalid response." + "\n")

    validation = false

    }else if(wordValidation(verifyWord)){

        validation = true

    }


    return validation
}