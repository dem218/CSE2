/*Darcy Marmolejos
02/19/2016
CSE002
lab 04
CardGenerator Program
This program will be able to pick a random card/number.*/
public class CardGenerator{
    //main method
    public static void main(String[]args){
        int card=(int)(Math.random()*52)+1; //Select random number between 1 and 52
        String result=""; // Store result variable
        //set suit name to ranf of numbers
        if ((card>=1) && (card<=13)){
            result="diamonds";
        }
        if ((card>=14) && (card<=26)){
            result="clubs";
        }
        if ((card>=27) && (card<=39)){
            result="hearts";
        }
        if((card>=40) && (card<=52)){
            result="spades";
        }
        int test=card%13;  
        String type=""; //store variable
        //Type/number of card 
        switch (test){
            case 0: type="2"; 
            break;
            case 1: type="3";
            break;
            case 2: type="4";
            break;
            case 3: type="5";
            break;
            case 4: type="6";
            break;
            case 5: type="7";
            break;
            case 6: type="8";
            break;
            case 7: type="9";
            break;
            case 8: type="10";
            break;
            case 9: type="jack";
            break;
            case 10: type="queen";
            break;
            case 11: type="king";
            break;
            case 12: type="ace";
            break;
        }
            System.out.println("The card is "+type+" of "+result); //print output statement
    }//end of main method
} //end of class