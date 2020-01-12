package layout.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;

public class PanelJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelJFrame frame = new PanelJFrame();
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
	public PanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northP = new JPanel();
		northP.setBackground(Color.PINK);
		contentPane.add(northP, BorderLayout.NORTH);
		northP.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnProfessor = new JButton("Professor");
		northP.add(btnProfessor);
		
		JButton btnStudent = new JButton("Student");
		northP.add(btnStudent);
		
		JButton btnStaff = new JButton("Staff");
		northP.add(btnStaff);
		
		JPanel southP = new JPanel();
		southP.setBackground(Color.ORANGE);
		contentPane.add(southP, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("Add");
		southP.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		southP.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		southP.add(btnDelete);
		
		JButton btnList = new JButton("List");
		southP.add(btnList);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\uAE40\uD0DC\uD76C", "\uC6B0\uD06C\uB77C\uC774\uB098", "\uBE44", "\uAE40\uC218\uB85C", "\uACE0\uC18C\uC601", "\uC7A5\uB3D9\uAC74"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.WEST);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\uAE40\uD0DC\uD76C: \uC624\uB298 \uBB50\uD558\uC138\uC694?\r\n\uBE44: \uC624\uB298\uBB50\uD558\uC138\uC694?\r\n");
		contentPane.add(textPane, BorderLayout.CENTER);
	}

}
