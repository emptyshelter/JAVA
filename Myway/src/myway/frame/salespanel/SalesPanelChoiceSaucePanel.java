package myway.frame.salespanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import myway.product.ProductManager;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.sauce.Sauce;
import util.MyUtils;

/*
 * SalesPanelChoiceExtraPanel - 소스 선택 패널
 * 
 * 
 * 전체 토핑 목록을 불러와서 개수만큼 버튼 생성
 * 
 * 소스 버튼을 누르면 소스 추가, 삭제
 * 
 * 다음 버튼을 누르면 주문 완료
 */
public class SalesPanelChoiceSaucePanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 3169960248280186199L;
    
    ProductManager productMgr;

    /* Constructor */
    public SalesPanelChoiceSaucePanel() {}

    public SalesPanelChoiceSaucePanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // 주문 패널
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // 주문 패널의 카드레이아웃
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();
        productMgr = new ProductManager();


        // Title Label 생성 후 가운데 정렬
        JLabel choiceSauceLabel = new JLabel("소스 선택");
        choiceSauceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel 생성
        JPanel choiceSauceCenterPanel = new JPanel(new GridLayout(0, 1));
        // 모든 소스를 불러와서
        for (Sauce sauce : mgr.getAllSauceList()) {
            // 소스 번호
            int sauceNo = sauce.getSauceNo();
            // 임시버튼(토글버튼) 생성, setActionCommand
            JButton tmpBtn = new JButton(sauce.getKorName());
            tmpBtn.setActionCommand(String.valueOf(sauceNo));
            tmpBtn.setFocusable(false);
            // 추가/삭제 토글버튼 Listener
            tmpBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // 샌드위치가 가지고 있는 해당 소스의 참조변수를 얻어옴
                    Sauce sauceRef = sandwich.getSauceRef(sauceNo);
                    // 소스를 포함하고 있지 않다면 (null) 해당 소스 추가, 토글버튼 색상 변경
                    // 포함하고 있다면 (else) 해당 소스 삭제, 토글버튼 색상 변경
                    if (sauceRef == null) {
                        sandwich.addSauce(sauceNo);
                        tmpBtn.setBackground(Color.GREEN);
                        System.out.println(sandwich);
                    } else {
                        sandwich.subSauce(sauceNo);
                        tmpBtn.setBackground(Color.RED);
                        System.out.println(sandwich);
                    }
                    mgr.displayExtraList(SalesPanelManager.DETAILS_SAUCE, sandwich);
                    // 콘솔 출력 (디버깅)
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                }
            });

            // 샌드위치의 소스 포함 여부에 따라 버튼 색상 변경
            if (sandwich.isContainSauce(sauceNo)) {
                tmpBtn.setBackground(Color.GREEN);
            } else {
                tmpBtn.setBackground(Color.RED);
            }

            // 임시버튼을 CenterPanel에 add
            choiceSauceCenterPanel.add(tmpBtn);
        } // for end

        // Bottom Panel (Next, Previous)
        JPanel choiceSauceBottomPanel = new JPanel();
        choiceSauceBottomPanel.setLayout(new BorderLayout());
        // Complete Order Button
        JButton nextBtn = new JButton("주문 완료");
        nextBtn.setFocusable(false);
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 주문 완료
                try {
                    String[] option = new String[3];
                    option[SalesPanel.OPTION_ORDER_YES] = "주문 완료";
                    option[SalesPanel.OPTION_ORDER_NO] = "주문 수정";
                    option[SalesPanel.OPTION_ORDER_RESET] = "주문 초기화";
                    String str = "\n가격 : " + sandwich.getPrice() + "원";
                    str += "\n\n주문을 확정할까요?";
                    int response = JOptionPane.showOptionDialog(null, str, "Subway", 0,
                            JOptionPane.QUESTION_MESSAGE, null, option, null);
                    switch (response) {
                        case SalesPanel.OPTION_ORDER_YES:
                            mgr.completeOrder(sandwich);
                            mgr.resetReviewPanel();
                            break;

                        case SalesPanel.OPTION_ORDER_NO:
                            break;

                        case SalesPanel.OPTION_ORDER_RESET:
                            mgr.resetReviewPanel();
                            break;

                        default:
                            break;
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        // Previous Button
        JButton prevBtn = new JButton("이전 : 야채 선택");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이전 페이지로
                cardLayout.previous(orderPanel);
                // 소스 선택 패널 삭제
                mgr.removeLastComponent();
                // 주문확인 패널의 소스 이미지 삭제
                mgr.removeDetailsList(SalesPanelManager.DETAILS_SAUCE);
            }
        });
        // Next, Previous Button add
        choiceSauceBottomPanel.add(nextBtn, BorderLayout.NORTH);
        choiceSauceBottomPanel.add(prevBtn, BorderLayout.SOUTH);

        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceSauceLabel, BorderLayout.NORTH);
        add(choiceSauceCenterPanel, BorderLayout.CENTER);
        add(choiceSauceBottomPanel, BorderLayout.SOUTH);
    }
}
