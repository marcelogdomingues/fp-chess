fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean, showPieces: Boolean) : String {
    val esc: String = Character.toString(27)
    val startBlue = "$esc[30;44m"
    val startGrey = "$esc[30;47m"
    val startWhite = "$esc[30;30m"
    val end = "$esc[0m"

    for (x in 0..numColumns) {
        for (y in 0..numLines) {
            if (x % 2 == 0) {
                print("$startWhite $end")
            } else {
                print("$startGrey $end")
            }
        }
    }

    return "Número de colunas: $numColumns" + "Número de linhas: $numLines" + "$showLegend" + "$showPieces"
}
