fun wordValidation (wordList : List<String>) : Boolean {

    var wordValidation = false;
    val word = wordList.joinToString().replace(",", "")


    if (asNumbers(word) && hasUpperCase(wordList)) {

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
