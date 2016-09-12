// Read two lists of letters l1 and l2 and combine them

package java_collections_basics_homework_solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] firstInputArray = scanner.nextLine().split(" ");
		String[] secondInputArray = scanner.nextLine().split(" ");
		
		ArrayList<Character> firstInput = new ArrayList();
		ArrayList<Character> secondInput = new ArrayList();
		
		for (String str : firstInputArray) {  
		    firstInput.add(str.charAt(0));  
		}  
		for (String str : secondInputArray) {  
			secondInput.add(str.charAt(0));  
		} 
		
		ArrayList<Character> result = new ArrayList(firstInput);
		for (Character character : secondInput) {
			if (!firstInput.contains(character)) { // If the character is not contained in the first list 
				result.add(character); // Append it to the result
			}
		}
		
		for (Character character : result) {
			System.out.print(character + " ");
		}
	}
}