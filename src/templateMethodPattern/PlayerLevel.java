package templateMethodPattern;
// level 에 대한 클래스를 만들지 않고 if-else 를 많이쓰면 좋지 않은 구조  
// 하위 레벨을 핸들링 하기도 좋음

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	final public void go(int cnt) {
		run();
		while(cnt > 0) {
			jump();
			cnt--;
		}
		turn();
	}
}
