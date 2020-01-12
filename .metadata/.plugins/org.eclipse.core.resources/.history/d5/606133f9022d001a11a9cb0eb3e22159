package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Premium;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class RoastedChicken extends Sandwich implements Premium, Serializable {
    public RoastedChicken() {}
    
    public RoastedChicken(int size) {
        menuNo = ROASTED_CHICKEN;
        name = "Roasted Chicken";
        korName = "로스트 치킨";
        
        Extra chickenBreast = Extra.getExtra(Extra.CHICKEN_BREAST);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce salt = Sauce.getSauce(Sauce.SALT);
        Sauce blackPepper = Sauce.getSauce(Sauce.BLACK_PEPPER);
        Sauce honeyMustard = Sauce.getSauce(Sauce.HONEY_MUSTARD);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                chickenBreast.setQuantity(5);
                cheese.setQuantity(2);
                
                extras.add(chickenBreast);
                extras.add(cheese);
                
                sauces.add(salt);
                sauces.add(blackPepper);
                sauces.add(honeyMustard);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                chickenBreast.setQuantity(10);
                cheese.setQuantity(4);
                
                extras.add(chickenBreast);
                extras.add(cheese);
                
                sauces.add(salt);
                sauces.add(blackPepper);
                sauces.add(honeyMustard);
                
                break;
                
            default:
                break;
        }
    }
}
