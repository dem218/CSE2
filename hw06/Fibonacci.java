/*Darcy Marmolejos
03/08/2016
CSE002
homework 06
Fibonacci Program
This program will be able to calculate and print out a desired fibonacci sequence.*/
import java.util.Scanner; //imports scanner for input values
public class Fibonacci{
    public static void main(String[]args){
        int check = 0; //initialize check
        while (check == 0) //as long as check is equal to 0, the while loop will continue until broken by a number not equal to 0.
        {
        Scanner scanr= new Scanner(System.in); //creates instance for scanner
        int d=0; // initialize d as 0
        int a1= 0; //initialize a1
        boolean great=false; 
        //check to see if the input value is an integer and that it is greater than 0
        while (!great){
            System.out.println("Enter the first number for fibonacci sequence: "); //takes input value from user
                if(scanr.hasNextInt()){
                    d=scanr.nextInt(); //sets d as the input value if the input value is an integer
                    if (d>0){
                    a1=d; //sets a1 as d, if d (the input number) is greater than 0, a1 is the variable we use during calculations
                    great=true; //ends while loop
                    }
                }
        
                else {
                    scanr.next(); //if input value is not valid, asks user for another value
                    }
                    
        }
        ////////////////////////////////////////////////////////////////////////////////////        
        //Checking next input value
        int r=0;// initialize r as 0
        int a2= 0; //initialize a2 as 0
        boolean ginput= false;
        //check to see if the input value is an integer and that it is greater than 0
        while (!ginput){
        System.out.println("Enter the second number for fibonacci sequence: "); //takes input value from user
            if (scanr.hasNextInt()){
            r=scanr.nextInt(); //sets r as the input value if the input value is an integer
                if(r>0){
                    a2=r; //sets r as a2 if r(the inout number) is greater than 0, a2 is the variable we use during calculations
                    ginput=true;//ends while loop
                 }
            }
        else{
            scanr.next();//if input value is not valid, asks user for another value
        }
        }
        ////////////////////////////////////////////////////////////////////////////////////  
        //Checking next input value
        //check to see if the input value is an integer and that it is greater than 0
        int c=0; // initialize r as 0
        int n= 0; // initialize n as 0
        boolean good= false;
        //check to see if the input value is an integer and that it is greater than 0
        while (!good){
        System.out.println("Enter the length of fibonacci sequence: ");
            if(scanr.hasNextInt()){
                c=scanr.nextInt(); //sets c as the input value if the input value is an integer
                if (c>0){
                    n=c;//sets c as n if c(the inout number for the length of the sequence) is greater than 0,
                    //n is the variable we use during calculations
                    good=true;//ends while loop
                    
                }
            }
        else{
            scanr.next(); //if input value is not valid, asks user for another value
        }
        }
                
         ////////////////////////////////////////////////////////////////////////////////////  
         String sequence=""; //initializes fibonacci sequence
         sequence=(a1+","+a2+","); //Starts sequence with first two input values which begins the sequence
         int count=0; //initializes count (counter)
         int ai = 0; //initializes ai
         //calculations for fibonacci sequence
         while (count<n-3){
            ai=a1+a2; //the next number is the sum of the last two numbers
            a1=a2;//a1 then becomes the second numer so that it can be used to add to a2
            a2=ai; // a2 becomes the sum of the last two so that it can be added to a1
            sequence=(sequence+ai+","); //increments the print sequence
            count++; //increments count
            
            if (count == n-3) //if count is equal to n-2, for last number in sequence
            {
                ai=a1+a2;//the next number is the sum of the last two numbers
                a1=a2;//a1 then becomes the second numer so that it can be used to add to a2
                a2=ai;// a2 becomes the sum of the last two so that it can be added to a1
                sequence=(sequence+ai+".");//increments the print sequence with a period at the end
            }
         }
         System.out.println(sequence); //prints out the sequence
         check++;//ends while loop
         
        }//end of while loop
        
    }//end of main method
}//end of class
