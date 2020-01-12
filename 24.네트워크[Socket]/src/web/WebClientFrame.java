package web;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class WebClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField addressTF;
	private JEditorPane editorPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebClientFrame frame = new WebClientFrame();
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
	public WebClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		addressTF = new JTextField();
		addressTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String hostStr = addressTF.getText();
					Socket socket=new Socket(hostStr, 88);
					OutputStream out=socket.getOutputStream();
					InputStream in=socket.getInputStream();
					InputStreamReader isr=new InputStreamReader(in);
					
					String requestStr = "GET /index.html HTTP/1.1\r\n\r\n";
					out.write(requestStr.getBytes());
					out.flush();
					String htmlStr="";
					while(true) {
						int readChar = isr.read();
						if(readChar==-1)break;
						System.out.print((char)readChar);
						htmlStr+=(char)readChar;
					}
					System.out.println("-----------------");
					editorPane.setText(htmlStr);
				} catch (Exception e1) {
					
				}
				
				
			}
		});
		contentPane.add(addressTF, BorderLayout.NORTH);
		addressTF.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		editorPane = new JEditorPane();
		editorPane.setContentType("text/html");
		
		scrollPane.setViewportView(editorPane);
	}

}
