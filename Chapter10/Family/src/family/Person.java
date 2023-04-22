/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:4/9/23
Assignment:Chapter 10 Excersie 1 
 */
package family;

public class Person {

    // private instance variables
    private String name;
    private String birthDate;
    private char sex;
    private Person spouse;

    //default constructor
    public Person() {

    }

    //overloaded constructor
    public Person(String name, String birthDate, char sex) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;

    }

    //get name 
    public String getName() {
        return name;
    }

    //set name 
    public void setName(String name) {
        this.name = name;
    }

    //get birthdate 
    public String getBirthDate() {
        return birthDate;
    }

    //set birthdate 
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    //get sex 
    public char getSex() {
        return sex;
    }

    // set sex
    public void setSex(char sex) {
        this.sex = sex;
    }

    //get spouse 
    public Person getSpouse() {
        return spouse;
    }

    //set spouse
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    //show Spouse. If spouse is null,return "Not Married"
    public String showSpouse() {
        if (spouse == null) {
            return "Not Married";

        } else {
            return spouse.toString();
        }
    }

    // get married method | spouse with name, birthDate, and sex
    public void getMarried(String name, String birthDate, char sex) {
        if (spouse == null) {
            spouse = new Person(name, birthDate, sex);
            spouse.setSpouse(this);
        }
    }

    // Override the toString() method to show the Person's info
    @Override
    public String toString() {
        String spouseName = (spouse == null) ? "null" : spouse.getName();
        return "Name: " + name + ", Birthdate: " + birthDate + ", Sex: " + sex + ", Spouse: " + spouseName;
    }

}
