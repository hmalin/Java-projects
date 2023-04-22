/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Date: 1/30/23
Assignment: Chapter 2 | Exercise 1
 */
package poundstokilograms;

import java.util.Scanner;

public class PoundsToKilograms {
   
    
    public static void main(String[] args) {
        //Creates scanner object, prompts user for a value 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds to convert to kilograms");
        //stores user input as varible "pounds". Then calculates the result.
        double pounds = input.nextDouble();
        double result = pounds * 0.454;
        
        System.out.println(pounds + " is equal to " + result + " kilograms ");
        
    }
    
}
