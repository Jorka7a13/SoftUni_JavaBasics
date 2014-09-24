package java_loops_methods_classes_homework_solutions;

import java.util.Scanner;

public class _05_AngleUnitConverter {

	private static double degToRad(double deg) {
		return deg * (Math.PI / 180);
	}

	private static double radToDeg(double rad) {
		return rad * (180 / Math.PI);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());

		double[] numbers = new double[n];
		String[] measures = new String[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = Double.parseDouble(scanner.next());
			measures[i] = scanner.next();
		}

		for (int i = 0; i < n; i++) {
			if (measures[i].equals("rad")) {
				System.out.printf("%.6f deg%n", radToDeg(numbers[i]));
			} else if (measures[i].equals("deg")) {
				System.out.printf("%.6f rad%n", degToRad(numbers[i]));
			} else {
				System.out.println("Invalid syntax!");
			}
		}
	}
}