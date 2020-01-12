package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Premium;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class ChickenBaconRanch extends Sandwich implements Premium, Serializable {
    /* Variable */
    private static final long serialVersionUID = -5766303311625602905L;

    /* Constructor */
    public ChickenBaconRanch() {}
    
    public ChickenBaconRanch(int size) {
        menuNo = CHICKEN_BACON_RANCH;
        name = "Chicken Bacon Ranch";
        korName = "치킨 베이컨랜치";
        
        Extra chickenStrip = Extra.getExtra(Extra.CHICKEN_STRIP);
        Extra bacon = Extra.getExtra(Extra.BACON);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce horseradish = Sauce.getSauce(Sauce.HORSERADISH);
        Sauce blackPepper = Sauce.getSauce(Sauce.BLACK_PEPPER);
        Sauce ranch = Sauce.getSauce(Sauce.RANCH);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                chickenStrip.setQuantity(1);
                bacon.setQuantity(2);
                cheese.setQuantity(2);
                
                extras.add(chickenStrip);
                extras.add(bacon);
                extras.add(cheese);
                
                sauces.add(horseradish);
                sauces.add(blackPepper);
                sauces.add(ranch);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                chickenStrip.setQuantity(2);
                bacon.setQuantity(4);
                cheese.setQuantity(4);
                
                extras.add(chickenStrip);
                extras.add(bacon);
                extras.add(cheese);
                
                sauces.add(horseradish);
                sauces.add(blackPepper);
                sauces.add(ranch);
                
                break;
                
            default:
                break;
        }
    }
}
