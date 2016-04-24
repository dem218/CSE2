/* Darcy Marmolejos
CSE02
HW12
program CSE2Linear
This program will be able to take the input from the user for 15 different numbers of student grades.
It will put it into an array. The program will be able to use binary search to search for a number
the user is looking for. I will also be able to scramble the array and use linear search to look for a number
the user is looking for.*/
import java.util.Scanner; //import scanner to input from user.
import java.util.Arrays; // import arrays
public class CSE2Linear{ 
    //main method
    public static void main(String[]args){
        Scanner scanr= new Scanner(System.in); //creates instance
        int[]finalGrades= new int[15]; //initialize array of lenth 15
        int user=0;// initialize variable user to 0
        int i=0;// initialize variable user to 0
        int a=0;// initialize variable user to 0
        int userinput=0;// initialize variable user to 0
        int b=0;// initialize variable user to 0
        boolean good=false;// initialize boolean
        System.out.println("Enter int for final grades in CSE2"); //ask user to enter final grades
        while(!good){ //loop will keep going until it breaks out if input works
            for (i = 0; i < 15; i++){ // for loop to put value to each part of array
                if (scanr.hasNextInt()) { //checks if input is an integer
                    a=scanr.nextInt();//variable a is set to input if it is an integer 
                if  (a>= 0 && a<= 100){ //checks if input is between 0 and 100 (inclusive)
                    user=a;//set user to a if it is between 0 and 100
                if(a>=b){ //check to see that it is greater than the last number
                    userinput=user;//if it is set userinput to user
                    finalGrades[i] = userinput; //insert number in position i
                }
                else{ //if the numer is not bigger that the last 
                    System.out.println("Number was not bigger than the last");
                    System.exit(0); //end program
                }
                }
                else{ //if the number is not in between  0 and 100
                    System.out.println("Number was not in the range");
                    System.exit(0);//end program
                }
                }
                else{//if the user did not enter an integer
                    System.out.println("You didn't enter an integer");
                    System.exit(0); //end program
                }
                b=a;//the last number, to be later compared to the new input 
            }
            good=true; //ends while loop
        }
        System.out.println(Arrays.toString(finalGrades)); //print array
        BinarySearch(finalGrades); //call binary search method
        Scramble(finalGrades); //call scramble method
        LinearSearch(finalGrades); // call linear search method
    }
    public static void BinarySearch(int[] finalGrades) {
    Scanner scanr= new Scanner(System.in);
    int bn=0;
    int tn=finalGrades.length - 1;
    System.out.println("Pick a number to search");
    if (scanr.hasNextInt()) {
    int user= scanr.nextInt(); 
        while (bn<=tn){
          int middle= (bn+tn)/2;
          if (user<finalGrades[middle]){
              tn=middle- 1;
          }
          else if (user > finalGrades[middle]){
              bn=middle+ 1;
          }
              else if (user == finalGrades[middle]){
                  System.out.println("We found" + user);
                  break;
          }
        }
        if (bn > tn){
            System.out.println("could not find" + user);
        }
        }
    }
    public static void Scramble(int[] finalGrades) {
        int count=0;
           while(count<15){
                int other=(int)(Math.random()*15);
                int numbefore= finalGrades[count];
                
                
                if (other != count){
                    finalGrades[count] = finalGrades[other];
                    finalGrades[other] = numbefore;
                }
                count++;
        }
        System.out.println(Arrays.toString(finalGrades));
    }
    public static void LinearSearch(int[] finalGrades) {
        System.out.println("Pick a number to search");
        Scanner scanr= new Scanner(System.in);
        if (scanr.hasNextInt()){
            int counter=1;
            int wassap=scanr.nextInt();   
            for(int count=0; count< finalGrades.length; count++){
                if (finalGrades[count] == wassap){
                    System.out.println(wassap + " was found after " + counter + " with iterations");
                }
                 counter++;
            }
        }
        else{
            System.out.println("Enter an int!!");
        }
    }
}