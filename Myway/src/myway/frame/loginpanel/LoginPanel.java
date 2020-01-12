package myway.frame.loginpanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import myway.exception.IdNotFoundException;
import myway.exception.InvalidPasswordException;
import myway.exception.NoRegisteredMemberException;
import myway.file.image.ImageIcons;
import myway.frame.MainFrame;
import myway.member.Member;
import myway.member.MemberManager;

public class LoginPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = -7830075948719733192L;

    private MemberManager memberMgr;
    private boolean isLogin;
    private JTextField txtId;
    private JPasswordField passwordField;
    private JButton btnNewLogon;
    private JPanel loginArea;
    MainFrame mainFrame;
    public static final String INPUT_ID = "아이디를 입력해주세요.";
    public static final String INPUT_PW = "비밀번호를 입력해주세요.";

    /* Constructor */
    public LoginPanel() {}
    
    public LoginPanel(MainFrame frame) throws Exception {
        this.mainFrame = frame;
        memberMgr = new MemberManager();

        // 아이디, 비밀번호 입력창에 붙일 KeyAdapter
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    loginStep();
                }
            }
        };

        // 아이디 TextField
        txtId = new JTextField();
        txtId.setBounds(125, 20, 150, 20);
        txtId.setText(INPUT_ID);
        txtId.setColumns(10);
        txtId.setHorizontalAlignment(SwingConstants.CENTER);
        txtId.addKeyListener(keyAdapter);
        txtId.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (txtId.getText().trim().equals("")) {
                    txtId.setText(INPUT_ID);
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtId.setText("");
            }
        });

        // 비밀번호 PasswordField
        passwordField = new JPasswordField();
        passwordField.setBounds(125, 60, 150, 20);
        passwordField.setEchoChar((char) 0);
        passwordField.setText(INPUT_PW);
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.addKeyListener(keyAdapter);
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).trim().equals("")) {
                    passwordField.setEchoChar((char) 0);
                    passwordField.setText(INPUT_PW);
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                passwordField.setEchoChar('●');
                passwordField.setText("");
            }
        });

        // 로그인 버튼
        btnNewLogon = new JButton("로그인");
        btnNewLogon.setBounds(150, 100, 100, 25);
        btnNewLogon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginStep();
            }
        });

        // 로그인 패널
        int width = 400;
        int height = 150;
        loginArea = new JPanel(null);
        loginArea.setBounds((MainFrame.FRAME_WIDTH - width) / 2, 320, width, height);
        loginArea.setBackground(new Color(0, 84, 60));
        loginArea.add(txtId);
        loginArea.add(passwordField);
        loginArea.add(btnNewLogon);

        // this
        setLayout(null);
        add(loginArea);
    }

    /* Method */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String path = ImageIcons.class.getResource("").getPath() + "SubwayLogo.png";
        Image img = Toolkit.getDefaultToolkit().getImage(path);
        g.drawImage(img, 0, 0, this);
        loginArea.repaint();
    }

    // 로그아웃
    public void logout() {
        isLogin = false;
        mainFrame.setAdmin(false);
        mainFrame.getTabbedPane().setSelectedIndex(MainFrame.TAB_SALES);
        mainFrame.setTitle(MainFrame.FRAME_TITLE);
        mainFrame.changePanel(MainFrame.PANEL_LOGIN);
    }

    // 로그인
    private void login(String id, String pw) throws Exception {
        Member loginMember = memberMgr.login(id, pw);
        txtId.setText(INPUT_ID);
        passwordField.setText(INPUT_PW);
        passwordField.setEchoChar((char) 0);
        mainFrame.setLoginMember(loginMember);
        mainFrame.setAdmin(loginMember.isAdmin());
        mainFrame.setTitle(MainFrame.FRAME_TITLE + " : " + loginMember.getName() + "님 로그인중"
                + (loginMember.isAdmin() ? "(관리자)" : ""));
        mainFrame.changePanel(MainFrame.PANEL_MAIN);
        if (loginMember.isAdmin()) {
            mainFrame.getTabbedPane().setEnabledAt(MainFrame.TAB_MEMBER, true);
        } else {
            mainFrame.getTabbedPane().setEnabledAt(MainFrame.TAB_MEMBER, false);
        }
    }

    // 회원가입
    private void join(String name, String id, String pw) throws Exception {
        memberMgr.join(name, id, pw, true);
    }

    // 로그인
    private void loginStep() {
        String id = null;
        String pw = null;
        try {
            id = txtId.getText();
            pw = String.valueOf(passwordField.getPassword());
            login(id, pw);
            isLogin = true;
        } catch (NoRegisteredMemberException e) {
            // 등록된 멤버 없음
            String message = "등록된 직원이 없습니다.\n관리자로 등록하려면 이름을 입력해주세요.";
            String name = JOptionPane.showInputDialog(mainFrame, message);
            if (name != null) {
                try {
                    join(name, id, pw);
                    login(id, pw);
                    isLogin = true;
                } catch (Exception e1) {
                    e1.printStackTrace();
                } // try-catch
            } // if
        } catch (IdNotFoundException e) {
            // ID없음
            JOptionPane.showMessageDialog(mainFrame, "존재하지 않는 아이디입니다.\n아이디를 확인해주세요.");
        } catch (InvalidPasswordException e) {
            // 패스워드 오류
            JOptionPane.showMessageDialog(mainFrame, "비밀번호가 맞지 않습니다.\n비밀번호를 확인해주세요.");
        } catch (Exception e) {
            e.printStackTrace();
        } //
    }
}
