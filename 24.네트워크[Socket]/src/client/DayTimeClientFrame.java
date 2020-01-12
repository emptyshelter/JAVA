package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JLabel timeDisplayL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnRequestServerTime = new JButton("Request Server Time");
		btnRequestServerTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Socket socket=new Socket("192.168.56.1",8000);
					InputStream in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in);
//					int readChar = isr.read();  ���Ѵ�� -1�� üũ �ȵ�
					BufferedReader br = new BufferedReader(isr);
					String serverTime = br.readLine();
					timeDisplayL.setText(serverTime);
					
				} catch (Exception e1) {
					
				}
				
			}
		});
		contentPane.add(btnRequestServerTime, BorderLayout.SOUTH);
		
		timeDisplayL = new JLabel("12:34");
		timeDisplayL.setFont(new Font("����", Font.BOLD, 24));
		timeDisplayL.setForeground(Color.BLUE);
		timeDisplayL.setBackground(Color.ORANGE);
		timeDisplayL.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(timeDisplayL, BorderLayout.CENTER);
	}

}
