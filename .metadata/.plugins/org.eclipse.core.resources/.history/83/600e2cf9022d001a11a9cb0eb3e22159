package myway.product.sandwich.bread;

import java.io.Serializable;
import java.util.ArrayList;

public class Bread implements Serializable {
    public static final int NULL = 0;
    public static final int FLAT_BREAD = 1;
    public static final int HEARTY_ITALIAN = 2;
    public static final int HONEY_OAT = 3;
    public static final int PARMESAN_OREGANO = 4;
    public static final int WHEAT = 5;
    public static final int WHITE = 6;
    
    protected int breadNo;
    protected String name;
    protected String korName;
    protected int servingSize;
    protected int calorie;
    
    @Override
    public String toString() {
        return name;
    }
    
    public static Bread getBread(int breadNo) {
        switch(breadNo) {
            case FLAT_BREAD:
                return new FlatBread();
                
            case HEARTY_ITALIAN:
                return new HeartyItalian();
                
            case HONEY_OAT:
                return new HoneyOat();
                
            case PARMESAN_OREGANO:
                return new ParmesanOregano();
                
            case WHEAT:
                return new Wheat();
                
            case WHITE:
                return new White();
            
            default:
                return null;
        }
    }
    
    public static ArrayList<Bread> getAllBreadList() {
        ArrayList<Bread> result = new ArrayList<>();
        result.add(Bread.getBread(FLAT_BREAD));
        result.add(Bread.getBread(HEARTY_ITALIAN));
        result.add(Bread.getBread(HONEY_OAT));
        result.add(Bread.getBread(PARMESAN_OREGANO));
        result.add(Bread.getBread(WHEAT));
        result.add(Bread.getBread(WHITE));
        return result;
    }
    
    public int getBreadNo() {
        return breadNo;
    }

    public String getName() {
        return name;
    }

    public String getKorName() {
        return korName;
    }
}
