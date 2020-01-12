package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DropMode;

public class CalculatorJFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String firstOp="";
	private String secondOp="";
	private Double result=0.;
	private String operator="";

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
		textField.setBackground(Color.LIGHT_GRAY);
		northP.add(textField);
		textField.setColumns(10);
		
		JPanel centerP = new JPanel();
		contentPane.add(centerP, BorderLayout.CENTER);
		centerP.setLayout(new GridLayout(4, 4, 3, 3));
		
		JButton b7 = new JButton("7");
		centerP.add(b7);
		
		JButton b8 = new JButton("8");
		centerP.add(b8);
		
		JButton b9 = new JButton("9");
		centerP.add(b9);
		
		JButton divB = new JButton("/");
		divB.setForeground(Color.RED);
		divB.setFont(new Font("����", Font.BOLD, 12));
		centerP.add(divB);
		
		JButton b4 = new JButton("4");
		centerP.add(b4);
		
		JButton b5 = new JButton("5");
		centerP.add(b5);
		
		JButton b6 = new JButton("6");
		centerP.add(b6);
		
		JButton mulB = new JButton("*");
		mulB.setFont(new Font("D2Coding", Font.BOLD, 12));
		mulB.setForeground(Color.BLUE);
		centerP.add(mulB);
		
		JButton b1 = new JButton("1");
		centerP.add(b1);
		
		JButton b2 = new JButton("2");
		centerP.add(b2);
		
		JButton b3 = new JButton("3");
		centerP.add(b3);
		
		JButton minusB = new JButton("-");
		minusB.setFont(new Font("D2Coding", Font.BOLD, 12));
		centerP.add(minusB);
		
		JButton b0 = new JButton("0");
		centerP.add(b0);
		
		JButton resetB = new JButton("C");
		centerP.add(resetB);
		
		JButton equalB = new JButton("=");
		centerP.add(equalB);
		
		JButton plusB = new JButton("+");
		plusB.setForeground(Color.BLUE);
		plusB.setFont(new Font("D2Coding", Font.BOLD, 12));
		centerP.add(plusB);
		ButtonHandler bh=new ButtonHandler();
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
		plusB.addActionListener(bh);
		minusB.addActionListener(bh);
		divB.addActionListener(bh);
		equalB.addActionListener(bh);
		resetB.addActionListener(bh);
		mulB.addActionListener(bh);
	}
	

	
	/*
	 * event
	 */
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e);
			String cmd = e.getActionCommand();//Component�� �ؽ�Ʈ ���� ����
//			JButton source = (JButton) e.getSource(); Component�� ������������ ����
			
			if (cmd.equals("=")) {
				if (!firstOp.equals("") && !secondOp.equals("") && !operator.equals("")) {
					if (operator.equals("+")) {
						result = Double.parseDouble(firstOp)+Double.parseDouble(secondOp);
					}else if (operator.equals("-")) {
						result = Double.parseDouble(firstOp)-Double.parseDouble(secondOp);
					}else if (operator.equals("*")) {
						result = Double.parseDouble(firstOp)*Double.parseDouble(secondOp);
					}else if (operator.equals("/")) {
						result = Double.parseDouble(firstOp)/Double.parseDouble(secondOp);
					}
					firstOp= Double.toString(result);
					textField.setText(Double.toString(result));
					secondOp="";
					operator="";
				}
			}else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
				if (!firstOp.equals(""))operator= cmd;
			}else if (cmd.equals("C")) {
				textField.setText("");
				firstOp = "";
				secondOp = "";
				operator= "";
			} else{
				if (secondOp.equals("") && operator.equals("")) {
					firstOp+= cmd;
					textField.setText(firstOp);
				}else if (!firstOp.equals("") && !operator.equals("")){
					secondOp+= cmd;
					textField.setText(secondOp);
				}
			}
		}
	}
}
