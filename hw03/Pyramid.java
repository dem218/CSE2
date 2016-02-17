/*Darcy Marmolejos
02/16/2016
CSE002
homework 03
Pyramid program 
The purpose of this program is to be able to get input data from the user. 
The program will be able to find the volume of a pyramid using the values the user
has given*/
import java.util.Scanner;
public class Pyramid{
    //main method
    public static void main(String[]args){
        
        //declare & construct
        Scanner scanr=new Scanner(System.in);
        
        //User input length of base of pyramid
        System.out.println("Enter the length of the base of the pyramid: ");
        double baseLength=scanr.nextDouble(); //read and store input
        
        //User input width of base of pyramid
        System.out.println("Enter the width of the base of the pyramid: ");
        double baseWidth=scanr.nextDouble();//read and store input
        
        //User input height of pyramid
        System.out.println("Enter the height of the pyramid: ");
        double pyramidHeight=scanr.nextDouble();//read and store input
        
        //Calculate volume of the pyramid
        double pyramidVolume;
        pyramidVolume=(baseLength*baseWidth*pyramidHeight)/3;
        System.out.println("The volume of the pyramid is "+pyramidVolume);
    }//end of main method
}//end of class