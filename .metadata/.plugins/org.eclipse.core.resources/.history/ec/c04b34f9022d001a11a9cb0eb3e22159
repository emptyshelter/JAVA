package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Classic;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class Seafood extends Sandwich implements Classic, Serializable {
    public Seafood() {}

    public Seafood(int size) {
        menuNo = SEAFOOD;
        name = "Seafood";
        korName = "¾¾Çªµå";

        Extra seafood = Extra.getExtra(Extra.SEAFOOD);
        Extra cheese = Extra.getExtra(Extra.CHEESE);

        Sauce thousandIsland = Sauce.getSauce(Sauce.THOUSAND_ISLAND);
        Sauce hotChilli = Sauce.getSauce(Sauce.HOT_CHILLI);

        switch (size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                seafood.setQuantity(2);
                cheese.setQuantity(2);
                
                extras.add(seafood);
                extras.add(cheese);

                sauces.add(thousandIsland);
                sauces.add(hotChilli);

                break;

            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;

                seafood.setQuantity(4);
                cheese.setQuantity(4);
                
                extras.add(seafood);
                extras.add(cheese);

                sauces.add(thousandIsland);
                sauces.add(hotChilli);

                break;

            default:
                break;
        }
    }
}
