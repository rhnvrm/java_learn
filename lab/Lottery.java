/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.Scanner;

/**
 *
 * @author rv285
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randNum1, randNum2, userNumber;
        randNum1 = (int) (Math.random() * 10);
        randNum2 = (int) (Math.random() * 10);
        
        Scanner s = new Scanner(System.in);
        
        userNumber = s.nextInt();
        
        int matches = 0;
        while(userNumber != 0){
            
            int digit = userNumber % 10;
            
            if(digit == randNum1) matches+=1;
            if(digit == randNum2) matches+=1;
            
            userNumber /= 10;
        }
        
        if(matches == 2) System.out.println("You have won 3000 USD!");
        else if(matches == 1) System.out.println("You have won 1000 USD!");
        else System.out.println("Better Luck Next Time!");
        
    }
}
