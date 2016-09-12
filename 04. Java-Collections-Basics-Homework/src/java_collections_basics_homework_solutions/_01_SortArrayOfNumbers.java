// Enter a number "n" and "n" integer numbers and sort and print them

package java_collections_basics_homework_solutions;

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number n and n numbers after that: ");
		int n = Integer.parseInt(scanner.next());

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
		    try {
		    	array[i] = Integer.parseInt(scanner.next());
		    } catch (NumberFormatException nfe) {};
		}
		
		Arrays.sort(array);
		
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}