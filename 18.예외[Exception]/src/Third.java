import java.io.File;
import java.io.FileInputStream;

public class Third {
	public void method3() throws Throwable {
		System.out.println("\t\t\tThird.method3() ����");
		/******���ܹ߻�case1******/
		/*- JVM�� ���ܹ߻��� �����ϰ� ���ܰ�ü�� �����Ѵ�.
		 *- ������ ���ܰ�ü�� ��ȯ����(ȣ�����ڵ�)���� ������(throw)  
		 *- �̶� �������� ������� �����ȴ�. 
		 */
//		String str=null;
//		str.length();
		/******����ڿ��ܹ߻�case2******/
		/* - ���ܰ�ü����
		 * - ���ܰ�ü�� ��ȯ����(ȣ�����ڵ�)���� ������(throw)
		 * - �̶� �������� ������� �����ȴ�.
		 */
		/*
		boolean b = true;
		if (b) {
			throw new Throwable("Thrid.method3() ���ܰ�ü����");
		}
		*/
//		Class.forName("Third");
		/********case3*************/
		/*
		 * - ���� ȣ���� �޼ҵ�(������)���� ���ܰ�ü�� ����
		 * - ���ܰ�ü�� ������.
		 * - �̶� �������� ������� �����ȴ�.
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		System.out.println("\t\t\tThird.method3() ��ȯ");
		
	}
}
