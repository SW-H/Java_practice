package staticPractice;

public class CardCompany {
	private static CardCompany instance = new CardCompany();

	private CardCompany() {
		;
	}

	public static CardCompany getInstance() {
		return instance;
	}

	public Card createCard() {
		Card newCard = new Card();
		return newCard;
	}
}
