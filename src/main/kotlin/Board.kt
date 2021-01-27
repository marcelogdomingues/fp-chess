var boardOption = 1
var boardValidation = true

var cols = 0
var rows = 0
var showLegend = false
var showPiece = false

fun board() {


    while (boardValidation) {

        when (boardOption) {

            1 -> columns()
            2 -> lines()
            3 -> checkTableOptions(getColumns(), getLines())
            4 -> showLegend()
            5 -> showPieces()

        }

    }

    resetValues()
    startNewGame("w","b", arrayOfNulls(5), arrayOfNulls(5), getColumns(), getLines(), showLegend, showPiece)
    //buildBoard(numColumns = getColumns() + 1, numLines = getLines() + 1, showLegend = getShowChessLegendValue(), showPieces = getShowPiecesValue(),  pieces = arrayOfNulls(5))

}

fun columns() {


    print("\n" + "How many chess columns?" + "\n")

    val col = readLine()

    if (checkColumn(col.toString())) {

        cols = col.toString().toInt()
        boardOption++

    }

}

fun getColumns(): Int {

    return cols;
}

fun lines() {


    print("\n" + "How many chess lines?" + "\n")

    val line = readLine()

    if (checkLine(line.toString())) {

        boardOption++
        rows = line.toString().toInt()

    }

}

fun getLines(): Int {

    return rows;
}


fun checkTableOptions(cols: Int, lines: Int) {


    if (cols == 8 && lines == 8) {

        boardOption++

    } else if (cols == 7 && lines == 8) {

        boardOption++

    } else if (cols == 6 && lines == 6) {

        boardOption++

    } else if (cols == 6 && lines == 6) {

        boardOption++

    } else if (cols == 4 && lines == 4) {

        boardOption++

    } else {

        print("\n" + "Invalid Response" + "\n")
        boardOption = 1

    }

}

fun showChessLegendOrPieces(message: String): Boolean? {


    if (message == "y" || message == "Y") {

        return true

    } else if (message == "n" || message == "N") {

        return false

    } else {

        return null

    }

}

fun showLegend(): Boolean {

    print("\n" + "Show legend (y/n)?" + "\n")

    val legend = readLine()

    if (showChessLegendOrPieces(legend.toString()) == true) {

        boardOption++
        showLegend = true

    } else if (showChessLegendOrPieces(legend.toString()) == false) {

        boardOption++
        showLegend = false

    } else if (showChessLegendOrPieces(legend.toString()) == null) {

        print("\n" + "Invalid Response" + "\n")


    }

    return showLegend

}

fun getShowChessLegendValue(): Boolean {


    return showLegend
}

fun showPieces(): Boolean {


    print("\n" + "Show pieces (y/n)?" + "\n")

    val pieces = readLine()

    if (showChessLegendOrPieces(pieces.toString()) == true) {

        boardOption++
        showPiece = true
        boardValidation = false

    } else if (showChessLegendOrPieces(pieces.toString()) == false) {

        boardOption++
        showPiece = false
        boardValidation = false

    } else if (showChessLegendOrPieces(pieces.toString()) == null) {

        print("\n" + "Invalid response" + "\n")

    }

    print("\n")
    return showPiece
}

fun getShowPiecesValue(): Boolean {

    return showPiece

}

fun resetValues(){

    boardOption = 1
    boardValidation = true


}
