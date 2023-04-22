/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:1/23/23
Assignment: Chapter 1 (1.8)
 */
package areaandperimeter;

// Calculates and displays the Area & Perimeter of a circle whos radius is 5.5
public class AreaAndPerimeter {

    public static void main(String[] args) {
        double radius = 5.5;
        double pie = 3.1416;
        double Perimeter = 2 * radius * pie;
        double area = radius * radius * pie;
    System.out.println(Perimeter);
    System.out.println(area);
    
    }
    
}
