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
public class HW5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); //make a new scanner called input
       int number; //get a variable number
        do{//loop
        int result; // get a variable number
        System.out.print("Please enter 5 numbers separated by a space:  "); //propmt users
        int n1 = input.nextInt(); //get value from users
        int n2 = input.nextInt();//get value from users
        int n3 = input.nextInt(); //get value from users
        int n4 = input.nextInt();//get value from users
        int n5= input.nextInt();//get value from users
        result = findmax(n1,n2); //use findmax method to find max between n1,n2
        result= findmax(result,n3);//use findmax method to find max between result,n3
        result = findmax(result,n4);//use findmax method to find max between result,n4
        result = findmax(result,n5);//use findmax method to find max between result,n5
        System.out.println("The maximum value in the list is:" + result); // prin out message the maxium value in the list is result
        System.out.println("Would you like to continue? ");// print out message would you like to countinue
        System.out.println("Please enter 1 for yes, 0 for no.");//prompt users
        number = input.nextInt();//get value from users
       }while(number == 1); //loop condition
       
        
        
    }
    
    public static int findmax (int x, int y){ // create new method called findmax
        int max = 1; // get variable number
        if (x>y){ // condition
            max = x;//if condition is true then max=x
        }
        else max = y;//if condition is not ture then max=y
        return max; //get max value
    }
}
