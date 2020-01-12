package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Premium;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class SubwayMelt extends Sandwich implements Premium, Serializable {
    public SubwayMelt() {}
    
    public SubwayMelt(int size) {
        menuNo = SUBWAY_MELT;
        name = "Subway Melt";
        korName = "써브웨이 멜트";
        
        Extra turkey = Extra.getExtra(Extra.TURKEY);
        Extra ham = Extra.getExtra(Extra.HAM);
        Extra bacon = Extra.getExtra(Extra.BACON);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce honeyMustard = Sauce.getSauce(Sauce.HONEY_MUSTARD);
        Sauce sweetChilli = Sauce.getSauce(Sauce.SWEET_CHILLI);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                turkey.setQuantity(2);
                ham.setQuantity(2);
                bacon.setQuantity(2);
                cheese.setQuantity(2);
                
                extras.add(turkey);
                extras.add(ham);
                extras.add(bacon);
                extras.add(cheese);
                
                sauces.add(honeyMustard);
                sauces.add(sweetChilli);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                turkey.setQuantity(4);
                ham.setQuantity(4);
                bacon.setQuantity(4);
                cheese.setQuantity(4);
                
                extras.add(turkey);
                extras.add(ham);
                extras.add(bacon);
                extras.add(cheese);
                
                sauces.add(honeyMustard);
                sauces.add(sweetChilli);
                
                break;
                
            default:
                break;
        }
    }
}
