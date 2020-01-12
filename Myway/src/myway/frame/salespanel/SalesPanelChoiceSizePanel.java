package myway.frame.salespanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import myway.menu.Menu;
import myway.product.sandwich.Sandwich;
import util.MyUtils;

/*
 * SalesPanelChoiceSizePanel - 빵 선택 패널
 * 
 * 
 * 15cm, 30cm 버튼 생성
 * 
 * 버튼을 누르면 주문 확인 패널에 사이즈 이미지를 노출,
 * 빵 선택 패널을 생성하고 주문 패널(Card Layout)에 add
 */
public class SalesPanelChoiceSizePanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = -9079159112045533185L;

    /* Constructor */
    public SalesPanelChoiceSizePanel() {}

    public SalesPanelChoiceSizePanel(SalesPanel salesPanel, Menu menu) throws Exception {
        // 주문 패널
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // 주문 패널의 카드레이아웃
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label 생성 후 가운데 정렬
        JLabel choiceSizeLabel = new JLabel("사이즈 선택");
        choiceSizeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel 생성
        JPanel choiceSizeCenterPanel = new JPanel(new GridLayout(0, 1));

        // Size 선택 버튼 (15cm, 30cm)
        JButton size15Button = new JButton("15cm");
        JButton size30Button = new JButton("30cm");
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        size15Button.setFont(font);
        size30Button.setFont(font);

        // ActionListener
        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 선택한 사이즈에 맞게 menu객체를 변경하고 주문 확인 패널에 이미지 노출
                switch (e.getActionCommand()) {
                    case "15cm":
                        menu.setMenuSize(Menu.SIZE_15CM);
                        mgr.setDetailsImage(Menu.SIZE_15CM);
                        break;

                    case "30cm":
                        menu.setMenuSize(Menu.SIZE_30CM);
                        mgr.setDetailsImage(Menu.SIZE_30CM);
                        break;

                    default:
                        break;
                }
                // 메뉴, 사이즈 정보로 샌드위치 생성
                Sandwich sandwich = mgr.makeSandwich(menu);
                
                // 빵 선택 패널 생성
                SalesPanelChoiceBreadPanel choiceBreadPanel;
                try {
                    choiceBreadPanel = new SalesPanelChoiceBreadPanel(salesPanel, sandwich);
                    orderPanel.add(choiceBreadPanel);
                    cardLayout.next(orderPanel);
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                // CardLayout에 토핑 선택 패널 추가 후 페이지 넘김
                // 콘솔에 출력 (디버깅)
                MyUtils.clearConsole();
                System.out.println(menu);
            }
        };
        // 생성한 ActionListner를 사이즈 선택 버튼에 부착
        size15Button.addActionListener(l);
        size30Button.addActionListener(l);

        // 사이즈 선택 버튼을 CenterPanel에 add
        choiceSizeCenterPanel.add(size15Button);
        choiceSizeCenterPanel.add(size30Button);

        // 이전 버튼 생성, ActionListner 부착
        JButton prevBtn = new JButton("이전 : 메뉴 선택");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이전 페이지로
                cardLayout.previous(orderPanel);
                // 사이즈 선택 패널 삭제
                mgr.removeLastComponent();
                // 주문확인 패널의 사이즈 이미지 삭제
                mgr.removeDetailsImage(SalesPanelManager.DETAILS_MENU);
            }
        });
        
        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceSizeLabel, BorderLayout.NORTH);
        add(choiceSizeCenterPanel, BorderLayout.CENTER);
        add(prevBtn, BorderLayout.SOUTH);
    }
}
