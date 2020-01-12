package com.itwill.account.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.account.Account;
import com.itwill.account.AccountService;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.print.attribute.standard.Fidelity;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AccountFrameMain extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTextField noTF;
	private JTextField ownerTF;
	private JTextField balanceTF;
	private JTextField iyulTF;

	/********AccountService선언***********/
	private AccountService accountService;
	private JTextArea listTA;
	/*********************************/
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountFrameMain frame = new AccountFrameMain();
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
	public AccountFrameMain() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel addP = new JPanel();
		tabbedPane.addTab("add", null, addP, null);
		addP.setLayout(null);
		
		JLabel lblNo = new JLabel("no");
		lblNo.setBounds(77, 37, 57, 15);
		addP.add(lblNo);
		
		JLabel lblOwner = new JLabel("owner");
		lblOwner.setBounds(77, 84, 57, 15);
		addP.add(lblOwner);
		
		JLabel lblBalance = new JLabel("balance");
		lblBalance.setBounds(77, 135, 57, 15);
		addP.add(lblBalance);
		
		JLabel lblIyul = new JLabel("iyul");
		lblIyul.setBounds(77, 183, 57, 15);
		addP.add(lblIyul);
		
		noTF = new JTextField();
		noTF.setBounds(188, 34, 116, 21);
		addP.add(noTF);
		noTF.setColumns(10);
		
		ownerTF = new JTextField();
		ownerTF.setBounds(188, 81, 116, 21);
		addP.add(ownerTF);
		ownerTF.setColumns(10);
		
		balanceTF = new JTextField();
		balanceTF.setBounds(188, 132, 116, 21);
		addP.add(balanceTF);
		balanceTF.setColumns(10);
		
		iyulTF = new JTextField();
		iyulTF.setBounds(188, 180, 116, 21);
		addP.add(iyulTF);
		iyulTF.setColumns(10);
		
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noStr = noTF.getText();
				String ownerStr=ownerTF.getText();
				String balanceStr=balanceTF.getText();
				String iyulStr=iyulTF.getText();
				Account addAccount=
						new Account(
								Integer.parseInt(noStr),
								ownerStr, 
								Integer.parseInt(balanceStr),
								Double.parseDouble(iyulStr));
				try {
					boolean isAdd = 
							accountService.addAccount(addAccount);
					if(isAdd) {
						JOptionPane.showMessageDialog(null, "계좌 추가 성공");
						tabbedPane.setSelectedIndex(1);
					}else {
						JOptionPane.showMessageDialog(null, "계좌 추가 실패");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "죄송합니다 ㅎ. ");
					
				}
				
			}
		});
		btnAdd.setBounds(143, 222, 97, 23);
		addP.add(btnAdd);
		
		JPanel listP = new JPanel();
		tabbedPane.addTab("list", null, listP, null);
		listP.setLayout(null);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 391, 224);
		listP.add(scrollPane);
		
		listTA = new JTextArea();
		scrollPane.setViewportView(listTA);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Account> accountList= 
							accountService.findAllAccount();
					String accountListStr="";
					for (Account account : accountList) {
						accountListStr += account.toString()+"\n";
					}
					listTA.setText(accountListStr);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "죄송합니다 ㅎ. ");
				}
			}
		});
		btnList.setBounds(10, 234, 79, 23);
		listP.add(btnList);
		
		JButton btnName = new JButton("findByNo");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accountNoStr= JOptionPane.showInputDialog(null,
						"번호를 입력하세요",
						"번호",
						JOptionPane.INFORMATION_MESSAGE);

				int accountNo =Integer.parseInt(accountNoStr);
				try {
					Account findAccount = accountService.findByNo(accountNo);
					if(findAccount==null) {
						JOptionPane.showMessageDialog(null,
								accountNo+" 계좌객체없네용!!!");
						return;
					}
					listTA.setText(findAccount.toString()+"\n");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnName.setBounds(138, 234, 84, 23);
		listP.add(btnName);
		
		JButton btnBalance = new JButton("findByOwner");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accountOwnerStr= JOptionPane.showInputDialog(null,
						"이름을 입력하세요",
						"이름",
						JOptionPane.INFORMATION_MESSAGE);
				try {
					ArrayList <Account> findAccount = 
							accountService.findByOwner(accountOwnerStr);
					String findOwner = "";
					for (Account account : findAccount) {
						findOwner+= account.toString()+"\n";
					}
					if (accountOwnerStr==null) {
						JOptionPane.showMessageDialog(null,
								accountOwnerStr+" 계좌객체없네용!!!");
						return;
					}
					listTA.setText(findOwner.toString()+"\n");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (rootPaneCheckingEnabled) {
					
				}
//				try {
//				String ownerStr=findTF.getText();
//				ArrayList<Account> findAccount = 
//						accountService.findByOwner(ownerStr);
//				String findBYOwner = "";
//				for (Account account : findAccount) {
//					findBYOwner += account.toString()+"\n";
//				}
//				listTA.setText(findBYOwner);
//			} catch (Exception e1) {
//				JOptionPane.showMessageDialog(null, "죄송합니다 ㅎ. ");
//			}
			}
		});
		btnBalance.setBounds(268, 234, 111, 23);
		listP.add(btnBalance);
		/********AccountService객체생성***********/
		accountService=new AccountService();
		/****************************************/
		tabbedPane.setSelectedIndex(1);
		
	}
//	private void getList(ActionEvent e1) throws Exception {
//		System.out.println(e1);
//		String ownerStr=findTF.getText();
//		String balanceStr=findTF.getText();
//		ArrayList<Account> findAccount = accountService.findByOwner(ownerStr);
//		String findBYOwner = "";
//		for (Account account : findAccount) {
//			if (ownerStr.equals(findAccount)) {
//				findBYOwner += accountService.findByOwner(ownerStr);
//			}
//		}
//	}
}
