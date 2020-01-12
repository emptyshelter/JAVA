package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
/*
GUI���α׷��� ���
	1. �����̳� Ŭ������ �غ�(Frame, Dialog, Window)& ��ü����
	2. ������Ʈ Ŭ���� �غ�(Button,List,Textfield,Label) //����� ���� �ʴ´�.    
	3. �����̳ʿ� ������Ʈ�� ���δ�.(add)
	4. �����̳� ��ü ũ�� ����
	5. �����̳� ��ü�� (����ڿ���) �����ֱ�
*/

public class NullLayoutFrame extends Frame{
	
	private Button loginB;
	private Button cancleB;
	private Label idL;
	private Label passL;
	private TextField idTF;
	private TextField passTF;
	
	
	public NullLayoutFrame() {
		setTitle("�α���");
		setBackground(Color.gray);
		loginB = new Button("�α���");
		cancleB = new Button("���");
		idL = new Label("���̵�");
		idL.setBackground(Color.WHITE);
		idL.setForeground(Color.darkGray);
		passL= new Label("��й�ȣ");
		idTF = new TextField();
		passTF = new TextField();
		passTF.setEchoChar('��');
		
		/*
		 * �⺻ ��ġ �����ڸ� ����
		 */
		this.setLayout(null);
		
		
		loginB.setBounds(50, 180, 100, 25);
		cancleB.setBounds(150, 180, 100, 25);
		idL.setBounds(50, 100, 70, 25);
		passL.setBounds(50, 140, 70, 25);
		idTF.setBounds(150, 100, 100, 25);
		passTF.setBounds(150, 140, 100, 25);
		
		
		
		this.add(loginB);
		this.add(cancleB);
		this.add(idL);
		this.add(passL);
		this.add(idTF);
		this.add(passTF);
		setSize(300, 250);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new NullLayoutFrame();
	}

}