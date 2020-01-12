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
 * SalesPanelChoiceExtraPanel - �ҽ� ���� �г�
 * 
 * 
 * ��ü ���� ����� �ҷ��ͼ� ������ŭ ��ư ����
 * 
 * �ҽ� ��ư�� ������ �ҽ� �߰�, ����
 * 
 * ���� ��ư�� ������ �ֹ� �Ϸ�
 */
public class SalesPanelChoiceSaucePanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 3169960248280186199L;
    
    ProductManager productMgr;

    /* Constructor */
    public SalesPanelChoiceSaucePanel() {}

    public SalesPanelChoiceSaucePanel(SalesPanel salesPanel, Sandwich sandwich) throws Exception {
        // �ֹ� �г�
        JPanel orderPanel = SalesPanel.getOrderPanel();
        // �ֹ� �г��� ī�巹�̾ƿ�
        CardLayout cardLayout = SalesPanel.getCardLayout();
        SalesPanelManager mgr = salesPanel.getSalesPanelManager();
        productMgr = new ProductManager();


        // Title Label ���� �� ��� ����
        JLabel choiceSauceLabel = new JLabel("�ҽ� ����");
        choiceSauceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center Panel ����
        JPanel choiceSauceCenterPanel = new JPanel(new GridLayout(0, 1));
        // ��� �ҽ��� �ҷ��ͼ�
        for (Sauce sauce : mgr.getAllSauceList()) {
            // �ҽ� ��ȣ
            int sauceNo = sauce.getSauceNo();
            // �ӽù�ư(��۹�ư) ����, setActionCommand
            JButton tmpBtn = new JButton(sauce.getKorName());
            tmpBtn.setActionCommand(String.valueOf(sauceNo));
            tmpBtn.setFocusable(false);
            // �߰�/���� ��۹�ư Listener
            tmpBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // ������ġ�� ������ �ִ� �ش� �ҽ��� ���������� ����
                    Sauce sauceRef = sandwich.getSauceRef(sauceNo);
                    // �ҽ��� �����ϰ� ���� �ʴٸ� (null) �ش� �ҽ� �߰�, ��۹�ư ���� ����
                    // �����ϰ� �ִٸ� (else) �ش� �ҽ� ����, ��۹�ư ���� ����
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
                    // �ܼ� ��� (�����)
                    MyUtils.clearConsole();
                    System.out.println(sandwich);
                }
            });

            // ������ġ�� �ҽ� ���� ���ο� ���� ��ư ���� ����
            if (sandwich.isContainSauce(sauceNo)) {
                tmpBtn.setBackground(Color.GREEN);
            } else {
                tmpBtn.setBackground(Color.RED);
            }

            // �ӽù�ư�� CenterPanel�� add
            choiceSauceCenterPanel.add(tmpBtn);
        } // for end

        // Bottom Panel (Next, Previous)
        JPanel choiceSauceBottomPanel = new JPanel();
        choiceSauceBottomPanel.setLayout(new BorderLayout());
        // Complete Order Button
        JButton nextBtn = new JButton("�ֹ� �Ϸ�");
        nextBtn.setFocusable(false);
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // �ֹ� �Ϸ�
                try {
                    String[] option = new String[3];
                    option[SalesPanel.OPTION_ORDER_YES] = "�ֹ� �Ϸ�";
                    option[SalesPanel.OPTION_ORDER_NO] = "�ֹ� ����";
                    option[SalesPanel.OPTION_ORDER_RESET] = "�ֹ� �ʱ�ȭ";
                    String str = "\n���� : " + sandwich.getPrice() + "��";
                    str += "\n\n�ֹ��� Ȯ���ұ��?";
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
        JButton prevBtn = new JButton("���� : ��ä ����");
        prevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ���� ��������
                cardLayout.previous(orderPanel);
                // �ҽ� ���� �г� ����
                mgr.removeLastComponent();
                // �ֹ�Ȯ�� �г��� �ҽ� �̹��� ����
                mgr.removeDetailsList(SalesPanelManager.DETAILS_SAUCE);
            }
        });
        // Next, Previous Button add
        choiceSauceBottomPanel.add(nextBtn, BorderLayout.NORTH);
        choiceSauceBottomPanel.add(prevBtn, BorderLayout.SOUTH);

        // �г� ����
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(choiceSauceLabel, BorderLayout.NORTH);
        add(choiceSauceCenterPanel, BorderLayout.CENTER);
        add(choiceSauceBottomPanel, BorderLayout.SOUTH);
    }
}
