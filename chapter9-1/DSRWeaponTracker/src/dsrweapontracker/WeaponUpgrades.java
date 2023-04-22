/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
date : 3/27/23
Assignment: Chapter 9  Weapon upgrade tracker
 */
package dsrweapontracker;


public class WeaponUpgrades {
    
    private String weaponName;
    private double damage;
    private int cap;
    private String level;
    
    //constructor for weapons
    public WeaponUpgrades(String weaponName, double damage,  int cap, String level){
        this.weaponName=weaponName;
        this.damage=damage;
        this.cap=cap;
        this.level=level;
        
    }
    
    
    //getter for weapon name
    public String getWeaponName(){
        return weaponName;
    }
    //setter for damage 
    public void setDamage(double damage){
        this.damage= damage; 
    }
    
    //getter for damage
    public double getDamage(){
        return damage;
    }
    
    //setter for capacity
    public void setCap(int cap){
        this.cap=cap;
    }
    
    //getter for capacity 
    public int getCap(){
        return cap;
    }
    
    //setter for level 
    public void setLevel(String level){
        this.level=level;
    }
    
    //getter for level
    public String getLevel(){
        return level;
    }
    
}
