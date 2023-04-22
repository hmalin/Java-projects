/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:3/27/23
Assignment: Chapter 9 Employee testing
 */
package employeetesting;


public class Employee {
    
    // declare variables
    private  String firstName;
    private  String lastName;
    private  int yearsWithCompany;
    private  double payRate;
    
    
    //constructor for employee
    public Employee ( String firstName , String lastName, int yearsWithCompany, double payRate){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsWithCompany = yearsWithCompany;
        this.payRate = payRate;        
    }
            
    //setter for first name 
    public void setFirstName(String firstName){
        this.firstName = firstName;
        
    }
    
    //getter for firstname
    public String getFirstName(){
        return firstName;
    }
    
    
    //setter for last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    //getter for last name
    public String getLastName(){
        return lastName;
    }
    
    //setter for Years with the company
    public void setYearsWithCompany(int yearsWithCompany){
        this.yearsWithCompany = yearsWithCompany;
        
    }
    
    //getter for yers with the company 
    public int getYearsWithCompany(){
        return yearsWithCompany;
    }
    // setter for pay rate 
    public void setpayRate( double payRate){
        this.payRate = payRate;
    }
    
    // getter for payrate 
    public double getPayRate(){
        return payRate;
    }
    
}
