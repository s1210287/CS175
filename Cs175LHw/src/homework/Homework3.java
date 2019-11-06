package homework;

import java.util.Scanner;

public class Homework3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
  
		//5.1
		System.out.print("Input a number: ");
		int number = in.nextInt();
  
		if(number>0)
		{
			System.out.println("number is positive");
		}
		else if(number<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
		//5.2
		System.out.print("Input a number: ");
		double num = in.nextDouble();
  
		if (num>0)
		{
			if (num<1)
			{
				System.out.println("Positive small");
			}
			else if (num > 1000000)
			{
				System.out.println("Positive large");
			}
			else
			{
				System.out.println("Positive");
			}
		}
		else if (num<0)
		{
			if (Math.abs(num)<1)
			{
				System.out.println("Negative small");
			}
			else if (Math.abs(num)>1000000)
			{
				System.out.println("Negative large");
			}
			else
			{
				System.out.println("Negative"); 
			}
		}
		else
		{
			System.out.println("Zero");
		}
		//5.3
		System.out.print("Input digit: " );
		long n = in.nextLong(); //long is used bc
		int numOfDigits = 0;
		{
		if (n<0) {
				n= n*(-1);
			}
			if (n>0 && n < 10) {
				numOfDigits = 1;
			}
			else if (n>= 10 && n < 100) {
				numOfDigits = 2;
			}
			else if (n >= 100 && n <1000) {
				numOfDigits = 3;
			}
			else if (n >= 1000 && n < 10000) {
				numOfDigits = 4;
			}
			else if (n>=10000 && n<100000) {
				numOfDigits = 5;
			}
			else if (n>=100000 && n<1000000) {
				numOfDigits = 6;
			}
			else if (n>=1000000 && n<10000000) {
				numOfDigits = 7;
			}
			else if (n>=10000000 && n<100000000) {
				numOfDigits = 8;
			}
			else if (n>=100000000 && n<1000000000) {
				numOfDigits =9;
			}
			else if (n>=1000000000 && n<10000000000l) {
				numOfDigits = 10;
 	}
	else {
 		System.out.println("Number is either greater than 10 billion or less than -10 billion and has more than 10 characters");
 	}
		System.out.println("Number of digits: " + numOfDigits);
		}
  
		//5.4
		System.out.println("Input first number: ");
        int x = in.nextInt();
        System.out.println("Input second number: ");
        int y = in.nextInt();
        System.out.println("Input third number: ");
        int z = in.nextInt();
        if (x == y && x == z)
        {
            System.out.println("All the same");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Neither");
        }
        else
        {
            System.out.println("All different");
        }
        //5.5
        System.out.print("Input first number: ");
        double a = in.nextDouble();
        System.out.print("Input second number: ");
        double b = in.nextDouble();
        System.out.print("Input third number: ");
        double c = in.nextDouble();
        
        if(a<b && b<c) {
         System.out.println("increasing");
        }
        else if(a>b && b>c) {
         System.out.println("decreasing");
        }
        else {
         System.out.println("Neither");
        }
        //5.6
        System.out.println("strict or lenient? ");
        String input = in.next().toLowerCase();
        System.out.println("Input first number: ");
        int m = in.nextInt();
        System.out.println("Input second number: ");
        int e = in.nextInt();
        System.out.println("Input third number: ");
        int l = in.nextInt();
        if (input.equals("strict")) {
            if (m < e && e < l) {
                System.out.println("Increasing");
            }
            else if (m > e && e > l) {
                System.out.println("Decreasing");
            }
            else {
                System.out.println("Neither");
            }
        }
        else if (input.equals("lenient")) {
            if ((m <= e && e < l) || (m < e && e <= l)) {
                System.out.println("Increasing");
            }
            else if ((m >= e && e > l) || (m > e && e >= l)) {
                System.out.println("Decreasing");
            }
            else if ((m == e) && (e == l)) {
                System.out.println("Increasing and decreasing");
            }
            else {
                System.out.println("Neither");
            }
        }
        //5.7
        
        System.out.println("Input first number: ");
        int t = in.nextInt();
        System.out.println("Input second number: ");
        int o = in.nextInt();
        System.out.println("Input third number: ");
        int p = in.nextInt();
        
        if ((t<=o && o<p) || (t<o && o<= p) || (t>=o && o>p) || (t>o && o >= p)) {
         System.out.println("In order");
        }
        else {
         System.out.println("Not in order");
        }
        //5.8
        
        System.out.println("Input first number: ");
        int i = in.nextInt();
        System.out.println("Input second number: ");
        int j = in.nextInt();
        System.out.println("Input third number: ");
        int k = in.nextInt();
        System.out.println("Input fourth number:");
        int q = in.nextInt();
        
        if ((i == j && k == q) || (i==k && j == q) || (i==q && j == k)) {
         System.out.println("Two Pairs");
        }
        else {
         System.out.println("Not two pairs");
        }
        //5.9
        System.out.println("Please enter an angle");
        double angle=in.nextDouble();
        if (angle>0 && angle<=22.5)
        {
        	System.out.println("Heading N");
        }
        else if(angle>22.5 && angle<67.5)
  		{
	  		System.out.println("Heading NE");
	  	}
        else if(angle>=67.5 && angle<=112.5)
        {
        	System.out.println("Heading E");
        }
        else if(angle>112.5 && angle<157.5)
        {
        	System.out.println("Heading SE");
        }
        else if(angle>=157.5 && angle<=202.5)
        {
        	System.out.println("Heading S");
        }
        else if(angle>202.5 && angle<247.5)
  		{
        	System.out.println("Heading SW");
  		}
        else if(angle>=247.5 && angle<=292.5)
        {
        	System.out.println("Heading W");
        }
        else if(angle>292.5 && angle<337.5)
        {
        	System.out.println("Heading NW");
        }
        else if(angle>=337.5 && angle<=360)
        {
        	System.out.println("Heading N");
        }
  		//5.10
        System.out.println("Input hourly wage: ");
        final double HOURLY_WAGE= in.nextDouble();
        System.out.println("Input hours worked this week: ");
        final double HOURS_WORKED = in.nextDouble();
  
        double normalPay = 0;
        double overtimePay = 0;
        double totalPay = 0;
  
        if(HOURS_WORKED > 40) {
        	normalPay = HOURS_WORKED *40;
        	overtimePay = (HOURS_WORKED - 40) * (HOURLY_WAGE*1.5);
        	totalPay = normalPay + overtimePay;
        }
        else {
        	totalPay = HOURLY_WAGE*HOURS_WORKED;
        }
  
        System.out.printf("You worked %5.2f hours and your normal rate of pay is %4.2f. ", HOURS_WORKED, HOURLY_WAGE);
        System.out.printf("Your overtime pay is %5.2f hours and your total paycheck is %4.2f. ", overtimePay, totalPay);
  		//5.11
  		System.out.println("Input 'c' for celsius or 'f' for fahrenheit temperature: ");
        String temperature = in.next().toLowerCase();
 
        System.out.println("Input the temperature in degrees in celsius: ");
        double cDegrees = in.nextDouble();
        System.out.println("input the temperature in degrees in fahrenheit: ");
        double fDegrees = in.nextDouble();
        
      if (temperature.equals("c")) {
       if(cDegrees >= 100){
        System.out.println("The water is gaseous");
        }
       else if(cDegrees > 0 && cDegrees <100) {
        System.out.println("The water is liquid");
            }
        else if(cDegrees <= 0) {
         System.out.println("The water is solid");
            }
      }
      else if (temperature.equals("f")) {
          if(fDegrees >= 212){
           System.out.println("The water is gaseous");
          }
          else if(fDegrees > 32 && fDegrees < 212) {
           System.out.println("The water is liquid");
          }
          else if(fDegrees <= 32){
           System.out.println("The water is solid");
          }
      }
  
  
	}
	}
