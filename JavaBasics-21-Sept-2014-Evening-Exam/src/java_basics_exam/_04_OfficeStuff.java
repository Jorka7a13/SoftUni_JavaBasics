package java_basics_exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_OfficeStuff {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] inputLine = null;
		ArrayList<String[]> input = new ArrayList();
		
		for (int i = 0; i < n; i++) {
			inputLine = scanner.nextLine().split("[\\| -]+");
			input.add(inputLine);
		}
		
		TreeMap<String, LinkedHashMap<String, Integer>> resultTable = new TreeMap();
		LinkedHashMap<String, Integer> temp = new LinkedHashMap();
		
		for (int i = 0; i < input.size(); i++) {
			String name = input.get(i)[1];
			String product = input.get(i)[3];
			Integer ammount = Integer.parseInt(input.get(i)[2]);
			
			if (resultTable.containsKey(name)) {
				temp = new LinkedHashMap();
				temp = resultTable.get(name);
				
				if (temp.containsKey(product)) {
					temp.put(product, temp.get(product) + ammount); // Increment the ammount
				} else {
					// add product to this linkedHashMap
					temp.put(product, ammount);
				}
			} else {
				// add to resultTable
				temp = new LinkedHashMap();
				temp.put(product, ammount);
				resultTable.put(name, temp);
			}
		}
		
		
		for (Map.Entry<String, LinkedHashMap<String, Integer>> resultTableEntry : resultTable.entrySet())
		{
		    System.out.print(resultTableEntry.getKey() + ": ");
		    
		    Iterator it = resultTableEntry.getValue().entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pairs = (Map.Entry)it.next();
		        System.out.print(pairs.getKey() + "-" + pairs.getValue());
		        
		        if (it.hasNext()) {
					System.out.print(", ");
				}
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    
		    System.out.println();
		}
	}
}