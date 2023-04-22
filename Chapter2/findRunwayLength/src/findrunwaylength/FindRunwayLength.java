/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Assignment: Chapter 2 | Excercise 3
Date: 1/30/23
 */
package findrunwaylength;

import java.util.Scanner;

public class FindRunwayLength {

    public static void main(String[] args) {
        // Create scanner object and prompts the user for V (speed) and a ( acceleration) then stores both as variables
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to runday calculater! " + " Please enter the speed and acceleration ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        //Calculates length for L= v^2/2a and displays the result
        double Length = (Math.pow(speed, 2))/(2 * acceleration);
        System.out.println("The minunum runway length will need to be " + Length);
        
        
        
    }
    
}
