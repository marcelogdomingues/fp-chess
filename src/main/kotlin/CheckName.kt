fun checkName(number: String) : Boolean {

    val trim: String = number.trim()
    val verifyWord = number.split("\\s+".toRegex())
    val wordSize = verifyWord.size
    var validation = true;

    wordValidation(verifyWord)

    if (trim.isBlank()){

        print("\n" +"Output 0")

    validation = false

    }else if(wordSize < 2){

        print("\n" +"Output 0")

        validation = false

    }else if(wordSize == 2){

        validation = true

    }


    return validation
}