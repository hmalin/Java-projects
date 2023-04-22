/*
 Name: Lloyd Malin
 
 */

package areaandvolume;

import java.util.Scanner;

public class AreaandVolume {

    
    public static void main(String[] args) {
        //Create scanner object and Prompt the user for A & L
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius and Length of a Cylinder");
        //stores provided values as variables and calculates A=R*R*PI & V= A*L
        double radius = input.nextDouble();
        double Length = input.nextDouble();
        final double PI = 3.14159;
        double area = radius * radius * PI;
        double Volume = area * Length ;
        //Prints Area and volume to the console
        System.out.println("the area is " + area);
        System.out.println("The volume is " +Volume);
         
       
        
    }

}
