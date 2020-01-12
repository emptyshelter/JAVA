package com.itwill.web;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginDialog extends JDialog {

	MainFrame mainFrame;

	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JButton okButton;
	private JButton cancelButton;
	private JPasswordField passTF;
	private boolean isEnable = false;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { try { LoginDialog dialog = new
	 * LoginDialog(); dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */
	/**
	 * Create the dialog.
	 */
	public LoginDialog(MainFrame frame) {
		super(frame);
		this.mainFrame = frame;
		setBounds(100, 100, 222, 152);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(12, 27, 57, 15);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(12, 55, 57, 15);
		contentPanel.add(lblNewLabel_1);

		idTF = new JTextField();
		idTF.setBounds(81, 24, 116, 21);
		contentPanel.add(idTF);
		idTF.setColumns(10);

		passTF = new JPasswordField();
		passTF.setBounds(81, 52, 116, 21);
		contentPanel.add(passTF);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String id = idTF.getText();
						char[] passCharArray = passTF.getPassword();
						String passStr = new String(passCharArray);
						if (id.equals("") || passStr.equals("")) {
							JOptionPane.showMessageDialog(null, "아이디,패쓰워드를 입력하세요!!");
							idTF.requestFocus();
							isEnable = false; // login 실패

							return;
						}

						// memberManager.login(id,pass);
						System.out.println("memberManager.login(id,pass)호출");
						try {

							boolean loginSuccess = mainFrame.adminManager.login(id, passStr);
							if (loginSuccess) {

								System.out.println(id + "님 로그인 되셨습니다.");
								
								JOptionPane.showMessageDialog(null, "로그인 되셨습니다!");
								mainFrame.setTitle(id + " 님 로그인중");
								isEnable = true; // login 성공
								dispose();

							} else {
								isEnable = false; // login 실패
								int result = JOptionPane.showConfirmDialog(null, "로그인실패 다시로그인할래요?", "경고",
										JOptionPane.YES_NO_OPTION);
								if (result == JOptionPane.YES_OPTION) {
									idTF.requestFocus();
									idTF.selectAll();
								} else if (result == JOptionPane.NO_OPTION) {
									dispose();
								}
							}

						} catch (Exception e11) {
							dispose();
						}
					}
				});
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LoginDialog.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public boolean isEnable() {
		return isEnable;
	} // Main으로 boolean 전달을 위해 생성 -> tab 활성화 여부를 결정하기 위해서 login 성공 여부 전달용!

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
}
