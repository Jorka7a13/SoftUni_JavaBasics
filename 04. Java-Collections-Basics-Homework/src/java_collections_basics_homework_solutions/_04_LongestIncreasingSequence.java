// Find all increasing sequences inside an array of integers

package java_collections_basics_homework_solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {
	
	private static ArrayList<Integer> getLongestList(ArrayList<ArrayList<Integer>> input) {
		ArrayList<Integer> result = input.get(0);
		int maxListSize = input.get(0).size();
		
		for (ArrayList<Integer> list : input) {
			if (list.size() > maxListSize) {
				maxListSize = list.size();
				result = list;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String[] stringInput = new Scanner(System.in).nextLine().split(" ");
		
		int[] input = new int[stringInput.length];
		for (int i = 0; i < stringInput.length; i++) {
		    try {
		        input[i] = Integer.parseInt(stringInput[i]);
		    } catch (NumberFormatException nfe) {};
		}
		
		ArrayList<ArrayList<Integer>> sequenceList = new ArrayList();
		ArrayList<Integer> currSequence = new ArrayList<>();
		
		for (int i = 0; i < input.length - 1; i++) {
			
			if (i == 0) { // If it is the first number of the input
				currSequence.add(input[i]);
			}
			
			if (input[i + 1] > input[i]) {
				currSequence.add(input[i + 1]);
			} else { // If a new sequence will start add the last number
				sequenceList.add(currSequence);
				currSequence = new ArrayList<>();
				currSequence.add(input[i + 1]);
			}
			
		}
		sequenceList.add(currSequence); // Add the last sequence
		
		for (ArrayList<Integer> list : sequenceList) {
			for (Integer num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		System.out.print("Longest: ");
		ArrayList<Integer> longestList = getLongestList(sequenceList); 
		for (Integer number : longestList) {
			System.out.print(number + " ");
		}
	}
}