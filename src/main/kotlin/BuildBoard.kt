fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean, showPieces: Boolean) : String {
    val esc: String = Character.toString(27)
    val startBlue = "$esc[30;44m"
    val startGrey = "$esc[30;47m"
    val startWhite = "$esc[30;30m"
    val end = "$esc[0m"

    println("$startBlue $end")

    println("------$numColumns---------$numLines")

    if (showLegend) {
            for (x in 0..numColumns) {
                for(x in 0..numLines) {
                    if(x % 2 == 0) {
                        println(startWhite)
                    }
                        println(startGrey)
                }

        }

        return esc

    }

    return "Número de colunas: $numColumns" + "Número de linhas: $numLines" + "$showLegend" + "$showPieces"
}
