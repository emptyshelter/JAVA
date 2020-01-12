package myway.product.sandwich.extra;

import myway.file.image.ImageIcons;
import myway.product.sandwich.extra.interfaces.Addible;

public class DoubleMeat extends Extra implements Addible {
    public DoubleMeat() {
        extraNo = DOUBLE_MEAT;
        name = "Double Meat";
        korName = "더블 미트";
        price = 1500;
        imageIcon = ImageIcons.EXTRA_DOUBLE_MEAT;
    }
}
