
public class PaintCost {

	public static void main(String[] args) {
		/*
		 *This program will calculate the cost to paint a house 
		 */
		//insert scanner
		
	import java.util.Scanner;
		
		
		Scanner in = new Scanner(System.in);
	

		int houseLengthFeet = 20;
		double houseLengthInches = 6;
		System.out.println(houseLengthFeet + houseLengthInches/12);
		double number = 18.333333333333332;
		double rounded = Math.round(number);
		int houseWidthFeet = 18;
		double houseWidthInches = 4;
		System.out.println(houseWidthFeet + houseWidthInches/12);
	
		
		int houseHeightFeet = 22;
		double houseHeightInches = 8;
		System.out.println(houseHeightFeet + houseHeightInches/12);
		int windowLengthFeet = 2;
		double windowLengthInches = 2;
		System.out.println(windowLengthFeet + windowLengthInches/12);
		int windowWidthFeet = 2;
		double windowWidthInches = 3;
		System.out.println(windowWidthFeet + windowWidthInches/12);
		
		System.out.print("Please enter the number of windows: ");
		int windows = in.nextInt(4);
		
		int doorLengthFeet = 4;
		double doorLengthInches = 2; 
		System.out.println(doorLengthFeet + doorLengthInches/12);
		int doorWidthFeet = 5;
		double doorWidthInches = 2;
		
		int doorNumber = 2;
		
		//example
		int houseFeet=20;
		double inches = 6;
		System.out.println(houseLengthFeet + inches/12);
		

	}

}
