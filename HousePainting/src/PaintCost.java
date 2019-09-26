import java.util.Scanner;
public class PaintCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter length of house in whole feet: ");
		double houseLengthFeet = in.nextDouble();
		//houseLengthFeet = 40;
		//double houseLengthInches = 0;
		System.out.print("Enter inches of house in inches/feet: ");
		double houseLengthInches = in.nextDouble();
		houseLengthFeet = houseLengthFeet + houseLengthInches/12;
		//double houseWidthFeet = 15;
		//double houseWidthInches = 0;
		System.out.print("Enter width of house in whole feet: ");
		double houseWidthFeet = in.nextDouble();
		System.out.print("Enter width of house in inches/feet: ");
		double houseWidthInches = in.nextDouble();
		houseWidthFeet = houseWidthFeet + houseWidthInches/12;
		//double houseHeightFeet = 25;
		//double houseHeightInches = 0;
		System.out.print("Enter height of house in whole feet: ");
		double houseHeightFeet = in.nextDouble();
		System.out.print("Enter height of house in inches/feet: ");
		double houseHeightInches = in.nextDouble();
		
		//Window Dimensions
		//double windowLengthFeet = 4;
		//double windowLengthInches = 0;
		System.out.print("Enter length of windows in whole feet: ");
		double windowLengthFeet = in.nextDouble();
		System.out.print("Enter length of windows in inches/feet: ");
		double windowLengthInches = in.nextDouble();
		windowLengthFeet = windowLengthFeet + windowLengthInches/12;
		//double windowWidthFeet = 2;
		//double windowWidthInches = 0;
		System.out.print("Enter width of windows in whole feet: ");
		double windowWidthFeet = in.nextDouble();
		System.out.print("Enter width of windows in inches/feet: ");
		double windowWidthInches = in.nextDouble();
		windowWidthFeet = windowWidthFeet + windowWidthInches/12;
		double windowSquareFoot = (windowLengthFeet * windowWidthFeet);
		System.out.println("The amount in square feet to paint one window is " + windowSquareFoot);
		//double windowTotal = 10;
		System.out.print("Enter number of windows: ");
		double windowTotal = in.nextDouble();
		//System.out.println("The total number of windows are " + windowTotal);
		double tenWindowSquareFoot = (windowTotal * windowSquareFoot);
		System.out.println("The amount in square feet to paint 10 windows is " + tenWindowSquareFoot);
		
		//Doors Dimensions
		//double doorLengthFeet = 6;
		//double doorLengthInches = 0; 
		System.out.println("Enter length of doors in whole feet: ");
		double doorLengthFeet = in.nextDouble();
		System.out.println("Enter length of doors in whole inches/feet: ");
		double doorLengthInches = in.nextDouble();
		doorLengthFeet = doorLengthFeet + doorLengthInches/12;
		//double doorWidthFeet = 3;
		//double doorWidthInches = 0; 
		System.out.println("Enter width of doors in whole feet: ");
		double doorWidthFeet = in.nextDouble();
		System.out.println("Enter width of doors in whole inches/feet: ");
		double doorWidthInches = in.nextDouble();
		doorWidthFeet = doorWidthFeet + doorWidthInches/12;
		double doorSquareFoot = (doorLengthFeet * doorWidthFeet);
		System.out.println("The amount in square feet to paint one door is " + doorSquareFoot);
		//double doorTotal = 2;
		System.out.print("Enter number of doors: ");
		double doorTotal = in.nextDouble();
		double twoDoorSquareFoot = (doorTotal * doorSquareFoot);
		System.out.println("The amount in square feet to paint two doors is " + twoDoorSquareFoot);
		
		//How much it cost per square foot
		//double costPerSquareFoot = 5; 
		//System.out.println("The cost of painting per square foot is $" + costPerSquareFoot);
		System.out.println("Enter cost per square foot to paint: "); 
		double costPerSquareFoot = in.nextDouble();

		
		//Formulas 
		houseHeightFeet = houseHeightFeet + houseHeightInches/12;
		double houseSquareFoot = 2*(houseLengthFeet * houseWidthFeet)+ 2*(houseLengthFeet * houseWidthFeet + .5*(houseLengthFeet * (houseHeightFeet - houseWidthFeet))); 
		System.out.println("The amount in square feet to paint the house is " + houseSquareFoot);
		double costToPaintHouse = (costPerSquareFoot * houseSquareFoot);
		System.out.println("The cost to paint the house before subtracting the windows and doors cost are " + costToPaintHouse);
		double costToPaintWindow = (costPerSquareFoot * tenWindowSquareFoot); 
		System.out.println("The cost to paint the ten windows is " + costToPaintWindow);
		double costToPaintDoor = (costPerSquareFoot * twoDoorSquareFoot);
		System.out.println("The cost to paint two doors is " + costToPaintDoor);
		double costToPaintHouseA = (costToPaintHouse - costToPaintWindow - costToPaintDoor);
		System.out.println("The cost to paint the house after subtracting the windows and doors cost are " + costToPaintHouseA);
		
	}

}