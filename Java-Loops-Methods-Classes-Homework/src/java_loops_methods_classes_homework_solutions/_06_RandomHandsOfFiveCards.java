package java_loops_methods_classes_homework_solutions;

import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfFiveCards {
	
	private static class Card {
		private String face;
		private char suit;
		
		public String getFace() {
			return face;
		}
		public void setFace(String face) {
			this.face = face;
		}
		public char getSuit() {
			return suit;
		}
		public void setSuit(char suit) {
			this.suit = suit;
		}
	}
	
	private static Card generateCard() {
		Card card = new Card();
		
		Random rand = new Random();
		int  face = rand.nextInt(14 - 2 + 1) + 2;
		int suit = rand.nextInt(4 - 1 + 1) + 1;
		
		if (face < 11) {
			card.setFace(Integer.toString(face));
		} else {
			switch (face) {
			case 11:
				card.setFace("J");
				break;
			case 12:
				card.setFace("Q");
				break;
			case 13:
				card.setFace("K");
				break;
			case 14:
				card.setFace("A");
				break;
			default:
				break;
			}
		}
		
		switch (suit) {
		case 1:
			card.setSuit('\u2663');
			break;
		case 2:
			card.setSuit('\u2666');
			break;
		case 3:
			card.setSuit('\u2665');
			break;
		case 4:
			card.setSuit('\u2660');
			break;
		default:
			break;
		}
		
		return card;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		
		for (int i = 0; i < n; i++) {
		
			Card[] hand = new Card[5];
			for (int j = 0; j < 5; j++) {
				hand[j] = generateCard();
			}

			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < j; k++) {
					while (hand[j].getFace().equals(hand[k].getFace())
							&& hand[j].getSuit() == hand[k].getSuit()) {
						hand[j] = generateCard();
					}
				}
			}

			for (Card card : hand) {
				System.out.print(card.getFace() + card.getSuit() + " ");
			}
			System.out.println();
		}
	}
}