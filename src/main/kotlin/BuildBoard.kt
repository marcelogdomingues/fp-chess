val esc: String = Character.toString(27)
val startBlue = "$esc[30;44m"
val startGrey = "$esc[30;47m"
val startWhite = "$esc[30;30m"
val end = "$esc[0m"
var validator = 0
val alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray()
val numbersArray = "1234567890".toCharArray()

//Devolve uma string que contém a informação do tabuleiro. Devem adaptar a função que fizeram na parte 1 para construir o tabuleiro a partir do array de peças que é passado como parâmetro.
fun buildBoard(
    numColumns: Int,
    numLines: Int,
    showLegend: Boolean = false,
    showPieces: Boolean = false,
    pieces: Array<Pair<String, String>?>
): String {

    pieces.size

    buildBlueLayer(numColumns, numLines)

    return "Número de colunas: $numColumns Número de linhas: $numLines $showLegend  $showPieces"

}

//A partir do número de colunas e linhas, será necessário construir e retornar um array de Pair (peças do tabuleiro). Esta estrutura está explicada na secção “Estrutura do jogo”.
fun createInitialBoard(numColumns: Int, numLines: Int): Array<Pair<String, String>?> {
    return arrayOf()
}

fun buildBlueLayer(numColumns: Int, numLines: Int) {

    while (validator <= 0) {

        for (i in 0..numLines) {

            for (j in 0..numColumns) {

                //First Line
                if (i == 0) {

                    //Ultima Coluna
                    when {
                        j == numColumns -> {

                            println("$startBlue   $end")

                            //Restamtes Colunas
                        }
                        j >= 1 -> {

                            val alphabet = alphabetArray[j - 1].toUpperCase()
                            print("$startBlue $alphabet $end")

                            //Primeira Coluna
                        }
                        else -> {

                            print("$startBlue   $end")

                        }
                    }
                }

                if (i in 1 until numLines) {


                    if (j == 0) {

                        val numbers = numbersArray[i - 1].toUpperCase()
                        print("$startBlue $numbers $end")

                    } else if (j in 1 until numColumns) {

                        if (j % 2 == 0) {

                            if (i % 2 == 0) {

                                print("$startWhite   $end")

                            } else {

                                print("$startGrey   $end")
                            }

                        }else{

                            if (i % 2 == 0) {

                                print("$startGrey   $end")

                            } else {

                                print("$startWhite   $end")

                            }
                        }

                    }else if (j == numColumns) {

                        println("$startBlue   $end")

                    }

                }

                //Last Line
                if (i == numLines && j < numColumns && j > 0) {

                    print("$startBlue   $end")
                    //x = 1

                } else if (i == numLines && j == 0 || i == numLines && j == numColumns) {

                    print("$startBlue   $end")

                }

            }

        }

        validator = 1

    }

}



