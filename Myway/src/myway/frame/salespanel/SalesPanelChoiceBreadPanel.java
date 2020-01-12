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
 * SalesPanelChoiceBreadPanel - 빵 선택 패널
 * 
 * 
 * 전체 빵 목록을 불러와서 개수만큼 버튼 생성
 * 
 * 버튼을 누르면 주문 확인 패널에 빵 이미지를 노출,
 * 토핑 선택 패널을 생성하고 주문 패널(Card Layout)에 add
 */
public class SalesPanelChoiceBreadPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 7733837009411382042L;
    
    /* Constructor */
    public SalesPanelChoiceBreadPanel() {}

    public SalesPanelChoiceBreadPanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // 주문 패널
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // 주문 패널의 카드레이아웃
        CardLayout cardLayout = SalesPanel.getCardLayout();
        
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label 생성 후 가운데 정렬
        JLabel choiceBreadLabel = new JLabel("빵 선택");
        choiceBreadLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel 생성
        JPanel choiceBreadCenterPanel = new JPanel(new GridLayout(0, 1));
        // 모든 빵을 불러와서
        for (Bread bread : mgr.getAllBreadList()) {
            // 임시버튼 생성, 빵 번호(상수) setActionCommand
            JButton tmpBtn = new JButton(
                    "<html>" + bread.getKorName() + "<br>" + bread.getName() + "</html>");
            tmpBtn.setActionCommand(String.valueOf(bread.getBreadNo()));

            // 버튼에 붙일 ActionListener
            ActionListener l = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                    // 샌드위치에 선택한 빵 Set
                    sandwich.setBread(Integer.parseInt(e.getActionCommand()));
                    // 빵 이미지와 토핑 목록 노출
                    mgr.setDetailsImage(bread);
                    mgr.displayExtraList(SalesPanelManager.DETAILS_EXTRA, sandwich);
                    // 토핑 선택 패널 생성, orderPanel에 add후 CardLayout next
                    SalesPanelChoiceExtraPanel choiceExtraPanel;
                    choiceExtraPanel = new SalesPanelChoiceExtraPanel(salesPanel, sandwich);
                    orderPanel.add(choiceExtraPanel);
                    cardLayout.next(orderPanel);
                    // 콘솔에 출력 (디버깅)
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            };
            
            // 생성한 ActionListner를 임시버튼에 부착
            tmpBtn.addActionListener(l);
            
            // 임시버튼을 CenterPanel에 add
            choiceBreadCenterPanel.add(tmpBtn);
        } // for end

        // 이전 버튼 생성, ActionListner 부착
        JButton prevBtn = new JButton("이전 : 사이즈 선택");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이전 페이지로
                cardLayout.previous(orderPanel);
                // 빵 선택 패널 삭제
                mgr.removeLastComponent();
                // 주문확인 패널의 사이즈 이미지 삭제
                mgr.removeDetailsImage(SalesPanelManager.DETAILS_SIZE);
            }
        });
        
        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceBreadLabel, BorderLayout.NORTH);
        add(choiceBreadCenterPanel, BorderLayout.CENTER);
        add(prevBtn, BorderLayout.SOUTH);
    }
}
