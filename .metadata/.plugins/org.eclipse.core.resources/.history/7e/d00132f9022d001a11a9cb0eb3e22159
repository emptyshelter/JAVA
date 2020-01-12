package myway.menu.sandwichmenu;

import java.io.Serializable;

import myway.menu.sandwichmenu.interfaces.Classic;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;

public class VeggieDelite extends Sandwich implements Classic, Serializable {
    public VeggieDelite() {}

    public VeggieDelite(int size) {
        menuNo = VEGGIE_DELITE;
        name = "Veggie Delite";
        korName = "º£Áö";

        Extra cheese = Extra.getExtra(Extra.CHEESE);

        Sauce oliveOil = Sauce.getSauce(Sauce.OLIVE_OIL);
        Sauce redWineVinegar = Sauce.getSauce(Sauce.RED_WINE_VINEGAR);
        Sauce italianDressing = Sauce.getSauce(Sauce.ITALIAN_DRESSING);

        switch (size) {
            case SIZE_15CM:
                this.size = size;
                price = defaultPrice = PRICE_15CM;

                cheese.setQuantity(2);
                
                extras.add(cheese);

                sauces.add(oliveOil);
                sauces.add(redWineVinegar);
                sauces.add(italianDressing);

                break;

            case SIZE_30CM:
                this.size = size;
                price = defaultPrice = PRICE_30CM;

                cheese.setQuantity(4);
                
                extras.add(cheese);

                sauces.add(oliveOil);
                sauces.add(redWineVinegar);
                sauces.add(italianDressing);

                break;

            default:
                break;
        }
    }
}
