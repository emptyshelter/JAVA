package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Signature;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class SpicyItalian extends Sandwich implements Signature, Serializable {
    public SpicyItalian() {}
    
    public SpicyItalian(int size) {
        menuNo = SPICY_ITALIAN;
        name = "Spicy Italian";
        korName = "스파이시 이탈리안";
        
        Extra pepperoni = Extra.getExtra(Extra.PEPPERONI);
        Extra salami = Extra.getExtra(Extra.SALAMI);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce hotChilli = Sauce.getSauce(Sauce.HOT_CHILLI);
        Sauce mayonnaise = Sauce.getSauce(Sauce.MAYONNAISE);
        Sauce ranch = Sauce.getSauce(Sauce.RANCH);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                pepperoni.setQuantity(5);
                salami.setQuantity(5);
                cheese.setQuantity(2);
                
                extras.add(pepperoni);
                extras.add(salami);
                extras.add(cheese);
                
                sauces.add(hotChilli);
                sauces.add(mayonnaise);
                sauces.add(ranch);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                pepperoni.setQuantity(10);
                salami.setQuantity(10);
                cheese.setQuantity(4);
                
                extras.add(pepperoni);
                extras.add(salami);
                extras.add(cheese);
                
                sauces.add(hotChilli);
                sauces.add(mayonnaise);
                sauces.add(ranch);
                
                break;
                
            default:
                break;
        }
    }
}
