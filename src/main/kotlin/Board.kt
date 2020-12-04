var boardOption = 1
var boardValidation = true


fun board(){


    while (boardValidation) {

        when (boardOption) {

            1 -> columns()
            2 -> lines()

        }
    }
    buildBoard(5,5, true, showPieces = false)
}

fun columns(){


    print("\n" + "How many chess columns?" + "\n")

    val col = readLine()

    if (checkColumn(col.toString())){

        boardOption++

    }

}

fun lines(){


    print("\n" + "How many chess lines?" + "\n")

    val line = readLine()

    if (checkLine(line.toString())){

        boardOption++
        boardValidation = false

    }

}
