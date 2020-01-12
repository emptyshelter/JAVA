package myway.menu;

import java.util.ArrayList;

public class Menu {
    public static final int BLT = 1;
    public static final int CHICKEN_BACON_RANCH = 2;
    public static final int CHICKEN_TERIYAKI = 3;
    public static final int HAM = 4;
    public static final int ITALIAN_BMT = 5;
    public static final int MEATBALL = 6;
    public static final int ROAST_BEEF = 7;
    public static final int ROASTED_CHICKEN = 8;
    public static final int SEAFOOD = 9;
    public static final int SPICY_ITALIAN = 10;
    public static final int STEAK_AND_CHEESE = 11;
    public static final int SUBWAY_CLUB = 12;
    public static final int SUBWAY_MELT = 13;
    public static final int TUNA = 14;
    public static final int VEGGIE_DELITE = 15;
    
    public static final int SIZE_15CM = 15;
    public static final int SIZE_30CM = 30;
    
    protected int menuNo;
    protected String menuName;
    protected String menuKorName;
    protected int menuSize;
    protected int defaultPrice;
    
    public Menu() {}
    
    public Menu(int menuNo) {
        this.menuNo = menuNo;
        
        switch (menuNo) {
            case BLT:
                menuName = "B.L.T";
                menuKorName = "��Ƽ";
                break;
                
            case CHICKEN_BACON_RANCH:
                menuName = "Chicken Bacon Ranch";
                menuKorName = "ġŲ ��������ġ";
                break;
                
            case CHICKEN_TERIYAKI:
                menuName = "Chicken Teriyaki";
                menuKorName = "ġŲ �����߳�";
                break;
                
            case HAM:
                menuName = "Ham";
                menuKorName = "��";
                break;
                
            case ITALIAN_BMT:
                menuName = "Italian B.M.T";
                menuKorName = "��Ż���� ��Ƽ";
                break;
                
            case MEATBALL:
                menuName = "Meatball";
                menuKorName = "��Ʈ��";
                break;
                
            case ROAST_BEEF:
                menuName = "Roast Beef";
                menuKorName = "�ν�Ʈ ����";
                break;
                
            case ROASTED_CHICKEN:
                menuName = "Roasted Chicken";
                menuKorName = "�ν�Ʈ ġŲ";
                break;
                
            case SEAFOOD:
                menuName = "Seafood";
                menuKorName = "��Ǫ��";
                break;
                
            case SPICY_ITALIAN:
                menuName = "Spicy Italian";
                menuKorName = "�����̽� ��Ż����";
                break;
                
            case STEAK_AND_CHEESE:
                menuName = "Steak & Cheese";
                menuKorName = "������ũ&ġ��";
                break;
                
            case SUBWAY_CLUB:
                menuName = "Subway Club";
                menuKorName = "������ Ŭ��";
                break;
                
            case SUBWAY_MELT:
                menuName = "Subway Melt";
                menuKorName = "������ ��Ʈ";
                break;
                
            case TUNA:
                menuName = "Tuna";
                menuKorName = "��ġ";
                break;
                
            case VEGGIE_DELITE:
                menuName = "Veggie Delite";
                menuKorName = "����";
                break;
                
            default:
                break;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("�޴� �̸�\n");
        sb.append(menuKorName).append(" (").append(menuName).append(")\n");
        sb.append("������\n");
        sb.append(menuSize);
        return sb.toString();
    }
    
    public static ArrayList<Menu> getAllSandwichMenuList() {
        ArrayList<Menu> resultList = new ArrayList<>();
        resultList.add(new Menu(BLT));
        resultList.add(new Menu(CHICKEN_BACON_RANCH));
        resultList.add(new Menu(CHICKEN_TERIYAKI));
        resultList.add(new Menu(HAM));
        resultList.add(new Menu(ITALIAN_BMT));
        resultList.add(new Menu(MEATBALL));
        resultList.add(new Menu(ROAST_BEEF));
        resultList.add(new Menu(ROASTED_CHICKEN));
        resultList.add(new Menu(SEAFOOD));
        resultList.add(new Menu(SPICY_ITALIAN));
        resultList.add(new Menu(STEAK_AND_CHEESE));
        resultList.add(new Menu(SUBWAY_CLUB));
        resultList.add(new Menu(SUBWAY_MELT));
        resultList.add(new Menu(TUNA));
        resultList.add(new Menu(VEGGIE_DELITE));
        return resultList;
    }

    public int getMenuNo() {
        return menuNo;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuKorName() {
        return menuKorName;
    }

    public int getMenuSize() {
        return menuSize;
    }
    
    public int getDefaultPrice() {
        return defaultPrice;
    }
    
    public void setMenuSize(int menuSize) {
        this.menuSize = menuSize;
    }
}
