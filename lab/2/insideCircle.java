/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insidecircle;

import java.util.Scanner;

/**
 *
 * @author rv285
 */
public class InsideCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double x,y,r;
        Scanner s = new Scanner(System.in);
        
        x = s.nextDouble();
        y = s.nextDouble();
        r = s.nextDouble();
               
        double LHS = Math.pow(x,2) + Math.pow(y,2);
        double RHS = Math.pow(r,2);
        
        if(LHS <= RHS){
            System.out.println("The point is inside or on the circle");
        }
        else{
            System.out.println("The point is outside the circle");
        }
              
    }
}
