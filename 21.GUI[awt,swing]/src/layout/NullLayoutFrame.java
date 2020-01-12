package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
/*
GUI프로그래밍 방법
	1. 컨테이너 클래스를 준비(Frame, Dialog, Window)& 객체생성
	2. 컴포넌트 클래스 준비(Button,List,Textfield,Label) //상속을 받지 않는다.    
	3. 컨테이너에 컴포넌트를 붙인다.(add)
	4. 컨테이너 객체 크기 설정
	5. 컨테이너 객체를 (사용자에게) 보여주기
*/

public class NullLayoutFrame extends Frame{
	
	private Button loginB;
	private Button cancleB;
	private Label idL;
	private Label passL;
	private TextField idTF;
	private TextField passTF;
	
	
	public NullLayoutFrame() {
		setTitle("로그인");
		setBackground(Color.gray);
		loginB = new Button("로그인");
		cancleB = new Button("취소");
		idL = new Label("아이디");
		idL.setBackground(Color.WHITE);
		idL.setForeground(Color.darkGray);
		passL= new Label("비밀번호");
		idTF = new TextField();
		passTF = new TextField();
		passTF.setEchoChar('●');
		
		/*
		 * 기본 배치 관리자를 제거
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
