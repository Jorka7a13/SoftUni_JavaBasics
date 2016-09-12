package java_collections_basics_homework_solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class _15_SumCards {
	
	private static int getCardValue(String face) {
		int value;
		
		switch (face) {
		case "1": case "2": case "3": case "4": case "5": 
		case "6": case "7": case "8": case "9": case "10":
			value = Integer.parseInt(face);
			break;
		case "J":
			value = 12;
			break;
		case "Q":
			value = 13;
			break;
		case "K":
			value = 14;
			break;
		case "A":
			value = 15;
			break;
		default:
			value = 0;
			break;
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		ArrayList<String> cards = new ArrayList();
		for (String string : input) {
			cards.add(string.substring(0, string.length() - 1));
		}
	
		int multiplier = 1, sum = 0;
		for (int i = 0; i < cards.size(); i++) {
			if (i > 0) {
				if (cards.get(i).equals(cards.get(i - 1))) {
					if (multiplier == 1) {
						multiplier = 3; // Used to compensate for the first value from a sequence of equal faces
					} else {
						multiplier = 2;
					}
				} else {
					multiplier = 1;
				}
			}
			sum += getCardValue(cards.get(i)) * multiplier; 
		}
		System.out.println(sum);
	}
}