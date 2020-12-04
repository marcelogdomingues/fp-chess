package pt.ulusofona.fp.chess.checkers

fun wordValidation (wordList : List<String>) : Boolean {

    var wordValidation = false;

    if (wordSize(wordList) && asNumbers(wordList[0]) && asNumbers(wordList[1]) && hasUpperCase(wordList)) {

        wordValidation = true

    }

    return wordValidation

}

fun asNumbers(word : String) : Boolean{

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