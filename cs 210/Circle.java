/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasonwei
 */
public class Circle {

    public static void main(String [] args){
        
        int r = 5; //get radius
        
        System.out.println("This program will calculate the area of a circle with a radius of 5.");
        //let computer print out message "This program will calculate the area of a circle with a radius of 5."
        double pi= Math.PI; // define pi is math pi
        double area = r * r * pi; // give the function to calcaute area
        System.out.println("The area is: " + area); // let computer print out message "this area" and the result of area
        
    }
    
}
