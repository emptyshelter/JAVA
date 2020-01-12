package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Premium;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class SteakAndCheese extends Sandwich implements Premium, Serializable {
    public SteakAndCheese() {}
    
    public SteakAndCheese(int size) {
        menuNo = STEAK_AND_CHEESE;
        name = "Steak & Cheese";
        korName = "스테이크&치즈";
        
        Extra steak = Extra.getExtra(Extra.STEAK);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce bbq = Sauce.getSauce(Sauce.BBQ);
        Sauce yellowMustard = Sauce.getSauce(Sauce.YELLOW_MUSTARD);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                steak.setQuantity(1);
                cheese.setQuantity(2);
                
                extras.add(steak);
                extras.add(cheese);
                
                sauces.add(bbq);
                sauces.add(yellowMustard);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                steak.setQuantity(2);
                cheese.setQuantity(4);
                
                extras.add(steak);
                extras.add(cheese);
                
                sauces.add(bbq);
                sauces.add(yellowMustard);
                
                break;
                
            default:
                break;
        }
    }
}
