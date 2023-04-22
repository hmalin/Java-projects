/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date: 3/27/23
Assignment:Chapter 9 Exercise 1 -employee testing
 */

package employeetesting;


public class EmployeeTesting {

    
    public static void main(String[] args) {
        //create employee objects 
        Employee employee1 = new Employee("Frank", "Smith", 2,25.50);
        Employee employee2 = new Employee("John","Doe",4, 27.32);
        //update employee 1 Years with the company
       employee1.setYearsWithCompany(3);
       System.out.println(employee1.getFirstName() + 
               " Has Reached their annversery, they have reached  " +employee1.getYearsWithCompany() + " years with the company!");
       //update employee 2 pay rate
       employee2.setpayRate(28.32);
       System.out.println(employee2.getFirstName() + 
               " Has recived a 1.00 raise their pay rate is now: " +employee2.getPayRate());
       //print out employee info 
       System.out.println("Employee data has been updated ");
       System.out.println( employee1.getFirstName() + " " + employee1.getLastName() + " " +
               employee1.getYearsWithCompany() + "yrs, " + employee1.getPayRate() + "/hr" );
       System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " +
               employee2.getYearsWithCompany() + "yrs, " + employee2.getPayRate() + "/hr");
    }

}
