package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Classic;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class Tuna extends Sandwich implements Classic, Serializable {
    public Tuna() {}

    public Tuna(int size) {
        menuNo = TUNA;
        name = "Tuna";
        korName = "ÂüÄ¡";

        Extra tuna = Extra.getExtra(Extra.TUNA);
        Extra cheese = Extra.getExtra(Extra.CHEESE);

        Sauce honeyMustard = Sauce.getSauce(Sauce.HONEY_MUSTARD);
        Sauce bbq = Sauce.getSauce(Sauce.BBQ);

        switch (size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                tuna.setQuantity(2);
                cheese.setQuantity(2);
                
                extras.add(tuna);
                extras.add(cheese);

                sauces.add(honeyMustard);
                sauces.add(bbq);

                break;

            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;

                tuna.setQuantity(4);
                cheese.setQuantity(4);
                
                extras.add(tuna);
                extras.add(cheese);

                sauces.add(honeyMustard);
                sauces.add(bbq);

                break;

            default:
                break;
        }
    }
}
