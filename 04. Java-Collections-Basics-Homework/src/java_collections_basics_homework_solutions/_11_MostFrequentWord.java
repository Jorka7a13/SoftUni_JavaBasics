// Find the most frequent word in a text, print it and print how many times it appears

package java_collections_basics_homework_solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11_MostFrequentWord {
	
	public static class EntryComparator implements Comparator<Entry<String, Integer>> {
	    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	        return o1.getKey().compareTo(o2.getKey());
	    }
	}
	
	public static void main(String[] args) {
		
		Pattern wordPattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = wordPattern.matcher(new Scanner(System.in).nextLine());
		
		ArrayList<String> allWords = new ArrayList();
		HashMap<String, Integer> resultMap = new HashMap();
		
		while (matcher.find()) { // Fill the ArrayList with words
			allWords.add(matcher.group().toLowerCase());
		}
		
		for (int i = 0; i < allWords.size(); i++) { 
			if (resultMap.containsKey(allWords.get(i))) { // If the word exists in the map, increment the value
				resultMap.put(allWords.get(i), resultMap.get(allWords.get(i)) + 1);
			} else {
				resultMap.put(allWords.get(i), 1); // If the word doesn't exist in the map, add it
			}
		}
		
		Integer biggestVal = null;
		List<Entry<String, Integer>> biggestValueList = new ArrayList();
		
		for (Entry<String, Integer> entry : resultMap.entrySet()) { // Find the biggest value
		     if (biggestVal == null || biggestVal  < entry.getValue()) {
		         biggestVal = entry.getValue();
		         biggestValueList.clear();
		         biggestValueList.add(entry);
		     } else if (biggestVal == entry.getValue()) {
		         biggestValueList.add(entry);
		     }
		}
		
		Collections.sort(biggestValueList, new EntryComparator()); // Sort the list
		
		for (Entry<String, Integer> entry : biggestValueList) { // Print the list
			System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
		}
	}
}