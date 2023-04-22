/*  
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:2/7/23
Assignment: chapter 4 Random Character
 */

package randomcharacter;

public class RandomCharacter {

    
    public static void main(String[] args) {
        // utilizing math.random generate a random char and print as uppercase
        System.out.println("Generating random characters....................");
        char randomChar=(char)(Math.random()*26 + 'a');
        char randomCharTwo=(char)(Math.random()*26 + 'a');
        char randomCharThree=(char)(Math.random()*26 + 'a');
        char randomCharFour=(char)(Math.random()*26 + 'a');
        char randomCharFive=(char)(Math.random()*26 + 'a');
        
        //print 5 random chars spaced on the same line 
        System.out.println(Character.toUpperCase(randomChar)+ " " +Character.toUpperCase(randomCharTwo)+
        " " +Character.toUpperCase(randomCharThree)+ " " +Character.toUpperCase(randomCharFour)+
                " " +Character.toUpperCase(randomCharFive));
        
    }

}
