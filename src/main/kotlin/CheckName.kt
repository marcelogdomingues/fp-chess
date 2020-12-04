fun checkName(number: String) : Boolean {

    val trim: String = number.trim()

    val verifyWord = number.split(" ")
    var validation = false



    if (trim.isBlank()){

        print("\n" + "Invalid response." + "\n")

    }else if(wordValidation(verifyWord)){

        validation = true

    }


    return validation
}
