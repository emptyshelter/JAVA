package paint;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		/*****************/
		backImage=Toolkit.getDefaultToolkit()
				.getImage("penguin_back.jpg");
		penguins=new Image[3];
		penguins[0]=Toolkit.getDefaultToolkit()
				.getImage("penguin1.gif");
		penguins[1]=Toolkit.getDefaultToolkit()
				.getImage("penguin2.gif");
		penguins[2]=Toolkit.getDefaultToolkit()
				.getImage("penguin3.gif");
		pX=10;
		pY=300;
		imageNo=0;
		/*****************/
		requestFocus();
		//event
		this.addKeyListener(new KeyHandler());
	}
	Image backImage;
	Image[] penguins;
	int pX,pY;//�������ġ
	int imageNo;//������̹�����ȣ
	@Override
	public void paint(Graphics g) {
		g.drawImage(backImage, 0, 0,getWidth(),getHeight(),this);
		g.drawImage(penguins[imageNo],pX,pY,this);
	}
	/****************KeyListener Impl*********/
	public class KeyHandler implements KeyListener{
		public void keyPressed(KeyEvent e) {
//			System.out.println("keyPressed:"+e.getKeyCode());
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {
				pX-=5;
				if(pX <= 0) {
					pX = 0;
				}
			}else if(keyCode==KeyEvent.VK_RIGHT) {
				if(pX >= getWidth()-penguins[0].getWidth(new JButton())) {
					pX = getWidth()-penguins[0].getWidth(new JButton());
				}
				pX+=5;
			}
//			}else if(keyCode==KeyEvent.VK_UP) {
//				pY-=5;
//				if(pY <= 0) {
//					pY = 0;
//				}
//			}else if(keyCode==KeyEvent.VK_DOWN)
//				if(pY >= getHeight()-penguins[0].getHeight(new JButton())) {
//					pY = getHeight()-penguins[0].getHeight(new JButton());
//				}
//				pY+=5;
				
			imageNo++;
			imageNo = imageNo%3;
			
			/*
			public void repaint()
			  - Repaints this component.
			  - If this component is a lightweight component, 
			    this method causes a call to 
			    this component's paint method as soon as possible. 
			    Otherwise, this method causes a call to 
			    this component's update method as soon as possible.
			 */
			repaint();
			
		}
		public void keyTyped(KeyEvent e) {
//			System.out.println("keyTyped:"+e.getKeyChar());
		}
		public void keyReleased(KeyEvent e) {
//			System.out.println("keyReleased"+e.getKeyCode());
		}
		
	}
	/*****************************************/
}










