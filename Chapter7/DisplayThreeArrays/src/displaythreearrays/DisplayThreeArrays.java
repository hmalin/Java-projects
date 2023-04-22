/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/16/23
Assignment:Chapter 7 Exercise #3 
 */
package displaythreearrays;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayThreeArrays {

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Hello please enter 10 numbers in order ");
        //Declaire the array 
        int[] numberArray = new int[10];
        //Get user input for 10 numbers
        for (int x = 0; x < numberArray.length; x++) {
            numberArray[x] = input.nextInt();
        }
        //calls OrderArray Method
        OrderArray(numberArray);
    }//end of main 

    //Order Array Method
    public static void OrderArray(int[] numberArray) {
        //Declaire 2 arrays for even and odd 
        int[] oddArray = new int[5];
        int[] evenArray = new int[5];
        //loop to seperate even and odd indices
        for (int x = 0; x < numberArray.length; x++) {
            if (x % 2 == 0) {
                oddArray[x / 2] = numberArray[x];

            } else {
                evenArray[x / 2] = numberArray[x];

            }
        }
        // print all three arrays
        System.out.println("Starting Array : " + Arrays.toString(numberArray));
        System.out.println("Odd index Array : " + Arrays.toString(oddArray));
        System.out.println("Even index Array: " + Arrays.toString(evenArray));

    }// Order Array End 

}
