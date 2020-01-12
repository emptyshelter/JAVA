import javax.swing.JOptionPane;

public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception{
		System.out.println("1.main");
		ControlStopThread cst=new ControlStopThread();
		cst.start();
		System.out.println("2.main");
		//JOptionPane.showMessageDialog(null, "1.Thread.stop()");
		Thread.sleep(5000);
		/*
		 * 호출한순간 종료
		 */
		//cst.stop();
		/*
		 * 조건변경으로 종료시킴
		 */
		cst.setPlay(false);
		System.out.println();
		System.out.println("3.main");
		
	}

}
