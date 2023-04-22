/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Assignment: Chapter 3 Descending Order 
Date: 2/3/23
 */
package descendingorder;

import java.util.Scanner;
public class DescendingOrder {

  
    public static void main(String[] args) {
        //create Scanner Object & Prompt the user for three integers
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number ordering , Plese enter three integers");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        // tests the values and prints integers in descending order
        if (numberOne > numberTwo && numberTwo > numberThree){
            System.out.println("Here is the integers in largest to smallest");
            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(numberThree);
        }else if (numberTwo > numberOne && numberOne > numberThree){
            System.out.println("Here is the integers in largest to smallest");
            System.out.println(numberTwo);
            System.out.println(numberOne);
            System.out.println(numberThree);
        }else if (numberThree > numberOne && numberOne > numberTwo ){
            System.out.println("Here is the integers in largest to smallest");
            System.out.println(numberThree);
            System.out.println(numberOne);
            System.out.println(numberTwo);
        }else if (numberOne > numberThree && numberThree > numberTwo){
            System.out.println("Here is the integers in largest to smallest");
            System.out.println(numberOne);
            System.out.println(numberThree);
            System.out.println(numberTwo);
        }else if (numberTwo > numberThree && numberThree > numberOne){
            System.out.println("Here is the integers in largest to smallest");
            System.out.println(numberTwo);
            System.out.println(numberThree);
            System.out.println(numberOne);
        }else if (numberThree > numberTwo && numberTwo > numberOne){
            System.out.println("Here is the integers in largest to smallest");
            System.out.println(numberThree);
            System.out.println(numberTwo);
            System.out.println(numberOne);
            //Additional logic if two integers provided are equivalent
        }else if (numberOne == numberTwo && numberThree > numberOne){
            System.out.println(numberOne+ " And " +numberTwo+ " Are the same " +numberThree+ " Is the largest");
        }else if (numberOne == numberThree && numberTwo > numberOne){
            System.out.println(numberOne+ " And " + numberThree+ "Are the same " + numberTwo+ " Is the largest");
        }else if (numberTwo==numberThree && numberOne > numberTwo){
            System.out.println(numberTwo+ " And " + numberThree+ " Are the same " + numberOne+ " Is the largest");
           
          //Added logic if all three integers are equivalent 
          //Added logic probably not needed for the Assignment but I was having some fun with this! :)
        }else if (numberOne==numberTwo && numberOne==numberThree){
            int all = (numberOne + numberTwo +numberThree)/3;
            System.out.println("All integers are the same! add all three numbers and divide by three you get " +all);
            
        }
            
            
            
    }
    
}
