package myway.product.sandwich.sauce;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Sauce implements Serializable {
    public static final int BBQ = 1;
    public static final int BLACK_PEPPER = 2;
    public static final int CHIPOTLE = 3;
    public static final int HONEY_MUSTARD = 4;
    public static final int HORSERADISH = 5;
    public static final int HOT_CHILLI = 6;
    public static final int ITALIAN_DRESSING = 7;
    public static final int MARINARA = 8;
    public static final int MAYONNAISE = 9;
    public static final int OLIVE_OIL = 10;
    public static final int RANCH = 11;
    public static final int RED_WINE_VINEGAR = 12;
    public static final int SALT = 13;
    public static final int SWEET_CHILLI = 14;
    public static final int SWEET_ONION = 15;   
    public static final int THOUSAND_ISLAND = 16;
    public static final int YELLOW_MUSTARD = 17;

    protected int sauceNo;
    protected String name;
    protected String korName;
    protected ImageIcon imageIcon;

    @Override
    public String toString() {
        return name;
    }

    public static Sauce getSauce(int sauceNo) {
        switch (sauceNo) {
            case BBQ:
                return new BBQ();

            case BLACK_PEPPER:
                return new BlackPepper();

            case CHIPOTLE:
                return new Chipotle();

            case HONEY_MUSTARD:
                return new HoneyMustard();
                
            case HORSERADISH:
                return new Horseradish();
                
            case HOT_CHILLI:
                return new HotChilli();
            
            case ITALIAN_DRESSING:
                return new ItalianDressing();
                
            case MARINARA:
                return new Marinara();
                
            case MAYONNAISE:
                return new Mayonnaise();
                
            case OLIVE_OIL:
                return new OliveOil();
                
            case RANCH:
                return new Ranch();
                
            case RED_WINE_VINEGAR:
                return new RedWineVinegar();
                
            case SALT:
                return new Salt();
                
            case SWEET_CHILLI:
                return new SweetChilli();
                
            case SWEET_ONION:
                return new SweetOnion();
                
            case THOUSAND_ISLAND:
                return new ThousandIsland();
                
            case YELLOW_MUSTARD:
                return new YellowMustard();

            default:
                return null;
        }
    }
    
    public static ArrayList<Sauce> getAllSauceList() {
        ArrayList<Sauce> resultList = new ArrayList<>();
        resultList.add(Sauce.getSauce(BBQ));
        resultList.add(Sauce.getSauce(BLACK_PEPPER));
        resultList.add(Sauce.getSauce(CHIPOTLE));
        resultList.add(Sauce.getSauce(HONEY_MUSTARD));
        resultList.add(Sauce.getSauce(HORSERADISH));
        resultList.add(Sauce.getSauce(HOT_CHILLI));
        resultList.add(Sauce.getSauce(ITALIAN_DRESSING));
        resultList.add(Sauce.getSauce(MARINARA));
        resultList.add(Sauce.getSauce(MAYONNAISE));
        resultList.add(Sauce.getSauce(OLIVE_OIL));
        resultList.add(Sauce.getSauce(RANCH));
        resultList.add(Sauce.getSauce(RED_WINE_VINEGAR));
        resultList.add(Sauce.getSauce(SALT));
        resultList.add(Sauce.getSauce(SWEET_CHILLI));
        resultList.add(Sauce.getSauce(SWEET_ONION));
        resultList.add(Sauce.getSauce(THOUSAND_ISLAND));
        resultList.add(Sauce.getSauce(YELLOW_MUSTARD));
        return resultList;
    }

    public int getSauceNo() {
        return sauceNo;
    }
    
    public String getName() {
        return name;
    }

    public String getKorName() {
        return korName;
    }
    
    public ImageIcon getImageIcon() {
        return imageIcon;
    }
}
