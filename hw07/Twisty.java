/*Darcy Marmolejos
homework 7
cse 002
03/15/16
Twisty program
Program will be able to take input from user and print a twist based off input */
import java.util.Scanner; //import scanner to take input from user
public class Twisty{ //defines class
    public static void main(String[]args){ //main method
        Scanner scanr = new Scanner (System.in); //creates instance for scanner
        int length=0;
        int width=0;
        int d=0;
        boolean goodnum=false;
        while (!goodnum){
            System.out.println("Enter length of twist: ");
            if (scanr.hasNextInt()){
                d=scanr.nextInt();
                if (d>0 && d<=80){
                length=d;
                goodnum=true;
                }
                else{
                    System.out.println("Please enter a number a positive number less than or equal to 80.");
                scanr.next();
            }
            }
            else{
                System.out.println("Please enter an integer.");
                scanr.next();
            }
        }
        int m=0;
        boolean goodnum2=false;
        while (!goodnum2){
            System.out.println("Enter width of twist: ");
            if (scanr.hasNextInt()){
                m=scanr.nextInt();
                if (m>0 && m<=length){
                    width=m;
                    goodnum2=true;
                }
                else{
                System.out.println("Please enter a positive integer that is less than the value for length.");
                scanr.next();
            }
            }
            else{
                System.out.println("Please enter an integer.");
                scanr.next();
            }
        }
        int sets=length/(width*2);
       //int hash=0;
       //int slash=0;
       int numLine=0;
       int line=(width/2);
       int space=0;
       int spaceTwo=(width-2);
       int spaceThree=0;
       int middleSpace=0;
       int count1=0;
       int countLine=0;
       int countSpace=0;
       int countSpace2=0;
       int countSpace3=0;
       int middle=(width%2);
       
       
      
           while (countLine<line){
             while (count1<sets){
               while (countSpace<space){
                   System.out.print(" ");
                   countSpace++;
               }
               countSpace=0;
         
            System.out.print("#");
            
            while (countSpace2<spaceTwo){
                System.out.print(" ");
                countSpace2++;
           }
           countSpace2=0;
           
           
           
            System.out.print("/");
            
             while (countSpace3<spaceThree){
                   System.out.print(" ");
                   countSpace3++;
               }
               countSpace3=0;
             
               while (countSpace<space){
                   System.out.print(" ");
                   countSpace++;
               }
               countSpace=0;
               
            System.out.print("\\");
            
            while (countSpace2<spaceTwo){
                System.out.print(" ");
                countSpace2++;
           }
           countSpace2=0;
           
           
           
            System.out.print("#");
            
             while (countSpace3<spaceThree){
                   System.out.print(" ");
                   countSpace3++;
               }
               countSpace3=0;
               count1++;
             }
             count1=0;
             spaceTwo=spaceTwo-2;
             space++;
             spaceThree++;
             countLine++;
             System.out.println();
           }
          
           
              
              
           
       
              
           countLine=0;
        
           if (middle == 1){
            while (count1<sets){
            while (middleSpace<space){
            System.out.print(" ");
            middleSpace++;
            }
            middleSpace=0;
            
            System.out.print("#");
            
            while (middleSpace<space){
            System.out.print(" ");
            middleSpace++;
            }
            middleSpace=0;
            
            while (middleSpace<space){
            System.out.print(" ");
            middleSpace++;
            }
            middleSpace=0;
            
            System.out.print("\\");
            
            while (middleSpace<space){
            System.out.print(" ");
            middleSpace++;
            }
            middleSpace=0;
            count1++;
            }
            count1=0;
            System.out.println();
           }
            
           
           
       
            while(countLine<line){
              countSpace=0;
              countSpace2=0;
              countSpace3=0;
              space--;
              spaceThree--;
              spaceTwo=spaceTwo+2;
              while (count1<sets){
                while (countSpace<space){
                    System.out.print(" ");
                   countSpace++;
                }
                countSpace=0;
    
                System.out.print("/");
                while (countSpace2<spaceTwo){
                    System.out.print(" ");
                countSpace2++;
                }
                countSpace2=0;
                
                System.out.print("#");
                while (countSpace3<spaceThree){
                   System.out.print(" ");
                   countSpace3++;
               }
              countSpace3=0;
              while (countSpace<space){
                    System.out.print(" ");
                   countSpace++;
                }
                countSpace=0;
                System.out.print("#");
                while (countSpace2<spaceTwo){
                    System.out.print(" ");
                countSpace2++;
                }
                countSpace2=0;
                
                System.out.print("\\");
                while (countSpace3<spaceThree){
                   System.out.print(" ");
                   countSpace3++;
               }
               countSpace3=0;
               
              count1++;
               
                }
              count1=0;
              countLine++;
              
              System.out.println();
              
              
              }
              countLine=0;
              
       
              
    
      
    }
}
           
       
       
