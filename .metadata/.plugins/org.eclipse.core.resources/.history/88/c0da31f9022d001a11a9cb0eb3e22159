package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Favorite;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class Meatball extends Sandwich implements Favorite, Serializable {
    public Meatball() {}
    
    public Meatball(int size) {
        menuNo = MEATBALL;
        name = "Meatball";
        korName = "¹ÌÆ®º¼";
        
        Extra meatball = Extra.getExtra(Extra.MEATBALL);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce marinara = Sauce.getSauce(Sauce.MARINARA);
        Sauce mayonnaise = Sauce.getSauce(Sauce.MAYONNAISE);
        Sauce hotChilli = Sauce.getSauce(Sauce.HOT_CHILLI);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;
                
                meatball.setQuantity(4);
                cheese.setQuantity(2);
                
                extras.add(meatball);
                extras.add(cheese);
                
                sauces.add(marinara);
                sauces.add(mayonnaise);
                sauces.add(hotChilli);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                meatball.setQuantity(8);
                cheese.setQuantity(4);
                
                extras.add(meatball);
                extras.add(cheese);
                
                sauces.add(marinara);
                sauces.add(mayonnaise);
                sauces.add(hotChilli);
                
                break;
                
            default:
                break;
        }
    }
}
