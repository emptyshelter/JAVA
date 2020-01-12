package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Signature;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class ChickenTeriyaki extends Sandwich implements Signature, Serializable {
    /* Variable */
    private static final long serialVersionUID = -4177233273451287194L;

    /* Constructor */
    public ChickenTeriyaki() {}
    
    public ChickenTeriyaki(int size) {
        menuNo = CHICKEN_TERIYAKI;
        name = "Chicken Teriyaki";
        korName = "치킨 데리야끼";
        
        Extra chickenTeriyaki = Extra.getExtra(Extra.CHICKEN_TERIYAKI);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce sweetOnion = Sauce.getSauce(Sauce.SWEET_ONION);
        Sauce bbq = Sauce.getSauce(Sauce.BBQ);
        Sauce ranch = Sauce.getSauce(Sauce.RANCH);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                chickenTeriyaki.setQuantity(1);
                cheese.setQuantity(2);
                
                extras.add(chickenTeriyaki);
                extras.add(cheese);
                
                sauces.add(sweetOnion);
                sauces.add(bbq);
                sauces.add(ranch);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                chickenTeriyaki.setQuantity(2);
                cheese.setQuantity(4);
                
                extras.add(chickenTeriyaki);
                extras.add(cheese);
                
                sauces.add(sweetOnion);
                sauces.add(bbq);
                sauces.add(ranch);
                
                break;
                
            default:
                break;
        }
    }
}
