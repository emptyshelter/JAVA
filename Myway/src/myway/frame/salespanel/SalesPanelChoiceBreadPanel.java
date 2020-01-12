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

import myway.product.sandwich.Sandwich;
import myway.product.sandwich.bread.Bread;
import util.MyUtils;

/*
 * SalesPanelChoiceBreadPanel - �� ���� �г�
 * 
 * 
 * ��ü �� ����� �ҷ��ͼ� ������ŭ ��ư ����
 * 
 * ��ư�� ������ �ֹ� Ȯ�� �гο� �� �̹����� ����,
 * ���� ���� �г��� �����ϰ� �ֹ� �г�(Card Layout)�� add
 */
public class SalesPanelChoiceBreadPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 7733837009411382042L;
    
    /* Constructor */
    public SalesPanelChoiceBreadPanel() {}

    public SalesPanelChoiceBreadPanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // �ֹ� �г�
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // �ֹ� �г��� ī�巹�̾ƿ�
        CardLayout cardLayout = SalesPanel.getCardLayout();
        
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label ���� �� ��� ����
        JLabel choiceBreadLabel = new JLabel("�� ����");
        choiceBreadLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel ����
        JPanel choiceBreadCenterPanel = new JPanel(new GridLayout(0, 1));
        // ��� ���� �ҷ��ͼ�
        for (Bread bread : mgr.getAllBreadList()) {
            // �ӽù�ư ����, �� ��ȣ(���) setActionCommand
            JButton tmpBtn = new JButton(
                    "<html>" + bread.getKorName() + "<br>" + bread.getName() + "</html>");
            tmpBtn.setActionCommand(String.valueOf(bread.getBreadNo()));

            // ��ư�� ���� ActionListener
            ActionListener l = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                    // ������ġ�� ������ �� Set
                    sandwich.setBread(Integer.parseInt(e.getActionCommand()));
                    // �� �̹����� ���� ��� ����
                    mgr.setDetailsImage(bread);
                    mgr.displayExtraList(SalesPanelManager.DETAILS_EXTRA, sandwich);
                    // ���� ���� �г� ����, orderPanel�� add�� CardLayout next
                    SalesPanelChoiceExtraPanel choiceExtraPanel;
                    choiceExtraPanel = new SalesPanelChoiceExtraPanel(salesPanel, sandwich);
                    orderPanel.add(choiceExtraPanel);
                    cardLayout.next(orderPanel);
                    // �ֿܼ� ��� (�����)
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            };
            
            // ������ ActionListner�� �ӽù�ư�� ����
            tmpBtn.addActionListener(l);
            
            // �ӽù�ư�� CenterPanel�� add
            choiceBreadCenterPanel.add(tmpBtn);
        } // for end

        // ���� ��ư ����, ActionListner ����
        JButton prevBtn = new JButton("���� : ������ ����");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ���� ��������
                cardLayout.previous(orderPanel);
                // �� ���� �г� ����
                mgr.removeLastComponent();
                // �ֹ�Ȯ�� �г��� ������ �̹��� ����
                mgr.removeDetailsImage(SalesPanelManager.DETAILS_SIZE);
            }
        });
        
        // �г� ����
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceBreadLabel, BorderLayout.NORTH);
        add(choiceBreadCenterPanel, BorderLayout.CENTER);
        add(prevBtn, BorderLayout.SOUTH);
    }
}
