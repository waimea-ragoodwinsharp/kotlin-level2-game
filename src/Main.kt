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
fun main() {
   println("⊹₊ ˚‧︵‿₊୨ ᰔ ୧₊‿︵‧ ˚ ₊⊹".red())
    println("┌-------------------┐".magenta())
    println("│   The Squeeze     │".magenta())
    println("└-------------------┘".magenta())
createSquares()
    addingPlayers()

    while (true){
        showSquares()

        break
    }

}
//Making the squares exits
fun createSquares() {
    repeat(15) {
        squares.add("EMPTY")
    }
}
// showing the squares and making them pretty
fun showSquares() {

    for (i in 1..squares.size) {
        print(" Square $i      ".yellow())
    }
    println()

    println("+--------------".repeat(squares.size).blue() + "+".blue())

    for (i in 0..<squares.size) {
        print("| ${squares[i].padEnd(12)} ".cyan())
    }
    println("|".blue())

    println("+--------------".repeat(squares.size).blue() + "+".blue())

}
// I AM SO CONFUUSSEEDD

fun addingPlayers() {

var player = thePlayers
    for (i in ) {
        if (squares[i] == "EMPTY") {
           squares[i] = player
            break
        }
    }
}


fun thePlayers() {

}

























