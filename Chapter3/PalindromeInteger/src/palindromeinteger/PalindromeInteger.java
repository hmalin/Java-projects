/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Assignment: Capter 3 Palindrome Integer
date:2/3/23
 */
package palindromeinteger;

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        //Create scanner object and prompt user for a 3 digit integer and store as an int
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Palindrome Checker " + " Please Enter a three digit number to check ");
       int num = input.nextInt();
       //Palindromes integers have the same first and last digits
       //find the last digit
       int LastDigit = num % 10; 
       //find the first digit
       int firstDigit = (num/10) /10;
       
       //if the first and last digit are = , not 0, Print " its a palindrome "
       if (LastDigit == firstDigit && num !=0  ) {
           System.out.println(num + " Is a Pallindrome!");    
          
       //If the number enterd > or = to 1000 print " is not a three digit number "
       } else if (num >= 1000) {
           System.out.println("Sorry " +num+ " is not a three digit number ");    
       } 
       
      //if fist and last digit are != then print "not a palindrome" 
       else  {
           System.out.println( num + " Is not a Palindrome ");
       }
       
       
           
           
       
       
    }
    
}
