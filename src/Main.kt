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
//  getPlayerAction1()
//  getPlayerAction2()
    switchSquares()


    while (true){
        showSquares()
        // get the p1's move

        // make the move on the board


        // Get P2 move

        // Make it

        // Squish!

        break
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
    println("|".blue())

    println("+-------".repeat(squares.size).blue() + "+".blue())

}


fun getPlayerNames() {
    println("Player 1, what is your name? ")
    val answer = readlnOrNull()
    if (!answer.isNullOrBlank()) {
            p1Name = answer
            break
        }
}
        while (true) {
    val p2Name = readlnOrNull()
    if (p2Name != null && p2Name.isNotBlank()) break


//    var p1name = readlnOrNull()
//    if (p1name.isNullOrBlank())
//        p1name = "Player 1"
//    println("Player 2, what is your name? ")
//    var p2name = readlnOrNull()
//    if (p2name.isNullOrBlank())
//        p2name = "Player 2"



fun switchSquares() {
    println("$p1Name, Choose a square to switch to")




}


//fun getPlayerAction1(): Char {
//    println("Alright $p1Name. Choose your move")
//
//}
//
//
//fun getPlayerAction2(): Char {
//    println("Alright ${p2Name}Name. Choose your move")
//
//}




















