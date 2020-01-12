package layout.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class CalculatorJFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorJFrame2 frame = new CalculatorJFrame2();
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
	public CalculatorJFrame2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_SPRING\\01.JAVA_FUNDMENTAL\\99.image\\default1.png"));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel northP = new JPanel();
		contentPane.add(northP, BorderLayout.NORTH);
		northP.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField = new JTextField();
		northP.add(textField);
		textField.setColumns(10);
		
		JPanel centerP = new JPanel();
		contentPane.add(centerP, BorderLayout.CENTER);
		centerP.setLayout(new GridLayout(4, 4, 3, 3));
		
		JButton btnNewButton = new JButton("7");
		centerP.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		centerP.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("9");
		centerP.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("/");
		centerP.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		centerP.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		centerP.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("6");
		centerP.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("*");
		centerP.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("1");
		centerP.add(btnNewButton_8);
		
		JButton btnNewButton_11 = new JButton("2");
		centerP.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("3");
		centerP.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("-");
		centerP.add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("0");
		centerP.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("C");
		centerP.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		centerP.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		centerP.add(btnNewButton_15);
	}

}
