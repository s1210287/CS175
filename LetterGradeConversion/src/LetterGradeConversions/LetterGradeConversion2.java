package LetterGradeConversions;

import java.util.Scanner;
import java.util.*;

public class LetterGradeConversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner out = new Scanner(System.in);
		double numericValue = 0.0;
		double gpa = 0.0;
		double gradePoints = 0.0;
		double numberGrade = 0.0;
		int creditHours=0; 
		String course = null; 
		System.out.print("Enter course info separated by commas(title, credit hours, a letter grade(followed by + or - if applicable), or Q to quit : ");
		
		while (out.hasNext()) {
			course = out.next();
			if(course.equals("Q")) {
				break;
			}
			
		String [] data = course.split(",");
		String info = data[0];
		int hours = Integer.parseInt(data[1]);
		String grade = data[2];
		
		if (grade.equals("A+") || grade.equals("A"))
		{
		numericValue = 4.0;
		}
		else if (grade.equals("A-"))
		{
		numericValue = 3.7;
		}
		else if (grade.equals("B+"))
		{
		numericValue = 3.3;
		}
		else if (grade.equals("B"))
		{
		numericValue = 3.0;
		}
		else if (grade.equals("B-"))
		{
		numericValue = 2.7;
		}
		else if (grade.equals("C+"))
		{
		numericValue = 2.3;
		}
		else if (grade.equals("C"))
		{
		numericValue = 2.0;
		}
		else if (grade.equals("C-"))
		{
		numericValue = 1.7;
		}
		else if (grade.equals("D+"))
		{
		numericValue = 1.3;
		}
		else if (grade.equals("D"))
		{
		numericValue = 1.0;
		}
		else if (grade.equals("D-"))
		{
		numericValue = 0.7;
		}
		else if (grade.equals("F") || grade.equals("WF"))
		{
		numericValue = 0.0;
		}
		else if (grade.equals("P") || grade.equals("NP") || grade.equals("I")) 
		{
		hours = 0;
		}
		else 
		{
		System.out.println("Invalid letter grade, enter a different value: ");
		}
		gradePoints += (numericValue*hours);
		creditHours += hours;
		numberGrade += numericValue;
		gpa = gradePoints/creditHours;
		System.out.print("\nEnter course info separated by commas(title, credit hours, a letter grade(followed by + or - if applicable), or Q to quit : ");
		
		}
		System.out.print("Your gpa is: " + gpa);
		
	}
    
	
	
	
	}
	


