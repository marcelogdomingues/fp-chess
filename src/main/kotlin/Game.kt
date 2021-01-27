fun startGame(){

    players()
    game()

}

fun game(){

    board()

}

//É nesta função que é mostrado o tabuleiro e é onde pede constantemente para cada jogador colocar as coordenadas de partida e de origem.
// Também é aqui que dá a opção de retornar ao menu principal, clicando na tecla “m”.
// É de notar que os argumentos whitePlayer e blackPlayer são os nomes dados pelos utilizador, em que o whitePlayer é o nome do 1o jogador e o blackPlayer é o nome do 2o jogador.
fun startNewGame (whitePlayer: String, blackPlayer: String, pieces : Array<Pair<String, String>?>, totalPiecesAndTurn : Array<Int?>,numColumns: Int,numLines: Int, showLegend: Boolean= false, showPieces: Boolean = false){

}

//Valida se as coordenadas escolhidas estão dentro do tabuleiro.
fun isCoordinateInsideChess (coord: Pair<Int, Int>,numColumns: Int,numLines: Int):Boolean{
    return false
}

//A partir de uma string (por exemplo “2a”), esta função converte as coordenadas em números (por exemplo return Pair(2,2) com a string de entrada de “2a”).
// Se as coordenadas forem inválidas, deve retornar null. A String passada deve ser case insensitive, ou seja, aceitar “2a” ou “2A”.
fun getCoordinates (readText: String?): Pair<Int, Int>?{
    return null
}

//A partir do tipo de peça e da côr, devolve o Unicode respetivo. Caso a peça e/ou a côr sejam inválidos, deve retornar uma String com um espaço (“ “). Verão que este espaço vai facilitar o desenho do tabuleiro.
fun convertStringToUnicode(piece: String, color: String): String{
    return "0"
}