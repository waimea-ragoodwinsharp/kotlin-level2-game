/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   The Squeeze Level 2 game
 * Project Author: Rose Goodwin-Sharp
 * GitHub Repo:    https://github.com/waimea-ragoodwinsharp/kotlin-level2-game
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */

val squares = mutableListOf<String>()
var p1Name = "P1"
var p2Name = "P2"

fun main() {
   println("⊹₊ ˚‧︵‿₊୨ ᰔ ୧₊‿︵‧ ˚ ₊⊹".red())
    println("┌-------------------┐".magenta())
    println("│   The Squeeze     │".magenta())
    println("└-------------------┘".magenta())

    setupBoard()
    getPlayerNames()
    while (true){
        showSquares()

        // Get the counter of P1 that they want to move
        val p1Move = switchSquares(p1Name)

//        getPlayerAction(p2Name)


        // get the p1's move

        // make the move on the board


        // Get P2 move

        // Make it

        // Squish!
        removeEdgesOfBoard()

        // if winner then break
    }
//    while (true) {
//        val action = getPlayerAction1()
//        val action = getPlayerAction2()
//        when (action) {
//
//        }
//    }

}
//Making the squares exist
fun setupBoard() {
    repeat(15) {
        squares.add("     ")
    }

    squares[4] = "P1"

    squares[5] = "P2"

    squares[6] = "P1"

    squares[7] = "P2"

    squares[8] = "P1"

    squares[9] = "P2"



}


// showing the squares and making them pretty
fun showSquares() {

    for (i in 1..squares.size) {
        print("   ${i.toString().padStart(2)}   ".yellow())
    }
    println()

    println("+-------".repeat(squares.size).blue() + "+".blue())

    for (i in 0..<squares.size) {
        print("| ${squares[i].padEnd(5)} ".cyan())
    }
    println("|".cyan())

    println("+-------".repeat(squares.size).blue() + "+".blue())

}


fun getPlayerNames() {
    while (true) {
        println("Player 1, what is your name? ")
        val answer = readlnOrNull()
        if (!answer.isNullOrBlank()) {
            p1Name = answer
            break
        }
    }

        while (true) {
            println("Player 2, what is your name? ")
            val answer2 = readlnOrNull()
            if (p2Name != null && p2Name.isNotBlank())
                if (!answer2.isNullOrBlank())
                p2Name = answer2
                break

        }
    }
//fun getPlayerAction(name: String): String {
//    println("Alright $name. Choose your move")
//
//    while (true) {
//        println("[L]eft (Move to the left)")
//        println("[R]ight (Move to the right)")
//        val move = readlnOrNull()?.uppercase()
//        when (move) {
//            "L" -> return "Left"
//            "R" -> return "Right"
//        }
//    }
//}


fun switchSquares(name: String?): String? {
    println("$name, which square will move?")
    val targetSquare = readlnOrNull().toInt()
    // minus 1 from user input to make list correct
    println("$name, which square will be switched?")
    val switchedSquare = readlnOrNull().toInt()
    //same here
   squares[targetSquare] = "O"
  val temp = squares[targetSquare]
    squares [targetSquare] = squares [switchedSquare]
    squares [switchedSquare] = temp

    }


fun removeEdgesOfBoard() {

    squares.removeFirst()
    squares.removeLast()
}

fun checkForWinner() {

}





















