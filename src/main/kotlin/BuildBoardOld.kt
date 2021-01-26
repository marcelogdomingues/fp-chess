/*
val esc: String = Character.toString(27)
val startBlue = "$esc[30;44m"
val startGrey = "$esc[30;47m"
val startWhite = "$esc[30;30m"
val end = "$esc[0m"

fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean = false, showPieces: Boolean = false) : String {

    while(showLegend == true) {
        for (x in 0..numColumns) {
            for (y in 0..numLines) {
                if (x % 2 == 0) {
                    print("$startBlue $end")
                } else {
                    print("$startGrey $end")
                }
            }
        }
        return esc
    }

    return "Número de colunas: $numColumns Número de linhas: $numLines $showLegend  $showPieces"
}

fun blueBoard(){



}*/
