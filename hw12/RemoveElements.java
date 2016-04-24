/*Darcy Marmolejos
*/
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
}
public static void randomInput(){
int []random= new int[10];
        int count=0;
        
        for(count=0;count<10; count++){
            int randomnum=(int)(Math.random()*9);
            midterm[a]=random;
        }
        System.out.println(Arrays.toString(random));
}
public static void delete(list,pos){
int []newarray= new int[(list.length)-1]
	for (int count=0; count<pos; count++;){
	    newarray[count]=list[count];
	    for (int counter=count; count<pos; count++){
	        newarray[count]=list[count+1];
	    }
	}
	System.out.println(Arrays.toString(list))
}
//remove(list,target){
	
//}