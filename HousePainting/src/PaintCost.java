import java.util.Scanner;
public class PaintCost {

	public static void main(String[] args) {
		/*
		 *This program will calculate the cost to paint a house 
		 */
		//insert scanner
		Scanner in = new Scanner (System.in);
		
		//House Dimensions
		double houseLengthFeet = 40;
		double houseLengthInches = 0;
		houseLengthFeet = houseLengthFeet + houseLengthInches/12;
		double houseWidthFeet = 15;
		double houseWidthInches = 0;
		houseWidthFeet = houseWidthFeet + houseWidthInches/12;
		double houseHeightFeet = 25;
		double houseHeightInches = 0;
		houseHeightFeet = houseHeightFeet + houseHeightInches/12;
		double houseSquareFoot = 2*(houseLengthFeet * houseWidthFeet)+ 2*(houseLengthFeet * houseWidthFeet + .5*(houseLengthFeet * (houseHeightFeet - houseWidthFeet))); 
		System.out.println("The amount in square feet to paint the house is " + houseSquareFoot);
		
		//Window Dimensions
		double windowLengthFeet = 4;
		double windowLengthInches = 0;
		windowLengthFeet = windowLengthFeet + windowLengthInches/12;
		double windowWidthFeet = 2;
		double windowWidthInches = 0;
		windowWidthFeet = windowWidthFeet + windowWidthInches/12;
		double windowSquareFoot = (windowLengthFeet * windowWidthFeet);
		System.out.println("The amount in square feet to paint one window is " + windowSquareFoot);
		double windowTotal = 10;
		System.out.println("The total number of windows are " + windowTotal);
		double tenWindowSquareFoot = (windowTotal * windowSquareFoot);
		System.out.println("The amount in square feet to paint 10 windows is " + tenWindowSquareFoot);
		
		//Doors Dimensions
		double doorLengthFeet = 6;
		double doorLengthInches = 0; 
		doorLengthFeet = doorLengthFeet + doorLengthInches/12;
		double doorWidthFeet = 3;
		double doorWidthInches = 0; 
		doorWidthFeet = doorWidthFeet + doorWidthInches/12;
		double doorSquareFoot = (doorLengthFeet * doorWidthFeet);
		System.out.println("The amount in square feet to paint one door is " + doorSquareFoot);
		double doorTotal = 2;
		System.out.println("The total number of doors are " + doorTotal);
		double twoDoorSquareFoot = (doorTotal * doorSquareFoot);
		System.out.println("The amount in square feet to paint two doors is " + twoDoorSquareFoot);
		
		//How much it cost per square foot
		double costPerSquareFoot = 5; 
		System.out.println("The cost of painting per square foot is $" + costPerSquareFoot);
		
		//Formulas
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
