package pt.ulusofona.fp.chess.checkers

import java.lang.NumberFormatException

fun checkLine(lines: String): Boolean {

    var lineValidation = false


    try {

        val lineNumber = lines.toInt()

        if (lineNumber < 5) {

            print("Invalid response")

        }else{

            lineValidation = true

        }


    } catch (e: NumberFormatException) {

        print("Invalid response")

    }

    return lineValidation
}

fun checkColumn(cols: String): Boolean {

    var columnValidation = false


    try {

        val colNumber = cols.toInt()

        if (colNumber < 5) {

            print("Invalid response")

        }else{

            columnValidation = true

        }


    } catch (e: NumberFormatException) {

        print("Invalid response")

    }

    return columnValidation
}