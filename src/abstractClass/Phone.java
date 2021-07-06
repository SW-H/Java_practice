package abstractClass;

abstract class Phone {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public abstract void printLog();
}
