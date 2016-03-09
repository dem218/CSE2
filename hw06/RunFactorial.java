/*Darcy Marmolejos
03/08/2016
CSE002
homework 06
RunFactorial Program
This program will be able to take an input value from the user of an integer bwtween 9 and 16 (inclusive)
and calculate the factorial of that input number.*/
import java.util.Scanner; //imports scanner to be used to get the input value from the user.
public class RunFactorial{
    public static void main(String[]args){
        Scanner scanr= new Scanner(System.in);//creates instance for scanner
        
        
        int d=0; //initializes d as 0
        int num=0; //initializes num as 0
        boolean good=false;
        int count=1; //initializes counter as 1
        int a=1; //initializes a as 1 (the running product)
        //Checks if input value is an integer and a number between 9 and 16 (inclusive)
        while(!good){
        System.out.println("Enter a number between 9 and 16 (may include 9 and 16): ");
            if(scanr.hasNextInt()){
                d=scanr.nextInt(); //sets the d as the input value if the input value is an integer
                    if (d>=9 && d<=16){
                        num=d; //if the d (the input value) is between 9 and 16 including 9 and 16, it sets the variable num to d.
                        good=true; //for ending while loop 
                        //calculate the n factorial, the while loop goes up to the input number
                            while (count<num){
                                count=count+1; //increments count (counter)
                                a=a*count; //calculates product
                        
                                }
                                System.out.println(num+"!= "+a); //prints the factorial of the input value
                        
            }
            else
            {
                System.out.println("Invalid, please enter an integer between 9 and 16 (may include 9 and 16)"); //if the input value is not between 9 and 16 (inclusive), user is asked again
            }
        }
        else{
            System.out.println("Invalid, please enter an integer");//if the input value is not an integer, user is asked again
            scanr.next();
            
        }
        }//end of while loop
        
    }//end of main method
}//end of class