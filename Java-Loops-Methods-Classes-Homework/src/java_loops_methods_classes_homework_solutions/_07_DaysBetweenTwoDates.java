package java_loops_methods_classes_homework_solutions;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] inputOne = scanner.next().split("-");
		String[] inputTwo = scanner.next().split("-");
		
		LocalDate startDate = LocalDate.of(Integer.parseInt(inputOne[2]), Month.of(Integer.parseInt(inputOne[1])), Integer.parseInt(inputOne[0]));
		LocalDate endDate = LocalDate.of(Integer.parseInt(inputTwo[2]), Month.of(Integer.parseInt(inputTwo[1])), Integer.parseInt(inputTwo[0]));

		long p2 = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(p2);
	}
}
