// Enter an array of strings and find the largest sequence of equal elements in it

package java_collections_basics_homework_solutions;

import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {
	public static void main(String[] args) {

		String[] input = new Scanner(System.in).nextLine().split(" ");

		int currSequenceLenght = 1;
		int longestSequenceLength = currSequenceLenght;
		String longestSequenceString = input[0];

		for (int i = 1; i < input.length; i++) {
			if (!input[i].equals(input[i - 1])) { // If two consecutive strings are different
				if (currSequenceLenght > longestSequenceLength) {
					longestSequenceLength = currSequenceLenght;
					longestSequenceString = input[i - 1];
				}
				currSequenceLenght = 1;
			} else {
				currSequenceLenght++;
			}
			
			if (i == input.length - 1) { // If the last sequence is the longest
				if (currSequenceLenght > longestSequenceLength) {
					longestSequenceLength = currSequenceLenght;
					longestSequenceString = input[i - 1];
				}
			}
		}

		for (int i = 0; i < longestSequenceLength; i++) {
			System.out.print(longestSequenceString + " ");
		}
	}
}