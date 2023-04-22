/*  
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date: 3/4/23
Assignment:Chapter 6 Craps
 */
package crapsgame;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    //Define constant list called "Status" 
    private enum Status {
        CONTINUE, WON, LOST
    };
    //Declare constants 
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        //Create scanner object, Greet user and ask to play a game 
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! would you like to play a game of craps ?" + "enter Y or N");
        String userinput = input.next();
        char userAnswer = userinput.charAt(0);
        //condition if user answers y or Y 
        if (userAnswer == 'y' || userAnswer == 'Y') {

            int myPoint = 0;

            Status gameStatus;
            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    break;

            }
            //Checks additional roll 
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) {

                        gameStatus = Status.LOST;
                    }
                }
            }
            //Display results for win & lose conditions 
            if (gameStatus == Status.WON) {
                System.out.println("Congrats you win!");
            } else {
                System.out.println(" Sorry you lost :( ");
            }
            //Exit if the user selects n or N  
        } else if (userAnswer == 'n' || userAnswer == 'N') {
            System.out.println("Thats ok , Come back and play a game later..");
            //Displays an error if the user does not input either Y or N   
        } else {
            System.out.println("Invalid option! ...please enter Y or N");
        }

    } //end of main method

    //rollDice method | creates two random ints from 1-6 adds them and returnsthe value.
    private static int rollDice() {
        int diceOne = 1 + randomNumbers.nextInt(6);
        int diceTwo = 1 + randomNumbers.nextInt(6);

        int sum = diceOne + diceTwo;
        System.out.println(" You rolled  " + diceOne + " and " + diceTwo + " total is " + sum);
        return sum;

    } // end rollDice method

}
