val esc: String = Character.toString(27)
val startBlue = "$esc[30;44m"
val startGrey = "$esc[30;47m"
val startWhite = "$esc[30;30m"
val end = "$esc[0m"
var x = 0
val alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray()
val numbersArray = "1234567890".toCharArray()


fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean = false, showPieces: Boolean = false): String {

    buildBlueLayer(numColumns, numLines)

    return "Número de colunas: $numColumns Número de linhas: $numLines $showLegend  $showPieces"

}

fun buildBlueLayer(numColumns: Int, numLines: Int) {


    while (x <= 0) {

        for (i in 0..numLines) {

            for (j in 0..numColumns) {

                //First Line
                if (i == 0) {

                    if (j == numColumns) {

                        print("$startBlue        $end")
                        print("\n")

                    } else if (j >= 1) {

                        val alphabet = alphabetArray[j - 1].toUpperCase()
                        print("$startBlue    $alphabet    $end")

                    } else {

                        print("$startBlue        $end")

                    }
                }

                if (i > 0 && i < numLines) {

                    if (j == 0) {

                        val numbes = numbersArray[i - 1].toUpperCase()
                        print("$startBlue    $numbes    $end")
                        print("\n")


                    }

                }

                //Last Line
                if (i == numLines && j < numColumns && j > 0) {

                    print("$startBlue         $end")
                    //x = 1

                } else if (i == numLines && j == 0 || i == numLines && j == numColumns) {

                    print("$startBlue        $end")

                }

            }

        }

        x = 1

    }
}


