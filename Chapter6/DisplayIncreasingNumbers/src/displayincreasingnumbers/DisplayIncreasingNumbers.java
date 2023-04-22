/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date: 3/4/23
Assignment:Chapter 6 Display Three numbers increasing order.
 */
package displayincreasingnumbers;

import java.util.Scanner;

public class DisplayIncreasingNumbers {

    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);
        //Prompt user for each value specifiying data type
        System.out.println("Welecome to number ordering");
        System.out.println("Enter and int value and press enter");
        int userInt = input.nextInt();
        System.out.println("Now enter a double value and press enter");
        double userDouble = input.nextDouble();
        System.out.println("Finally, Enter a long value and press enter");
        long userLong = input.nextLong();
        //call displayIncreasingNumbers method. 
        displayIncreasingNumbers(userInt, userDouble, userLong);

    }//Main Method End  

    //Display Increasing Numbers Method. 
    public static void displayIncreasingNumbers(int num1, double num2, long num3) {

        //convert values to double 
        double n1 = num1;
        double n2 = num2;
        double n3 = num3;

        //compare values
        if (n1 < n2) {

            // set temp equal to n1
            double temp = n1;

            // set n1 equal to n2
            n1 = n2;

            // set n2 equal to temp
            n2 = temp;

        }

        // compare n1 and n3
        if (n1 < n3) {

            double temp = n1;

            n1 = n3;

            n3 = temp;

        }

        // compare n2 & n3,
        if (n2 < n3) {

            double temp = n2;

            n2 = n3;

            n3 = temp;

        }
        //print in increaseing order 
        System.out.println("here is the numbers sorted fromt least to greatest:");
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);

    }// DisplayIncreasingNumbers Method end 

}
