
public class SyncUpperLowerMain {
	public static void main(String[] args) {
		Object m = new Object();
		SyncLowerThread lt = new SyncLowerThread(m);
		SyncUpperThread ut = new SyncUpperThread(m);
		ut.start();
		lt.start();
		
	}

}
