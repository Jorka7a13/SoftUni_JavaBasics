// Calculate and print the frequency of each card's face

package java_collections_basics_homework_solutions;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12_CardsFrequencies {
	public static void main(String[] args) {
		
		Pattern cardFacePattern = Pattern.compile("[0-9JQKA]+");
		Matcher matcher = cardFacePattern.matcher(new Scanner(System.in).nextLine());
		
		ArrayList<String> allCards = new ArrayList();
		TreeMap<String, Integer> resultMap = new TreeMap();
		
		while (matcher.find()) { // Fill the ArrayList with card faces
			allCards.add(matcher.group());
		}
		
		for (int i = 0; i < allCards.size(); i++) { 
			if (resultMap.containsKey(allCards.get(i))) { // If the card exists in the map, increment the value
				resultMap.put(allCards.get(i), resultMap.get(allCards.get(i)) + 1);
			} else {
				resultMap.put(allCards.get(i), 1); // If the card doesn't exist in the map, add it
			}
		}
		
		for (Entry<String, Integer> entry : resultMap.entrySet()) { 
			double percentage = (entry.getValue() * 100.00)/allCards.size();
			System.out.printf("%s -> %.2f%%",entry.getKey() , percentage);
			System.out.println();
		}
	}
}