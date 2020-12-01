fun buildMenu(): String{

    val welcome = "\n" + "Welcome to the Chess Board Game!"
    val start = "1-> Start New Game"
    val quit = "0-> Exit"

    val menuBuilder = welcome + "\n" + start + "\n"+ quit + "\n";

    return menuBuilder

}