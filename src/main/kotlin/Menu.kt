import java.util.*


fun menu() {


    displayMenu();



    }

fun displayMenu() {

    print("Welcome to the Chess Board Game!"+ "\n")
    print("1-> Start New Game"+ "\n")
    print("0-> Exit Game"+ "\n")

    val scan = Scanner(System.`in`)

    when  (scan.nextInt()) {
        1 -> print("You picked option 1" + "\n");
        2 -> print("Exit Game"+ "\n")

    }

    if (scan.nextInt() == 1){

        Game()

    }

}