package chat.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea displayTA;
	private JTextField noticeTF;
	/************************************/
	private ServerClientService clientService;
	private ChatServerThread chatServerThread;
	/*************************************/
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerFrame frame = new ChatServerFrame();
					frame.setVisible(true);
					frame.noticeTF.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatServerFrame() {
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		displayTA = new JTextArea();
		displayTA.setFont(new Font("D2Coding", Font.BOLD, 16));
		scrollPane.setViewportView(displayTA);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendNoticeAllClient();
			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(38);
		
		JButton btnNotice = new JButton("notice");
		btnNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendNoticeAllClient();
			}
		});
		panel.add(btnNotice);
		/***********************************/
		clientService=new ServerClientService();
		chatServerThread=new ChatServerThread();
		chatServerThread.start();
		/***********************************/
	}
	/**********모든클라이언트에 공지사항전송****************/
	private void sendNoticeAllClient() {
		String noticeStr = noticeTF.getText().trim();
		if(noticeStr==null || noticeStr.equals("")) {
			noticeTF.requestFocus();
			return;
		}
		clientService.sendBroadcasting("[공지]"+noticeStr);
		noticeTF.setText("");
		noticeTF.requestFocus();
		displayLog("[서버공지]"+noticeStr);
	}
	private void displayLog(String msg) {
		displayTA.append(msg+"\n");
		int maxSize = 
				scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}
	
	/***********************************************
	 * 특정포트를 열고 클라이언트의 소켓연결요청을
	 * 처리해서소켓을생성하는쓰레드클래스
	 ***********************************************/
	public class ChatServerThread extends Thread{
		@Override
		public void run() {
			try {
				ServerSocket serverSocket=new ServerSocket(1987);
				displayLog("0.ChatServerThread:1987번포트에 ServerSocket생성");
				while (true) {
					displayLog("1.ChatServerThread:클라이언트소켓연결요청대기");
					Socket socket = 
							serverSocket.accept();
					displayLog("2.ChatServerThread:접속클라이언트["+
							socket.getInetAddress().getHostAddress()+"("+
							socket.getPort()+")]");
					ServerClient client=new ServerClient(socket);
					clientService.addClient(client);
					client.start();
					
				}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				/*
				Terminates the currently running Java Virtual Machine
				 */
				System.exit(0);
				
			}
		}
	}
	/*************************************************************/
	/********************************************
	  한명의 클라이언트와통신을 담당하는 클래스(VO)
		- 클라이언트와연결된 소켓1개를 가지고있는클래스
		- 클라이언트의 정보를 가지고있는 클래스
		- 클라이언트당 1개의객체가생성
	 ********************************************/
	public class ServerClient extends Thread{
		private String id;
		private Socket socket;
		private DataInputStream in;
		private DataOutputStream out;
		public ServerClient(Socket socket) throws Exception{
			this.socket=socket;
			this.id = socket.getInetAddress()
					 .getHostAddress()+"["+socket.getPort()+"]";
			this.in=new DataInputStream(socket.getInputStream());
			this.out=new DataOutputStream(socket.getOutputStream());
		}
		public String getUserId() {
			return id;
		}
		public void send(String msg) throws Exception{
			this.out.writeUTF(msg);
		}
		@Override
		public void run() {
			try {
				while (true) {
					System.out.println("ㄱ.ServerClient:"+id+" 로부터 데이타읽기위해쓰레드대기");
					String readStr = in.readUTF();
					System.out.println("ㄴ.ServerClient:"+id+" 로부터읽은데이타-->"+readStr);
					clientService.sendBroadcasting(readStr);
				}
			}catch (Exception e) {
				
				clientService.removeClient(this);
			}
			
		}
		
	}
	/************************************
	 서버에연결된 클라이언트객체(Service)를관리할클래스  
	  - 클라이언트객체 추가
	  - 클라이언트객체 찾기
	  - 클라이언트객체 삭제
	  - 모든 클라이언트객체에 데이타전송
	 ************************************/
	public class ServerClientService{
		/*
		 * 클라이언트객체 리스트
		 */
		private ArrayList<ServerClient> clientList;
		public ServerClientService() {
			clientList=new ArrayList<ServerClient>();
		}
	
		/*
		 * 클라이언트객체추가
		 */
		public void addClient(ServerClient client) {
			clientList.add(client);
			this.sendBroadcasting(client.getUserId()+" 님입장");
			displayLog("A.ServerClientService:"+client.getUserId()+" 님 입장");
			displayLog("B.ServerClientService:현재접속자수:"+
			clientList.size());
		}
		public void removeClient(ServerClient client) {
			clientList.remove(client);
			this.sendBroadcasting(client.getUserId()+" 님퇴장");
			displayLog("A.ServerClientService:"+client.getUserId()+" 님 퇴장");
			displayLog("B.ServerClientService:현재접속자수:"+
			clientList.size());
			
		}
		
		/*
		 *모든클라이언트에 메세지 전송
		 */
		public void sendBroadcasting(String msg){
			for (ServerClient client : clientList) {
				try {
					client.send(msg);
				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
		}
		
		
	}
	
}













