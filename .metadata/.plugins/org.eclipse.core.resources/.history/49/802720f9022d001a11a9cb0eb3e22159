package myway.product.sandwich.veggie;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Veggie implements Serializable {
    public static final int CUCUMBER = 1;
    public static final int JALAPENO = 2;
    public static final int LETTUCE = 3;
    public static final int OLIVE = 4;
    public static final int PEPPER = 5;
    public static final int PICKLE = 6;
    public static final int RED_ONION = 7;
    public static final int TOMATO = 8;

    protected int veggieNo;
    protected String name;
    protected String korName;
    protected ImageIcon imageIcon;
//    protected int servingSize;
//    protected int calorie;
    
    @Override
    public String toString() {
        return name;
    }
    
    public static Veggie getVeggie(int veggieNo) {
        switch (veggieNo) {
            case CUCUMBER:
                return new Cucumber();
                
            case JALAPENO:
                return new Jalapeno();
                
            case LETTUCE:
                return new Lettuce();
                
            case OLIVE:
                return new Olive();
                
            case PEPPER:
                return new Pepper();
                
            case PICKLE:
                return new Pickle();
                
            case RED_ONION:
                return new RedOnion();
                
            case TOMATO:
                return new Tomato();
            
            default:
                return null;
        }
    }
    
    public static ArrayList<Veggie> getAllVeggieList() {
        ArrayList<Veggie> resultList = new ArrayList<>();
        resultList.add(getVeggie(CUCUMBER));
        resultList.add(getVeggie(JALAPENO));
        resultList.add(getVeggie(LETTUCE));
        resultList.add(getVeggie(OLIVE));
        resultList.add(getVeggie(PEPPER));
        resultList.add(getVeggie(PICKLE));
        resultList.add(getVeggie(RED_ONION));
        resultList.add(getVeggie(TOMATO));
        return resultList;
    }
    
    public int getVeggieNo() {
        return veggieNo;
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
