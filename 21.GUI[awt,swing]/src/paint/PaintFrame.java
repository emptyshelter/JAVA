package paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PaintFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintFrame frame = new PaintFrame();
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
	public PaintFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	/*
	/*
	public void paint(Graphics g)
		- Paints this component.
		- This method is called 
		   when the contents of the component should be painted; 
		   such as when the component is first being shown 
		   or is damaged and in need of repair. 
		- The clip rectangle in the Graphics parameter is set to the area which needs to be painted. 
		- Subclasses of Component that override this method 
		   need not call super.paint(g).
	 
	   - �� ������Ʈ�� �׸��ϴ�.
	   - �� �޼ҵ��, ���۳�Ʈ�� �������� ����Ʈ �� �ʿ䰡�ִ� ��쿡 �ҷ����ϴ�. 
	      ���� ��Ұ� ó�� ǥ�õǰų� 
	      �ջ�Ǿ� ������ �ʿ��� ���� ����.
	   - Graphics �Ű� ������ Ŭ�� �簢���� ĥ�ؾ� �� �������� �����˴ϴ�.
	   - �� �޼ҵ带 �������̵� (override)�ϴ� Component ���� Ŭ������ super.paint (g)�� ȣ�� �� �ʿ�� �����ϴ�.
	 */
	
	@Override
	public void paint(Graphics g) {
		Image backimage = 
				Toolkit.getDefaultToolkit().getImage("penguin_back.jpg");
		g.drawImage(backimage, 0, 0,getWidth(),getHeight(),this);
		System.out.println("paint"+Thread.currentThread().getName());
		/*
		 * <<Graphics>>
		 * - �����ӿ� �׸����ִ� �Ұ�ü
		 */
		//����
		String str = "Hello Java!!!";
		g.drawString(str, 80, 50);
		//����
		g.drawLine(0, 80, this.getWidth(), 80);
		//�簢��
		g.setColor(Color.PINK);
		g.drawRect(20, 90, 50, 50);
		g.setColor(Color.BLUE);
		g.fillRect(20, 150, 50, 50);
		//��
		g.setColor(Color.RED);
		g.drawOval(20, 210, 50, 50);
		g.fillOval(20, 270, 50, 50);
		//Image
		Image image1 = 
				Toolkit.getDefaultToolkit().getImage("penguin1.gif");
		Image image2 = 
				Toolkit.getDefaultToolkit().getImage("penguin2.gif");
		Image image3 = 
				Toolkit.getDefaultToolkit().getImage("penguin3.gif");
		g.drawImage(image1, 20,330,this);
		g.drawImage(image2, 100,330,this);
		g.drawImage(image3, 180,330,this);
	}

}