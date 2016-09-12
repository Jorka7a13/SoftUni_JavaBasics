package java_collections_basics_homework_solutions;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class _17_LogsAggregator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		TreeMap<String, TreeSet<String>> IPMap = new TreeMap();
		TreeMap<String, Integer> durationMap = new TreeMap();
		
		String[] input = new String[3];
		for (int i = 0; i < n; i++) {
			input = scanner.nextLine().split(" ");
			
			if (IPMap.containsKey(input[1])) {
				IPMap.get(input[1]).add(input[0]);
				durationMap.put(input[1], durationMap.get(input[1]) + Integer.parseInt(input[2]));
			} else {
				TreeSet<String> IPSet = new TreeSet();
				IPSet.add(input[0]);
				IPMap.put(input[1], IPSet);
				durationMap.put(input[1], Integer.parseInt(input[2]));
			}
		}
		
		for(Entry<String, TreeSet<String>> entry : IPMap.entrySet()) {
			String name = entry.getKey();
			TreeSet<String> ips = entry.getValue();
			int duration = durationMap.get(name);
			
			System.out.println(name + ": " + duration + " " + ips);
		}
	}
}