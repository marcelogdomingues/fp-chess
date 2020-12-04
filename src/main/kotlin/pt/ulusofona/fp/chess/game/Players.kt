package pt.ulusofona.fp.chess.game

import pt.ulusofona.fp.chess.checkers.checkName

var playerOption = 1
var playerValidation = true

fun players() {

    while (playerValidation) {

        when (playerOption) {

            1 -> playerOne()
            2 -> playerTwo()

        }
    }
}

fun playerOne(){

    print("\n" + "First player name?" + "\n")

    val player1 = readLine()

    if (checkName(player1.toString())){

        playerOption++

    }

}

fun playerTwo(){

    print("\n" + "Second player name?" + "\n")

    val player2 = readLine()

    if (checkName(player2.toString())){

        playerOption = 1
        playerValidation = false

    }

}
