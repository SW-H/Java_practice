package templateMethodPattern;

public class TestMain {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
	}
}
