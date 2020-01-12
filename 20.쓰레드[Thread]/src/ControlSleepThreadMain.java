
public class ControlSleepThreadMain {
	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		System.out.println("2.main 쓰레드를 3초간 sleep");
		/*
		 << public static void sleep(long millis) throws InterruptedException; >>
		  - Causes the currently executing thread to sleep
		     (temporarily cease execution) for the specified number of milliseconds
		 */
		ControlSleepThread sct = new ControlSleepThread();
		sct.start();
		Thread.sleep(3000);		
		System.out.println("3.main 쓰레드 sleep후 깨어난 후 실행");
	}

}
