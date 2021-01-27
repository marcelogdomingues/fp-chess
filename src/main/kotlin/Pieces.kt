fun wantSpecificPiece(message: String): Boolean? {
    return false
}

fun isASpecificPieceValid(piece: String): Boolean{
    return false
}

fun replaceWithSpecificPiece(pieces : Array<Pair<String,String>?>, piece: String){

}

//Valida se a peça escolhida para mover é do respectivo jogador. Por exemplo, se o jogador das peças brancas (turno 0), escolheu bem a peça para mover (côr “w”).
fun checkRightPieceSelected(pieceColor: String, turn: Int): Boolean{
    return false
}

//Valida se o movimento da peça é válido. Se sim retorna true e false caso contrário. (Dica: Esta função irá ser chamada dentro da função movePiece).
fun isValidTargetPiece(currentSelectedPiece : Pair<String, String>,currentCoord : Pair<Int, Int>, targetCoord : Pair<Int, Int>, pieces : Array<Pair<String, String>?>, numColumns: Int, numLines: Int): Boolean{
    return false
}

//A partir do número de colunas e linhas, será necessário construir e retornar um array de 3 posições de Int.
// Na primeira posição é identificado o número de peças brancas, na seguinte o número de peças pretas e por fim turno atual (0 para branco e 1 para preto). Exemplo: arrayOf(16,16,0).
// Esta estrutura está explicada em detalhe na secção Estrutura do jogo.
fun createTotalPiecesAndTurn(numColumns: Int, numLines: Int): Array<Int?> {
    return arrayOfNulls(5)
}

//Esta função, irá alterar o valor do argumento pieces e do totalPiecesAndTurno.
// Só serão alterados caso o movimento das peças sejam válidas. Se forem alterados é retornado true e false caso contrário. (Dica: esta função irá ser chamada dentro da função startNewGame)
fun movePiece( pieces : Array<Pair<String, String>?>, numColumns: Int, numLines: Int, currentCoord: Pair<Int, Int>, targetCoord: Pair<Int, Int>, totalPiecesAndTurn : Array<Int>): Boolean{
    return false
}

//Dado as coordenadas do cavalo (currentCoord), as coordenadas de destino (targetCoord) e as peças do tabuleiro (pieces) retornar se o movimento é válido (true) ou não (false)
//Esta função não deve alterar o tabuleiro, apenas verificar se o movimento é válido.
fun isHorseValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,pieces : Array<Pair<String, String>?>,numColumns: Int, numLines: Int): Boolean{
    return false
}

//Dado as coordenadas do rei (currentCoord), as coordenadas de destino (targetCoord) e as peças do tabuleiro (pieces) retornar se o movimento é válido (true) ou não (false)
//Esta função não deve alterar o tabuleiro, apenas verificar se o movimento é válido.
fun isKingValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    return false
}

//Dado as coordenadas da Torre (currentCoord), as coordenadas de destino (targetCoord) e as peças do tabuleiro (pieces) retornar se o movimento é válido (true) ou não (false)
//Esta função não deve alterar o tabuleiro, apenas verificar se o movimento é válido.
fun isTowerValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    return false
}

//Dado as coordenadas do Bispo (currentCoord), as coordenadas de destino (targetCoord) e as peças do tabuleiro (pieces) retornar se o movimento é válido (true) ou não (false)
//Esta função não deve alterar o tabuleiro, apenas verificar se o movimento é válido.
fun isBishopValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int): Boolean{
    return false
}

//Dado as coordenadas da Rainha (currentCoord), as coordenadas de destino (targetCoord) e as peças do tabuleiro (pieces) retornar se o movimento é válido (true) ou não (false)
//Esta função não deve alterar o tabuleiro, apenas verificar se o movimento é válido.
fun isQueenValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    return false
}

//Dado as coordenadas do Peão (currentCoord), as coordenadas de destino (targetCoord), as peças do tabuleiro (pieces), o turno actual
fun isKnightValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,numColumns: Int,numLines: Int):Boolean{
    return false
}