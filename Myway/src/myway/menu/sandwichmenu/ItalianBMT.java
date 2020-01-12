package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Favorite;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class ItalianBMT extends Sandwich implements Favorite, Serializable {
    public ItalianBMT() {}
    
    public ItalianBMT(int size) {
        menuNo = ITALIAN_BMT;
        name = "Italian B.M.T";
        korName = "ÀÌÅ»¸®¾È ºñ¿¥Æ¼";
        
        Extra pepperoni = Extra.getExtra(Extra.PEPPERONI);
        Extra salami = Extra.getExtra(Extra.SALAMI);
        Extra ham = Extra.getExtra(Extra.HAM);
        Extra cheese = Extra.getExtra(Extra.CHEESE);
        
        Sauce horseRadish = Sauce.getSauce(Sauce.HORSERADISH);
        Sauce chipotle = Sauce.getSauce(Sauce.CHIPOTLE);
        Sauce mayonnaise = Sauce.getSauce(Sauce.MAYONNAISE);
        
        switch(size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;
                
                pepperoni.setQuantity(3);
                salami.setQuantity(3);
                ham.setQuantity(2);
                cheese.setQuantity(2);
                
                extras.add(pepperoni);
                extras.add(salami);
                extras.add(ham);
                extras.add(cheese);
                
                sauces.add(horseRadish);
                sauces.add(chipotle);
                sauces.add(mayonnaise);
                
                break;
                
            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;
                
                pepperoni.setQuantity(6);
                salami.setQuantity(6);
                ham.setQuantity(4);
                cheese.setQuantity(4);
                
                extras.add(pepperoni);
                extras.add(salami);
                extras.add(ham);
                extras.add(cheese);
                
                sauces.add(horseRadish);
                sauces.add(chipotle);
                sauces.add(mayonnaise);
                
                break;
                
            default:
                break;
        }
    }
}
