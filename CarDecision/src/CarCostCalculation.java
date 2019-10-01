import java.util.Scanner;
public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Regular Car
		//28000
		System.out.print("Enter cost of regular car: ");
		double CostOfRegularCar = in.nextDouble();
		//20
		System.out.print("Enter miles per gallon on regular car: ");
		double Mpgr = in.nextDouble();
		
		//Hybrid Car
		//31000
		System.out.print("Enter cost of hybrid car: ");
		double CostOfHybridCar = in.nextDouble();
		//30
		System.out.print("Enter miles per gallon on hybrid car: ");
		double Mpgh = in.nextDouble();
		
		//Other info
		//15000
		System.out.print("Enter miles traveled in a year: ");
		double MilesTraveledYear = in.nextDouble();
		//2.50
		System.out.print("Enter cost per gallon of gas: ");
		double CostPerGallonGas = in.nextDouble();
		
		//Equations 
		//1 year
		double CostOwnRegularCar = ((MilesTraveledYear/Mpgr)*CostPerGallonGas+CostOfRegularCar);
		System.out.println("The cost to own a regular car for one year is " + CostOwnRegularCar);
		double CostOwnHybridCar = ((MilesTraveledYear/Mpgh)*CostPerGallonGas+CostOfHybridCar);
		System.out.println("The cost to own a hybrid car for one year is " + CostOwnHybridCar);
		
		//2 years
		double CostOwnRegularCar2 = CostOwnRegularCar + ((MilesTraveledYear/Mpgr)*CostPerGallonGas);
		System.out.println("The cost to own a regular car for two years is " + CostOwnRegularCar2);
		double CostOwnHybridCar2 = CostOwnHybridCar + ((MilesTraveledYear/Mpgh)*CostPerGallonGas);
		System.out.println("The cost to own a hybrid car for two years is " + CostOwnHybridCar2);
		//3 years
		double CostOwnRegularCar3 = CostOwnRegularCar2 + ((MilesTraveledYear/Mpgr)*CostPerGallonGas);
		System.out.println("The cost to own a regular car for three years is " + CostOwnRegularCar3);
		double CostOwnHybridCar3 = CostOwnHybridCar2 + ((MilesTraveledYear/Mpgh)*CostPerGallonGas);
		System.out.println("The cost to own a hybrid car for three years is " + CostOwnHybridCar3);
		//4 years
		double CostOwnRegularCar4 = CostOwnRegularCar3 + ((MilesTraveledYear/Mpgr)*CostPerGallonGas);
		System.out.println("The cost to own a regular car for four years is " + CostOwnRegularCar4);
		double CostOwnHybridCar4 = CostOwnHybridCar3 + ((MilesTraveledYear/Mpgh)*CostPerGallonGas);
		System.out.println("The cost to own a hybrid car for four years is " + CostOwnHybridCar4);
		//5 years
		double CostOwnRegularCar5 = CostOwnRegularCar4 + ((MilesTraveledYear/Mpgr)*CostPerGallonGas);
		System.out.println("The cost to own a regular car for five years is " + CostOwnRegularCar5);
		double CostOwnHybridCar5 = CostOwnHybridCar4 + ((MilesTraveledYear/Mpgh)*CostPerGallonGas);
		System.out.println("The cost to own a hybrid car for five years is " + CostOwnHybridCar5);
		
		double CostHybridCar5y = 37250;
		double CostRegularCar5y = 37375;
		if (CostHybridCar5y>CostRegularCar5y) {System.out.println("CostHybridCar5y is greater than CostRegularCar5y after 5 years");}
		else if (CostHybridCar5y<CostRegularCar5y) {System.out.println("CostHybridCar5y is less than or CostHybridCar5y is equal to CostRegularCar5y after 5 years");}
		else {System.out.println("CostHybridCar5y is equal to CostRegularCar5y after 5 years");}
	}

}