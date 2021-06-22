package staticPractice;

public class TestMain {
	public static void main(String[] args) {
		CardCompany comp = CardCompany.getInstance();
		
		Card hyundai = comp.createCard();
		Card shinhan = comp.createCard();
		System.out.println(hyundai.getCardSerial());
		System.out.println(shinhan.getCardSerial());
		
	}
}
