
public class SyncCount100Main {

	public static void main(String[] args) {
		SyncCount100 s1 = new SyncCount100();
		s1.setName("s1");
		s1.start();
		SyncCount100 s2 = new SyncCount100();
		s2.setName("s2");
		s2.start();
	}

}
