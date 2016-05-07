/*Darcy Marmolejos
CSE002
04/26/2016
Holoporter program
This program will be able to make a 3d array that has code, and print it. Then holoport it to another array
and rearange it.
*/
import java.util.Scanner; //imoport scanner
public class Holoporter{
    public static void main(String[]args){
        String array[][][] = soRandom();
        //fill in 3d array with codes
        for(int x=0; x<array.length; x++){
            for(int y=0; y<array[x].length; y++){
                for(int z=0; z<array[x][y].length; z++){
                    array[x][y][z]=coder();
            }
           }
        }
        print(array); //the original array
        System.out.println(); //next line
        
        //new empty array
        String array2[][][] = soRandom();
        
        //empty array becomes holoported array
        array2=holoport(array,array2);
        print(array2);
        
        Scanner scanr= new Scanner (System.in);
        System.out.println("Enter a code to search for");
        String input=scanr.next();
        System.out.println(sampling(array2, input));
        System.out.println(percentage(array, array2) + "%");
        //print(holoportedArray);
        print(frankeinstein(array2));
    }
    
    public static String[][][] soRandom(){
        int randomlength1=(int)(Math.random()*10);
        String[][][]sRandom= new String[randomlength1][][];
        int randomNum = 0;
        
        //create ragged 3D array
        for(int x=0; x<sRandom.length; x++){
             randomNum=(int)(Math.random()*10);
                sRandom[x]=new String[randomNum][];
            for(int y=0; y<sRandom[x].length; y++){
                randomNum=(int)(Math.random()*10);
                sRandom[x][y]=new String [randomNum];
            }
        }
        return sRandom;
    }
    //method print array when called
      public static void print( String[][][] sRandom){  
        for(int x=0; x<sRandom.length; x++){
            for(int y=0; y<sRandom[x].length; y++){
                System.out.print("["); 
                for(int z=0; z<sRandom[x][y].length; z++){
                System.out.print(sRandom[x][y][z] + ","); //separates elements
                }
                System.out.print("]");
                System.out.print("|");//separates second dimensions
                //System.out.println();
            }
             System.out.print("--");//separates outermost dimension
        }
      }
        
        
        
    //method creates codes to fill in 3d array
    public static String coder(){
        String temp="";
        String finalcode="";
        String type="";
        String code="";
        //perform twice for first to parts of code
        for(int x=0; x<2; x++){
            //generate random number
            int randomlength3=(int)(Math.random()*26);
            //if a certain number, then certain letter
            switch (randomlength3){
            case 0: type="A"; 
            break;
            case 1: type="B";
            break;
            case 2: type="C";
            break;
            case 3: type="D";
            break;
            case 4: type="E";
            break;
            case 5: type="F";
            break;
            case 6: type="G";
            break;
            case 7: type="H";
            break;
            case 8: type="I";
            break;
            case 9: type="J";
            break;
            case 10: type="K";
            break;
            case 11: type="L";
            break;
            case 12: type="M";
            break;
            case 13: type="N";
            break;
            case 14: type="O";
            break;
            case 15: type="P";
            break;
            case 16: type="Q";
            break;
            case 17: type="R";
            break;
            case 18: type="S";
            break;
            case 19: type="T";
            break;
            case 20: type="U";
            break;
            case 21: type="V";
            break;
            case 22: type="W";
            break;
            case 23: type="X";
            break;
            case 24: type="Y";
            break;
            case 25: type="Z";
            break;
            }
        code=code + type; //code for first two letters
        }
            //gnerate random numbers for last for parts of code
            int randomNum1=(int)(Math.random()*10);
            int randomNum2=(int)(Math.random()*10);
            int randomNum3=(int)(Math.random()*10);
            int randomNum4=(int)(Math.random()*10);
            //completed code
            code=code+randomNum1+randomNum2+randomNum3+randomNum4;
            //System.out.println(code);
            temp=code;
            return code;
        }
        /*
public static void check(){
    
            if(temp==code){
               return;
            }
            else{
                coder();
            }
        }
        */
        //method holoports original code to a new array 
public static String[][][] holoport(String[][][]array, String[][][]secondArray){
    //go through new array
    int x=0;
    while(x<secondArray.length){
    if(x<array.length){ //if x is less than the length of the old array then continue to copy code, if it is bigger that it fills it with dollar signs
    for(int y=0; y<secondArray[x].length; y++){
        if(y<array[x].length){//if y is less than the length of the old array then continue to copy code, if it is bigger that it fills it with dollar signs
        for(int z=0; z<secondArray[x][y].length; z++){
        if(z<array[x][y].length){//if z is less than the length of the old array then continue to copy code, if it is bigger that it fills it with dollar signs
                secondArray[x][y][z]=array[x][y][z]; //copy old array into new array
        }
        //if new array is longer than old array fill in elements with dollar signs
        else{
            secondArray[x][y][z]="$$$$$$";
         }
             }
        }
        //if new array is longer than old array fill in elements with dollar signs
        else{
            for(int z=0; z<secondArray[x][y].length; z++){
            secondArray[x][y][z]="$$$$$$";
            }
        }
            }
        }
        //if new array is longer than old array fill in elements with dollar signs
        else{ 
            for (int y=0; y<secondArray[x].length; y++){
            for(int z=0; z<secondArray[x][y].length; z++){
            secondArray[x][y][z]="$$$$$$";
                }
            }
        }
        x++;
    }
    return secondArray;
}
   
   
   
   //sampling method checks to see if user input code is found in the array
    public static String sampling(String[][][]array, String code ){ 
        int found=0;
        String foundAt="";
        for(int x=0; x<array.length; x++){
            for(int y=0; y< array[x].length; y++){
                for(int z=0; z< array[x][y].length; z++){
                    if(array[x][y][z].equals(code)){ //goes through array and if a part equals the user input 
                        found=1;
                        foundAt=("("+x+","+y+","+z + ")"); //iterations of where user input was found 
                    }
                }
            }
        }
        if(found<1){ //if user input is not found let user know
            foundAt="Code not found";
        }
        return foundAt;
   }
   
   
   //check percentage of array that was successfuly imported
   public static int percentage(String[][][]array, String[][][]array2){ 
   int originalLength=0;
    for(int x=0; x<array.length; x++){
        for(int y=0; y< array[x].length; y++){
            for(int z=0; z< array[x][y].length; z++){
                originalLength=originalLength+ 1; //gets amount of elements in original array
            }
        }
    }
    int totalEqual=0;
    int total=0;
    for(int x=0; x<array2.length; x++){
        for(int y=0; y< array2[x].length; y++){
            for(int z=0; z< array2[x][y].length; z++){
                total=total+1; //gets amount of elements in new/holoported array
                totalEqual=totalEqual+ 1; //gets number that was atually holoported from old array to new array
                    if(array2[x][y][z].equals("$$$$$$")){
                        totalEqual=totalEqual- 1;  
                }
            }
        }
    }
    int percentages= (totalEqual*100) / originalLength ; //percent holoported
    return percentages;
   }
   
   //method rearanges array
    public static String[][][] frankeinstein(String[][][]array){
        
        
    //rearange by length of array 
    for(int x=0; x<array.length - 1; x++){
        int min=array.length;
        int minx=x;
        for(int y= x+ 1; y< array.length; y++){
            if(min< array[y].length){
                min=array[y].length;
                minx=y;
            }
            if(minx != x){
                String [][] temp=array[minx];
                array[minx]=array[x];
                array[x]=temp;
            }    
        }
    }
    return array;
    }
    
    
    }
    