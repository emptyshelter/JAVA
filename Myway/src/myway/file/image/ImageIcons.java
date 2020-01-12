package myway.file.image;

import javax.swing.ImageIcon;

public class ImageIcons {
    // PATH
    private static final String PATH = ImageIcons.class.getResource("").getPath();
    private static final String PATH_MENU = ImageIcons.class.getResource("").getPath() + "menu\\";
    private static final String PATH_SIZE = ImageIcons.class.getResource("").getPath() + "size\\";
    private static final String PATH_BREAD = ImageIcons.class.getResource("").getPath() + "bread\\";
    private static final String PATH_EXTRA = ImageIcons.class.getResource("").getPath() + "extra\\";
    private static final String PATH_VEGGIE = ImageIcons.class.getResource("").getPath() + "veggie\\";
    private static final String PATH_SAUCE = ImageIcons.class.getResource("").getPath() + "sauce\\";

    // Null
    public static final ImageIcon NULL = new ImageIcon(PATH + "null.png");
    public static final ImageIcon NULL_WIDE = new ImageIcon(PATH + "nullWide.png");

    // Menu
    public static final ImageIcon MENU_BLT = new ImageIcon(PATH_MENU + "BLT.png");
    public static final ImageIcon MENU_CHICKEN_BACON_RANCH =
            new ImageIcon(PATH_MENU + "ChickenBaconRanch.png");
    public static final ImageIcon MENU_CHICKEN_TERIYAKI =
            new ImageIcon(PATH_MENU + "ChickenTeriyaki.png");
    public static final ImageIcon MENU_HAM = new ImageIcon(PATH_MENU + "Ham.png");
    public static final ImageIcon MENU_ITALIAN_BMT = new ImageIcon(PATH_MENU + "ItalianBMT.png");
    public static final ImageIcon MENU_MEATBALL = new ImageIcon(PATH_MENU + "Meatball.png");
    public static final ImageIcon MENU_ROAST_BEEF = new ImageIcon(PATH_MENU + "RoastBeef.png");
    public static final ImageIcon MENU_ROASTED_CHICKEN = new ImageIcon(PATH_MENU + "RoastedChicken.png");
    public static final ImageIcon MENU_SEAFOOD = new ImageIcon(PATH_MENU + "Seafood.png");
    public static final ImageIcon MENU_SPICYITALIAN = new ImageIcon(PATH_MENU + "SpicyItalian.png");
    public static final ImageIcon MENU_STEAK_AND_CHEESE =
            new ImageIcon(PATH_MENU + "SteakAndCheese.png");
    public static final ImageIcon MENU_SUBWAY_CLUB = new ImageIcon(PATH_MENU + "SubwayClub.png");
    public static final ImageIcon MENU_SUBWAY_MELT = new ImageIcon(PATH_MENU + "SubwayMelt.png");
    public static final ImageIcon MENU_TUNA = new ImageIcon(PATH_MENU + "Tuna.png");
    public static final ImageIcon MENU_VEGGIE_DELITE = new ImageIcon(PATH_MENU + "VeggieDelite.png");

    // Size
    public static final ImageIcon SIZE_15CM = new ImageIcon(PATH_SIZE + "Size15cm.png");
    public static final ImageIcon SIZE_30CM = new ImageIcon(PATH_SIZE + "Size30cm.png");

    // Bread
    public static final ImageIcon BREAD_FLAT_BREAD = new ImageIcon(PATH_BREAD + "FlatBread.png");
    public static final ImageIcon BREAD_HEARTY_ITALIAN = new ImageIcon(PATH_BREAD + "HeartyItalian.png");
    public static final ImageIcon BREAD_HONEY_OAT = new ImageIcon(PATH_BREAD + "HoneyOat.png");
    public static final ImageIcon BREAD_PARMESAN_OREGANO =
            new ImageIcon(PATH_BREAD + "ParmesanOregano.png");
    public static final ImageIcon BREAD_WHEAT = new ImageIcon(PATH_BREAD + "Wheat.png");
    public static final ImageIcon BREAD_WHITE = new ImageIcon(PATH_BREAD + "White.png");

    // Extra
    public static final ImageIcon EXTRA_AVOCADO = new ImageIcon(PATH_EXTRA + "Avocado.png");
    public static final ImageIcon EXTRA_BACON = new ImageIcon(PATH_EXTRA + "Bacon.png");
    public static final ImageIcon EXTRA_CHEESE = new ImageIcon(PATH_EXTRA + "Cheese.png");
    public static final ImageIcon EXTRA_CHICKEN_BREAST = new ImageIcon(PATH_EXTRA + "ChickenBreast.png");
    public static final ImageIcon EXTRA_CHICKEN_STRIP = new ImageIcon(PATH_EXTRA + "ChickenStrip.png");
    public static final ImageIcon EXTRA_CHICKEN_TERIYAKI = new ImageIcon(PATH_EXTRA + "ChickenTeriyaki.png");
    public static final ImageIcon EXTRA_DOUBLE_MEAT = new ImageIcon(PATH_EXTRA + "DoubleMeat.png");
    public static final ImageIcon EXTRA_EGG = new ImageIcon(PATH_EXTRA + "egg.png");
    public static final ImageIcon EXTRA_HAM = new ImageIcon(PATH_EXTRA + "Ham.png");
    public static final ImageIcon EXTRA_MEATBALL = new ImageIcon(PATH_EXTRA + "Meatball.png");
    public static final ImageIcon EXTRA_PEPPERONI = new ImageIcon(PATH_EXTRA + "Pepperoni.png");
    public static final ImageIcon EXTRA_ROAST_BEEF = new ImageIcon(PATH_EXTRA + "RoastBeef.png");
    public static final ImageIcon EXTRA_SALAMI = new ImageIcon(PATH_EXTRA + "Salami.png");
    public static final ImageIcon EXTRA_SEAFOOD = new ImageIcon(PATH_EXTRA + "Seafood.png");
    public static final ImageIcon EXTRA_SMOKED_HAM = new ImageIcon(PATH_EXTRA + "SmokedHam.png");
    public static final ImageIcon EXTRA_STEAK = new ImageIcon(PATH_EXTRA + "Steak.png");
    public static final ImageIcon EXTRA_TUNA = new ImageIcon(PATH_EXTRA + "Tuna.png");
    public static final ImageIcon EXTRA_TURKEY = new ImageIcon(PATH_EXTRA + "Turkey.png");
    
    // Veggie
    public static final ImageIcon VEGGIE_CUCUMBER = new ImageIcon(PATH_VEGGIE + "Cucumber.png");
    public static final ImageIcon VEGGIE_JALAPENO = new ImageIcon(PATH_VEGGIE + "Jalapeno.png");
    public static final ImageIcon VEGGIE_LETTUCE = new ImageIcon(PATH_VEGGIE + "Lettuce.png");
    public static final ImageIcon VEGGIE_OLIVE = new ImageIcon(PATH_VEGGIE + "Olive.png");
    public static final ImageIcon VEGGIE_PEPPER = new ImageIcon(PATH_VEGGIE + "Pepper.png");
    public static final ImageIcon VEGGIE_PICKLE = new ImageIcon(PATH_VEGGIE + "Pickle.png");
    public static final ImageIcon VEGGIE_RED_ONION = new ImageIcon(PATH_VEGGIE + "RedOnion.png");
    public static final ImageIcon VEGGIE_TOMATO = new ImageIcon(PATH_VEGGIE + "Tomato.png");
    
    // Sauce
    public static final ImageIcon SAUCE_BBQ = new ImageIcon(PATH_SAUCE + "BBQ.png");
    public static final ImageIcon SAUCE_BLACK_PEPPER= new ImageIcon(PATH_SAUCE + "BlackPepper.png");
    public static final ImageIcon SAUCE_CHIPOTLE = new ImageIcon(PATH_SAUCE + "Chipotle.png");
    public static final ImageIcon SAUCE_HONEY_MUSTARD = new ImageIcon(PATH_SAUCE + "HoneyMustard.png");
    public static final ImageIcon SAUCE_HORSERADISH = new ImageIcon(PATH_SAUCE + "Horseradish.png");
    public static final ImageIcon SAUCE_HOT_CHILLI = new ImageIcon(PATH_SAUCE + "HotChilli.png");
    public static final ImageIcon SAUCE_ITALIAN_DRESSING = new ImageIcon(PATH_SAUCE + "ItalianDressing.png");
    public static final ImageIcon SAUCE_MARINARA = new ImageIcon(PATH_SAUCE + "Marinara.png");
    public static final ImageIcon SAUCE_MAYONNAISE = new ImageIcon(PATH_SAUCE + "Mayonnaise.png");
    public static final ImageIcon SAUCE_OLIVE_OIL= new ImageIcon(PATH_SAUCE + "OliveOil.png");
    public static final ImageIcon SAUCE_RANCH = new ImageIcon(PATH_SAUCE + "Ranch.png");
    public static final ImageIcon SAUCE_RED_WINE_VINEGAR = new ImageIcon(PATH_SAUCE + "RedWineVinegar.png");
    public static final ImageIcon SAUCE_SALT = new ImageIcon(PATH_SAUCE + "Salt.png");
    public static final ImageIcon SAUCE_SWEET_CHILLI = new ImageIcon(PATH_SAUCE + "SweetChilli.png");
    public static final ImageIcon SAUCE_SWEET_ONION = new ImageIcon(PATH_SAUCE + "SweetOnion.png");
    public static final ImageIcon SAUCE_THOUSAND_ISLAND = new ImageIcon(PATH_SAUCE + "ThousandIsland.png");
    public static final ImageIcon SAUCE_YELLOW_MUSTARD = new ImageIcon(PATH_SAUCE + "YellowMustard.png");
}
