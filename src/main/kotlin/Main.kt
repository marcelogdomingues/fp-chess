
import java.lang.NumberFormatException
import java.util.*
import kotlin.system.exitProcess


fun main(args: Array<String>) {

   val isRunning = true;

   while (isRunning) {

      print(buildMenu())

      try {

         val scan = Scanner(System.`in`)
         val choice = scan.next()

         if(checkIsNumber(choice))

         when (choice.toInt()) {

            1 -> print("\n" + "You picked option 1" + "\n")
            0 -> exitProcess(1)
            else ->
               print("\n" + "Option Not Available" + "\n")

         }


      }catch (e: NumberFormatException){

         print("Error. You have to choose a number!")

      }

   }
}