package myway.frame.memberpanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import myway.MemberAddDialog;
import myway.frame.MainFrame;
import myway.frame.loginpanel.LoginPanel;
import myway.member.Member;
import myway.member.MemberManager;

public class MemberPanel extends JPanel {
    private static final long serialVersionUID = -7225343638417587840L;
    
    private MemberAddDialog memberAddFrame;
    
    private JPanel btnPanel;
    private JButton deleteB;
    private JButton registerB;
    private JButton modifyB;
    private JTable table;
    private MemberManager mbmgr;
    private DefaultTableModel model;
    

    public MemberPanel(MainFrame frame) throws Exception {
        setLayout(new BorderLayout());

        mbmgr = new MemberManager();

        // Table
        table = new JTable(model);
        refreshTable();
        
        // Table Panel
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Button Panel
        btnPanel = new JPanel();

        // 등록버튼 & Listener
        registerB = new JButton("직원등록");
        registerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new MemberAddDialog(frame).createUI();
            }
        });
        btnPanel.add(registerB);
        // 수정버튼 & Listener
        modifyB = new JButton("직원수정");
        modifyB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(frame, "수정할 직원정보를 선택해주세요.");
                    return;
                }
                
                String id = table.getValueAt(row, 1).toString();
                String pw = table.getValueAt(row, 2).toString();
                String name = table.getValueAt(row, 3).toString();
                boolean isAdmin = ((String)table.getValueAt(row, 4)).equals("Y");
                
                MemberAddDialog mad = new MemberAddDialog(frame);
//                mad.setId(id);
//                mad.setPw(pw);
//                mad.setName(name);
//                mad.setAdmin(isAdmin);
                mad.createUI(id, pw, name, isAdmin);
            }
        });
        btnPanel.add(modifyB);
        // 삭제버튼 & Listener
        deleteB = new JButton("직원해고");
        deleteB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 테이블 선택되지 않음
                    int row = table.getSelectedRow();
                    if (row == -1) {
                    	String message = "삭제할 직원정보를 선택해주세요.";
                    	String title = "직원 삭제";
                    	int messageType = JOptionPane.WARNING_MESSAGE;
                        JOptionPane.showMessageDialog(frame, message, title, messageType);
                        return;
                    }
                    // 로그인중인 직원 삭제
                    if ((int) table.getValueAt(row, 0) == frame.getLoginMember().getNo()) {
                        String message = "로그인중인 직원은 삭제할 수 없습니다.";
                        String title = "직원 삭제";
                        int messageType = JOptionPane.WARNING_MESSAGE;
                        JOptionPane.showMessageDialog(frame, message, title, messageType);
                        return;
                    }
                    
                    String message = "선택한 직원의 정보를 삭제합니다.";
                    String title = "직원 삭제";
                    int optionType = JOptionPane.YES_NO_OPTION;
                    int messageType = JOptionPane.QUESTION_MESSAGE;
                    int r = JOptionPane.showConfirmDialog(frame, message, title, optionType,
                            messageType);
                    if (r == JOptionPane.YES_OPTION) {
                        mbmgr.delete((int) (table.getValueAt(row, 0)));
                        refreshTable();
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

        });
        // Button Panel
        btnPanel.add(deleteB);

        // add
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
    }

    public void refreshTable() throws Exception {
        model = new DefaultTableModel(getDataVector(), getHeaderVector());
        table.setModel(model);
    }

    private Vector<Object> getHeaderVector() {
        Vector<Object> headerVector = new Vector<>();
        headerVector.add("번호");
        headerVector.add("ID");
        headerVector.add("PW");
        headerVector.add("이름");
        headerVector.add("관리자여부");
        return headerVector;
    }

    private Vector<Vector<Object>> getDataVector() throws Exception {
        Vector<Vector<Object>> dataVector = new Vector<>();

        ArrayList<Member> getMember = mbmgr.selectAll();
        for (Member member : getMember) {
            Vector<Object> rowVector = new Vector<>();
            // no
            rowVector.add(member.getNo());
            // id
            rowVector.add(member.getId());
            // pw
            StringBuilder pw = new StringBuilder();
            for (int i = 0; i < member.getPw().length(); i++) {
                pw.append("●");
            }
            rowVector.add(pw);
            // name
            rowVector.add(member.getName());
            // isAdmin
            rowVector.add(member.isAdmin() ? "Y" : "");

            dataVector.add(rowVector);
        }
        return dataVector;
    }

}
