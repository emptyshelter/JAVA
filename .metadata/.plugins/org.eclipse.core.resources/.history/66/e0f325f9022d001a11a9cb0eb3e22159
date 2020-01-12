package myway.product.sandwich.extra;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import myway.file.image.ImageIcons;

public class Extra implements Serializable {
    public static final int NULL = 0;
    public static final int AVOCADO = 7;
    public static final int BACON = 8;
    public static final int CHEESE = 9;
    public static final int CHICKEN_BREAST = 10;
    public static final int CHICKEN_STRIP = 11;
    public static final int CHICKEN_TERIYAKI = 12;
    public static final int DOUBLE_MEAT = 13;
    public static final int EGG = 14;
    public static final int HAM = 15;
    public static final int MEATBALL = 16;
    public static final int PEPPERONI = 17;
    public static final int ROAST_BEEF = 18;
    public static final int SALAMI = 19;
    public static final int SEAFOOD = 20;
    public static final int SMOKED_HAM = 21;
    public static final int STEAK = 22;
    public static final int TUNA = 23;
    public static final int TURKEY = 24;
    
    protected int extraNo;
    protected String name;
    protected String korName;
    protected int quantity;
    protected int price;
    protected ImageIcon imageIcon;
    
    public Extra() {
        quantity = 1;
        imageIcon = ImageIcons.NULL_WIDE;
    }
    
    @Override
    public String toString() {
        String result = "";
        if (quantity == 1) {
            result = name;
        } else {
            result = name + " x" + quantity;
        }
        return result;
    }
    
    public void addQuantity() {
        quantity++;
    }
    
    public void subQuantity() {
        quantity--;
    }
    
    public static Extra getExtra(int extraNo) {
        return getExtra(extraNo, 1);
    }
    
    public static Extra getExtra(int extraNo, int quantity) {
        switch (extraNo) {
            case AVOCADO:
                return new Avocado();
                
            case BACON:
                return new Bacon();
                
            case CHEESE:
                return new Cheese();
                
            case CHICKEN_BREAST:
                return new ChickenBreast();
                
            case CHICKEN_STRIP:
                return new ChickenStrip();
                
            case CHICKEN_TERIYAKI:
                return new ChickenTeriyaki();
                
            case DOUBLE_MEAT:
                return new DoubleMeat();
                
            case EGG:
                return new Egg();
                
            case HAM:
                return new Ham();
                
            case MEATBALL:
                return new Meatball();
                
            case PEPPERONI:
                return new Pepperoni();
                
            case ROAST_BEEF:
                return new RoastBeef();
                
            case SALAMI:
                return new Salami();
                
            case SEAFOOD:
                return new Seafood();
                        
            case SMOKED_HAM:
                return new SmokedHam();
                
            case STEAK:
                return new Steak();
                
            case TUNA:
                return new Tuna();
                
            case TURKEY:
                return new Turkey();
                
            default:
                return null;
        }
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public String getKorName() {
        return korName;
    }
    
    public int getExtraNo() {
        return extraNo;
    }
    
    public int getPrice() {
        return price;
    }
    
    public ImageIcon getImageIcon() {
        return imageIcon;
    }
    
    public static ArrayList<Extra> getAllExtraList() {
        ArrayList<Extra> result = new ArrayList<>();
        result.add(Extra.getExtra(AVOCADO));
        result.add(Extra.getExtra(BACON));
        result.add(Extra.getExtra(CHEESE));
        result.add(Extra.getExtra(CHICKEN_BREAST));
        result.add(Extra.getExtra(CHICKEN_STRIP));
        result.add(Extra.getExtra(DOUBLE_MEAT));
        result.add(Extra.getExtra(EGG));
        result.add(Extra.getExtra(MEATBALL));
        result.add(Extra.getExtra(PEPPERONI));
        result.add(Extra.getExtra(ROAST_BEEF));
        result.add(Extra.getExtra(SALAMI));
        result.add(Extra.getExtra(SEAFOOD));
        result.add(Extra.getExtra(SMOKED_HAM));
        result.add(Extra.getExtra(STEAK));
        return result;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
