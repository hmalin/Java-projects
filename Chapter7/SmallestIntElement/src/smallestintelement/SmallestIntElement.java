/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/16/23
Assignment: Chapter 7 Excersise # 2
 */
package smallestintelement;

import java.util.Scanner;

public class SmallestIntElement {

    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter 10 numbers
        System.out.println("Hello! ... please enter 10 numbers ");
        //Declare and isntaitiate the array 
        int[] numberArray = new int[10];
        //get user input for 10 numbers
        for (int x = 0; x < numberArray.length; x++) {
            numberArray[x] = input.nextInt();
        }
        //call IndexOfSmallNumber Method for value and Display 
        int smallIndex = indexOfSmallNumber(numberArray);
        System.out.println("Smallest index is " + smallIndex);
        
    }//End of main method 

    // IndexofSmallNumber method calls IndexOfSmallNumberToo and returns 
    public static int indexOfSmallNumber(int[] numberArray) {
        int Smallest = indexOfSmallNumberToo(numberArray);

        return Smallest;

    }//method end 

    //IndexOfSmallNumberToo | gets array and calculates the smallest index and returns.  
    public static int indexOfSmallNumberToo(int[] numberArray) {
        int smallIndex = 1;
        //loop to check the array index values
        for (int x = 1; x < numberArray.length; x++) {
            if (numberArray[x] < numberArray[smallIndex]) {
                smallIndex = x;
            }
        }
        //return the smallest index value 

        return smallIndex;
    }//end of method

}
