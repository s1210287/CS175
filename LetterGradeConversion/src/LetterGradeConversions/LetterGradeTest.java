package LetterGradeConversions;

import java.util.Scanner;

import java.io.*;

public class LetterGradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		{
		String grade;
		double loop = 0;
		double numericValue = 5;
		
		while (loop == 0) {
			System.out.println("Enter a letter grade or 'Q' to quit the program: ");
			grade = in.next();
		
		if (grade.contentEquals("Q"))
			loop =2;
		
		if (loop == 2)
			break;
		
		if (grade.contentEquals("A+") || grade.contentEquals("A"))
		{
		numericValue = 4.0;
		}
		else if (grade.contentEquals("A-"))
		{
		numericValue = 3.7;
		}
		else if (grade.contentEquals("B+"))
		{
		numericValue = 3.3;
		}
		else if (grade.contentEquals("B"))
		{
		numericValue = 3.0;
		}
		else if (grade.contentEquals("B-"))
		{
		numericValue = 2.7;
		}
		else if (grade.contentEquals("C+"))
		{
		numericValue = 2.3;
		}
		else if (grade.contentEquals("C"))
		{
		numericValue = 2.0;
		}
		else if (grade.contentEquals("C-"))
		{
		numericValue = 1.7;
		}
		else if (grade.contentEquals("D+"))
		{
		numericValue = 1.3;
		}
		else if (grade.contentEquals("D"))
		{
		numericValue = 1.0;
		}
		else if (grade.contentEquals("F"))
		{
		numericValue = 5;
		}
		System.out.println(numericValue);
		System.out.println(" ");
		}
	}
			
	}
}



