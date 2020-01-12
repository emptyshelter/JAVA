package myway.frame.salespanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import myway.menu.Menu;
import util.MyUtils;

/*
 * SalesPanelChoiceMenuPanel - �޴� ���� �г�
 * 
 * 
 * ��ü �޴� ����� �ҷ��ͼ� ������ŭ ��ư ����
 * 
 * ��ư�� ������ �ֹ� Ȯ�� �гο� �޴� �̹����� ����,
 * �� ���� �г��� �����ϰ� �ֹ� �г�(Card Layout)�� add
 */
public class SalesPanelChoiceMenuPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 9077139250689383591L;

    /* Constructor */
    public SalesPanelChoiceMenuPanel() {}
    
    public SalesPanelChoiceMenuPanel(SalesPanel salesPanel) {
        // �ֹ� �г�
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // �ֹ� �г��� ī�巹�̾ƿ�
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label ���� �� ��� ����
        JLabel choiceMenuLabel = new JLabel("�޴� ����");
        choiceMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel ����
        JPanel choiceMenuCenterPanel = new JPanel(new GridLayout(0, 1));
        
        // ��� �޴��� �ҷ��ͼ�
        for (Menu menu : mgr.getAllMenuList()) {
            // �ӽù�ư ����
            JButton tmpButton = new JButton(
                    "<html>" + menu.getMenuKorName() + "<br>" + menu.getMenuName() + "</html>");
            
            // ��ư�� ���� ActionListener
            ActionListener l = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // ������ �޴� �̹��� ����
                    mgr.setDetailsImage(menu);
                    // ������ ���� �г� ����, orderPanel�� add�� CardLayout next
                    SalesPanelChoiceSizePanel choiceSizePanel;
                    try {
                        choiceSizePanel = new SalesPanelChoiceSizePanel(salesPanel, menu);
                        orderPanel.add(choiceSizePanel);
                        cardLayout.next(orderPanel);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    // CardLayout�� ������ ���� �г� �߰� �� ������ �ѱ�
                    // �ֿܼ� ��� (�����)
                    MyUtils.clearConsole();
                    System.out.println(menu);
                }
            };
            
            // ������ ActionListner�� �ӽù�ư�� ����
            tmpButton.addActionListener(l);
            
            // �ӽù�ư�� CenterPanel�� add
            choiceMenuCenterPanel.add(tmpButton);
        } // for end

        // �г� ����
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceMenuLabel, BorderLayout.NORTH);
        add(choiceMenuCenterPanel, BorderLayout.CENTER);
    }
}
