package java_basics_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_PossibleTriangles {
	
	private static double findLongestSide(double a, double b, double c) {
		return Math.max(Math.max(a, b),  c);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String[]> inputStrings = new ArrayList();
		ArrayList<Double[]> input = new ArrayList();
		String inputLine = null;
		
		boolean foundResult = false;
		
		while (true) {
			inputLine = scanner.nextLine();
			if (inputLine.equals("End")) {
				break;
			}
			inputStrings.add(inputLine.split(" "));
		}
		
		for (int i = 0; i < inputStrings.size(); i++) {
			Double[] tempArray = new Double[3];
			for (int j = 0; j < inputStrings.get(i).length; j++) {
				tempArray[j] = Double.parseDouble(inputStrings.get(i)[j]);
			}
			input.add(tempArray);
		}
		
		for (Double[] line : input) {
			if (line[0] == findLongestSide(line[0], line[1], line[2])) {
				if (line[1] + line[2] > line[0]) {
					foundResult = true;
					System.out.printf("%.2f+%.2f>%.2f%n", Math.min(line[1], line[2]), Math.max(line[1], line[2]), line[0]);
				}
			} else if (line[1] == findLongestSide(line[0], line[1], line[2])) {
				if (line[0] + line[2] > line[1]) {
					foundResult = true;
					System.out.printf("%.2f+%.2f>%.2f%n", Math.min(line[0], line[2]), Math.max(line[0], line[2]), line[1]);
				}
			} else if (line[2] == findLongestSide(line[0], line[1], line[2])) {
				if (line[0] + line[1] > line[2]) {
					foundResult = true;
					System.out.printf("%.2f+%.2f>%.2f%n", Math.min(line[0], line[1]), Math.max(line[0], line[1]), line[2]);
				}
			}
		}
		
		if (!foundResult) {
			System.out.println("No");
		}
	}
}