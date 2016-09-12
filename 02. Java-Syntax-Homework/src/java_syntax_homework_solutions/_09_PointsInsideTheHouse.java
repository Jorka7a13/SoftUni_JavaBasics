package java_syntax_homework_solutions;

import java.util.Scanner;

public class _09_PointsInsideTheHouse {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter point coordinates: ");
		double X = Double.parseDouble(scanner.next());
		double Y = Double.parseDouble(scanner.next());
		
		boolean isInsideTriangle = false, isInsideSquare = false, isInsideRect = false;
		
		double AX = 12.5, AY = 8.5;
		double BX = 22.5, BY = 8.5;
		double CX = 17.5, CY = 3.5;
		
		double firstSign = (BX - AX) * (Y - AY) - (BY - AY) * (X - AX);
		double secondSign = (CX - BX) * (Y - BY) - (CY - BY) * (X - BX); 
		double thirdSign = (AX - CX) * (Y - CY) - (AY - CY) * (X - CX);
		
		if (firstSign <= 0 && secondSign <= 0 && thirdSign <= 0) {
			isInsideTriangle = true;
		} 
		
		if (X >= 12.5 && X <= 17.5 && Y >= 8.5 && Y <= 13.5) {
			isInsideSquare = true;
		}
		
		if (X >= 20 && X <= 22.5 && Y >= 8.5 && Y <= 13.5) {
			isInsideRect = true;
		}
		
		if (isInsideTriangle || isInsideSquare || isInsideRect) {
			System.out.print("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}