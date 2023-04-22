/*
Name: Lloyd Malin
Course:CIT-130 SEC:2003
Date:2/7/23
Assignment: Chapter 4 PhoneKeypad
 */

package phoneandkeypad;

import java.util.Scanner;

public class PhoneAndKeypad {

    
    public static void main(String[] args) {
        // Create Scanner & Prompt user for a char. Store provided char as userslect
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the telephone key pad"
                + "Please enter a lower or uppercase letter");
       char userSelect=input.next().charAt(0);
       char abc='2';   char pqrs='7';
       char def='3';   char tuv='8'; 
       char ghi='4';   char wxyz='9'; 
       char jkl='5';
       char mno='6';
       
    // logic when user select is a,b,c or A,B,C
    if ( userSelect == 'a' || userSelect == 'A'|| userSelect =='b'||
            userSelect == 'B'|| userSelect=='c'|| userSelect =='C')
    {
       int ABC=Character.getNumericValue(abc);
        System.out.println("You have dialed " +ABC);
        
    }// logic when user select is d,e,f or D,E,F
    
    else if (userSelect == 'd'|| userSelect =='D'|| userSelect== 'e'||
            userSelect =='E'|| userSelect =='f'|| userSelect== 'F'){
        
        int DEF=Character.getNumericValue(def);
        System.out.println("You have dialed " +DEF);
    }//logic when user select is g,h,i or G,H,I
    
    else if (userSelect=='g'|| userSelect=='G'||userSelect=='h'||
            userSelect=='H'||userSelect=='i'||userSelect=='I'){
        
        int GHI=Character.getNumericValue(ghi);
        System.out.println("You have dialed " +GHI);
        
    }//logic when user select is j,k,l or J,K,L
    else if(userSelect=='j'||userSelect=='J'||userSelect=='k'||
            userSelect=='K'||userSelect=='l'||userSelect=='L'){
        
        int JKL=Character.getNumericValue(jkl);
        System.out.println("You have dialed " +JKL);
        
    }//logic when user select is m,n,o or M,N,O
    else if (userSelect=='m'||userSelect=='M'||userSelect=='n'||
            userSelect=='N'||userSelect=='o'||userSelect=='O'){
        
        int MNO=Character.getNumericValue(mno);
        System.out.println("You have dialed " +MNO);
        
    }//logic when user select is p,q,r,s, or P,Q,R,S
    else if (userSelect=='p'|| userSelect=='P'||userSelect=='q'||
            userSelect=='Q'||userSelect=='r'||userSelect=='R'
            ||userSelect=='s'||userSelect=='S'){
        int PQRS=Character.getNumericValue(pqrs);
        System.out.println("You have dialed " +PQRS);
    }//logic when user select is t,u,v or T,U,V
    else if (userSelect=='t'||userSelect=='T'|| userSelect=='u'||
            userSelect=='U'||userSelect=='v'||userSelect=='V'){
        
        int TUV=Character.getNumericValue(tuv);
        System.out.println("You have dialed " +TUV);
    }//logic when user select is w,x,y,z or W,X,Y,Z
    else if (userSelect=='w'||userSelect=='W'||userSelect=='x'
            ||userSelect=='X'||userSelect=='y'||userSelect=='Y'
            ||userSelect=='z'||userSelect=='Z'){
        int WXYZ= Character.getNumericValue(wxyz);
        System.out.println("You have dialed " +WXYZ);
    }
    // If an invalid option is provided by the user 
    else {
        System.out.println("Sorry invalid input..You have dialed a wrong number");
    }
       
        
        
     
    }

}
