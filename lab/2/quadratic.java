/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

import java.util.Scanner;

/**
 *
 * @author rv285
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,d,r;
        
        //a = 1;
        Scanner s = new Scanner(System.in);
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        
        d = Math.pow(b,2) - 4*a*c;
        
        if(d == 0){
            System.out.println("Root:");
            r = (-b)/(2*a);
            System.out.println(r);
        }
        else if (d > 0){
            System.out.println("Roots:");
            
            r = ((-b) + d)/(2*a);
            System.out.println(r);

            r = ((-b) - d)/(2*a);
            System.out.println(r);

        }
        else {
            System.out.println("The equation has no real roots.");
        }
        
        
    }
}
