package java_syntax_homework_solutions;

import java.util.Scanner;

public class _08_CountOfEqualBitPairs {

	private static int getBitAtPos(int num, int pos) {
		int mask = 1 << pos;
		return (num & mask) >> pos;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = Integer.parseInt(scanner.next());
		
		int bitCounter = 0;
		for (int i = num; i > 0; i /= 2) {
			bitCounter++;
		}
		
		int oldBit;
		int newBit = getBitAtPos(num, 0);;
		int equalBitsCounter = 0;
		
		for (int i = 1; i < bitCounter; i++) {
			oldBit = newBit;
			newBit = getBitAtPos(num, i);
			
			if (oldBit == newBit) {
				equalBitsCounter++;
			}
		}
		
		System.out.println("Number of equal bits: " + equalBitsCounter);
	}
}