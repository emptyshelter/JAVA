
public class SyncCount100 extends Thread{
	@Override
	public void run() {
		SyncCount100.count();
	}
	public synchronized static void count() {
		for (int i = 0; i < 100; i++) {
			System.out.println((i+1)+" :"+Thread.currentThread().getName()+" ");
		}
	}
}
