package layout.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class ChattingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingJFrame frame = new ChattingJFrame();
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
	public ChattingJFrame() {
		setTitle("\uCC44\uD305\uBC29");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northP = new JPanel();
		northP.setBackground(Color.PINK);
		contentPane.add(northP, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\uCC44\uD305");
		label.setBackground(Color.PINK);
		northP.add(label);
		
		JPanel centerP = new JPanel();
		centerP.setBackground(Color.WHITE);
		contentPane.add(centerP, BorderLayout.WEST);
		centerP.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\uBAA8\uBAA8", "\uAE40\uD76C\uCCA0", "\uC9C0\uD6A8", "\uAC15\uB2E4\uB2C8\uC5D8", "JYP"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		centerP.add(list);
		
		JPanel southP = new JPanel();
		southP.setBackground(Color.ORANGE);
		contentPane.add(southP, BorderLayout.SOUTH);
		
		textField = new JTextField();
		southP.add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton = new JButton("\uC804\uC1A1");
		southP.add(btnNewButton);
		
		JTextArea txtrJyp = new JTextArea();
		contentPane.add(txtrJyp, BorderLayout.CENTER);
		txtrJyp.setText("JYP:.............");
	}

}
