package intro_java_homework_solutions;

import java.awt.Color;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;

public class _09_GenerateAPDF {

	static PDDocument doc = null;
	static PDPage page = null;
	static PDFont font = null;
	static PDPageContentStream content = null;
	static boolean pageAdded = false;

	public static class Card {

		private String face;
		private char suit;

		public Card(String face, char suit) {
			this.face = face;
			this.suit = suit;
		}

		public String toString() {
			return this.face + " " + this.suit;
		}
	}

	public static void printCard(String face, char suit, int row, int col)
			throws IOException {

		int startX = 35, startY = 750;
		int spacingX = 100;
		int spacingY = 20;

		switch (col) {
		case 0:
			startX = 35;
			break;
		case 1:
			startX = (35 + 60) + spacingX;
			break;
		case 2:
			startX = (35 + 60 * 2) + spacingX * 2;
			break;
		case 3:
			startX = (35 + 60 * 3) + spacingX * 3;
			break;
		default:
			break;
		}

		switch (row) {
		case 0:
			startY = 750;
			break;
		case 1:
			startY = (750 - 80) - spacingY;
			break;
		case 2:
			startY = (750 - 80 * 2) - spacingY * 2;
			break;
		case 3:
			startY = (750 - 80 * 3) - spacingY * 3;
			break;
		case 4:
			startY = (750 - 80 * 4) - spacingY * 4;
			break;
		case 5:
			startY = (750 - 80 * 5) - spacingY * 5;
			break;
		case 6:
			startY = (750 - 80 * 6) - spacingY * 6;
			break;
		case 7:
			if (!pageAdded) {
				page = new PDPage();
				doc.addPage(page);
				pageAdded = true;
				content.close();
				content = new PDPageContentStream(doc, page);
			}

			startY = 750;
			break;
		case 8:
			startY = (750 - 80) - spacingY;
			break;
		case 9:
			startY = (750 - 80 * 2) - spacingY * 2;
			break;
		case 10:
			startY = (750 - 80 * 3) - spacingY * 3;
			break;
		case 11:
			startY = (750 - 80 * 4) - spacingY * 4;
			break;
		case 12:
			startY = (750 - 80 * 5) - spacingY * 5;
			break;
		default:
			break;
		}

		content.drawLine(startX, startY, startX + 60, startY);
		content.drawLine(startX, startY, startX, startY - 80);
		content.drawLine(startX + 60, startY, startX + 60, startY - 80);
		content.drawLine(startX, startY - 80, startX + 60, startY - 80);

		content.beginText();
		content.setFont(font, 42);
		content.moveTextPositionByAmount(startX + 10, startY - 40);

		if (suit == 'r' || suit == 'e') {
			content.setNonStrokingColor(Color.RED);
		} else {
			content.setNonStrokingColor(Color.BLACK);
		}

		switch (face) {
		case "10":
			face = "0";
			break;
		case "J":
			face = "a";
			break;
		case "Q":
			face = "s";
			break;
		case "K":
			face = "d";
			break;
		case "A":
			face = "f";
			break;
		default:
			break;
		}

		content.drawString(face + String.valueOf(suit));
		content.endText();
	}

	private static Card[] generateDeck() {

		Card array[] = new Card[52];
		String face = "";
		char suit = ' ';
		int index = 0;

		for (int i = 0; i < 13; i++) {

			switch (i) {
			case 0:
				face = "2";
				break;
			case 1:
				face = "3";
				break;
			case 2:
				face = "4";
				break;
			case 3:
				face = "5";
				break;
			case 4:
				face = "6";
				break;
			case 5:
				face = "7";
				break;
			case 6:
				face = "8";
				break;
			case 7:
				face = "9";
				break;
			case 8:
				face = "10";
				break;
			case 9:
				face = "J";
				break;
			case 10:
				face = "Q";
				break;
			case 11:
				face = "K";
				break;
			case 12:
				face = "A";
				break;
			default:
				break;
			}

			for (int j = 0; j < 4; j++) {

				switch (j) {
				case 0:
					suit = 'w';
					break;
				case 1:
					suit = 'e';
					break;
				case 2:
					suit = 'r';
					break;
				case 3:
					suit = 'q';
					break;
				default:
					break;
				}

				array[index] = new Card(face, suit);
				index++;
			}
		}

		return array;
	}

	public static void main(String[] args) {
		Card[] result = generateDeck();

		try {
			doc = new PDDocument();
			page = new PDPage();

			doc.addPage(page);
			font = PDTrueTypeFont.loadTTF(doc, "HoylePlayingCards.ttf");
			content = new PDPageContentStream(doc, page);

			for (int i = 0; i < result.length; i++) {
				printCard(result[i].face, result[i].suit, i / 4, i % 4);
			}

			content.close();

			doc.save("Deck-of-Cards.pdf");
			doc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}