package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Favorite;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class BLT extends Sandwich implements Favorite, Serializable {
    /* Variable */
    private static final long serialVersionUID = 3770734588632767984L;

    /* Constructor */
    public BLT() {}
    
    public BLT(int size) {
        menuNo = BLT;
        name = "B.L.T";
        korName = "ºñ¿¤Æ¼";
        
        Extra bacon = Extra.getExtra(Extra.BACON);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce mayonnaise = Sauce.getSauce(Sauce.MAYONNAISE);
        Sauce sweetChilli = Sauce.getSauce(Sauce.SWEET_CHILLI);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;
                
                bacon.setQuantity(4);
                cheese.setQuantity(2);
                
                extras.add(bacon);
                extras.add(cheese);
                
                sauces.add(mayonnaise);
                sauces.add(sweetChilli);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                bacon.setQuantity(8);
                cheese.setQuantity(4);
                
                extras.add(bacon);
                extras.add(cheese);
                
                sauces.add(mayonnaise);
                sauces.add(sweetChilli);
                
                break;
                
            default:
                break;
        }
    }
}
