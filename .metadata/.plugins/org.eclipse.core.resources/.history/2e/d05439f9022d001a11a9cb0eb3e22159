package myway.frame.salespanel;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

import myway.file.image.ImageIcons;
import myway.menu.Menu;
import myway.product.ProductManager;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.SandwichManager;
import myway.product.sandwich.bread.Bread;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;
import myway.product.sandwich.veggie.Veggie;

public class SalesPanelManager {
    /* Variable */
    public static final int DETAILS_MENU = 1;
    public static final int DETAILS_SIZE = 2;
    public static final int DETAILS_BREAD = 3;
    public static final int DETAILS_EXTRA = 4;
    public static final int DETAILS_VEGGIE = 5;
    public static final int DETAILS_SAUCE = 6;

    SalesPanel salesPanel;
    public ArrayList<Extra> allExtra;
    public ProductManager productManager;

    /* Constrctor */
    public SalesPanelManager() {}

    public SalesPanelManager(SalesPanel salesPanel) throws Exception {
        this.salesPanel = salesPanel;
        allExtra = new ArrayList<>();
        productManager = new ProductManager();
    }

    /* Method */
    public void removeLastComponent() {
        JPanel panel = SalesPanel.getOrderPanel();
        panel.remove(panel.getComponentCount() - 1);
        panel.revalidate();
    }

    public void resetReviewPanel() {
        removeDetailsImage(DETAILS_MENU);
        removeDetailsImage(DETAILS_SIZE);
        removeDetailsImage(DETAILS_BREAD);
        removeDetailsList(DETAILS_EXTRA);
        removeDetailsList(DETAILS_VEGGIE);
        removeDetailsList(DETAILS_SAUCE);

        SalesPanel.getCardLayout().first(SalesPanel.getOrderPanel());
        while (SalesPanel.getOrderPanel().getComponentCount() > 1) {
            removeLastComponent();
        }
    }

    public void setDetailsImage(Menu menu) {
        JLabel detailsMenuLabel =
                salesPanel.getOrderReviewPanel().getOrderReviewCenterPanelDetailsMenu();
        switch (menu.getMenuNo()) {
            case Menu.BLT:
                detailsMenuLabel.setIcon(ImageIcons.MENU_BLT);
                break;

            case Menu.CHICKEN_BACON_RANCH:
                detailsMenuLabel.setIcon(ImageIcons.MENU_CHICKEN_BACON_RANCH);
                break;

            case Menu.CHICKEN_TERIYAKI:
                detailsMenuLabel.setIcon(ImageIcons.MENU_CHICKEN_TERIYAKI);
                break;

            case Menu.HAM:
                detailsMenuLabel.setIcon(ImageIcons.MENU_HAM);
                break;

            case Menu.ITALIAN_BMT:
                detailsMenuLabel.setIcon(ImageIcons.MENU_ITALIAN_BMT);
                break;

            case Menu.MEATBALL:
                detailsMenuLabel.setIcon(ImageIcons.MENU_MEATBALL);
                break;

            case Menu.ROAST_BEEF:
                detailsMenuLabel.setIcon(ImageIcons.MENU_ROAST_BEEF);
                break;

            case Menu.ROASTED_CHICKEN:
                detailsMenuLabel.setIcon(ImageIcons.MENU_ROASTED_CHICKEN);
                break;

            case Menu.SEAFOOD:
                detailsMenuLabel.setIcon(ImageIcons.MENU_SEAFOOD);
                break;

            case Menu.SPICY_ITALIAN:
                detailsMenuLabel.setIcon(ImageIcons.MENU_SPICYITALIAN);
                break;

            case Menu.STEAK_AND_CHEESE:
                detailsMenuLabel.setIcon(ImageIcons.MENU_STEAK_AND_CHEESE);
                break;

            case Menu.SUBWAY_CLUB:
                detailsMenuLabel.setIcon(ImageIcons.MENU_SUBWAY_CLUB);
                break;

            case Menu.SUBWAY_MELT:
                detailsMenuLabel.setIcon(ImageIcons.MENU_SUBWAY_MELT);
                break;

            case Menu.TUNA:
                detailsMenuLabel.setIcon(ImageIcons.MENU_TUNA);
                break;

            case Menu.VEGGIE_DELITE:
                detailsMenuLabel.setIcon(ImageIcons.MENU_VEGGIE_DELITE);
                break;

            default:
                detailsMenuLabel.setIcon(ImageIcons.NULL_WIDE);
                break;
        }
    }

    public void setDetailsImage(int size) {
        JLabel detailsSizeLabel =
                salesPanel.getOrderReviewPanel().getOrderReviewCenterPanelDetailsSize();
        switch (size) {
            case Menu.SIZE_15CM:
                detailsSizeLabel.setIcon(ImageIcons.SIZE_15CM);
                break;

            case Menu.SIZE_30CM:
                detailsSizeLabel.setIcon(ImageIcons.SIZE_30CM);
                break;

            default:
                detailsSizeLabel.setIcon(ImageIcons.NULL_WIDE);
                break;
        }
    }

    public void setDetailsImage(Bread bread) {
        JLabel detailsBreadLabel =
                salesPanel.getOrderReviewPanel().getOrderReviewCenterPanelDetailsBread();
        switch (bread.getBreadNo()) {
            case Bread.FLAT_BREAD:
                detailsBreadLabel.setIcon(ImageIcons.BREAD_FLAT_BREAD);
                break;

            case Menu.CHICKEN_BACON_RANCH:
                detailsBreadLabel.setIcon(ImageIcons.BREAD_HEARTY_ITALIAN);
                break;

            case Menu.CHICKEN_TERIYAKI:
                detailsBreadLabel.setIcon(ImageIcons.BREAD_HONEY_OAT);
                break;

            case Menu.HAM:
                detailsBreadLabel.setIcon(ImageIcons.BREAD_PARMESAN_OREGANO);
                break;

            case Menu.ITALIAN_BMT:
                detailsBreadLabel.setIcon(ImageIcons.BREAD_WHEAT);
                break;

            case Menu.MEATBALL:
                detailsBreadLabel.setIcon(ImageIcons.BREAD_WHITE);
                break;

            default:
                detailsBreadLabel.setIcon(ImageIcons.NULL_WIDE);
                break;
        }
    }

    public void removeDetailsImage(int detailsConstants) {
        SalesPanelOrderReviewPanel orderReviewPanel = salesPanel.getOrderReviewPanel();
        switch (detailsConstants) {
            case DETAILS_MENU:
                orderReviewPanel.getOrderReviewCenterPanelDetailsMenu()
                        .setIcon(ImageIcons.NULL_WIDE);
                break;

            case DETAILS_SIZE:
                orderReviewPanel.getOrderReviewCenterPanelDetailsSize()
                        .setIcon(ImageIcons.NULL_WIDE);
                break;

            case DETAILS_BREAD:
                orderReviewPanel.getOrderReviewCenterPanelDetailsBread()
                        .setIcon(ImageIcons.NULL_WIDE);
                break;

            default:
                break;
        }
    }

    public void removeDetailsList(int type) {
        SalesPanelOrderReviewPanel orderReviewPanel = salesPanel.getOrderReviewPanel();

        switch (type) {
            case DETAILS_EXTRA:
                JPanel extraReviewPanel =
                        orderReviewPanel.getOrderReviewCenterPanelExtraListPanelCenterPanel();
                for (int i = 0; i < extraReviewPanel.getComponentCount(); i++) {
                    JPanel tmpPanel = (JPanel) extraReviewPanel.getComponent(i);
                    JLabel tmpLabel0 = (JLabel) tmpPanel.getComponent(0);
                    JLabel tmpLabel1 = (JLabel) tmpPanel.getComponent(1);
                    tmpLabel0.setIcon(ImageIcons.NULL);;
                    tmpLabel1.setText("");;
                }
                break;

            case DETAILS_VEGGIE:
                JPanel veggieReviewPanel =
                        orderReviewPanel.getOrderReviewCenterPanelVeggieListPanelCenterPanel();
                for (int i = 0; i < veggieReviewPanel.getComponentCount(); i++) {
                    JLabel tmpLabel = (JLabel) veggieReviewPanel.getComponent(i);
                    tmpLabel.setIcon(ImageIcons.NULL);
                }
                break;

            case DETAILS_SAUCE:
                JPanel sauceReviewPanel =
                        orderReviewPanel.getOrderReviewCenterPanelSauceListPanelCenterPanel();
                for (int i = 0; i < sauceReviewPanel.getComponentCount(); i++) {
                    JLabel tmpLabel = (JLabel) sauceReviewPanel.getComponent(i);
                    tmpLabel.setIcon(ImageIcons.NULL);
                }
                break;

            default:
                break;
        } // switch-case end
    }

    public void displayExtraList(int type, Sandwich sandwich) {
        removeDetailsList(type);
        
        int index = 0;
        SalesPanelOrderReviewPanel orderReviewPanel = salesPanel.getOrderReviewPanel();
        switch (type) {
            case DETAILS_EXTRA:
                for (Extra extra : sandwich.getExtras()) {
                    if (index >= 5) {
                        return;
                    }
                    JPanel tmpPanel = (JPanel) orderReviewPanel
                            .getOrderReviewCenterPanelExtraListPanelCenterPanel().getComponent(index++);
                    ((JLabel) tmpPanel.getComponent(0)).setIcon(extra.getImageIcon());
                    ((JLabel) tmpPanel.getComponent(1)).setText(String.valueOf(extra.getQuantity()));
                }
            break;
            
            case DETAILS_VEGGIE:
                ArrayList<Veggie> veggieList = Veggie.getAllVeggieList();
                for (Veggie sandwichVeggie : sandwich.getVeggies()) {
                    for (int i = 0; i < veggieList.size(); i++) {
                        Veggie listVeggie = veggieList.get(i);
                        if (sandwichVeggie.getVeggieNo() == listVeggie.getVeggieNo()) {
                            veggieList.remove(listVeggie);
                        }
                    }
                }
                for (int i = veggieList.size() - 1; i >= 0; i--) {
                    if (index >= 5) {
                        return;
                    }
                    Veggie veggie = veggieList.get(i);
                    JLabel tmpLabel = (JLabel) orderReviewPanel
                            .getOrderReviewCenterPanelVeggieListPanelCenterPanel().getComponent(index++);
                    tmpLabel.setIcon(veggie.getImageIcon());
                }
                break;
                
            case DETAILS_SAUCE:
                for (Sauce sauce : sandwich.getSauces()) {
                    if (index >= 5) {
                        return;
                    }
                    JLabel tmpLabel = (JLabel) orderReviewPanel
                            .getOrderReviewCenterPanelSauceListPanelCenterPanel().getComponent(index++);
                    tmpLabel.setIcon(sauce.getImageIcon());
                }
                break;
                
            default:
                break;
        }
    }

    public ArrayList<Menu> getAllMenuList() {
        return Menu.getAllSandwichMenuList();
    }

    public ArrayList<Bread> getAllBreadList() {
        return Bread.getAllBreadList();
    }

    public ArrayList<Extra> getAllExtraList() {
        return Extra.getAllExtraList();
    }

    public ArrayList<Veggie> getAllVeggieList() {
        return Veggie.getAllVeggieList();
    }

    public ArrayList<Sauce> getAllSauceList() {
        return Sauce.getAllSauceList();
    }

    public Sandwich makeSandwich(Menu menu) {
        return SandwichManager.makeSandwich(menu.getMenuNo(), menu.getMenuSize());
    }

    public void completeOrder(Sandwich sandwich) throws Exception {
        productManager.completeOrder(sandwich, new Date(), sandwich.getPrice());
    }
}
