fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean, showPieces: Boolean) : String {
    val esc: String = Character.toString(27)
    val startBlue = "$esc[30;44m"
    val startGrey = "$esc[30;47m"
    val startWhite = "$esc[30;30m"

    var board = arrayOf(intArrayOf(numColumns), intArrayOf(numLines))

    for(x in 0..numColumns) {
        for(y in 0..numLines) {
        }
    }

    /*if(columns < 5 || lines < 5) {
        print("Invalid response")
    }*/

    return "Número de colunas: $numColumns" + "Número de linhas: $numLines" + "$showLegend" + "$showPieces"
}
