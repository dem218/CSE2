/*Darcy Marmolejos
03/04/2016
CSE002
lab 06
TwistGenerator Program
This program will be able to write a twist on the screen using the loop.*/
import java.util.Scanner; //imports scanner to take input from user
//defines class
public class TwistGenerator{ 
    //main method
    public static void main(String[]args){
        Scanner scanr=new Scanner(System.in); //creates instance
        int a=0;//initialize a
        int length = 0; //initialize length
        boolean  goodinput = false; //initialize boolean 
        while (!goodinput){ //Check if input value is an integer
            System.out.println("Enter a positive integer:"); //asks user for a positive integer
            if (scanr.hasNextInt() ){ //Check if input value is an integer
                a = scanr.nextInt(); //if value is an integer then a equals the input value
                if(a>0){ //check to see if input value is a positive integer
                    length = a; //if it is, then length is set as a
                    goodinput = true; //ends while loop
                }
            }
            else{
               
                scanr.next(); //If user does not enter a positive integer, they are asked again
            }
        }
        
        int d=0; //initialize d
        while (d==0){ //while loop will keep going until there is a number (d) not equal to 0
        int big=length/3; //initialize big, number of times 3 fits into length
        String line1=""; //initialize line1
        String line2=""; //initialize line2
        String line3=""; //initialize line3
        
        while (big>0){ //while loop will keep going until there is a number (big) that is less than 0
            line1=line1+"\\ /"; //line1 is set to \ / and will repeat for the number of times that 3 fits into length
            line2=line2+" X ";//line2 is set to (space)X(space) and will repeat for the number of times that 3 fits into length
            line3=line3+("/"+" "+"\\"); //line3 is set to / \ and will repeat for the number of times that 3 fits into length
            big--; //increment big
        }
        int remainder=length%3; //calculates remainder
        if (remainder==1){ // If there is a remainder of 1
            line1=line1+"\\"; // add \ to the pre-existing top line
            line3=line3+"/"; // add / to the pre=existing bottom line
        }
        if (remainder==2){ //If there is a remainder of 2 
            line1=line1+"\\ "; // add \(space) to the pre-existing top line
            line2=line2+" x"; // add (space)x to the pre-existing middle line
            line3=line3+"/"+" "; // add / and (space) to the pre-existing bottom line
        }
          System.out.println(line1); //prints the top part of the twist
          System.out.println(line2); //prints the middle part of the twist
          System.out.println(line3); //prints the bottom part of the twist
          d++; //ends while initial loop 
        }
          
    
        
    }    
}


