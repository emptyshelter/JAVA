package basic;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
/*
 GUI프로그래밍방법
   1. 컨테이너클래스준비(Frame,Dialog,Window) & 객체생성
   2. 컨테이너객체크기설정
   3.
   4.
   5. 컨테이너객체 보여주기
 
 */
public class JFrameMain {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("포함(의존성)에의한 프레임사용");
		f.getContentPane().setBackground(new Color(0,0,255));
		f.setSize(300, 400);
		f.setVisible(true);
		/*
		 * Frame.setVisible(true)
		 *   - 호출되면 GUI(awt) 쓰레드생성
		 *   - GUI쓰레드는 무한대기하면서
		 *     GUI이벤트처리,그래픽처리담당한다.
		 *   - GUI컨테이너(Frame)는 계속떠있다.
		 *     (JVM이 종료되지않는다)  
		 */
	}

}







