package layout.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class FlowLayoutJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutJFrame frame = new FlowLayoutJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FlowLayoutJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\stu\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\KakaoTalk_20191112_152816101.jpg"));
		setTitle("\uD50C\uB85C\uC6B0\uB808\uC774\uC544\uC6C3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnFirst = new JButton("FIRST");
		btnFirst.setIcon(new ImageIcon("C:\\JAVA_SPRING\\01.JAVA_FUNDMENTAL\\99.image\\place.png"));
		contentPane.add(btnFirst);
		
		JButton btnSecond = new JButton("SECOND");
		contentPane.add(btnSecond);
		
		JButton btnThird = new JButton("THIRD");
		contentPane.add(btnThird);
		
		JButton btnFourth = new JButton("FOURTH");
		contentPane.add(btnFourth);
		
		JButton btnFifth = new JButton("FIFTH");
		contentPane.add(btnFifth);
	}

}
