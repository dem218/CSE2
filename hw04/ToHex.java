/*Darcy Marmolejos
02/21/2016
CSE002
hw 04
Decimal to hexadecimal converter program
The program will be able to convert decimals */
import java.util.Scanner;
public class ToHex{
    //main method
    public static void main(String[]args){
        Scanner scanr=new Scanner(System.in);
        System.out.println("Enter 1st RGB value: "); //Get input value from user
        boolean RGBcheck1=scanr.hasNextInt(); //Check to see if inout is a number or not
        String hexVal1 = ""; //Sets hexval1 as a string
        
        //For1st RGB value 
        
        if (scanr.hasNextint())
        {
            int RGB1 = scanr.nextInt();    
            int RGBval1=RGB1/16;
            int RGBval2=RGB1%16;
        }
        
        //Convert remainder value into 
        if ((RGBval1>0) && (RGBval1<9)){
            hexVal1 = RGBval1;
        }
        if (RGBval1==10){
            hexVal1="A";
        }
        if (RGBval1==11){
            hexVal1="B";
        }
        if (RGBval1==12){
            hexVal1="C";
        }
        if (RGBval1==13){
            hexVal1="D";
        }
        if (RGBval1==14){
            hexVal1="E";
        }
        if (RGBval1==15){
            hexVal1="F";
        }
    
        
        //for second RGB value 
        System.out.println("Enter 2nd RGB value: ");
        boolean RGBcheck2=scanr.nexHastInt();
        String hexVal2="";
    if (scanr.hasNextint()){
        int RGB2=scanr.nextInt();
        int RGBval3=RGB2/16;
        int RGBval4=RGB2%16; 
    }
        if ((RGBval4>0) && (RGBval4<9)){
            hexVal2 = RGBval3;
        }
        if (RGBval4==10){
            hexVal2="A";
        }
        if (RGBval4==11){
            hexVal2="B";
        }
        if (RGBval4==12){
            hexVal2="C";
        }
        if (RGBval4==13){
            hexVal2="D";
        }
        if (RGBval4==14){
            hexVal2="E";
        }
        if (RGBval4==15){
            hexVal2="F";
        }


        //for third RGB value
        
        System.out.println("Enter 3rd RGB value: ");
        boolean RGBcheck1=scanr.nextHasInt();
        String hexVal3="";
        
        if (scanr.hasNextint()){
        int RGB3=scanr.nextInt();
        int RGBval5=RGB2/16;
        int RGBval6=RGB2%16; 
    }
        if ((RGBval6>0) && (RGBval6<9)){
            hexVal3 = RGBval5;
        }
        if (RGBval6==10){
            hexVal3="A";
        }
        if (RGBval6==11){
            hexVal3="B";
        }
        if (RGBval6==12){
            hexVal3="C";
        }
        if (RGBval6==13){
            hexVal3="D";
        }
        if (RGBval6==14){
            hexVal3="E";
        }
        if (RGBval6==15){
            hexVal3="F";
        }
        System.out.println("The RGB Value R:" +RGB1+ "G" +RGB2 + "B"+ RGB3+ "is represented in hexadecimal as" +RGBval1+hexVal1+RGBval3+hexVal2+RGBval5+hexVal3);
    
    }
}
