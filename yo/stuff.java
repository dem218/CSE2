




public class stuff{ 
    public static void main(String[]args){
        int num=9;
        int countSpace=0;
        int b=0;
        int space=num-1;
        while (b<9){
            while(countSpace<space){
                System.out.print(" ");
                countSpace++;
            }
            countSpace=0;
            
            System.out.print(num);
            System.out.println();
            space--;
            num--;
            b++;
            
        }
    }
}