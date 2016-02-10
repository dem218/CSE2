/*Darcy Marmolejos
02/08/2016
CSE2
homework02
Arithmetic Program
Program will be able to calculate the cost of a purchase, included is the Pennsylvania sales 
tax. It will be able to print the cost and sales tax for 
each item, the final total cost without sales tax, the total sales tax, and the
final total cost with the sales tax.*/

//Define class
public class Arithmetic {
    //Main method
    public static void main (String[] args) {
        // Input Variables
        int numPants=3; //The number of pants purchased
        double pantPrice=34.98; //The price of one pair of pants
        
        int numShirts=2; //The number of shirts purchased
        double shirtPrice=24.99; //The price of one shirt
        
        int numBelts=1; //The number of belts purchased
        double beltPrice=33.99;//The pice of one belt
        
        double paSalesTax=0.06;// Sales Tax in PA
        
        double totalCostOfPants,totalCostOfShirts, totalCostOfBelts, totalTaxOfPants, 
        totalTaxOfShirts, totalTaxOfBelts,totalCostOfPurchase,costOfPurchasesWithoutTax,
        totalSalesTax,costOfPurchaceWithTax; //Declares variables as doubles
        
        //Calculate total cost of each item
        totalCostOfPants=((double)numPants)*pantPrice; //The total cost of pants
        totalCostOfShirts=((double)numShirts)*shirtPrice; //The total cost of shirts
        totalCostOfBelts=((double)numBelts)*beltPrice; //The total cost of belts
        
        //print the total cost of each item
        System.out.println("The total cost of pants is $"+totalCostOfPants);
        System.out.println("The total cost of shirts is $"+totalCostOfShirts);
        System.out.println("The total cost of Belts is $"+totalCostOfBelts);
        
        //Calaculate the total tax of all of each item bought
        totalTaxOfPants=((int)(100*(totalCostOfPants*paSalesTax)))/100.0; //The total tax on pants purchased
        totalTaxOfShirts=((int)(100*(totalCostOfShirts*paSalesTax)))/100.0; //The total tax on shirts purchased
        totalTaxOfBelts=((int)(100*(totalCostOfBelts*paSalesTax)))/100.0; //the total tax on belts purchased
        
        
        //print output data: the total tax of all of each item bought
        System.out.println("The total tax of the pants is $"+totalTaxOfPants);
        System.out.println("The total tax of the shirts is $"+totalTaxOfShirts);
        System.out.println("The total tax of the belts is $"+totalTaxOfBelts);
        
        //Calculate total cost of purchase, not including sales tax
        costOfPurchasesWithoutTax=totalCostOfPants+totalCostOfShirts+totalCostOfBelts;
        
        //print output data: the total cost of purchase without tax
        System.out.println("The total cost of the purchase without tax included is $"+costOfPurchasesWithoutTax);
        
        //Calculate the total sales tax
        totalSalesTax=totalTaxOfPants+totalTaxOfShirts+totalTaxOfBelts;
        
        //Print output data: the total sales tax for all of the purchases
        System.out.println("The total sales tax is $"+totalSalesTax);
        
        //the total cost of purchase, including sales tax
        costOfPurchaceWithTax=((int)(100*(totalCostOfPants+totalTaxOfPants+totalCostOfShirts+totalTaxOfShirts+
        totalCostOfBelts+totalTaxOfBelts)))/100.0;
    
        //print output data: the final total cost of purchase (with tax)
        System.out.println("The total cost of purchase with tax is $"+ costOfPurchaceWithTax);
        
        
        
        
        
        
        
    }//End of Main Method
} //End of class
