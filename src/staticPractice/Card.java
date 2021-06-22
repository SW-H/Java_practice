package staticPractice;

public class Card {
	private static int cardCnt = 1000;
	private int cardSerial;

	Card() {
		cardSerial = cardCnt;
		cardCnt++;
	}

	public int getCardSerial() {
		return cardSerial;
	}

	public void setCardSerial(int cardSerial) {
		this.cardSerial = cardSerial;
	}
}

