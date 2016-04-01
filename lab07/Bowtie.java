/*Darcy Marmolejos
CSE002
03/11/2016
Lab 07
Bowtie Program
This program will be able to */
public class Bowtie{
    public static void main(String[]args){
        int nStars=9;
        int count=0;
        String stars= "";
        int nLine = nStars;
        int countLine = 0;
        int nSpace = 0;
        int countSpace = 0;
        
    while(countLine<nLine){  
        while (nStars>0){
        while(countSpace<nSpace){
            System.out.print(" ");
            countSpace++;
        }
        
        while (count<nStars){
            if (count==nStars){
                count=0;
                break;
            } 
                stars="*"+stars;
                count++;
        }
        System.out.println(stars);
       stars=""; 
       nStars=nStars-2;
        nSpace++;
        countSpace = 0;
        count = 0;
        
    }
    countLine++;
    }
    nStars=9;
    count=0;
    stars= "";
    nLine = nStars;
    countSpace = 0;
    nSpace = nStars/2;
    countSpace = 0;
 
    while(nLine>0){  
        while (countStars<nStars{
        while(countSpace<nSpace){
            System.out.print(" ");
            countSpace++;
        }
        
        while (count<nStars){
            if (count==nStars){
                count=0;
                break;
            } 
                stars="*"+stars;
                count++;
        }
        System.out.println(stars);
       stars=""; 
       nStars=nStars-2;
        nSpace++;
        countSpace = 0;
        count = 0;
        
    }
    countLine++;
    }
   
        

}
}