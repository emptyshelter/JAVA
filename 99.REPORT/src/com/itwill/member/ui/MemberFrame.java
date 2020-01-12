package com.itwill.member.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemberFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idTF;
	private JTextField pwTF;
	private MemberService memberservice;
	private JTextField joinIdTF;
	private JTextField nameTF;
	private JTextField ageTF;
	private JTextField passwordTF;
	private JTextField addressTF;
	private JTextArea listTA;
	private JTextField marriedTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberFrame frame = new MemberFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MemberFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel loginP = new JPanel();
		tabbedPane.addTab("login", null, loginP, null);
		loginP.setLayout(null);
		
		JButton btnLogIn = new JButton("log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idTF.getText();
				String pw = pwTF.getText();
				try {
					int login = memberservice.login(id, pw);
					if (login == 0) {
						setTitle(id+" �� �α��� ����");
						tabbedPane.setEnabledAt(2,true);
						tabbedPane.setSelectedIndex(2);
						tabbedPane.setEnabledAt(0, false);
						tabbedPane.setEnabledAt(1, false);
					}else if (login == 1) {
						System.out.println("���̵��������� �ʽ��ϴ�.");
					}else if (login == 2) {
						System.out.println("��й�ȣ �����Դϴ�.");
					} 
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,
							" �ȹٷ� �Է����ּ���!!!");
				}
			}
		});
		btnLogIn.setBounds(144, 160, 97, 23);
		loginP.add(btnLogIn);
		
		idTF = new JTextField();
		idTF.setBounds(144, 57, 116, 21);
		loginP.add(idTF);
		idTF.setColumns(10);
		
		pwTF = new JTextField();
		pwTF.setBounds(144, 101, 116, 21);
		loginP.add(pwTF);
		pwTF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(64, 60, 57, 15);
		loginP.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(64, 104, 68, 15);
		loginP.add(lblNewLabel_1);
		
		JPanel joinP = new JPanel();
		tabbedPane.addTab("join", null, joinP, null);
		joinP.setLayout(null);
		
		JButton joinB = new JButton("join");
		joinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =joinIdTF.getText();
				String password = passwordTF.getText();
				String name = nameTF.getText();
				String address = addressTF.getText();
				int age = Integer.parseInt(ageTF.getText());
				boolean married = Boolean.parseBoolean(marriedTF.getText());
				Member addMember = 
						new Member(id, password,name,address,age,married);
				try {
					boolean isAdd = 
							memberservice.memberRegister(addMember);
					if (isAdd) {
						JOptionPane.showMessageDialog(null, "����߰�����!!");
					}else {
						JOptionPane.showMessageDialog(null,"��� ������ �������ּ���");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "����!!!");
				}
								
				
				
			}
		});
		joinB.setBounds(35, 190, 97, 23);
		joinP.add(joinB);
		
		joinIdTF = new JTextField();
		joinIdTF.setBounds(78, 28, 116, 21);
		joinP.add(joinIdTF);
		joinIdTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setBounds(78, 81, 116, 21);
		joinP.add(nameTF);
		nameTF.setColumns(10);
		
		ageTF = new JTextField();
		ageTF.setBounds(78, 133, 116, 21);
		joinP.add(ageTF);
		ageTF.setColumns(10);
		
		passwordTF = new JTextField();
		passwordTF.setBounds(275, 28, 116, 21);
		joinP.add(passwordTF);
		passwordTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(275, 81, 116, 21);
		joinP.add(addressTF);
		addressTF.setColumns(10);
		
		JLabel passwordL = new JLabel("password");
		passwordL.setBounds(206, 31, 57, 15);
		joinP.add(passwordL);
		
		JLabel addressL = new JLabel("address");
		addressL.setBounds(206, 84, 57, 15);
		joinP.add(addressL);
		
		JLabel marriedL = new JLabel("married");
		marriedL.setBounds(206, 136, 57, 15);
		joinP.add(marriedL);
		
		JLabel idL = new JLabel("id");
		idL.setBounds(9, 31, 57, 15);
		joinP.add(idL);
		
		JLabel nameL = new JLabel("name");
		nameL.setBounds(9, 84, 57, 15);
		joinP.add(nameL);
		
		JLabel ageL = new JLabel("age");
		ageL.setBounds(9, 136, 57, 15);
		joinP.add(ageL);
		
		marriedTF = new JTextField();
		marriedTF.setBounds(275, 133, 116, 21);
		joinP.add(marriedTF);
		marriedTF.setColumns(10);
		
		JButton updateB = new JButton("update");
		updateB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =joinIdTF.getText();
				String password = passwordTF.getText();
				String name = nameTF.getText();
				String address = addressTF.getText();
				int age = Integer.parseInt(ageTF.getText());
				boolean married = Boolean.parseBoolean(marriedTF.getText());
				Member updateMember = 
						new Member(id, password,name,address,age,married);
				try {
					memberservice.updateMember(updateMember);
					JOptionPane.showMessageDialog(null, id+" ���� ������ ����Ǿ����ϴ�.");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "����� �߸� �����ϼ̽��ϴ�.");
				}
			}
		});
		updateB.setBounds(166, 190, 97, 23);
		joinP.add(updateB);
		
		JButton deleteB = new JButton("delete");
		deleteB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =joinIdTF.getText();
				try {
					memberservice.deleteMember(id);
					JOptionPane.showMessageDialog(null, id+" �� �������� �ٽ� ã���ּ���.");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "����� �ƴմϴ�.");
				}
				
			}
		});
		deleteB.setBounds(294, 190, 97, 23);
		joinP.add(deleteB);
		
		JPanel listP = new JPanel();
		tabbedPane.addTab("list", null, listP, null);
		tabbedPane.setEnabledAt(2, false);
		listP.setLayout(null);
		
		JButton nameB = new JButton("name");
		nameB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String memberNameStr= JOptionPane.showInputDialog(null,
						"�̸��� �Է��ϼ���",
						"�̸�",
						JOptionPane.INFORMATION_MESSAGE);
				try {
					ArrayList<Member> findMember = 
							memberservice.findMemberByName(memberNameStr);
					String findName = "";
					for (Member member : findMember) {
						findName += member.toString()+"\n";
					}
					if (memberNameStr==null) {
						JOptionPane.showMessageDialog(null,
								memberNameStr+" ����ƴϴ�!!!");
						return;
					}
					listTA.setText(findName.toString()+"\n");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			
			}
		});
		nameB.setBounds(139, 190, 80, 23);
		listP.add(nameB);
		
		JButton addressB = new JButton("address");
		addressB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String memberAddStr= JOptionPane.showInputDialog(null,
						"������ �Է��ϼ���",
						"����",
						JOptionPane.INFORMATION_MESSAGE);
				try {
					ArrayList<Member>findMember = 
							memberservice.findMemberByAdress(memberAddStr);
					String findAdress = "";
					for (Member member : findMember) {
						findAdress += member.toString()+"\n";
					}
					if (memberAddStr == null) {
						JOptionPane.showMessageDialog(null, "�����ƴϴ�~");
						return;
					}
					listTA.setText(findAdress.toString()+"\n");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		addressB.setBounds(235, 190, 80, 23);
		listP.add(addressB);
		
		JButton ageB = new JButton("age");
		ageB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String memberAgeStr = JOptionPane.showInputDialog(null,
						"���̸� �Է��ϼ���",
						"����",
						JOptionPane.INFORMATION_MESSAGE);
				int age = Integer.parseInt(memberAgeStr);
				try {
					ArrayList<Member> findmember =
							memberservice.findMemberByAge(age);
					String findAge = "";
					for (Member member : findmember) {
						findAge += member.toString()+"\n";
					}
					listTA.setText(findAge.toString()+"\n");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ageB.setBounds(327, 190, 80, 23);
		listP.add(ageB);
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 395, 170);
		listP.add(scrollPane);
		
		listTA = new JTextArea();
		scrollPane.setViewportView(listTA);
		
		JButton listB = new JButton("list");
		listB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						ArrayList<Member> findMember = memberservice.findMemberByAll();
						String allMember ="";
						for (Member member : findMember) {
							allMember += member.toString()+"\n";
						}
						listTA.setText(allMember);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "����� �����ϴ�.");
					}
			}
		});
		listB.setBounds(22, 190, 97, 23);
		listP.add(listB);
		memberservice = new MemberService();
	}
}