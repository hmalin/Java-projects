/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date: 3/26/23
Assignment: Chapter 8 - Three Player TicTacToe 
 */
package threeplayertictactoe;

import java.util.Scanner;

public class ThreePlayerTicTacToe {

    public static void main(String[] args) {

        //declare 4x4 array to hold game values
        char[][] gameBoard = new char[4][4];

        //call initializeBoard method
        initializeBoard(gameBoard);

        //call the PlayGameMethod
        playGame(gameBoard);

    }

    //loops through each index and sets value to blank space
    public static void initializeBoard(char[][] gameBoard) {
        //
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameBoard[i][j] = '_';
            }

        }

    }

    // Main game logic |
    public static void playGame(char[][] gameBoard) {
        //Create scanner object 
        Scanner input = new Scanner(System.in);
        //Char array to store Player Values
        char[] players = {'X', 'Y', 'Z'};
        int currentPlayer = 0;
        int playerMove = 0;
        //loop to prombt each player for their move. Loop continues untill winning or draw conditions are met
        while (playerMove < 16) {
            displayBoard(gameBoard);
            System.out.println("Player " + players[currentPlayer] + ", enter your move( row and column, 0-3 , Seperated by a space):");
            int row = input.nextInt();
            int col = input.nextInt();
            //condition if user enters a selection outside of the 4X4 Board
            if (row < 0 || row > 3 || col < 0 || col > 3) {
                System.out.println("Sorry Invalid input.. Please try again");

            } //condition if users eters a space that has been taken
            else if (gameBoard[row][col] != '_') {
                System.out.println("Space taken please try again");

            } //stores player move in the array 
            else {
                gameBoard[row][col] = players[currentPlayer];
                currentPlayer = (currentPlayer + 1) % 3;
                playerMove++;
            }

        }

        //calls displayBoard method 
        displayBoard(gameBoard);

        //winning condition met | Prints the winner 
        if (isGameOver(gameBoard)) {
            System.out.println("Congrats Player " + players[(currentPlayer + 2) % 3] + "Is the Winner!");
        } //Draw condition met
        else {
            System.out.println("Its a Draw!");

        }
    }

    //Displays gameBoards current values 
    private static void displayBoard(char[][] gameBoard) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    //checks gameBoard for winning conditions 
    private static boolean isGameOver(char[][] gameBoard) {
        for (int i = 0; i < 4; i++) {
            if (isWon(gameBoard[i][0], gameBoard[i][1], gameBoard[i][2], gameBoard[i][3])
                    || isWon(gameBoard[0][i], gameBoard[1][i], gameBoard[2][i], gameBoard[3][i])) {
                return true;
            }
        }

        return isWon(gameBoard[0][0], gameBoard[1][1], gameBoard[2][2], gameBoard[3][3])
                || isWon(gameBoard[0][3], gameBoard[1][2], gameBoard[2][1], gameBoard[3][0]);

    }

    //checks given chars for equal values
    private static boolean isWon(char A, char B, char C, char D) {

        return A != '_' && A == B && B == C && C == D;

    }

}
