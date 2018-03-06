/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasonwei
 */
// I choose the word "happy"
public class HW7 {
    public static void main (String [] args){
        char [] word = new char [5]; //create an array
        word [1] = 65 ; //second array is A
        word [2] = 'P'; //third array is P
        word [3] = word [2];//fourth array is P
        word [4] = 'Y';//the last array is Y
        word [0] = (char)(word[1] +7); //first array is H
        System.out.print("The word is: "); //print out the message
        for (int i=0; i<word.length;i++) // loop
        System.out.print(word[i]);//print out the array 
        System.out.println(""); //change the line
    }
}
