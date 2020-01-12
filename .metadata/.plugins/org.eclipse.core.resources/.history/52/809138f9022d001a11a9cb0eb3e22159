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
 * SalesPanelChoiceMenuPanel - 메뉴 선택 패널
 * 
 * 
 * 전체 메뉴 목록을 불러와서 개수만큼 버튼 생성
 * 
 * 버튼을 누르면 주문 확인 패널에 메뉴 이미지를 노출,
 * 빵 선택 패널을 생성하고 주문 패널(Card Layout)에 add
 */
public class SalesPanelChoiceMenuPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 9077139250689383591L;

    /* Constructor */
    public SalesPanelChoiceMenuPanel() {}
    
    public SalesPanelChoiceMenuPanel(SalesPanel salesPanel) {
        // 주문 패널
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // 주문 패널의 카드레이아웃
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label 생성 후 가운데 정렬
        JLabel choiceMenuLabel = new JLabel("메뉴 선택");
        choiceMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel 생성
        JPanel choiceMenuCenterPanel = new JPanel(new GridLayout(0, 1));
        
        // 모든 메뉴를 불러와서
        for (Menu menu : mgr.getAllMenuList()) {
            // 임시버튼 생성
            JButton tmpButton = new JButton(
                    "<html>" + menu.getMenuKorName() + "<br>" + menu.getMenuName() + "</html>");
            
            // 버튼에 붙일 ActionListener
            ActionListener l = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // 선택한 메뉴 이미지 노출
                    mgr.setDetailsImage(menu);
                    // 사이즈 선택 패널 생성, orderPanel에 add후 CardLayout next
                    SalesPanelChoiceSizePanel choiceSizePanel;
                    try {
                        choiceSizePanel = new SalesPanelChoiceSizePanel(salesPanel, menu);
                        orderPanel.add(choiceSizePanel);
                        cardLayout.next(orderPanel);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    // CardLayout에 사이즈 선택 패널 추가 후 페이지 넘김
                    // 콘솔에 출력 (디버깅)
                    MyUtils.clearConsole();
                    System.out.println(menu);
                }
            };
            
            // 생성한 ActionListner를 임시버튼에 부착
            tmpButton.addActionListener(l);
            
            // 임시버튼을 CenterPanel에 add
            choiceMenuCenterPanel.add(tmpButton);
        } // for end

        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceMenuLabel, BorderLayout.NORTH);
        add(choiceMenuCenterPanel, BorderLayout.CENTER);
    }
}
