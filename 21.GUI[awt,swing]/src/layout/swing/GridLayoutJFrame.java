package layout.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_8;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_6;
	private JButton btnNewButton_12;
	private JButton btnNewButton_7;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 4, 0));
		
		btnNewButton_5 = new JButton("1");
		contentPane.add(btnNewButton_5);
		
		btnNewButton_4 = new JButton("2");
		contentPane.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("3");
		contentPane.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("+");
		contentPane.add(btnNewButton_2);
		
		btnNewButton_8 = new JButton("4");
		contentPane.add(btnNewButton_8);
		
		btnNewButton_1 = new JButton("5");
		contentPane.add(btnNewButton_1);
		
		btnNewButton = new JButton("6");
		contentPane.add(btnNewButton);
		
		btnNewButton_6 = new JButton("-");
		contentPane.add(btnNewButton_6);
		
		btnNewButton_12 = new JButton("7");
		contentPane.add(btnNewButton_12);
		
		btnNewButton_7 = new JButton("8");
		contentPane.add(btnNewButton_7);
		
		btnNewButton_9 = new JButton("9");
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("*");
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("0");
		contentPane.add(btnNewButton_11);
		
		btnNewButton_13 = new JButton("=");
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("C");
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("/");
		contentPane.add(btnNewButton_15);
	}

}
