package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Premium;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class RoastBeef extends Sandwich implements Premium, Serializable {
    public RoastBeef() {}
    
    public RoastBeef(int size) {
        menuNo = ROAST_BEEF;
        name = "Roast Beef";
        korName = "로스트 비프";
        
        Extra roastBeef = Extra.getExtra(Extra.ROAST_BEEF);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce salt = Sauce.getSauce(Sauce.SALT);
        Sauce blackPepper = Sauce.getSauce(Sauce.BLACK_PEPPER);
        Sauce redWindVinegar = Sauce.getSauce(Sauce.RED_WINE_VINEGAR);
        Sauce oliveOil = Sauce.getSauce(Sauce.OLIVE_OIL);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                roastBeef.setQuantity(3);
                cheese.setQuantity(2);
                
                extras.add(roastBeef);
                extras.add(cheese);
                
                sauces.add(salt);
                sauces.add(blackPepper);
                sauces.add(redWindVinegar);
                sauces.add(oliveOil);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                roastBeef.setQuantity(6);
                cheese.setQuantity(4);
                
                extras.add(roastBeef);
                extras.add(cheese);
                
                sauces.add(salt);
                sauces.add(blackPepper);
                sauces.add(redWindVinegar);
                sauces.add(oliveOil);
                
                break;
                
            default:
                break;
        }
    }
}
