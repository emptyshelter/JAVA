package basic;

import java.awt.Color;
import java.awt.Frame;
/*
 GUI���α׷��� ���
 	1. �����̳� Ŭ������ �غ�(Frame, Dialog, Window)& ��ü����
 	2. �����̳� ��ü ũ�� ����  
 	3.	
 	4.
 	5. �����̳� ��ü�� (����ڿ���) �����ֱ�
 
 */

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("����(������)�� ���� ������ ���");
		f.setBackground(Color.blue);
		f.setSize(300, 400);
		f.setVisible(true);
		/*
		 * Frame.setVisible(true)
		 * 	- ȣ��Ǹ� GUI(awt) ���������
		 *  - GUI ������� ���� ����ϸ鼭
		 *    GUI �̺�Ʈ ó�� , �׷��� ó�� ����Ѵ�.
		 *  - GUI �����̳� (Frame)�� ��� ���ִ�.
		 *    (JVM�� ������� �ʴ´�.)
		 */
		
	}

}
