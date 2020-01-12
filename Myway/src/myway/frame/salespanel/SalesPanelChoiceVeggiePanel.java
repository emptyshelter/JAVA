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
 * SalesPanelChoiceExtraPanel - ��ä ���� �г�
 * 
 * 
 * ��ü ��ä ����� �ҷ��ͼ� ������ŭ ��ư ����
 * 
 * ��ä ��ư�� ������ �ҽ� �߰�, ����
 * 
 * ���� ��ư�� ������ �ҽ� ���� �г��� �����ϰ� �ֹ� �г�(Card Layout)�� add
 */
public class SalesPanelChoiceVeggiePanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = -1856538612200312744L;

    /* Constructor */
    public SalesPanelChoiceVeggiePanel() {}

    public SalesPanelChoiceVeggiePanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // �ֹ� �г�
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // �ֹ� �г��� ī�巹�̾ƿ�
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label ���� �� ��� ����
        JLabel choiceVeggieLabel = new JLabel("��ä ����");
        choiceVeggieLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel ����
        JPanel choiceVeggieCenterPanel = new JPanel(new GridLayout(0, 1));
        
        // ��� ��ä�� �ҷ��ͼ�
        for (Veggie veggie : mgr.getAllVeggieList()) {
            // �ӽ� ��ư ����
            JButton tmpBtn = new JButton(
                    "<html>" + veggie.getKorName() + "<br>" + veggie.getName() + "</html>");
            tmpBtn.setActionCommand(String.valueOf(veggie.getVeggieNo()));
            tmpBtn.setFocusable(false);
            // ������ġ�� ���ԵǴ� ��ä�� �ʷϻ�, �׷��� ������ ������ ��ư
            for (Veggie sandwichVeggie : sandwich.getVeggies()) {
                if (veggie.getVeggieNo() == sandwichVeggie.getVeggieNo()) {
                    tmpBtn.setBackground(Color.GREEN);
                    break;
                }
                tmpBtn.setBackground(Color.RED);
            }
            // �ӽ� ��ư Action Listener
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
        JButton nextBtn = new JButton("���� : �ҽ� ����");
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // �ҽ� ���� �г� ����, orderPanel�� add �� CardLayout next
                    SalesPanelChoiceSaucePanel choiceSaucePanel;
                    choiceSaucePanel = new SalesPanelChoiceSaucePanel(salesPanel, sandwich);
                    orderPanel.add(choiceSaucePanel);
                    cardLayout.next(orderPanel);
                    // �ֹ� Ȯ�� �гο� �ҽ� ����Ʈ ����
                    mgr.displayExtraList(SalesPanelManager.DETAILS_SAUCE, sandwich);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        // Previous Button
        JButton prevBtn = new JButton("���� : ���� ����");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ���� ��������
                cardLayout.previous(orderPanel);
                // ��ä ���� �г� ����
                mgr.removeLastComponent();
                // �ֹ�Ȯ�� �г��� ��ä �̹��� ����
                mgr.removeDetailsList(SalesPanelManager.DETAILS_VEGGIE);
            }
        });
        // Next, Previous Button add
        choiceVeggieBottomPanel.add(nextBtn, BorderLayout.NORTH);
        choiceVeggieBottomPanel.add(prevBtn, BorderLayout.SOUTH);

        // �г� ����
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceVeggieLabel, BorderLayout.NORTH);
        add(choiceVeggieCenterPanel, BorderLayout.CENTER);
        add(choiceVeggieBottomPanel, BorderLayout.SOUTH);
    }
}
