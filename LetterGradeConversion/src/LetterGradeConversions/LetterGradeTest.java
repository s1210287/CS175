package LetterGradeConversions;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class LetterGradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String english1 = "Make:Toyota, Model:Prius, Cost:31000, MPG:30";
		String nutrition = "CreditHours:3, Grade:A, GradePoints:4";
		String fYS = "CreditHours:#, Grade: , GradePoints: ";
		String it = "CreditHours:#, Grade: , GradePoints: ";
		String westCiv = "CreditHours:#, Grade: , GradePoints: ";
		String english2 = "CreditHours:#, Grade: , GradePoints: ";
		String psychology = "CreditHours:#, Grade: , GradePoints: ";
		String anthropology = "CreditHours:#, Grade: , GradePoints: ";
		String mathSS = "CreditHours:#, Grade: , GradePoints: ";
		String preCalc = "CreditHours:#, Grade: , GradePoints: ";
		String discreteM = "CreditHours:#, Grade: , GradePoints: ";
		String introCS = "CreditHours:#, Grade: , GradePoints: ";
		String CS = "CreditHours:#, Grade: , GradePoints: ";
		String CSL = "CreditHours:#, Grade: , GradePoints: ";
		
		String [] english01 = english1.split(",");
		
		String [] nutritionn = nutrition.split(",");
		
		String [] fYSS = fYS.split(",");
		
		String [] itt = it.split(",");
		
		String [] westCivv = westCiv.split(",");
		
		String [] english03 = english2.split(",");
		
		String [] psychologyy =psychology.split(",");
		
		String [] anthropologyy = anthropology.split(",");
		
		String [] mathSSS = mathSS.split(",");
		
		String [] preCalcc = preCalc.split(",");
		
		String [] discretee = discreteM.split(",");
		
		String [] introCSS = introCS.split(",");
		
		String [] CSS = CS.split(",");
		
		String [] CSLL = CSL.split(",");
		
		
		String crouse = "English";
		int cred = 3;
		String grade = "B+";
		ArrayList<String>courses = new ArrayList<String>();
		courses.add(courses+","+cred+","+grade);
		courses.add(courses+","+cred+","+grade);
		for(String element:courses) {
			System.out.println(element);
		}
		
		
		//course
		//credit hours
		//grade
		//grade points
		
		
		
			
	}
}



