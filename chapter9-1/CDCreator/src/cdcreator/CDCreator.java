/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Date: 3/27/23
Assignment: Chapter 9 Excersise 2 - CDCreator
 */
package cdcreator;


public class CDCreator {

   
    public static void main(String[] args) {
        // Create cd objects 
        CD cd1 = new CD(1 , 3.20,"London Calling"); 
        CD cd2 = new CD(9, 2.08, "Winnebago Warrior");
        CD cd3 = new CD(11, 3.03, "England Belongs to Me");
       
        
        //Display CD data
        System.out.println("Track_" + cd1.getNumberOfTrack() + " " + cd1.getRunningTime() + "min " + cd1.getTitle());
        System.out.println("Track_" + cd2.getNumberOfTrack() + " " + cd2.getRunningTime() + "min " + cd2.getTitle());
        System.out.println("Track_" + cd3.getNumberOfTrack() + " " + cd3.getRunningTime() + "min " + cd3.getTitle());
        
       
    }
    
}
