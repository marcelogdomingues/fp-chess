var boardOption = 1
var boardValidation = true

var cols = 0;
var rows = 0;

fun board(){


    while (boardValidation) {

        when (boardOption) {

            1 -> columns()
            2 -> lines()

        }
    }

    buildBoard(getColumns(),getLines(), true, showPieces = false)

}

fun columns(){


    print("\n" + "How many chess columns?" + "\n")

    val col = readLine()

    if (checkColumn(col.toString())){

        cols = col.toString().toInt()
        boardOption++

    }

}

fun getColumns() : Int{

    return cols;
}

fun lines(){


    print("\n" + "How many chess lines?" + "\n")

    val line = readLine()

    if (checkLine(line.toString())){

        boardOption++
        rows = line.toString().toInt()
        boardValidation = false

    }

}

fun getLines() : Int {

    return rows;
}

fun showChessLegendOrPieces(message: String): Boolean?{


    return true;
}

fun showChessLegend(){

}

fun showPieces(){

}