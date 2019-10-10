import java.util.Scanner;
public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String stickerHybrid = "Make:Toyota, Model:Prius, Cost:31000, MPG:30";
		String stickerRegular = "Make:Toyota, Model:Corolla, Cost:28000, MPG:20";
		
		String [] stuff = stickerHybrid.split(",");
		
		String [] cost = stuff[2].split(":");
		System.out.println(cost[1]);
		
		String [] mpg = stuff[3].split(":");
		System.out.println(mpg[1]);
		
		String [] stuff2 = stickerRegular.split(",");
		
		String [] cost2 = stuff2[2].split(":");
		System.out.println(cost2[1]);
		
		String [] mpg2 = stuff2[3].split(":");
		System.out.println(mpg2[1]);
		
		double hybridCost = Integer.parseInt(cost[1]);
		
		double hybridMpg = Integer.parseInt(mpg[1]);
		
		double regularCost = Integer.parseInt(cost2[1]);
		
		double regularMpg = Integer.parseInt(mpg2[1]);
		
		//Other info
		//15000
		System.out.print("Enter miles traveled in a year: ");
		double MilesTraveledYear = in.nextDouble();
		//2.50
		System.out.print("Enter cost per gallon of gas: ");
		double CostPerGallonGas = in.nextDouble();
		
		//Equations 
		//1 year
		double CostOwnRegularCar = ((MilesTraveledYear/regularMpg)*CostPerGallonGas+regularCost);
		System.out.println("The cost to own a Toyota Corolla after one year is " + CostOwnRegularCar);
		double CostOwnHybridCar = ((MilesTraveledYear/hybridMpg)*CostPerGallonGas+hybridCost);
		System.out.println("The cost to own a Toyota Prius after one year is " + CostOwnHybridCar);
		
		//2 years
		double CostOwnRegularCar2 = CostOwnRegularCar + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Corolla after two years is " + CostOwnRegularCar2);
		double CostOwnHybridCar2 = CostOwnHybridCar + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Prius after two years is " + CostOwnHybridCar2);
		//3 years
		double CostOwnRegularCar3 = CostOwnRegularCar2 + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Corolla after three years is " + CostOwnRegularCar3);
		double CostOwnHybridCar3 = CostOwnHybridCar2 + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Prius after three years is " + CostOwnHybridCar3);
		//4 years
		double CostOwnRegularCar4 = CostOwnRegularCar3 + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Corolla after four years is " + CostOwnRegularCar4);
		double CostOwnHybridCar4 = CostOwnHybridCar3 + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Prius after four years is " + CostOwnHybridCar4);
		//5 years
		double CostOwnRegularCar5 = CostOwnRegularCar4 + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Corolla after five years is " + CostOwnRegularCar5);
		double CostOwnHybridCar5 = CostOwnHybridCar4 + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println("The cost to own a Toyota Prius after five years is " + CostOwnHybridCar5);
		
		double CostHybridCar5y = 37250;
		double CostRegularCar5y = 37375;
		if (CostHybridCar5y>CostRegularCar5y) {System.out.println("Toyota Prius does not pay back after 5 years");}
		else if (CostHybridCar5y<CostRegularCar5y) {System.out.println("Toyota Prius pays back after 5 years");}
		else {System.out.println("Toyota Prius is equal to Toyota Corolla after 5 years");}
		

	}

}