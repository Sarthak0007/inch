/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inch;

import java.util.Scanner;


public class Inch {

   
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Input a value for inch :");
        
        double d = scn.nextDouble();
        double meters =d *0.0254;
        System.out.println(d+"inch is " + meters + "meters.");
    }
    
}
