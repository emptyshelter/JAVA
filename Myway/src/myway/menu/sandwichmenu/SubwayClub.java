package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Signature;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class SubwayClub extends Sandwich implements Signature, Serializable {
    public SubwayClub() {}
    
    public SubwayClub(int size) {
        menuNo = SUBWAY_CLUB;
        name = "Subway Club";
        korName = "써브웨이 클럽";
        
        Extra turkey = Extra.getExtra(Extra.TURKEY);
        Extra ham = Extra.getExtra(Extra.HAM);
        Extra roastBeef = Extra.getExtra(Extra.ROAST_BEEF);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce honeyMustard = Sauce.getSauce(Sauce.HONEY_MUSTARD);
        Sauce bbq = Sauce.getSauce(Sauce.BBQ);
        Sauce ranch = Sauce.getSauce(Sauce.RANCH);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                turkey.setQuantity(2);
                ham.setQuantity(1);
                roastBeef.setQuantity(1);
                cheese.setQuantity(2);
                
                extras.add(turkey);
                extras.add(ham);
                extras.add(roastBeef);
                extras.add(cheese);
                
                sauces.add(honeyMustard);
                sauces.add(bbq);
                sauces.add(ranch);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                turkey.setQuantity(4);
                ham.setQuantity(2);
                roastBeef.setQuantity(2);
                cheese.setQuantity(4);
                
                extras.add(turkey);
                extras.add(ham);
                extras.add(roastBeef);
                extras.add(cheese);
                
                sauces.add(honeyMustard);
                sauces.add(bbq);
                sauces.add(ranch);
                
                break;
                
            default:
                break;
        }
    }
}
