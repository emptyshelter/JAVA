package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChattingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JTextArea chatTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingJFrame frame = new ChattingJFrame();
					frame.setVisible(true);
					frame.chatTF.requestFocus();
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
		setFont(new Font("D2Coding", Font.BOLD, 14));
		setTitle("\uCC44\uD305");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
		chatTF.setFont(new Font("D2Coding", Font.BOLD, 13));
		panel.add(chatTF);
		chatTF.setColumns(48);
		
		JButton btnSend = new JButton("send");
		btnSend.setFont(new Font("D2Coding", Font.PLAIN, 12));
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				send();
				
			}
		});
		panel.add(btnSend);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		chatTA = new JTextArea();
		chatTA.setFont(new Font("D2Coding", Font.PLAIN, 12));
		chatTA.setText("\uAE40\uD0DC\uD76C: \uC774\uB530\uB9CC\uB098!!\r\n");
		chatTA.setEditable(false);
		scrollPane.setViewportView(chatTA);
		
	}
	private void send() {
		String sendStr = chatTF.getText();
		if (sendStr==null || sendStr.equals("")) {
			return;
		}
		chatTA.append("±è¹ÎÅÂ:"+sendStr+"\n");
		chatTF.setText("");
	}

}
