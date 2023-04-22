/*
 *  
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/16/23
Assignment:Chapter 7 Assignment #1
 */
package sumandaverage;

public class SumAndAverage {

    public static void main(String[] args) {
        System.out.println("Hello! we will now calculate the sum and average for ");

        // declare the array
        double[] doubleArray = {3.5, 2.4, 5.5, 6.6, 8.8};

        //print the array to the user 
        for (int x = 0; x < doubleArray.length; x++) {
            System.out.println(doubleArray[x]);
        }
        //call SumAverage method
        double Average = SumAverage(doubleArray);
        //print average to user 
        System.out.println("the Average is " + Average);

    }//main method end

    //SumAverage  Method | calculates sum and average of double values, Prints the sum value and returns Average
    public static double SumAverage(double[] doubleArray) {
        double sum = 0;
        //calculates the sum of double values
        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i];
        }
        // prints sum to the user  
        System.out.println("The sum is " + sum);
        //calculate average
        double Avg = sum / doubleArray.length;
        //return average value 
        return Avg;

    }// SumAverage Method end

}
