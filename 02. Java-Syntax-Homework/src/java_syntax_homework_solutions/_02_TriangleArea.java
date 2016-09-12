package java_syntax_homework_solutions;

import java.util.Scanner;

public class _02_TriangleArea {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the first point: ");
		int aX = Integer.parseInt(scanner.next());
		int aY = Integer.parseInt(scanner.next());
		System.out.print("Please enter the second point: ");
		int bX = Integer.parseInt(scanner.next());
		int bY = Integer.parseInt(scanner.next());
		System.out.print("Please enter the third point: ");
		int cX = Integer.parseInt(scanner.next());
		int cY = Integer.parseInt(scanner.next());
		
		int area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))/2;
		
		System.out.println(area > 1 ? area : -area); 
	}
}