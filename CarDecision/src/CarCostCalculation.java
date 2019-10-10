import java.util.Scanner;
public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String stickerHybrid = "Make:Toyota, Model:Prius, Cost:31000, MPG:30";
		String stickerRegular = "Make:Toyota, Model:Corolla, Cost:28000, MPG:20";
		
		String [] stuff = stickerHybrid.split(",");
		
		String [] hMake = stuff[0].split(":");
		
		String [] hModel = stuff[1].split(":");
		
		String [] cost = stuff[2].split(":");
		
		String [] mpg = stuff[3].split(":");
		
		String [] stuff2 = stickerRegular.split(",");
		
		String [] cost2 = stuff2[2].split(":");
		
		String [] mpg2 = stuff2[3].split(":");
		
		String [] rMake = stuff2[0].split(":");
		
		String [] rModel = stuff2[1].split(":");
		
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
		System.out.print("Cost to own a " + rMake[1] + " " + rModel[1] + " after year one: " + CostOwnRegularCar);
		double CostOwnHybridCar = ((MilesTraveledYear/hybridMpg)*CostPerGallonGas+hybridCost);
		System.out.println(" for " + hMake[1] + " " + hModel[1] + " is: "  + CostOwnHybridCar);
		
		//2 years
		double CostOwnRegularCar2 = CostOwnRegularCar + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.print("Cost to own a " +rMake[1] + " " + rModel[1] + " after year two: " + CostOwnRegularCar2);
		double CostOwnHybridCar2 = CostOwnHybridCar + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println(" for " +hMake[1] + " " + hModel[1] + " is: " + CostOwnHybridCar2);
		//3 years
		double CostOwnRegularCar3 = CostOwnRegularCar2 + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.print("Cost to own a " + rMake[1] + " " +rModel[1] + " after year three: " + CostOwnRegularCar3);
		double CostOwnHybridCar3 = CostOwnHybridCar2 + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println(" for " + hMake[1] + " " + hModel[1] + " is: " + CostOwnHybridCar3);
		//4 years
		double CostOwnRegularCar4 = CostOwnRegularCar3 + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.print("Cost to own a " + rMake[1] + " " + rModel[1] + " after year four: " + CostOwnRegularCar4);
		double CostOwnHybridCar4 = CostOwnHybridCar3 + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println(" for " + hMake[1] + " " + hModel[1] + " is: " + CostOwnHybridCar4);
		//5 years
		double CostOwnRegularCar5 = CostOwnRegularCar4 + ((MilesTraveledYear/regularMpg)*CostPerGallonGas);
		System.out.print("Cost to own a " + rMake[1] + " " + rModel[1] + " after year five: " + CostOwnRegularCar5);
		double CostOwnHybridCar5 = CostOwnHybridCar4 + ((MilesTraveledYear/hybridMpg)*CostPerGallonGas);
		System.out.println(" for " + hMake[1] + " " + hModel[1] + " is " + CostOwnHybridCar5);
		
		double CostHybridCar5y = 37250;
		double CostRegularCar5y = 37375;
		if (CostHybridCar5y>CostRegularCar5y) {System.out.println(hMake[1] + " " + hModel[1] + " does not pay back after 5 years");}
		else if (CostHybridCar5y<CostRegularCar5y) {System.out.println(hMake[1] + " " + hModel[1] + " pays back after 5 years");}
		else {System.out.println(hMake[1] + " " + hModel[1] + " is equal to " +rMake[1] + " " + rModel[1] + " after 5 years");}
		

	}

}