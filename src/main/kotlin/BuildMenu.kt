fun buildMenu(): String{

    val welcome =  "Welcome to the Chess Board Game!"
    val start = "1-> Start New Game"
    val quit = "0-> Exit"

    val menuBuilder = "\n" + welcome + "\n" + start + "\n"+ quit + "\n"

    return menuBuilder

}