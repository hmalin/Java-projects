/* 
Name:Lloyd Malin 
Course: CIT-130 Sect: 2003
Assignment: Chapter 9 Excersise 3 ( Dead Space Remake Upgrade tracker)
 */
package dsrweapontracker;

public class DSRWeaponTracker {

   
    public static void main(String[] args) {
        // Dead space - scifi survival horror videogame launched originally 2008| remade in 2023
        //create objects for games weapons 
        WeaponUpgrades w1 = new WeaponUpgrades("Plasma Cutter", 200.00, 23, "MAX" );
        WeaponUpgrades w2 = new WeaponUpgrades("Pulse Rifle" , 40.00,50, "MIN");
        WeaponUpgrades w3 = new WeaponUpgrades("Ripper" , 110.00, 15, "MAX");
        WeaponUpgrades w4 = new WeaponUpgrades("FlameThrower" , 65.00 , 50, "MIN");
        WeaponUpgrades w5 = new WeaponUpgrades("Contact Beam" , 75.00, 12, "MIN");
        WeaponUpgrades w6 = new WeaponUpgrades("Line Gun" , 250.00, 9, "MED" );
        WeaponUpgrades w7 = new WeaponUpgrades("Force Gun" , 150.00, 11, "MED");
        
       /////set dmg when upgraded////////////////////////// 
        //w2.setDamage(0);
        //w4.setDamage(0);
        //w5.setDamage(0);
        
        ////////set cap when upgraded ////////////////////
        //w2.setCap(0);
        //w4.setCap(0);
        //w5.setCap(0);
        
        //////////set level when upgraded//////////////////
        //w2.setLevel(level);
        //w4.setLevel(level);
        //w5.setLevel(level);
        
        //print current weapon stats
        System.out.println("Current weapon stats are :");
        System.out.println(w1.getWeaponName()+" "+w1.getDamage()+" "+w1.getCap()+" "+w1.getLevel());
        System.out.println(w2.getWeaponName()+" "+w2.getDamage()+" "+w2.getCap()+" "+w2.getLevel());
        System.out.println(w3.getWeaponName()+" "+w3.getDamage()+" "+w3.getCap()+" "+w3.getLevel());
        System.out.println(w4.getWeaponName()+" "+w4.getDamage()+" "+w4.getCap()+" "+w4.getLevel());
        System.out.println(w5.getWeaponName()+" "+w5.getDamage()+" "+w5.getCap()+" "+w5.getLevel());
        System.out.println(w6.getWeaponName()+" "+w6.getDamage()+" "+w6.getCap()+" "+w6.getLevel());
        System.out.println(w7.getWeaponName()+" "+w7.getDamage()+" "+w7.getCap()+" "+w7.getLevel());
    }
    
}
