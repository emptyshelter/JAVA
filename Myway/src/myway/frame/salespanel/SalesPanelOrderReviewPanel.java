package myway.frame.salespanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import myway.file.image.ImageIcons;

public class SalesPanelOrderReviewPanel extends JPanel {
    /* Variable */
    private static final long serialVersionUID = 614288859400211234L;
    
    private JLabel orderReviewCenterPanelDetailsMenu;
    private JLabel orderReviewCenterPanelDetailsSize;
    private JLabel orderReviewCenterPanelDetailsBread;
    private JPanel orderReviewCenterPanelExtraListPanelCenterPanel;
    private JPanel orderReviewCenterPanelVeggieListPanelCenterPanel;
    private JPanel orderReviewCenterPanelSauceListPanelCenterPanel;

    /* Constructor */
    public SalesPanelOrderReviewPanel(SalesPanel salesPanel) {
        // Title Label
        JLabel orderReviewNorthLabel = new JLabel("주문 확인");
        orderReviewNorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        //// Center Panel
        JPanel orderReviewCenterPanel = new JPanel(new GridLayout(0, 1));
        // Inner Panel
        JPanel orderReviewCenterPanelDetailsPanel = new JPanel(new GridLayout(0, 3));
        orderReviewCenterPanelDetailsPanel.setBackground(Color.WHITE);
        orderReviewCenterPanelDetailsMenu = new JLabel(ImageIcons.NULL_WIDE);   // 메뉴 사진
        orderReviewCenterPanelDetailsSize = new JLabel(ImageIcons.NULL_WIDE);   // 사이즈 사진
        orderReviewCenterPanelDetailsBread = new JLabel(ImageIcons.NULL_WIDE);  // 빵 사진
        orderReviewCenterPanelDetailsPanel.add(orderReviewCenterPanelDetailsMenu);
        orderReviewCenterPanelDetailsPanel.add(orderReviewCenterPanelDetailsSize);
        orderReviewCenterPanelDetailsPanel.add(orderReviewCenterPanelDetailsBread);
        orderReviewCenterPanelDetailsMenu.setBackground(Color.RED);
        orderReviewCenterPanelDetailsSize.setBackground(Color.GREEN);
        orderReviewCenterPanelDetailsBread.setBackground(Color.BLUE);
        // add Inner Panel
        orderReviewCenterPanel.add(orderReviewCenterPanelDetailsPanel);
        
        int gridLayoutMaxColumn = 5;
        // Extra List Panel
        JPanel orderReviewCenterPanelExtraListPanel = new JPanel();
        orderReviewCenterPanelExtraListPanelCenterPanel = new JPanel(new GridLayout(0, gridLayoutMaxColumn));
        for (int i = 0; i < gridLayoutMaxColumn; i++) {
            JPanel tmpPanel = new JPanel(new BorderLayout());
            tmpPanel.setBackground(Color.WHITE);
            tmpPanel.add(new JLabel(ImageIcons.NULL), BorderLayout.CENTER);
            JLabel tmpSouthLabel = new JLabel();
            tmpSouthLabel.setHorizontalAlignment(SwingConstants.CENTER);
            tmpSouthLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
            tmpPanel.add(tmpSouthLabel, BorderLayout.SOUTH);
            orderReviewCenterPanelExtraListPanelCenterPanel.add(tmpPanel);
        }
        // Veggie List Panel
        JPanel orderReviewCenterPanelVeggieListPanel = new JPanel(new BorderLayout());
        orderReviewCenterPanelVeggieListPanelCenterPanel = new JPanel(new GridLayout(0, gridLayoutMaxColumn));
        orderReviewCenterPanelVeggieListPanel.add(orderReviewCenterPanelVeggieListPanelCenterPanel, BorderLayout.CENTER);
        for (int i = 0; i < gridLayoutMaxColumn; i++) {
            orderReviewCenterPanelVeggieListPanelCenterPanel.add(new JLabel(ImageIcons.NULL));
        }
        // Sauce List Panel
        orderReviewCenterPanelSauceListPanelCenterPanel = new JPanel(new GridLayout(0, gridLayoutMaxColumn));
        orderReviewCenterPanelSauceListPanelCenterPanel.setBackground(Color.WHITE);
        for (int i = 0; i < gridLayoutMaxColumn; i++) {
            orderReviewCenterPanelSauceListPanelCenterPanel.add(new JLabel(ImageIcons.NULL));
        }
        orderReviewCenterPanelVeggieListPanelCenterPanel.setBackground(Color.WHITE);
        orderReviewCenterPanelExtraListPanel.setBackground(Color.WHITE);
        orderReviewCenterPanelVeggieListPanel.setBackground(Color.WHITE);
        // orderReviewCenterPanel add
        orderReviewCenterPanel.add(orderReviewCenterPanelExtraListPanelCenterPanel);
        orderReviewCenterPanel.add(orderReviewCenterPanelVeggieListPanel);
        orderReviewCenterPanel.add(orderReviewCenterPanelSauceListPanelCenterPanel);
        
        // 패널 셋팅
        setLayout(new BorderLayout());
        setBackground(new Color(170, 229, 68));		// GREEN
        add(orderReviewNorthLabel, BorderLayout.NORTH);
        add(orderReviewCenterPanel, BorderLayout.CENTER);
    }

    /* Method */
    // Getter
    public JLabel getOrderReviewCenterPanelDetailsMenu() {
        return orderReviewCenterPanelDetailsMenu;
    }

    public JLabel getOrderReviewCenterPanelDetailsSize() {
        return orderReviewCenterPanelDetailsSize;
    }

    public JLabel getOrderReviewCenterPanelDetailsBread() {
        return orderReviewCenterPanelDetailsBread;
    }

    public JPanel getOrderReviewCenterPanelExtraListPanelCenterPanel() {
        return orderReviewCenterPanelExtraListPanelCenterPanel;
    }

    public JPanel getOrderReviewCenterPanelVeggieListPanelCenterPanel() {
        return orderReviewCenterPanelVeggieListPanelCenterPanel;
    }

    public JPanel getOrderReviewCenterPanelSauceListPanelCenterPanel() {
        return orderReviewCenterPanelSauceListPanelCenterPanel;
    }
}
