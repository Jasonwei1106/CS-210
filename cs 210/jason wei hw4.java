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
public class Hw4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // make a new scanner called input
        int number; //get a variable number
        int month; //get a variable number

        do { // loop
            System.out.print("Please enter a number between 1 and 12: "); //  prompt user
            month = input.nextInt(); //get value from the user
            if (month > 12 || month < 1) { // condition
                System.out.println("Not a valid number in range"); // condition is true then print out "Not a valid number in range"
            } else { //condition if month 1=< month =<12
                switch (month % 12) { // switch statement
                    case 0: // if the reminder is 0 then print out December
                        System.out.println("December");
                        break;
                    case 1: //if the reminder is 1 then print out January 
                        System.out.println("January");
                        break;
                    case 2: // if the reminder is 2 then print out February
                        System.out.println("February");
                        break;
                    case 3: // if the reminder is 3 then print out March
                        System.out.println("March");
                        break;
                    case 4: // if the reminder is 4 then print out April
                        System.out.println("April");
                        break;
                    case 5: // if the reminder is 5 then print out May
                        System.out.println("May");
                        break;
                    case 6: // if the reminder is 6 then print out June
                        System.out.println("June");
                        break;
                    case 7: // if the reminder is 7 then print out 
                        System.out.println("July");
                        break;
                    case 8: // if the reminder is 8 then print out August
                        System.out.println("August");
                        break;
                    case 9: // if the reminder is 9 then print out September
                        System.out.println("September");
                        break;
                    case 10: // if the reminder is 10 then print out October
                        System.out.println("October");
                        break;
                    case 11:// if the reminder is 11 then print out November
                        System.out.println("November");
                        break;
                }
            
            }

            System.out.print("Would you like to continue?\n " + "Please enter 1 for yes, 0 for no. "); // prompt user
            number = input.nextInt(); //get value from the user
            
            
            if (number != 0 & number != 1) { //condition
                
                    System.out.println("Invalid number entered.  Will continue."); // if condition is true then print out "Invalid number entered.  Will continue."

                }

            

        } while (number != 0); //if number= 0 then stop the loop

    }
}
