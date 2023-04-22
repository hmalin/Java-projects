/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/26/23
Assignment: Chapter 8 Exercise #1 ( Sum odd array ) 
 */
package sumoddarray;

// This program does:
import java.util.Scanner;

public class SumOddArray {

    public static void main(String[] args) {
        //create scanner 
        Scanner input = new Scanner(System.in);
        //declare local int 
        int rows;
        int cols;
        //get user input for the rows and columns
        System.out.println("Please enter the number of rows :");
        rows = input.nextInt();
        System.out.println("Please enter the number of columns :");
        cols = input.nextInt();
        //declaire Array 
        double[][] items = new double[rows][cols];
        //get user input for each rows and col
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                System.out.print("Enter a value for row " + (x + 1) + ", column " + (y + 1) + " : ");
                items[x][y] = input.nextDouble();
            }
        }
        //call sumOddNumbers
        double sum = sumOddValues(items);

        // print sum 
        System.out.println("Sum of the odd numbers is :" + sum);
    }// end of main 

    // sumOddNumbers Method 
    public static double sumOddValues(double[][] items) {
        double sum = 0.0;

        //loop to add elements   
        for (int x = 0; x < items.length; x++) {
            for (int y = 0; y < items[x].length; y++) {
                //if value is odd calulate sum
                if (items[x][y] % 2 != 0) {
                    sum += items[x][y];
                }

            }
        }

        //return sum
        return sum;
    }

}
