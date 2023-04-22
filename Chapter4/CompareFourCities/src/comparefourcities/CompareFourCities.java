/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:2/7/23
Assignment:Chapter 4 Compare four cities 
 */

package comparefourcities;

import java.util.Scanner;
public class CompareFourCities {

    
    public static void main(String[] args) {
        // Creates Scanner Object and Probmpts user to enter 4 city names 
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to city name ordering");
        System.out.println("Enter the first City");
        String cityOne=input.nextLine();
        System.out.println("Enter the second city ");
        String cityTwo=input.nextLine();
        System.out.println("Enter the third city");
        String cityThree=input.nextLine();
        System.out.println("Enter the fourth city ");
        String cityFour=input.nextLine();
        //Begins comparison logic of city names
        //I will Appreciate loops in the next chapter! 
        if (cityOne.compareTo(cityTwo)<0 && cityTwo.compareTo(cityThree)<0 && cityThree.compareTo(cityFour)<0){
            System.out.println("the four cities in alphabetical order are " +cityOne+ " " +cityTwo+ " " +cityThree+ " " +cityFour);
        }
        else if (cityTwo.compareTo(cityOne)<0 && cityOne.compareTo(cityThree)<0 && cityThree.compareTo(cityFour)<0){
            System.out.println("the four cities in alphabetical order are " +cityTwo+ " " +cityOne+ " " +cityThree+ " " +cityFour);
            
        }
        else if (cityFour.compareTo(cityThree)<0 && cityThree.compareTo(cityTwo)<0 && cityTwo.compareTo(cityOne)<0){
            System.out.println("the four cities in alphabetical order are " +cityFour+ " " +cityThree+ " " +cityTwo+ " " +cityOne);
        }
        else if (cityThree.compareTo(cityOne)<0&&cityOne.compareTo(cityTwo)<0 &&cityTwo.compareTo(cityFour)<0){
            System.out.println("the four cities in alphabetical order are " +cityThree+ " " +cityOne+ " " +cityTwo+ " " +cityFour);
        }
        else if (cityThree.compareTo(cityTwo)<0 && cityTwo.compareTo(cityOne)<0&& cityOne.compareTo(cityFour)<0){
            System.out.println("the four cities in alphabetical order are " +cityThree+ " " +cityTwo+ " " +cityOne+ " " +cityFour);
        }
        else if (cityTwo.compareTo(cityThree)<0 && cityThree.compareTo(cityOne)<0 && cityOne.compareTo(cityFour)<0){
            System.out.println("the four cities in alphabetical order are " +cityTwo+ " " +cityThree+ " " +cityOne+ " " +cityFour);
        }
        else if (cityTwo.compareTo(cityFour)<0 && cityFour.compareTo(cityOne)<0 && cityOne.compareTo(cityThree)<0){
            System.out.println("the four cities in alphabetical order are " +cityTwo+ " " +cityFour+ " " +cityOne+ " " +cityThree);
        }
        else if (cityThree.compareTo(cityFour)<0 && cityFour.compareTo(cityOne)<0 && cityOne.compareTo(cityTwo)<0){
            System.out.println("the four cities in alphabetical order are " +cityThree+ " " +cityFour+ " " +cityOne+ " " +cityTwo);
        }
        else if(cityFour.compareTo(cityOne)<0 && cityOne.compareTo(cityTwo)<0 && cityTwo.compareTo(cityThree)<0){
            System.out.println("the four cities in alphabetical order are " +cityFour+ " " +cityOne+ " " +cityTwo+ " " +cityThree);
        }
        else if (cityFour.compareTo(cityTwo)<0 && cityTwo.compareTo(cityOne)<0 && cityOne.compareTo(cityThree)<0){
            System.out.println("the four cities in alphabetical order are " +cityFour+ " " +cityTwo+ " " +cityOne+ " " +cityThree);
        }
        else if (cityOne.compareTo(cityFour)<0 && cityFour.compareTo(cityTwo)<0 && cityTwo.compareTo(cityThree)<0){
            System.out.println("the four cities in alphabetical order are " +cityOne+ " " +cityFour+ " " +cityTwo+ " " +cityThree);
        }
        else if (cityFour.compareTo(cityThree)<0 && cityThree.compareTo(cityOne)<0 && cityOne.compareTo(cityTwo)<0){
            System.out.println("the four cities in alphabetical order are " +cityFour+ " " +cityThree+ " " +cityOne+ " " +cityTwo);
        }
        else if (cityTwo.compareTo(cityFour)<0 && cityFour.compareTo(cityThree)<0 && cityThree.compareTo(cityOne)<0){
            System.out.println("the four cities in alphabetical order are " +cityOne+ " " +cityTwo+ " " +cityThree+ " " +cityFour);
        }
        else if (cityThree.compareTo(cityFour)<0 && cityFour.compareTo(cityTwo)<0 && cityTwo.compareTo(cityOne)<0){
            System.out.println("the four cities in alphabetical order are " +cityThree+ " " +cityFour+ " " +cityTwo+ " " +cityOne);
        }
        else if (cityTwo.compareTo(cityThree)<0 && cityThree.compareTo(cityFour)<0&& cityFour.compareTo(cityOne)<0){
            System.out.println("the four cities in alphabetical order are " +cityTwo+ " " +cityThree+ " " +cityFour+ " " +cityOne);
            
        }
        else if (cityThree.compareTo(cityTwo)<0 && cityTwo.compareTo(cityFour)<0 && cityFour.compareTo(cityOne)<0){
            System.out.println("the four cities in alphabetical order are " +cityThree+ " " +cityTwo+ " " +cityFour+ " " +cityOne);
        }
        else if (cityTwo.compareTo(cityOne)<0 && cityOne.compareTo(cityFour)<0 && cityFour.compareTo(cityThree)<0){
            System.out.println("the four cities in alphabetical order are " +cityTwo+ " " +cityOne+ " " +cityFour+ " " +cityThree);
        }
        
        else {
            System.out.println("Whoops!...Invalid Entry ");
        }
        
        
        
    }

}
