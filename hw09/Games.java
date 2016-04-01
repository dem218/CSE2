/*Darcy Marmolejos
CSE002
03/30/16
Games program
This program will be able to */

import java.util.Scanner; //import scanner do get input from user
//import java.util.Random; 
//create a class
public class Games{
    public static void guessTheBox(){
        Scanner scanr1= new Scanner (System.in);
        System.out.println("There are 3 boxes, box 1,2 and 3. One of them contains a prize, Guess which box it is: ");
        int g=0;
        int box=(int)(Math.random()*3) + 1;
        int yourBoxNumber=0;
        boolean good=false;
        while (!good){
        if (scanr1.hasNextInt()){
            g=scanr1.nextInt();
            if (g>0 && g<=3){
                yourBoxNumber=g;
                good=true;
            }
            else{
                System.out.println("Please enter one of the box numbers.");
                scanr1.next();
            }
        }
        else{
            System.out.println("Please enter an integer");
            scanr1.nextLine();
        }
        }
        if (yourBoxNumber==box){
            System.out.println("Congrats, You guessed the right box! You win the prize of knowing you are an exceptional guesser, although it's not quite like winning the lottery, kudos to you ;)");
        }
        else
        {
            System.out.println("WRONG");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public static void spinTheWheel(){
        Scanner scanrTwo= new Scanner (System.in);
        System.out.println("There is a wheel with 10 sections, half red and half black, pick one of the colors.");
        String c="";
        int c1=0;
        boolean good1=false;
        while (!good1){
        if (scanrTwo.hasNext()){
            c=scanrTwo.next();
            if (c.equals("red")){
                c1=1;
                good1=true;
            }
            else if (c.equals("Red")){
                c1=1;
                good1=true;
            }
            else if (c.equals("black")){
                c1=0;
                good1=true;
            }
            else if (c.equals("Black")){
                c1=0;
                good1=true;
            }
            else{
            System.out.println("Please enter red or black");
            scanrTwo.nextLine();
        }
        }
        else{
            System.out.println("Please enter a word that is red or black");
            scanrTwo.next();
        }
        }
        System.out.println("Each section contains integers 1 through 5, chose an integer");
        int n=0;
        int r=0;
        boolean good2=false;
        while (!good2){
        if (scanrTwo.hasNextInt()){
            n=scanrTwo.nextInt();
            if (n<=5 && n>=1){
                n=r;
                good2=true;
            }
            else{
            System.out.println("Please enter an integer between 1 and 5");
            scanrTwo.next();
        }
        }
        else{
            System.out.println("Please enter an integer");
            scanrTwo.next();
        }
        }
        int black=0;
        int red=1;
        int color=(int)(Math.random()*0)+1; 
        int number=(int)(Math.random()*5)+1;
        
        if (color==0){
            System.out.println("black "+number);
        }
        if (color==1){
            System.out.println("red "+number);
        }
        if (c1==color && n==number){
            System.out.println("Congats you guessed where the wheel would stop");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void scrambler(){
        Scanner scanr3= new Scanner (System.in);
        boolean good1=false;
        while (!good1){
            System.out.println("Enter a word! Any word!!");
            String word="";
            if(scanr3.hasNext()){ 
                word=scanr3.next();
                int x=(int)(Math.random()*(word.length()));
                char c= word.charAt(x);
                String scram=Character.toString(c);
                int y=1;
                while (y<word.length()){
                    if (y!= x){
                       scram=scram+ Character.toString(word.charAt(y)); 
                    }
                    else{
                        scram=scram+ Character.toString(word.charAt(0));
                    }
                    y++;
                }
                word=scram;
                System.out.println("scrambled word: "+ word);
                good1=true;
            }
            else{
                System.out.println("Let's use our words.");
                scanr3.next();
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // main method for every java program
    public static void main(String[]args){
        System.out.println("Welcome to Darcy's game center"); //Tells user they are in my game center
        Scanner scanr= new Scanner (System.in); //create instance for scanner
        
        String d="";
        
            System.out.println("Pick a game: guessTheBox, spinTheWheel, or scrambler"); //ask user to pick a game
            if(scanr.hasNext()){ 
                d=scanr.next();
                if(d.equals("guessTheBox")){
                    guessTheBox();
                }
                else if(d.equals("spinTheWheel")){
                    spinTheWheel();
                }
                else if(d.equals("scrambler")){
                    scrambler();
                }
                
                else{
                    System.out.println("Sorry bud, my arcade doesn't have that game :( ");
                }
            
            //}
        }
    }
}
