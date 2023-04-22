/* 
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:4/9/23
Assignment:Chapter 10 Excercise Family
 */
package family;

public class Family {

    public static void main(String[] args) {
        // Create person objects 
        Person Karl = new Person("Karl Malin", "1/20/1960", 'M');
        Person Mae = new Person("Mae Malin", "5/31/1959", 'F');
        //Print person details
        System.out.println(Karl);
        System.out.println(Mae);
        
        //call show spouse method 
        System.out.println(Karl.showSpouse()); // Output: Not Married
        System.out.println(Mae.showSpouse());
        //call get married method , add spouse for each person & print 
        Karl.getMarried("Mae Malin", "5/31/1959", 'F');
        System.out.println(Karl.showSpouse());
        Mae.getMarried("Karl Malin", "1/20/1960", 'M');
        System.out.println(Mae.showSpouse());

    }

}
