package myway.frame.salespanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

import myway.frame.MainFrame;

/*
 * SalesPanel - ��ǰ�Ǹ� �г�
 * 
 * 
 * �ֹ��г�, �ֹ�Ȯ�� �гη� ����
 * 
 * �ֹ��г��� CardLayout�� �����Ͽ� �޴�, ������, ��, ��ä, �ҽ� ���� �г��� ����
 */
public class SalesPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 5843167950646459983L;
    
    public static final int OPTION_ORDER_YES = 0;
    public static final int OPTION_ORDER_NO = 1;
    public static final int OPTION_ORDER_RESET = 2;
    
    SalesPanelManager mgr;
    // �ֹ� �г�
    private static JPanel orderPanel = new JPanel();
    // �ֹ� �г� ���̾ƿ�
    private static CardLayout cardLayout = new CardLayout();
    // �ֹ�Ȯ�� �г�
    private SalesPanelOrderReviewPanel orderReviewPanel;

    /* Constructor */
    public SalesPanel() {}
    
    public SalesPanel(MainFrame frame) throws Exception {
        mgr = new SalesPanelManager(this);
//        JPanel orderPanel = new JPanel();
//        CardLayout cardLayout = new CardLayout();
        
        // �ֹ�Ȯ�� �г� ����
        orderReviewPanel = new SalesPanelOrderReviewPanel(this);
        // �ֹ� �г� ���� �� CardLayout ����
        orderPanel = new JPanel(cardLayout);

        // �޴����� �г� ���� �� �ֹ��гο� add
        SalesPanelChoiceMenuPanel choiceMenuPanel = new SalesPanelChoiceMenuPanel(this);
        orderPanel.add(choiceMenuPanel);

        // ��ǰ�Ǹ� �гο� �ֹ��гΰ� �ֹ� Ȯ�� �г� add
        setLayout(new BorderLayout());
        add(orderReviewPanel, BorderLayout.CENTER);
        add(orderPanel, BorderLayout.EAST);
    }

    /* Method */
    // Getter
    public SalesPanelOrderReviewPanel getOrderReviewPanel() {
        return orderReviewPanel;
    }
    
    public SalesPanelManager getSalesPanelManager() {
        return mgr;
    }

    public static JPanel getOrderPanel() {
        return orderPanel;
    }

    public static CardLayout getCardLayout() {
        return cardLayout;
    }
}
