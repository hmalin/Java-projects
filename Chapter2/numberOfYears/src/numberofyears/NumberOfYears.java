/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Assignment: Chapter2 | Exercise 2
 */

package numberofyears;

import java.util.Scanner; 

public class NumberOfYears {

    public static void main(String[] args) {
        // Create new scanner object & Prompt for user input in minutes
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minutes to years calculater! " + " Please enter minutes to convert ");
        //Store iput as variable "minutes" and calculate using 525600 min = 1 yr and 1440min = 1day. 
        int minutes = input.nextInt();
        int years = minutes/525600;
        int remainingMinutes = minutes % 525600; 
        int days = remainingMinutes/1440;
        System.out.println(minutes + " is approximatly " +years+ " Years and " + days + " days ");
    }
    
}
