package templateMethodPattern;

public class Player {
	PlayerLevel level;
	
	
	public Player() {
		level = new BeginnerLevel(); 
	}
	PlayerLevel getLevel(){
		return level;
	}
	void upgradeLevel(PlayerLevel level){
		this.level = level;
	}
	public void play(int cnt){
		System.out.println();
		level.showLevelMessage();
		level.go(cnt);
	}
}
