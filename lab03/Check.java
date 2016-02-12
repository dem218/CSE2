/*Darcy Marmolejos
02/12/2016
CSE002
lab 03
Check program
Purpose of program is to learn how to use scanner to get input data from the user. 
The program input data would be the cost of a check, the %tip the group of people 
wish to pay, and the # of ways to split the check. It will calculate whow much
each person has to pay to pay for the check.*/
import java.util.Scanner;
public class Check{
    //Main method for every java program
    public static void main (String[] args){
        //create instance
        Scanner myScanner= new Scanner(System.in);
        //Ask user for total cost of check
        System.out.print("Enter original cost of check in the form xx.xx:");
        
        //Ask user for percent tip
        double checkCost=myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (xx):");
        
        double tipPercent=myScanner.nextDouble();
        tipPercent /=100;//Converts the percentage into a decimal value
        
        //Ask user for the number of people wo went to dinner
        System.out.print("Enter the number of people who went out to dinner:");
        
        
        int numPeople=myScanner.nextInt();
        double totalCost;
        double costPerPerson;
        int dollars,dimes,pennies=0; //whole dollar amount of cost, 
        // storing digits to the right of the decimal point for the cost $
        
        
        totalCost=checkCost*(1+tipPercent);//The total cost
        costPerPerson=totalCost/ numPeople;//The cost per person
        dollars= (int)costPerPerson;
        //Get the whole ammount, dropping decimal fraction
        dimes=(int)(costPerPerson*10)%10;
        
        //get dimes amount
        pennies=(int)(costPerPerson*10)%10;
        System.out.println("Each person in the group owes $"+dollars+"."+dimes+pennies);
        
        
        
        
        
    }//end of main method
}//end of class