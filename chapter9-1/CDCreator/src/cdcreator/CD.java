/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Date : 3/27/23
Assignment: Chapter 9 CD Creator 
 */
package cdcreator;


public class CD {
    //private variables 
    private final int numberOfTrack;
    private final double runningTime;
    private final String title;
    
    //overloaded constructor 
    public CD (int numberOfTrack, double runningTime, String title){
        
        this.numberOfTrack = numberOfTrack;
        this.runningTime = runningTime;
        this.title = title;
        
    }
    //getter for number of track
    public int getNumberOfTrack(){
        return numberOfTrack;
    }
    
    //getter for running time
    public double getRunningTime(){
        return runningTime;
    }
    
    //getter for title
    public String getTitle(){
        return title;
    }
    
}
