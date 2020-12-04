fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean, showPieces: Boolean) : String {
    val esc: String = Character.toString(27)
    val startBlue = "$esc[30;44m"
    val startGrey = "$esc[30;47m"
    val startWhite = "$esc[30;30m"
    val end = "$esc[0m"




    if (showLegend == true) {
        for (x in 1..numColumns) {
            for (y in 1..numLines) {
                println("$startBlue   $end")
            }
        }
    }

    return "Número de colunas: $numColumns" + "Número de linhas: $numLines" + "$showLegend" + "$showPieces"
}