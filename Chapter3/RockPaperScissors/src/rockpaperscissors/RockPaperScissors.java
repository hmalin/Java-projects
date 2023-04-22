/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Assignment: Chapter 3 Rock Paper & Scissors
Date:1/2/23
*/
package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock paper Scissors! chose your weapon!");
        System.out.println("0 for Rock , 1 for Paper and 2 for Scissors");
        int Player = input.nextInt();
        int Rock =0;
        int Paper = 1 ;
        int Scissors = 2;
        int Computer = (int)(Math.random()*3);
        
        //Player winning conditions
        if (Player==Rock && Computer==Scissors ){
            System.out.println("You chose Rock...I chose Scissors");
            System.out.println("Congrats you won!"); 
        }else if(Player==Paper && Computer ==Rock){
            System.out.println("You chose Paper...I chose Rock");
            System.out.println("Congrats you won!");
        }else if (Player==Scissors && Computer == Paper){
            System.out.println("You chose Scissors...I chose Paper");
            System.out.println("Congrats you won!");
        
        //Computer winning conditions    
        }else if (Computer==Scissors && Player==Paper){
            System.out.println("You chose Paper...I chose Scissors");
            System.out.println("Better luck next time...23you lose!");
        }else if (Computer==Paper && Player ==Rock){
            System.out.println("You chose Rock... I chose Paper ");
            System.out.println("Better luck next time...You lose!");
        }else if (Computer==Rock && Player==Scissors){
            System.out.println("You chose Scissors...I chose Rock");
            System.out.println("Better luck next time...You lose!");
        
        //Player selects a number other than 0,1,2 
        }else if (Player >2 || Player < 0) {
            System.out.println("Hey no missile launchers allowed!! please select rock(0), paper(1), or scissors(2)");
        
        //Tied game
        } else if (Computer==Player){
            System.out.println("Great minds think alike we tied!");
        }
        
    }
    
}
