package groceryDiscount;

import java.text.NumberFormat;
import java.util.Scanner;

public class groceryDiscountVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.print("Enter grocery amount, any other response to end: ");
		while (in.hasNextDouble())
		{
			double moneySpent = in.nextDouble();
			
			if(moneySpent>=10 && moneySpent <=1000)
				
			{
			if (moneySpent <= 60.0) 
				{
				double discount = .08;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount) + ".(" + "8% of your purchase)");
				}
			else if (moneySpent <= 150)
				{
				double discount = .10;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount)+ ".(" + "10% of your purchase)");  
				}
			else if (moneySpent <= 210)
				{
				double discount = .12;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount) + ".(" + "12% of your purchase)");
				}
			else if (210 < moneySpent)
				{
				double discount = .14;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount) + ".(" + "14% of your purchase)");
				
				} 
		
			}
			else {System.out.println("Amount too high or too low please re enter: ");}
			System.out.print("Enter grocery amount, any other response to end: ");
			} 
		
		}
}




	




	
		
			
		
	

		
	

	

	
		
	
	

			
			//{total = total + input;
			//count++;}
			
				//System.out.println(input);
			//}
			//total = total + input;
			//count++;
			
			
			//System.out.println("Total: "+total+ "Average: "+average);
			//System.out.print("Enter grocery amount, any other response to end:");
			//while (in.hasNextDouble())
				
			
				
		
		
		

	
