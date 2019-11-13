package groceryDiscount;

import java.text.NumberFormat;
import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
			int continueProgram = 1;
			while(continueProgram==1) { 
			
			System.out.print("Please enter the cost of groceries or '0' to quit: ");
			int moneySpent = in.nextInt();
			
			if(moneySpent == 0.0)
			{
			break;
			}
			else if (moneySpent < 10.0)
			{
				System.out.println("You are not eligible for a coupon this time.");
				}
			else if (moneySpent <= 60.0) 
			{
				double discount = .08;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount) + ".(" + "8% of your purchase)");
			}
			else if (moneySpent <= 150.0)
			{
				double discount = .10;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount)+ ".(" + "10% of your purchase)");  
			}
			else if (moneySpent <= 210.0)
			{
				double discount = .12;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount) + ".(" + "12% of your purchase)");
			}
			else if (210.0 < moneySpent)
			{
				double discount = .14;
				System.out.println("You win a discount coupon of: " + formatter.format(moneySpent*discount) + ".(" + "14% of your purchase)");
				
			
			}


		}


	}
}

