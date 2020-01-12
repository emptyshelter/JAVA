package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Classic;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class Ham extends Sandwich implements Classic, Serializable {
    public Ham() {}

    public Ham(int size) {
        menuNo = HAM;
        name = "Ham";
        korName = "ÇÜ";

        Extra smokedHam = Extra.getExtra(Extra.SMOKED_HAM);
        Extra cheese = Extra.getExtra(Extra.CHEESE);

        Sauce mayonnaise = Sauce.getSauce(Sauce.MAYONNAISE);
        Sauce thousandIsland = Sauce.getSauce(Sauce.THOUSAND_ISLAND);

        switch (size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                smokedHam.setQuantity(4);
                cheese.setQuantity(2);
                
                extras.add(smokedHam);
                extras.add(cheese);

                sauces.add(mayonnaise);
                sauces.add(thousandIsland);

                break;

            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;

                smokedHam.setQuantity(8);
                cheese.setQuantity(4);
                
                extras.add(smokedHam);
                extras.add(cheese);

                sauces.add(mayonnaise);
                sauces.add(thousandIsland);

                break;

            default:
                break;
        }
    }
}
