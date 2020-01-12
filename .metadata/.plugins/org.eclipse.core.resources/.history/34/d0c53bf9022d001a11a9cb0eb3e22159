package myway.frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import myway.frame.loginpanel.LoginPanel;
import myway.frame.memberpanel.MemberPanel;
import myway.frame.salespanel.SalesPanel;
import myway.frame.statspanel.StatsPanel;
import myway.frame.stockpanel.StockPanel;
import myway.member.Member;
import myway.member.MemberManager;

public class MainFrame extends JFrame {
    /* Variable */
    private static final long serialVersionUID = -3556235278189419922L;

    public static final String FRAME_TITLE = "MyWay - 본격 매장관리 프로그램 v1.0";
    public static final int PANEL_LOGIN = 1;
    public static final int PANEL_MAIN = 2;
    
    public static final int TAB_SALES = 0;
    public static final int TAB_STATS = 1;
    public static final int TAB_STOCK = 2;
    public static final int TAB_MEMBER = 3;
    public static final int TAB_LOGOUT = 4;

    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    public static final Dimension FRAME_DIMENSION = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);

    private MainFrame frame;
    private JPanel contentPane;

    private LoginPanel loginPanel;
    private SalesPanel salesPanel;
    private StatsPanel salesLogPanel;
    private StockPanel stockManagerPanel;
    private MemberPanel memberPanel;

    private Component currentPanel;
    private JTabbedPane tabbedPane;
    
    private MemberManager memberManager;

    private Member loginMember;
    private boolean isAdmin;
    private int lastTabIndex;

    /* Constructor */
    public MainFrame() throws Exception {
        frame = this;
        setTitle(FRAME_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        memberManager = new MemberManager();

        tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        // tabbedPane listener
        tabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                try {
                    int tabIndex = tabbedPane.getSelectedIndex();

                    switch (tabIndex) {
                        case TAB_SALES:
                            break;

                        case TAB_STATS:
                            salesLogPanel.tableRefresh();
                            break;

                        case TAB_STOCK:
                            stockManagerPanel.tableRefresh();
                            break;

                        case TAB_MEMBER:
                            if (!isAdmin) {
                                tabbedPane.setSelectedIndex(lastTabIndex);
                                JOptionPane.showMessageDialog(frame, "권한이 없습니다.");
                                return;
                            }
                            memberPanel.refreshTable();
                            break;

                        case TAB_LOGOUT:
                            String message = "로그아웃 하시겠습니까?";
                            int optionType = JOptionPane.YES_NO_OPTION;
                            int messageType = JOptionPane.QUESTION_MESSAGE;
                            int response = JOptionPane.showConfirmDialog(frame, message, "Logout",
                                    optionType, messageType);
                            if (response == JOptionPane.YES_OPTION) {
                                loginPanel.logout();
                            } else {
                                tabbedPane.setSelectedIndex(lastTabIndex);
                            }
                            return;

                        default:
                            break;
                    }

                    lastTabIndex = tabIndex;
                } catch (Exception e1) {
                    e1.printStackTrace();
                } // try-catch

            } // method
        }); // listener

        loginPanel = new LoginPanel(this);

        salesPanel = new SalesPanel(this);
        tabbedPane.addTab("상품판매", null, salesPanel, null);

        salesLogPanel = new StatsPanel();
        tabbedPane.addTab("판매기록", null, salesLogPanel, null);

        stockManagerPanel = new StockPanel();
        tabbedPane.addTab("재고관리", null, stockManagerPanel, null);

        memberPanel = new MemberPanel(this);
        tabbedPane.addTab("직원관리", memberPanel);

        tabbedPane.addTab("로그아웃", null);
        



        changePanel(PANEL_LOGIN);
        setVisible(true);
    }

    public void changePanel(int changePanel) {
        /*
         * 현재패널제거
         */
        if (currentPanel != null) {
            contentPane.remove(currentPanel);
        }
        //contentPane.invalidate();
        contentPane.repaint();

        /*
         * 새로운패널부치기
         */
        switch (changePanel) {
            case PANEL_LOGIN:
                contentPane.add(loginPanel, BorderLayout.CENTER);

                currentPanel = loginPanel;
                break;
            case PANEL_MAIN:
                contentPane.add(tabbedPane, BorderLayout.CENTER);
                currentPanel = tabbedPane;
                break;

        }
        contentPane.validate();

    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public SalesPanel getSalesPanel() {
        return salesPanel;
    }

    public StatsPanel getSalesLogPanel() {
        return salesLogPanel;
    }

    public StockPanel getStockManagerPanel() {
        return stockManagerPanel;
    }

    public MemberManager getMemberManager() {
		return memberManager;
	}

	public MemberPanel getMemberPanel() {
        return memberPanel;
    }
    
    public boolean isAdmin() {
        return isAdmin;
    }
 
	public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Member getLoginMember() {
        return loginMember;
    }

    public void setLoginMember(Member loginMember) {
        this.loginMember = loginMember;
    }
}
