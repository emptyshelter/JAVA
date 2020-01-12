
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main");
//		3. Thread 객체를 생성한다.
		CreateCustomThread cct = new CreateCustomThread();
//		cct.setName("나의 첫번째 쓰레드");
//		4. Thread 객체를통해서 Thread를 시작시킨다.
		/*public void start()
			- Causes this thread to begin execution; 
			  the Java Virtual Machine calls the run method of this thread.
			- The result is that two threads are running concurrently: 
			  the current thread (which returns from the call to the start method) 
			  and the other thread (which executes its run method).
			- It is never legal to start a thread more than once. 
			  In particular, a thread may not be restarted once it has completed execution.
		 */
		System.out.println("2.main");
		cct.start();
		while (true) {
			System.out.println("3.main");
		}
	}

}
