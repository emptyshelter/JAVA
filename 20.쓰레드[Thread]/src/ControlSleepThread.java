import java.util.Date;

public class ControlSleepThread extends Thread{
	
	@Override
	public void run() {
		while (true) {
			try {
			Date now=new Date();
			System.out.println(now.toLocaleString());
			Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
