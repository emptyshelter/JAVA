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
import myway.product.sandwich.veggie.Veggie;
import util.MyUtils;

/*
 * SalesPanelChoiceExtraPanel - 야채 선택 패널
 * 
 * 
 * 전체 야채 목록을 불러와서 개수만큼 버튼 생성
 * 
 * 야채 버튼을 누르면 소스 추가, 삭제
 * 
 * 다음 버튼을 누르면 소스 선택 패널을 생성하고 주문 패널(Card Layout)에 add
 */
public class SalesPanelChoiceVeggiePanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = -1856538612200312744L;

    /* Constructor */
    public SalesPanelChoiceVeggiePanel() {}

    public SalesPanelChoiceVeggiePanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // 주문 패널
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // 주문 패널의 카드레이아웃
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label 생성 후 가운데 정렬
        JLabel choiceVeggieLabel = new JLabel("야채 선택");
        choiceVeggieLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel 생성
        JPanel choiceVeggieCenterPanel = new JPanel(new GridLayout(0, 1));
        
        // 모든 야채를 불러와서
        for (Veggie veggie : mgr.getAllVeggieList()) {
            // 임시 버튼 생성
            JButton tmpBtn = new JButton(
                    "<html>" + veggie.getKorName() + "<br>" + veggie.getName() + "</html>");
            tmpBtn.setActionCommand(String.valueOf(veggie.getVeggieNo()));
            tmpBtn.setFocusable(false);
            // 샌드위치에 포함되는 야채는 초록색, 그렇지 않으면 빨간색 버튼
            for (Veggie sandwichVeggie : sandwich.getVeggies()) {
                if (veggie.getVeggieNo() == sandwichVeggie.getVeggieNo()) {
                    tmpBtn.setBackground(Color.GREEN);
                    break;
                }
                tmpBtn.setBackground(Color.RED);
            }
            // 임시 버튼 Action Listener
            tmpBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int veggieNo = Integer.parseInt(e.getActionCommand());
                    Veggie veggieRef = sandwich.getVeggieRef(veggieNo);
                    if (veggieRef == null) {
                        sandwich.addVeggie(veggieNo);
                        tmpBtn.setBackground(Color.GREEN);
                    } else {
                        sandwich.subVeggie(veggieNo);
                        tmpBtn.setBackground(Color.RED);
                    }
                    mgr.displayExtraList(SalesPanelManager.DETAILS_VEGGIE, sandwich);
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                }
            });
            choiceVeggieCenterPanel.add(tmpBtn);
        } // for end

        // BottomPanel (Next, Previous)
        JPanel choiceVeggieBottomPanel = new JPanel();
        choiceVeggieBottomPanel.setLayout(new BorderLayout());
        // Next Button
        JButton nextBtn = new JButton("다음 : 소스 선택");
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 소스 선택 패널 생성, orderPanel에 add 후 CardLayout next
                    SalesPanelChoiceSaucePanel choiceSaucePanel;
                    choiceSaucePanel = new SalesPanelChoiceSaucePanel(salesPanel, sandwich);
                    orderPanel.add(choiceSaucePanel);
                    cardLayout.next(orderPanel);
                    // 주문 확인 패널에 소스 리스트 노출
                    mgr.displayExtraList(SalesPanelManager.DETAILS_SAUCE, sandwich);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        // Previous Button
        JButton prevBtn = new JButton("이전 : 토핑 선택");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이전 페이지로
                cardLayout.previous(orderPanel);
                // 야채 선택 패널 삭제
                mgr.removeLastComponent();
                // 주문확인 패널의 야채 이미지 삭제
                mgr.removeDetailsList(SalesPanelManager.DETAILS_VEGGIE);
            }
        });
        // Next, Previous Button add
        choiceVeggieBottomPanel.add(nextBtn, BorderLayout.NORTH);
        choiceVeggieBottomPanel.add(prevBtn, BorderLayout.SOUTH);

        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceVeggieLabel, BorderLayout.NORTH);
        add(choiceVeggieCenterPanel, BorderLayout.CENTER);
        add(choiceVeggieBottomPanel, BorderLayout.SOUTH);
    }
}
