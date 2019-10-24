package groceryDiscount;

import java.util.Scanner;

public class groceryDiscountVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double total = 0;
		int count = 0;
		//System.out.print("Enter amount of 'E' to end:");
		System.out.print("Enter grocery amount, any other response to end:");
		while (in.hasNextDouble())
		{
			double input = in.nextDouble();
			System.out.print("Enter amount:");
			if(input>=10 && input <=1000)
			{
				System.out.print("Enter grocery amount, any other response to end: ");
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
				
			
				
		
		}
	}

}
