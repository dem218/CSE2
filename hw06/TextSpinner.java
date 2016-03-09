/*Darcy Marmolejos
03/08/2016
CSE002
homework 06
TextSpinner Program
This program will be able to print out an infinite loop that has a spinning effect.*/
public class TextSpinner{
    //main method
    public static void main(String[]args){
        int count=0;//initialize count
        //as long as it is equal to 0 it will keep looping
        while (count==0){
            System.out.print("/\b"); // will print the symbol / and delete the last symbol on the same line
            System.out.print("-\b"); // will print the symbol - and delete the last symbol on the same line
            System.out.print("\\\b"); // will print the symbol \ and delete the last symbol on the same line
            System.out.print("|\b"); // will print the symbol | and delete the last symbol on the same line
        }//end of while loop
    }//end of main method
}//end of class