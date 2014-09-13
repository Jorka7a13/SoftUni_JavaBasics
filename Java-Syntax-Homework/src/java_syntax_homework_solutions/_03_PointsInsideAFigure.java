package java_syntax_homework_solutions;

import java.util.Scanner;

public class _03_PointsInsideAFigure {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isInside = false;
		
		System.out.print("Please enter the point coordinates: ");
		double pointX = Double.parseDouble(scanner.next());
		double pointY = Double.parseDouble(scanner.next());
		
		if (pointX >= 12.5 && pointX <= 17.5 && pointY >= 8.5 && pointY <= 13.5) {
			isInside = true;
		} else if (pointX >= 12.5 && pointX <= 22.5 && pointY >= 6 && pointY <= 8.5) {
			isInside = true;
		} else if (pointX >= 20 && pointX <= 22.5 && pointY >= 8.5 && pointY <= 13.5) {
			isInside = true;
		}
		
		if (isInside) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}