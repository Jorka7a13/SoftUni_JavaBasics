package java_loops_methods_classes_homework_solutions;

public class _03_FullHouse {

	private static int counter = 0;
	
	private static class Card {
		private String face;
		private char suit;

		public Card(String face, char suit) {
			this.face = face;
			this.suit = suit;
		}

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

		public void incFace() { // Should incFace set suit to zero?
			switch (face) {
			case "2":
				face = "3";
				break;
			case "3":
				face = "4";
				break;
			case "4":
				face = "5";
				break;
			case "5":
				face = "6";
				break;
			case "6":
				face = "7";
				break;
			case "7":
				face = "8";
				break;
			case "8":
				face = "9";
				break;
			case "9":
				face = "10";
				break;
			case "10":
				face = "J";
				break;
			case "J":
				face = "Q";
				break;
			case "Q":
				face = "K";
				break;
			case "K":
				face = "A";
				break;
			default:
				break;
			}
		}

		public void incSuit() {
			switch (suit) {
			case '\u2663':
				suit = '\u2666';
				break;
			case '\u2666':
				suit = '\u2665';
				break;
			case '\u2665':
				suit = '\u2660';
				break;
			default:
				break;
			}
		}

		public String toString() {
			return face + suit;
		}
	}

	public static void iterateSuits(Card cardOne, Card cardTwo, Card cardThree, Card cardFour, Card cardFive) {
		// Iterate left three card suits
		for (int i = 0; i < 4; i++) {
			// iterate right two card suits
			for (int j = 0; j < 6; j++) {
				System.out.print(cardOne + " " + cardTwo + " " + cardThree
						+ " " + cardFour + " " + cardFive);
				if (cardFive.suit == '\u2660') {
					cardFour.incSuit();
					cardFive.suit = cardFour.suit;
				}
				cardFive.incSuit();
				System.out.println();
				counter++;
			}

			cardFour.setSuit('\u2663');
			cardFive.setSuit('\u2666');
			if (cardThree.suit == '\u2660') {
				if (cardTwo.suit == '\u2665') {
					cardOne.incSuit();
				} else {
					cardTwo.incSuit();
				}
			} 
			cardThree.incSuit();
		}
	}

	public static void main(String[] args) {
		Card cardOne = new Card("2", '\u2663');
		Card cardTwo = new Card("2", '\u2666');
		Card cardThree = new Card("2", '\u2665');
		Card cardFour = new Card("3", '\u2663');
		Card cardFive = new Card("3", '\u2666');

		// Iterate left three cards
		for (int i = 0; i < 13; i++) {
			// Iterate right three cards
			for (int j = 0; j < 12; j++) {
				iterateSuits(cardOne, cardTwo, cardThree, cardFour, cardFive);
				cardFour.incFace();
				cardFive.incFace();
				if (cardOne.getFace() == cardFour.getFace()) {
					cardFour.incFace();
					cardFive.incFace();
				}
				
				cardOne.setSuit('\u2663');
				cardTwo.setSuit('\u2666');
				cardThree.setSuit('\u2665');
			}
			
			cardFour.setFace("2");
			cardFive.setFace("2");
			cardOne.incFace();
			cardTwo.incFace();
			cardThree.incFace();
		}
		
		System.out.println();
		System.out.println(counter + " full houses");
	}
}