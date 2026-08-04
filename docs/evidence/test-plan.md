# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Entering player names - valid

When using letters, the game continues and asks for the next player's name. When using numbers, it does the same and continues with the game. When the name is null or blank, it continues to ask for the same player name. 

### Test Data To Use

 valid: I will enter a valid name that isn't null: **Batman**, **Superman**

### Expected Test Result

When typing the name with letters and numbers, it should just continue with the game.

---

## Entering invalid player names - invalid

 When the name is null or blank, it continues to ask for the same player name.

### Test Data To Use

I will press space and enter for the player name

### Expected Test Result

When input is null or blank, it should bug the player for a name.

---

## Board setup - gameplay

The board sets up in 15 squares, with player 1 on squares 5,7,& 9 while player 2 is on squares 6,8,& 10. 

### Test Data To Use

I will enter player names and then see the board

### Expected Test Result

The board should print with 15 squares and player 1 squares in 5, 7, 9. Player 2 should print in 6, 8, 10.

---

## Player moves - valid

The player can move their own square to the place of the other player's square, or the place of a blank square by 1

### Test Data To Use

I will enter the squares to switch and go only by one to either the left or right
### Expected Test Result

Player should only be able to move by one space to the left or right. 

---
## Player moves - invalid

The player enters a board number that doesn't exist
### Test Data To Use

I will enter board numbers to switch to that don't exist 

### Expected Test Result

the game shouldn't accept the non-existent square

---

## is there a winner?

When there is only one square on the board, the game reads who is in the last square and declares them the winner. Depending on who it is, it plays a slightly different message

### Test Data To Use

Details of test data and reasons for selection. Details of test data and reasons for selection. Details of test data and reasons for selection.

### Expected Test Result

The game should see who is in the last square and declare them the winner and play a slightly different message for each winner. 

---
