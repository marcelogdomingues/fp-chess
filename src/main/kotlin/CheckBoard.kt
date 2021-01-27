import java.lang.NumberFormatException

var lineValidation = false;

fun checkLine(lines: String): Boolean {

    try {

        val lineNumber = lines.toInt()

        if (lineNumber < 5) {

            print("\n" + "Invalid response" + "\n")

        }else{

            lineValidation = true

        }


    } catch (e: NumberFormatException) {

        print("\n" + "Invalid response" + "\n")

    }

    return lineValidation
}

fun checkColumn(cols: String): Boolean {

    var columnValidation = false


    try {

        val colNumber = cols.toInt()

        if (colNumber < 5) {

            print("\n" + "Invalid response" + "\n")

        }else{

            columnValidation = true

        }


    } catch (e: NumberFormatException) {

        print("\n" + "Invalid response" + "\n")

    }

    return columnValidation
}