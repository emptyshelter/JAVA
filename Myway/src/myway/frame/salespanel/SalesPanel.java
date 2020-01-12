package myway.frame.salespanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

import myway.frame.MainFrame;

/*
 * SalesPanel - 상품판매 패널
 * 
 * 
 * 주문패널, 주문확인 패널로 구성
 * 
 * 주문패널은 CardLayout을 설정하여 메뉴, 사이즈, 빵, 야채, 소스 선택 패널을 가짐
 */
public class SalesPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 5843167950646459983L;
    
    public static final int OPTION_ORDER_YES = 0;
    public static final int OPTION_ORDER_NO = 1;
    public static final int OPTION_ORDER_RESET = 2;
    
    SalesPanelManager mgr;
    // 주문 패널
    private static JPanel orderPanel = new JPanel();
    // 주문 패널 레이아웃
    private static CardLayout cardLayout = new CardLayout();
    // 주문확인 패널
    private SalesPanelOrderReviewPanel orderReviewPanel;

    /* Constructor */
    public SalesPanel() {}
    
    public SalesPanel(MainFrame frame) throws Exception {
        mgr = new SalesPanelManager(this);
//        JPanel orderPanel = new JPanel();
//        CardLayout cardLayout = new CardLayout();
        
        // 주문확인 패널 생성
        orderReviewPanel = new SalesPanelOrderReviewPanel(this);
        // 주문 패널 생성 후 CardLayout 설정
        orderPanel = new JPanel(cardLayout);

        // 메뉴선택 패널 생성 후 주문패널에 add
        SalesPanelChoiceMenuPanel choiceMenuPanel = new SalesPanelChoiceMenuPanel(this);
        orderPanel.add(choiceMenuPanel);

        // 상품판매 패널에 주문패널과 주문 확인 패널 add
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
