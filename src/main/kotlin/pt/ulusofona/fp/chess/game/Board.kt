package pt.ulusofona.fp.chess.game

import pt.ulusofona.fp.chess.checkers.checkColumn
import pt.ulusofona.fp.chess.checkers.checkLine

var boardOption = 1
var boardValidation = true


fun board(){


    while (boardValidation) {

        when (boardOption) {

            1 -> columns()
            2 -> lines()

        }
    }
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