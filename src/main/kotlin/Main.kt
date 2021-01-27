import java.awt.event.KeyEvent
import java.lang.NumberFormatException
import java.util.*
import kotlin.system.exitProcess


fun main() {

    //buildBoard(6,6, true, true,arrayOfNulls(5))
   menu()
}

fun menu() {
    var isRunning = true

    while (isRunning) {

        buildMenu()

        try {

            val scan = Scanner(System.`in`)
            val choice = scan.next()

            if (checkIsNumber(choice)) {

                when (choice.toInt()) {

                    1 -> {

                        isRunning = false
                        startGame()


                    }

                    0 -> exitProcess(1)

                    else ->

                        println("Option Not Available")

                }
            }

        } catch (e: NumberFormatException) {

            println("Error. You have to choose a number!")

        }

    }
}

