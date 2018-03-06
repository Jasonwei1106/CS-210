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
public class HW6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //make a new Scanner called input
         System.out.println("Please the size of the array: "); //prompt users
        int size = input.nextInt(); //get value from users
        int[] array = new int[size]; //make "size" of arraries
        System.out.print("Please enter the " + size + " numbers for the array separated by spaces:");//print out the message
        for (int i = 0; i < size; i++) {//loop

            array[i] = input.nextInt();//get the value from user

        }
        System.out.print("You enter: ");//print out message 
        for (int i = 0; i < size; i++) {//loop
            System.out.print(" " + array[i]);//print out all the array
        }
        System.out.print("\nAfter selection sort, the array looks like this: ");//print out message   
        
        for (int i = 0; i < size; i++) {//loop  
            int temp; // get a variable number  

            temp = array[min(array, i, size)]; 
            array[min(array, i, size )] = array[i];
            array[i] = temp; //swap samllest array and current array
            System.out.print(" " + array[i]); //print out the message
         

     }
        System.out.println("\n");
    }
    /*
    find min index from a given array
    */
     public static int min(int[] array, int start, int end) { //create new method called min

        int minvalue = array[start]; //get a variable number and equal to the first array 
        int index;//get a variable number
        int smallestNumberIndex = 0; //get a variable number
        for (index = start; index < end; index++) { //loop
            if (array[index] <= minvalue) { //condition to compare if the current array is less than minvalue
                minvalue = array[index]; //if condition is true then minvalue will be current array     
                smallestNumberIndex = index; //save the index as samllestNumberIndex
            }
        }
        return smallestNumberIndex;//get the smallestNumberIndex 
    }
}
