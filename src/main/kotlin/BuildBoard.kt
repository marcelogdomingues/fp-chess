fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean, showPieces: Boolean) : String {
    val esc: String = Character.toString(27)
    val startBlue = "$esc[30;44m"
    val startGrey = "$esc[30;47m"
    val startWhite = "$esc[30;30m"
    val end = "$esc[0m"

    var i = 0
    var j = 0


    if (showLegend == true) {
        while (i < numColumns && j < numLines) {
            for (x in 0..i) {
                i++
                if (i == numColumns) {
                    continue
                }
                for (y in 0..j) {
                    j++
                    if (j == numLines) {
                        break
                    }
                    println("$startWhite $y $end")
                }
                println("$startGrey $x $end")

            }
        }
    }

    return "Número de colunas: $numColumns" + "Número de linhas: $numLines" + "$showLegend" + "$showPieces"
}
