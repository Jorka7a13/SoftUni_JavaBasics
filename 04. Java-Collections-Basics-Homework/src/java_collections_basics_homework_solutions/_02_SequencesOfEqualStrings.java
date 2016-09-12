// Enters an array of strings and find all sequences of equal elements in it
package java_collections_basics_homework_solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_SequencesOfEqualStrings {
	public static void main(String[] args) {
		
		System.out.print("Please enter strings separated by space: ");
		String[] input = new Scanner(System.in).nextLine().split(" ");
		
		ArrayList<ArrayList<String>> result = new ArrayList();
		ArrayList<String> wordGroup = new ArrayList();
		
		for (int i = 0; i < input.length; i++) {
			if (i < input.length - 1) { // In case we try to check outside the bounds of the array
				if (input[i + 1].equals(input[i])) { 
					wordGroup.add(input[i]); 
				} else {
					wordGroup.add(input[i]);
					result.add(wordGroup);
					wordGroup = new ArrayList(); // We make a new list for each group of equal elements
				}
			} else {
				wordGroup.add(input[i]);
				result.add(wordGroup);
				wordGroup = new ArrayList(); // We make a new list for each group of equal elements
			}
		}
		
		for (ArrayList<String> wordList : result) {
			for (String word : wordList) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}
}