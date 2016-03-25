/*Darcy Marmolejos
CSE002
03/21/16
Homework 07
Triangles Program 
This program will make use of the for, while and do-while loop method to make
3 sets of triangle based on the value the user has given.*/
import java.util.Scanner;
public class Triangles
{
    public static void main(String[]args)
    {
        Scanner scanr=new Scanner(System.in);
        int num=0;
        int h=0;
        int n=0;
        boolean inputsgood=false;
      while (n==0){
       // {
            while (!inputsgood)
            {
                System.out.println("Enter an integer between 5 and 30: ");
                if (scanr.hasNextInt())
                {
                    h=scanr.nextInt();
                    if (h>=5 && h<=30)
                    {
                        num=h;
                        inputsgood=true;
                    }
                    else
                    {
                        System.out.println("Please enter a number between 5 and 30.");
                        scanr.next();
                    }
            }
            else
            {
                System.out.println("Please enter an integer.");
                scanr.next();
            }
        }
        int begn=0;
        int d=0;
        int e=0;
        int g = 0;
        int f = 0;
        for (d=0; d<num; d++)
                        {
                            begn=begn+1;

                            for (e=0; e<begn; e++)
                            {
                                System.out.print(begn);
                                }
                                System.out.println();
                            }
        for (f=(num - 1) ; f>0; f--)
                        {
                            
                            for (g=f; g>0; g--)
                            {
                                System.out.print(f);
                                }
                                System.out.println();
                            }
        begn=0;
        d=0;
       //////////////////////////////////////////////////////////////////
       while (d<num){
                            begn=begn+1;
                            e = 0;
                            while (e<begn)
                            {
                                System.out.print(begn);
                                e++;
                                }
                                System.out.println();
                                d++;
                            }
        f=(num -1);
       while (f>0){
            
            g = f;
                            while (g>0) 
                            {
                                System.out.print(f);
                                g--;
                                }
                                System.out.println();
                           f--;
                            }
    
    ///////////////////////////////////////////////////////////////////    
    begn=0;
    d=0;
    do{
        begn=begn+1;
        e = 0;
        do{
            System.out.print(begn);
                                e++;
    }while(e<begn);
    System.out.println();
                                d++;
    }while(d<num);
  
    f=(num -1);
    do{
        g = f;
        do{
            System.out.print(f);
                g--;
        }while(g>0);
        System.out.println();
        f--;
    }while(f>0);
    
        n++;
      }
    }
}
  


