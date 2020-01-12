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
 * SalesPanelChoiceExtraPanel - ���� ���� �г�
 * 
 * 
 * ��ü ���� ��� �� �߰� ������(Addible) ������ �ҷ��ͼ� ������ŭ ��ư ����
 * 
 * ���� ���� ��ư�� ������ �ֹ� Ȯ�� �гο� ���� �̹����� ����
 * 
 * ���� ��ư�� ������ ��ä ���� �г��� �����ϰ� �ֹ� �г�(Card Layout)�� add
 */
public class SalesPanelChoiceExtraPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 3007926062636229609L;

    /* Constructor */
    public SalesPanelChoiceExtraPanel() {}

    public SalesPanelChoiceExtraPanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // �ֹ� �г�
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // �ֹ� �г��� ī�巹�̾ƿ�
        CardLayout cardLayout = SalesPanel.getCardLayout();
        
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();

        // Title Label ���� �� ��� ����
        JLabel choiceExtraLabel = new JLabel("���� ����");
        choiceExtraLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel ����
        JPanel choiceExtraCenterPanel = new JPanel(new GridLayout(0, 1));
        // ��� ������ �ҷ��ͼ�
        for (Extra extra : mgr.getAllExtraList()) {
            //            if (!(extra instanceof Addible) && !sandwich.isContainExtra(extra.getExtraNo())) {
            //                continue;
            //            }
            // �߰� ������ ������ �ƴϸ� continue
            if (!(extra instanceof Addible)) {
                continue;
            }

            // extraPanel ���� : ������ �̸�, ������ư�� ������ ǥ���� �г�
            JPanel extraPanel = new JPanel(new BorderLayout());
            // extraPanel�� ���� �г� ����
            JPanel extraBottomPanel = new JPanel(new GridLayout(1, 0));
            // ���� �̸� �� ����
            JLabel extraNameLabel = new JLabel(
                    "<html>" + extra.getKorName() + "<br>" + extra.getName() + "</html>");
            // ���� �� ����, ��Ʈ ����
            JLabel extraQuantityLabel =
                    new JLabel(String.valueOf(sandwich.getExtraQuantity(extra.getExtraNo())));
            extraQuantityLabel.setFont(new Font(Font.SERIF, Font.BOLD, 24));
            // ���� �̸�, ���� �� ��� ����
            extraNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
            extraQuantityLabel.setHorizontalAlignment(SwingConstants.LEFT);

            // ���� ��ư ����, setActionCommand
            JButton subExtraButton = new JButton("-");
            JButton addExtraButton = new JButton("+");
            subExtraButton.setFocusable(false);
            addExtraButton.setFocusable(false);
            subExtraButton.setActionCommand(String.valueOf(extra.getExtraNo()));
            addExtraButton.setActionCommand(String.valueOf(extra.getExtraNo()));
            // ���� ���� ���� ��ư Listener
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
            // ���� ���� ���� ��ư Listener
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

            // extraChoiceButtonPanel ����
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
        JButton nextBtn = new JButton("���� : ��ä ����");
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // ��ä ���� �г� ����, orderPanel�� add�� CardLayout next
                    SalesPanelChoiceVeggiePanel choiceVeggiePanel;
                    choiceVeggiePanel = new SalesPanelChoiceVeggiePanel(salesPanel, sandwich);
                    orderPanel.add(choiceVeggiePanel);
                    cardLayout.next(orderPanel);
                    // �ֹ� Ȯ�� �гο� ��ä ����Ʈ ����
                    mgr.displayExtraList(SalesPanelManager.DETAILS_EXTRA, sandwich);

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        // Previous Button
        JButton prevBtn = new JButton("���� : �� ����");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ���� ��������
                cardLayout.previous(orderPanel);
                // ���� ���� �г� ����
                mgr.removeLastComponent();
                // ���� ��� ����
                mgr.removeDetailsList(SalesPanelManager.DETAILS_EXTRA);
                // �ֹ�Ȯ�� �г��� �� �̹��� ����
                mgr.removeDetailsImage(SalesPanelManager.DETAILS_BREAD);
            }
        });
        // Next, Previous Button add
        choiceExtraBottomPanel.add(nextBtn, BorderLayout.NORTH);
        choiceExtraBottomPanel.add(prevBtn, BorderLayout.SOUTH);

        // �г� ����
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceExtraLabel, BorderLayout.NORTH);
        add(choiceExtraCenterPanel, BorderLayout.CENTER);
        add(choiceExtraBottomPanel, BorderLayout.SOUTH);
    }
}
