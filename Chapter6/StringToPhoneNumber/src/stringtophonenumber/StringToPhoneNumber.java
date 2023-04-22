/*
 *  
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/4/23
Assignment:Chapter 6 Convert a string to phone number
 */
package stringtophonenumber;

import java.util.Scanner;

public class StringToPhoneNumber {

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to phone number conversion, Please enter a string: ");
        String userString = input.next();
        System.out.println("Converting all letters to numbers per standard telephone keymapping ..........");
        // loop to find all non int chars in the user string 
        for (int x = 0; x < userString.length(); x++) {
            if (Character.isLetter(userString.charAt(x))) {
                //call getNumber method
                System.out.print(getNumber(Character.toUpperCase(userString.charAt(x))));
            } else {
                System.out.print(userString.charAt(x));
            }
        }
        System.out.println();

    } //Main Method End
    
    //Method to convert Uppercase letter to an Number value per international standard letter/number mapping.
    public static int getNumber(char uppercaseLetter) {
        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
            default:
                return 0;
        }

    }// end of getNumber method

}
