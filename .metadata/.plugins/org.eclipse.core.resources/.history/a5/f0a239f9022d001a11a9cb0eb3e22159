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
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.extra.interfaces.Addible;
import util.MyUtils;

/*
 * SalesPanelChoiceExtraPanel - 토핑 선택 패널
 * 
 * 
 * 전체 토핑 목록 중 추가 가능한(Addible) 토핑을 불러와서 개수만큼 버튼 생성
 * 
 * 토핑 증감 버튼을 누르면 주문 확인 패널에 토핑 이미지를 노출
 * 
 * 다음 버튼을 누르면 야채 선택 패널을 생성하고 주문 패널(Card Layout)에 add
 */
public class SalesPanelChoiceExtraPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 3007926062636229609L;

    /* Constructor */
    public SalesPanelChoiceExtraPanel() {}

    public SalesPanelChoiceExtraPanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // 주문 패널
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // 주문 패널의 카드레이아웃
        CardLayout cardLayout = SalesPanel.getCardLayout();
        
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label 생성 후 가운데 정렬
        JLabel choiceExtraLabel = new JLabel("토핑 선택");
        choiceExtraLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel 생성
        JPanel choiceExtraCenterPanel = new JPanel(new GridLayout(0, 1));
        // 모든 토핑을 불러와서
        for (Extra extra : mgr.getAllExtraList()) {
            //            if (!(extra instanceof Addible) && !sandwich.isContainExtra(extra.getExtraNo())) {
            //                continue;
            //            }
            // 추가 가능한 토핑이 아니면 continue
            if (!(extra instanceof Addible)) {
                continue;
            }

            // extraPanel 생성 : 토핑의 이름, 증감버튼과 수량을 표시할 패널
            JPanel extraPanel = new JPanel(new BorderLayout());
            // extraPanel에 붙일 패널 생성
            JPanel extraBottomPanel = new JPanel(new GridLayout(1, 0));
            // 토핑 이름 라벨 생성
            JLabel extraNameLabel = new JLabel(
                    "<html>" + extra.getKorName() + "<br>" + extra.getName() + "</html>");
            // 수량 라벨 생성, 폰트 설정
            JLabel extraQuantityLabel =
                    new JLabel(String.valueOf(sandwich.getExtraQuantity(extra.getExtraNo())));
            extraQuantityLabel.setFont(new Font(Font.SERIF, Font.BOLD, 24));
            // 토핑 이름, 수량 라벨 가운데 정렬
            extraNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
            extraQuantityLabel.setHorizontalAlignment(SwingConstants.LEFT);

            // 증감 버튼 생성, setActionCommand
            JButton subExtraButton = new JButton("-");
            JButton addExtraButton = new JButton("+");
            subExtraButton.setFocusable(false);
            addExtraButton.setFocusable(false);
            subExtraButton.setActionCommand(String.valueOf(extra.getExtraNo()));
            addExtraButton.setActionCommand(String.valueOf(extra.getExtraNo()));
            // 토핑 수량 감소 버튼 Listener
            subExtraButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (sandwich.getSize() == Menu.SIZE_30CM) {
                        sandwich.subExtra(extra.getExtraNo());
                    }
                    sandwich.subExtra(extra.getExtraNo());
                    mgr.displayExtraList(SalesPanelManager.DETAILS_EXTRA, sandwich);
                    extraQuantityLabel
                            .setText(String.valueOf(sandwich.getExtraQuantity(extra.getExtraNo())));
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                }
            });
            // 토핑 수량 증가 버튼 Listener
            addExtraButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (sandwich.getSize() == Menu.SIZE_30CM) {
                        sandwich.addExtra(extra.getExtraNo());
                    }
                    sandwich.addExtra(extra.getExtraNo());
                    mgr.displayExtraList(SalesPanelManager.DETAILS_EXTRA, sandwich);
                    extraQuantityLabel
                            .setText(String.valueOf(sandwich.getExtraQuantity(extra.getExtraNo())));
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                }
            });

            // extraChoiceButtonPanel 셋팅
            extraBottomPanel.add(subExtraButton);
            extraBottomPanel.add(addExtraButton);
            extraPanel.add(extraNameLabel, BorderLayout.CENTER);
            extraPanel.add(extraBottomPanel, BorderLayout.SOUTH);
            extraPanel.add(extraQuantityLabel, BorderLayout.EAST);
            choiceExtraCenterPanel.add(extraPanel);
        } // for end

        // Bottom Panel (Next, Previous)
        JPanel choiceExtraBottomPanel = new JPanel(new BorderLayout());
        // Next Button
        JButton nextBtn = new JButton("다음 : 야채 선택");
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 야채 선택 패널 생성, orderPanel에 add후 CardLayout next
                    SalesPanelChoiceVeggiePanel choiceVeggiePanel;
                    choiceVeggiePanel = new SalesPanelChoiceVeggiePanel(salesPanel, sandwich);
                    orderPanel.add(choiceVeggiePanel);
                    cardLayout.next(orderPanel);
                    // 주문 확인 패널에 야채 리스트 노출
                    mgr.displayExtraList(SalesPanelManager.DETAILS_EXTRA, sandwich);

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        // Previous Button
        JButton prevBtn = new JButton("이전 : 빵 선택");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이전 페이지로
                cardLayout.previous(orderPanel);
                // 토핑 선택 패널 삭제
                mgr.removeLastComponent();
                // 토핑 목록 삭제
                mgr.removeDetailsList(SalesPanelManager.DETAILS_EXTRA);
                // 주문확인 패널의 빵 이미지 삭제
                mgr.removeDetailsImage(SalesPanelManager.DETAILS_BREAD);
            }
        });
        // Next, Previous Button add
        choiceExtraBottomPanel.add(nextBtn, BorderLayout.NORTH);
        choiceExtraBottomPanel.add(prevBtn, BorderLayout.SOUTH);

        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceExtraLabel, BorderLayout.NORTH);
        add(choiceExtraCenterPanel, BorderLayout.CENTER);
        add(choiceExtraBottomPanel, BorderLayout.SOUTH);
    }
}
