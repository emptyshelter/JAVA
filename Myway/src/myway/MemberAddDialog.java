package myway;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import myway.exception.IdDuplicateException;
import myway.file.image.ImageIcons;
import myway.frame.MainFrame;
import myway.member.MemberManager;

public class MemberAddDialog extends JDialog {
	private static final long serialVersionUID = -5443403788252494043L;
	
	private static final String MEMBER_NAME = "이름을 입력해주세요.";
	private static final String MEMBER_ID = "ID를 입력해주세요.";
	private static final String MEMBER_PWF = "PW를 입력해주세요.";
	
	MemberAddDialog thisDialog;
	JPanel panel;
	
	private MainFrame frame;
	private JPanel contentPane;
	private JTextField memberNameF;
	private JTextField memberIdF;
	private JPasswordField memberPwF;
	private JCheckBox isAdminCB;
	
	
	private FocusListener idListener;
	private FocusListener pwListener;
	private FocusListener nameListener;
	
	
	private MemberManager memberManager;
	
	private String name;
	private String id;
	private String pw;
	private boolean isAdmin;

	/**
	 * Create the frame.
	 */
	public MemberAddDialog() {}
	
	public MemberAddDialog(MainFrame frame) {
		super(frame);
		name = "";
		id = "";
		pw = "";
		isAdmin = false;
		thisDialog = this;
		this.frame = frame;
		setType(Type.POPUP);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// 이름 필드.
		memberNameF = new JTextField();
		nameListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (memberNameF.getText().trim().equals("")) {
					memberNameF.setText(MEMBER_NAME);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				memberNameF.setText("");
			}
		};
		memberNameF.addFocusListener(nameListener);
		memberNameF.setHorizontalAlignment(SwingConstants.CENTER);
		memberNameF.setBounds(96, 44, 150, 21);
		panel.add(memberNameF);
		memberNameF.setColumns(12);

		// ID 필드. 
		// ID필드에 포커스가 들어오면
		// MEMBER_ID가 사라지고 ID를 입력하게 된다.
		// ID 입력 후 포커스가 사라지면 ID가 유지되어야 한다.
		memberIdF = new JTextField();
		idListener = new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (memberIdF.getText().trim().equals("")) {
					memberIdF.setText(MEMBER_ID);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				memberIdF.setText("");
			}
		};
		
		memberIdF.addFocusListener(idListener);
		memberIdF.setHorizontalAlignment(SwingConstants.CENTER);
		memberIdF.setBounds(96, 84, 150, 21);
		panel.add(memberIdF);
		memberIdF.setColumns(10);

		// PW 필드.
		memberPwF = new JPasswordField();
		pwListener = new FocusListener() {
			
			@Override
			public void focusGained(FocusEvent e) {
				memberPwF.setEchoChar('●');
				memberPwF.setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (String.valueOf(memberPwF.getPassword()).trim().equals("")) {
					
					memberPwF.setEchoChar((char)0);
					memberPwF.setText(MEMBER_PWF);
				}
			}
		};
		memberPwF.setEchoChar((char) 0);
		memberPwF.addFocusListener(pwListener);
		
		memberPwF.setHorizontalAlignment(SwingConstants.CENTER);
		memberPwF.setBounds(96, 124, 150, 21);
		panel.add(memberPwF);

		// 관리자로 등록 체크박스
		isAdminCB = new JCheckBox("관리자로 등록");
		isAdminCB.setBounds(111, 167, 106, 23);
		panel.add(isAdminCB);

		// 확인버튼
		JButton btnOkB = new JButton("확인");
		btnOkB.setBounds(63, 217, 97, 23);
		btnOkB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					memberManager = frame.getMemberManager();
					
					name = memberNameF.getText();
					id = memberIdF.getText();
					pw = String.valueOf(memberPwF.getPassword());
					boolean isAdmin = isAdminCB.isSelected();
				
					memberManager.join(name, id, pw, isAdmin);
					dispose();
					frame.getMemberPanel().refreshTable();
				} catch (IdDuplicateException e1) {
					// Id 중복시 처리
					String message = "같은 아이디가 존재합니다.";
					JOptionPane.showMessageDialog(thisDialog, message);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnOkB);

		// 취소버튼
		JButton btnCancelB = new JButton("취소");
		btnCancelB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					dispose();
				}
			}
		});
		btnCancelB.setBounds(182, 217, 97, 23);
		
		refreshInfo();
		
		panel.add(btnCancelB);
	}
	
	/* Method */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		String filePath = ImageIcons.class.getResource("").getPath() + "AddMemberBack.png";
		Image img = Toolkit.getDefaultToolkit().getImage(filePath);
		g.drawImage(img, 0, 0, this);
		panel.repaint();
		panel.setOpaque(true);
	}
	
	// 등록버튼
    public void createUI() {
    	createUI("", "", "", false);
    }
    
    // 수정버튼
    public void createUI(String id, String pw, String name, boolean isAdmin) {
    	this.id = id;
    	this.pw = pw;
    	this.name = name;
    	this.isAdmin = isAdmin;
    	
    	setTitle("직원 등록/수정");
    	int width = 350;
    	int height = 320;
    	setSize(width, height);
    	int x = (frame.getWidth() - getWidth()) / 2 + frame.getX();
    	int y = (frame.getHeight() - getHeight()) / 2 + frame.getY();
    	setLocation(x, y);
    	setModal(true);
    	
    	if (id.equals("")) {
    		memberIdF.addFocusListener(idListener);
    	} else if (!id.equals("")) {
    		memberIdF.removeFocusListener(idListener);
    	}
    	if (pw.equals("")) {
    		memberPwF.addFocusListener(pwListener);
    	} else if (!pw.equals("")) {
    		memberPwF.removeFocusListener(pwListener);
    	}
    	if (name.equals("")) {
    		memberNameF.addFocusListener(nameListener);
    	} else if (!name.equals("")) {
    		memberNameF.removeFocusListener(nameListener);
    	}

    	refreshInfo();
    	
    	setVisible(true);
    }
    
    private void refreshInfo() {
    	memberNameF.setText(name.equals("") ? MEMBER_NAME : name);
    	memberIdF.setText(id.equals("") ? MEMBER_ID : this.id);
    	memberPwF.setText(pw.equals("") ? MEMBER_PWF : pw);
    	isAdminCB.setSelected(isAdmin);
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
