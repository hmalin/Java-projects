/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/26/23
Assignment: Chapter 8 Excersie 2 (Matching value)
 */
package matchingvalue;

import java.util.Scanner;

public class MatchingValue {

    public static void main(String[] args) {
        //declare arrays size 9
        int[][] firstArray = new int[3][3];
        int[][] secondArray = new int[3][3];
        //create scanner 
        Scanner input = new Scanner(System.in);

        //get user input for firstArray 
        System.out.println("Please enter the first Array values: ");
        for (int row = 0; row < firstArray.length; row++) {
            for (int col = 0; col < firstArray[row].length; col++) {
                firstArray[row][col] = input.nextInt();
            }

        }

        //get user input for secondArray
        System.out.println("please Enter the second Array values");

        for (int row = 0; row < secondArray.length; row++) {
            for (int col = 0; col < secondArray[row].length; col++) {
                secondArray[row][col] = input.nextInt();
            }

        }
        //call findCommonValues method
        findCommonValues(firstArray, secondArray);

    }

    public static void findCommonValues(int[][] firstArray, int[][] secondArray) {
        // checks if values in first array are == to second array and prints == value
        for (int row = 0; row < firstArray.length; row++) {
            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[row][col] == secondArray[row][col]) {
                    System.out.println("Matching value at: " + firstArray[row][col]);

                }
            }
        }

    }// end of findCommonValues method

}
