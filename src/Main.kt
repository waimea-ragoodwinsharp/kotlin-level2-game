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
val p1Name = "unknown"
val p2Name = "unknown"

fun main() {
   println("⊹₊ ˚‧︵‿₊୨ ᰔ ୧₊‿︵‧ ˚ ₊⊹".red())
    println("┌-------------------┐".magenta())
    println("│   The Squeeze     │".magenta())
    println("└-------------------┘".magenta())
    setupBoard()
    getPlayerNames()

    while (true){
        showSquares()
        // get the p1's move

        // make the move on the board


        // Get P2 move

        // Make it

        // Squish!

        break
    }

}
//Making the squares exits
fun setupBoard() {
    repeat(15) {
        squares.add("EMPTY")
    }

    squares[5] = "P1"

    squares[6] = "P2"

    squares[7] = "P1"

    squares[8] = "P2"

    squares[9] = "P1"

    squares[10] = "P2"

}


// showing the squares and making them pretty
fun showSquares() {

    for (i in 1..squares.size) {
        print(" Square $i      ".yellow())
    }
    println()

    println("+--------------".repeat(squares.size).blue() + "+".blue())

    for (i in 1..<squares.size) {
        print("| ${squares[i].padEnd(12)} ".cyan())
    }
    println("|".blue())

    println("+--------------".repeat(squares.size).blue() + "+".blue())

}


fun getPlayerNames() {
    println("Player 1, what is your name? ")
    var p1name = readlnOrNull()
    if (p1name.isNullOrBlank())
        p1name = "Player 1"
    println("Player 2, what is your name? ")
    var p2name = readlnOrNull()
    if (p2name.isNullOrBlank())
        p2name = "Player 2"

}



























