/*
Name: Lloyd Malin
 */

package celsiustofahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    
    public static void main(String[] args) {
        //Create Scanner object and prompt user for a value to convert
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter a temp in Celsus to convert to Fahrenheit");
       //store celsius value and perfom the calculaton for F= (9/5) * C + 32
       double Cel=input.nextDouble();
       double Fah= (9.0/5) * Cel + 32;
       System.out.println(Cel + " Degrees Celsius is equal to " +Fah+  " Degrees Fahrenheit ");
       
    }

}
