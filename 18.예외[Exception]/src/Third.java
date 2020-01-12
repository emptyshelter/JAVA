import java.io.File;
import java.io.FileInputStream;

public class Third {
	public void method3() throws Throwable {
		System.out.println("\t\t\tThird.method3() 실행");
		/******예외발생case1******/
		/*- JVM이 예외발생을 감지하고 예외객체를 생성한다.
		 *- 생성한 예외객체를 반환방향(호출한코드)으로 던진다(throw)  
		 *- 이때 실행중인 쓰레드는 중지된다. 
		 */
//		String str=null;
//		str.length();
		/******사용자예외발생case2******/
		/* - 예외객체생성
		 * - 예외객체를 반환방향(호출한코드)으로 던진다(throw)
		 * - 이때 실행중인 쓰레드는 중지된다.
		 */
		/*
		boolean b = true;
		if (b) {
			throw new Throwable("Thrid.method3() 예외객체던짐");
		}
		*/
//		Class.forName("Third");
		/********case3*************/
		/*
		 * - 내가 호출한 메소드(생성자)에서 예외객체를 생성
		 * - 예외객체를 던진다.
		 * - 이때 실행중인 쓰레드는 중지된다.
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		System.out.println("\t\t\tThird.method3() 반환");
		
	}
}
