/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jasonwei
 */
public class Hw3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); //making a new Scanner called input
        System.out.println("I am thinking of a number, please enter your guess."); //print out I am thinking of a number, please enter your guess. 
        int randomnumber = 0 + (int)(Math.random() * 11); //get random number between 0 and 10
        int number;  // get variable number
        int i = 0;  // get variable number
        do { // loop
            System.out.println("Please enter a number between 0 and 10: "); // print out Please enter a number between 0 and 10:
            number = input.nextInt(); //get the value of number from user.
            if (number > randomnumber){  // give a condition
                System.out.println("Sorry, your guess is too high."); // if condition is true the print out Sorry, your guess is too high.
            }
            else if(number < randomnumber) { // give a condition
                System.out.println("Sorry, your guess is too low."); // if condition is true then Sorry, your guess is too low
            }
            i++; // every time runs loop then i = i + 1
            }while(number != randomnumber); // loop condition
        if(number == randomnumber){ // conditions
            System.out.println("Congratulations! I was thinking of the number: " + randomnumber + "You guessed the number in " +i + " tries.");
            // if condition is true then print out Congratulations! I was thinking of the number: "  randomnumber "You guessed the number in " i " tries
        }
            
        
  
    }
    }

