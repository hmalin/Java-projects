/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/13/23
Assignment: MidTerm 
 */
package midterm;

import java.util.Scanner;

import java.util.Random;

public class MidTerm {

    public static void main(String[] args) {
        //create scanner 
        Scanner input = new Scanner(System.in);
        //prompt for user name
        System.out.println("Please enter your name:");
        String userName = input.next();
        int userSelect;
        Random random = new Random();
        //loop to call the displayMenu method 
        do {
            displayMenu(userName);
            userSelect = input.nextInt();

            switch (userSelect) {

                //Menu option 1: calls changeYourName Method 
                case 1:
                    changeYourName(userName, random);
                    break;

                //Menu option 2: calls IQtest method  
                case 2:
                    IQtest(userName, random);
                    break;

                //Menu option 3: Calls displayTable method
                case 3:
                    displayTable(userName);
                    break;

                //Menu option 4: Calls headsOrTails method    
                case 4:
                    headsOrTails(userName, random);
                    break;

                //Menu option 5 Thanks the user and exits
                case 5:
                    System.out.println("Thank you for Playing....Goodbye");
                    break;
                    
                //Case if the user enters somthing other then 1-5    
                default:
                    System.out.println("Sorry invalid option...please try again");
                    

            }

        } while (userSelect > 0 && userSelect < 5);

    }// Main Method end

    // Menu Method | Displays a selection menu for the user
    public static void displayMenu(String userName) {
        System.out.println("Hello " + userName + "! " + "Please make a selection:");
        System.out.println("1-Change your name " + " 2-Test your IQ "
                + " 3-Display a table " + " 4-Play a game " + " 5-exit");
    }//end of displayMenu method

    //changeYourName Method | Generate a new name with the length from userName and print/return the new name.   
    public static String changeYourName(String userName, Random random) {
        System.out.println("Your current name is " + userName);
        String newName = "";
        //Generates a random name of the same length as userName
        for (int x = 0; x < userName.length(); x++) {
            int randomNum = random.nextInt(26) + 97;
            char randomChar = (char) randomNum;
            newName = newName + randomChar;

        }
        //Prints the new random name 
        System.out.println("your new name is " + newName.substring(0, 1).toUpperCase() + newName.substring(1));
        return newName;

    }//End of changeYourName method

    //IQ test Method | Generate 2 random ints and prompt the user answer sum. Print and return IQ score.
    public static int IQtest(String userName, Random random) {
        Scanner input = new Scanner(System.in);
        //Generate 2 random int values 1-49
        int randnum1 = random.nextInt(50);
        int randnum2 = random.nextInt(50);
        //Greet user and prompt for an answer to sum of random ints
        System.out.println("Welcome to IQ test " + userName);
        System.out.println("What is " + randnum1 + "+" + randnum2 + "?");
        int userGuess = input.nextInt();
        int answer = randnum1 + randnum2;
        int IQ;
        //if user is correct adds 100 to the sum and Prints IQ
        if (userGuess == answer) {
            IQ = answer + 100;
            System.out.println("Correct!..Your IQ is " + IQ);
            // if the user is incorect adds 10 to the sum and prints IQ
        } else {
            IQ = answer + 10;
            System.out.println("No the answer is " + answer + " Your IQ is " + IQ);
        }

        return IQ;
    }//end of IQtest

    //Display Table Method | Diplays a num x num table of char enterd by the user 
    public static void displayTable(String userName) {
        System.out.println("Hello " + userName + " Lets display a table");
        System.out.println("Please enter a letter");
        Scanner input = new Scanner(System.in);
        char userChar = input.next().charAt(0);
        System.out.println("Now please enter a number from 1 to 10");
        int userInt = input.nextInt();
        //checks that userInt is between 1-10 and prints userChar in a userInt x userInt grid
        if (userInt >= 1 && userInt <= 10) {
            for (int x = 0; x < userInt; x++) {
                for (int y = 0; y < userInt; y++) {
                    System.out.print(userChar);
                }

                System.out.println();
            }
            //sets the number enterd to 10 if its less then 1 or greater then 10
        } else {
            System.out.println("You have entered a number out of bounds "
                    + "setting input to 10......");
            userInt = 10;
            for (int x = 0; x < userInt; x++) {
                for (int y = 0; y < userInt; y++) {
                    System.out.print(userChar);
                }

                System.out.println();

            }
        }

    }//end of displayTable

    //headsOrTails Method| generates a random int 1 or 2 for the coin. Gets the user input and compares selection to the coin.
    public static void headsOrTails(String userName, Random random) {
        Scanner input = new Scanner(System.in);
        //random coin value either 1 or 2
        int Coin = random.nextInt(2) + 1;
        //Greet and prompt the user for a selection
        System.out.println("Hi " + userName + " Lets play Heads or Tails");
        System.out.println("Please enter 1 for Heads or 2 for Tails");
        int userInput = input.nextInt();
        //compare userInput to the coin value and print results.
        if (userInput == 1 && Coin == 1) {
            System.out.println("You selected heads and the coin was heads...You Win!");
        } else if (userInput == 1 && Coin == 2) {
            System.out.println("You selected Heads and the coin was Tails...Sorry you lose");
        } else if (userInput == 2 && Coin == 2) {
            System.out.println("You Selected Tails and the coin was Tails...You win!");
        } else if (userInput == 2 && Coin == 1) {
            System.out.println("You selected Tails and the coin was Heads...Sorry You lose");
        //if the user enters something other then 1 or 2.    
        } else {
            System.out.println("Invalid selection! Please choose Heads(1) or Tails(2)");
        }
    }//end of headsOrTails method
}
