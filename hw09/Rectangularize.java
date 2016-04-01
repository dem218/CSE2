/*Darcy Marmolejos
CSE002
03/30/16
Rectangularize Program
This program will be able to*/
import java.util.Scanner;
public class Rectangularize{
    
    //if the input is a number run this program
    public static void Rectangular(int number){
        //prints out as many times as the number and the length of the number
        int times = 0;
        while (times<number){
            int length = 0;
            while (length<number){
                System.out.print("%");
                length++;
            }
            System.out.println();
        times++;
        }
    }
    //if the input is a string then run this program
    public static void Rectangular(String string){
        //prints out as many times as the length of the word and the length of the word
        int x= 0;
        System.out.println("Output");
        while (x<string.length()){
            System.out.println(string);
            x++;
        }
            
    }
    //main method for every java program
    public static void main(String[]args){
        Scanner scanr= new Scanner (System.in);
        System.out.println("Enter an input ");
        int number=0;
        String string = "";
        //Check if the input is a number or a string 
        if (scanr.hasNextInt()){
            number=scanr.nextInt();
            Rectangular(number);
        }
        if (scanr.hasNext()){
            string=scanr.next();
            Rectangular(string);
        }
    }
}