fun wordValidation (wordList : List<String>) : Boolean {

    var wordValidation = false;

    if (wordSize(wordList) && hasNumbers(wordList[0]) && hasNumbers(wordList[1]) && hasUpperCase(wordList)) {

        wordValidation = true

    }

    return wordValidation

}

fun hasNumbers(word : String) : Boolean{

    var validation = false
    val removeBlankSpaces = word.replace("\\s".toRegex(), "")

    if(removeBlankSpaces.toIntOrNull() == null) {

        validation = true

    }

    return validation

}

fun hasUpperCase(word : List<String>) : Boolean {

    var validation = false


    if (word[0].capitalize() == word[0] && word[1].capitalize() == word[1]){

        validation = true;

    }


    return validation

}

fun wordSize(word : List<String>) : Boolean{

    var validation = false

    if(word.size == 2){

        validation = true

    }

    return validation


}