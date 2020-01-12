package myway.product.sandwich;

import myway.menu.Menu;
import myway.menu.sandwichmenu.BLT;
import myway.menu.sandwichmenu.ChickenBaconRanch;
import myway.menu.sandwichmenu.ChickenTeriyaki;
import myway.menu.sandwichmenu.Ham;
import myway.menu.sandwichmenu.ItalianBMT;
import myway.menu.sandwichmenu.Meatball;
import myway.menu.sandwichmenu.RoastBeef;
import myway.menu.sandwichmenu.RoastedChicken;
import myway.menu.sandwichmenu.Seafood;
import myway.menu.sandwichmenu.SpicyItalian;
import myway.menu.sandwichmenu.SteakAndCheese;
import myway.menu.sandwichmenu.SubwayClub;
import myway.menu.sandwichmenu.SubwayMelt;
import myway.menu.sandwichmenu.Tuna;
import myway.menu.sandwichmenu.VeggieDelite;

public class SandwichManager {

    public static Sandwich makeSandwich(int menuNo, int size) {
        switch (menuNo) {
            case Menu.BLT:
                return new BLT(size);
                
            case Menu.CHICKEN_BACON_RANCH:
                return new ChickenBaconRanch(size);
                
            case Menu.CHICKEN_TERIYAKI:
                return new ChickenTeriyaki(size);
                
            case Menu.HAM:
                return new Ham(size);
                
            case Menu.ITALIAN_BMT:
                return new ItalianBMT(size);
                
            case Menu.MEATBALL:
                return new Meatball(size);
                
            case Menu.ROAST_BEEF:
                return new RoastBeef(size);
                
            case Menu.ROASTED_CHICKEN:
                return new RoastedChicken(size);
                
            case Menu.SEAFOOD:
                return new Seafood(size);
                
            case Menu.SPICY_ITALIAN:
                return new SpicyItalian(size);
                
            case Menu.STEAK_AND_CHEESE:
                return new SteakAndCheese(size);
                
            case Menu.SUBWAY_CLUB:
                return new SubwayClub(size);
                
            case Menu.SUBWAY_MELT:
                return new SubwayMelt(size);
                
            case Menu.TUNA:
                return new Tuna(size);
                
            case Menu.VEGGIE_DELITE:
                return new VeggieDelite(size);
                
            default:
                return null;
        }
    }
}
