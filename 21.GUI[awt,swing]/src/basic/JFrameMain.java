package basic;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
/*
 GUI���α׷��ֹ��
   1. �����̳�Ŭ�����غ�(Frame,Dialog,Window) & ��ü����
   2. �����̳ʰ�üũ�⼳��
   3.
   4.
   5. �����̳ʰ�ü �����ֱ�
 
 */
public class JFrameMain {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("����(������)������ �����ӻ��");
		f.getContentPane().setBackground(new Color(0,0,255));
		f.setSize(300, 400);
		f.setVisible(true);
		/*
		 * Frame.setVisible(true)
		 *   - ȣ��Ǹ� GUI(awt) ���������
		 *   - GUI������� ���Ѵ���ϸ鼭
		 *     GUI�̺�Ʈó��,�׷���ó������Ѵ�.
		 *   - GUI�����̳�(Frame)�� ��Ӷ��ִ�.
		 *     (JVM�� ��������ʴ´�)  
		 */
	}

}






