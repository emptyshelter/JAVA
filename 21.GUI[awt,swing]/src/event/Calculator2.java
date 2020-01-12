package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator2 extends JFrame {

	private JPanel contentPane;
	private JTextField TF1;
	private String firstValue="";
	private String secondValue="";
	private String seperator="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 frame = new Calculator2();
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
	public Calculator2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 5));
		
		TF1 = new JTextField();
		TF1.setText("0");
		TF1.setHorizontalAlignment(SwingConstants.RIGHT);
		TF1.setFont(new Font("����", Font.PLAIN, 14));
		contentPane.add(TF1, BorderLayout.NORTH);
		TF1.setColumns(20);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton b1 = new JButton("1");
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		panel.add(b3);
		
		JButton bPlus = new JButton("+");
		bPlus.setFont(new Font("����", Font.PLAIN, 14));
		panel.add(bPlus);
		
		JButton b4 = new JButton("4");
		panel.add(b4);
		
		JButton b5 = new JButton("5");
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		panel.add(b6);
		
		JButton bMinus = new JButton("-");
		bMinus.setFont(new Font("����", Font.PLAIN, 14));
		panel.add(bMinus);
		
		JButton b7 = new JButton("7");
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		panel.add(b9);
		
		JButton bMul = new JButton("*");
		bMul.setFont(new Font("����", Font.PLAIN, 14));
		panel.add(bMul);
		
		JButton b0 = new JButton("0");
		panel.add(b0);
		
		JButton bEqual = new JButton("=");
		bEqual.setFont(new Font("����", Font.PLAIN, 14));
		panel.add(bEqual);
		
		JButton bClear = new JButton("C");
		panel.add(bClear);
		
		JButton bDiv = new JButton("/");
		bDiv.setFont(new Font("����", Font.PLAIN, 14));
		panel.add(bDiv);
		
		/*
		 * event
		 */
		
		ButtonHandler bh = new ButtonHandler();
		b1.addActionListener(bh);
		b2.addActionListener(bh);
		b3.addActionListener(bh);
		b4.addActionListener(bh);
		b5.addActionListener(bh);
		b6.addActionListener(bh);
		b7.addActionListener(bh);
		b8.addActionListener(bh);
		b9.addActionListener(bh);
		b0.addActionListener(bh);
		bDiv.addActionListener(bh);
		bMul.addActionListener(bh);
		bMinus.addActionListener(bh);
		bEqual.addActionListener(bh);
		bClear.addActionListener(bh);
		bPlus.addActionListener(bh);
		
	}
	
	/*************************************************************************/
	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e);
			
			/*
			 * JButton source = e.getSource
			 * JButton source = (JButton) e.getSource();
			 */
			String cmd = e.getActionCommand();
			
			if (cmd.equals("=")) {
				if (!firstValue.equals("") && !secondValue.equals("") && !seperator.equals("")) {
					Double retValue = 0.;
					if (seperator.equals("+")) {
						retValue = Double.parseDouble(firstValue) + Double.parseDouble(secondValue);
					} else if (seperator.equals("-")) {
						retValue = Double.parseDouble(firstValue) - Double.parseDouble(secondValue);
					} else if (seperator.equals("*")) {
						retValue = Double.parseDouble(firstValue) * Double.parseDouble(secondValue);
					} else if (seperator.equals("/")) {
						retValue = Double.parseDouble(firstValue) / Double.parseDouble(secondValue);
					}
					firstValue =Double.toString(retValue);
					TF1.setText(Double.toString(retValue));
					secondValue="";
					seperator ="";
				}
					
				
			} else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
				if (!firstValue.equals(""))seperator= cmd;
				
			} else if (cmd.equals("C")) {
				TF1.setText("");
				firstValue = "";
				secondValue = "";
				seperator= "";
				
			} else {
				if(secondValue.equals("") && seperator.equals("")) {
					firstValue += cmd;
					TF1.setText(firstValue);
				} else if (!firstValue.equals("") && !seperator.equals("")) {
					secondValue += cmd;
					TF1.setText(secondValue);
				}

			}
			
		}
		
	}
	/***************************************************************************/
	

}
