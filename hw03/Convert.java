/*Darcy Marmolejos
02/15/2016
CSE002
homework 03
convert program
The purpose of this program is for the user to be able to input data, which 
would be in meters, and it would be converted into inches.*/
import java.util.Scanner;
public class Convert{
    //main method 
    public static void main(String[]args){
        Scanner scanr;
        //declare
        scanr=new Scanner(System.in);
        
        //Input distance from user
        System.out.println("Enter a distance in meters: ");
        double distanceMeters=scanr.nextDouble(); //read & store input
        
        //Convert meters to inches
        double distanceInches;
        distanceInches=((int)(10000*(distanceMeters*39.370)))/10000.0;
        
        //output 
        System.out.println("The distance, "+distanceMeters+" meters, in inches is: " +distanceInches);
    }//end of main method
}//end of class