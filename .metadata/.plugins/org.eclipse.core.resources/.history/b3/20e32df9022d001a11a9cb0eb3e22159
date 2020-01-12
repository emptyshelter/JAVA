package myway.product.sandwich;

import java.io.Serializable;
import java.util.ArrayList;

import myway.menu.Menu;
import myway.product.sandwich.bread.Bread;
import myway.product.sandwich.extra.Extra;
import myway.product.sandwich.sauce.Sauce;
import myway.product.sandwich.veggie.Cucumber;
import myway.product.sandwich.veggie.Jalapeno;
import myway.product.sandwich.veggie.Lettuce;
import myway.product.sandwich.veggie.Olive;
import myway.product.sandwich.veggie.Pepper;
import myway.product.sandwich.veggie.Pickle;
import myway.product.sandwich.veggie.RedOnion;
import myway.product.sandwich.veggie.Tomato;
import myway.product.sandwich.veggie.Veggie;

public class Sandwich extends Menu implements Serializable {
//    public static final int SPICY_ITALIAN_15CM = 1;
//    public static final int SPICY_ITALIAN_30CM = 2;
//    public static final int HAM_15CM = 3;
//    public static final int HAM_30CM = 4;
//    public static final int MEATBALL_15CM = 5;
//    public static final int MEATBALL_30CM = 6;
//    public static final int ROAST_BEEF_15CM = 7;
//    public static final int ROAST_BEEF_30CM = 8;
//    public static final int CHICKEN_BACON_RANCH_15CM = 9;
//    public static final int CHICKEN_BACON_RANCH_30CM = 10;
//    public static final int ROASTED_CHICKEN_15CM = 11;
//    public static final int ROASTED_CHICKEN_30CM = 12;
//    public static final int SEAFOOD_15CM = 13;
//    public static final int SEAFOOD_30CM = 14;
//    public static final int STEAK_AND_CHEESE_15CM = 15;
//    public static final int STEAK_AND_CHEESE_30CM = 16;

    protected int sandwichNo;
    protected String name;
    protected String korName;
    protected int size;
    private Bread bread;
    protected ArrayList<Extra> extras;
    protected ArrayList<Veggie> veggies;
    protected ArrayList<Sauce> sauces;
    protected int price;

    public Sandwich() {
        extras = new ArrayList<>();
        veggies = new ArrayList<>();
        sauces = new ArrayList<>();

        veggies.add(new Lettuce());
        veggies.add(new Tomato());
        veggies.add(new Cucumber());
        veggies.add(new Pepper());
        veggies.add(new RedOnion());
        veggies.add(new Pickle());
        veggies.add(new Olive());
        veggies.add(new Jalapeno());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(name);
        sb.append(" (" + size + "cm)");
        sb.append("\n빵:\n");
        sb.append(bread);
        sb.append("\n토핑:\n");
        sb.append(extras);
        sb.append("\n야채 :\n");
        sb.append(veggies);
        sb.append("\n소스 :\n");
        sb.append(sauces);
        sb.append("\n가격 :\n");
        sb.append(price + "원");
        return sb.toString();
    }

    public void addExtra(int extraNo) {
        price += Extra.getExtra(extraNo).getPrice();
        for (Extra extra : extras) {
            // 추가 가능한 토핑이 아니면 return
//            if (!(extra instanceof Addible)) {
//                return;
//            }
            
            // 토핑리스트에 있으면 수량 1 증가 후 return
            if (extraNo == extra.getExtraNo()) {
                extra.addQuantity();
                return;
            }
        }
        // 토핑 리스트에 없다면 새로 추가
        extras.add(Extra.getExtra(extraNo));
    }

    public void subExtra(int extraNo) {
        for (int i = 0; i < extras.size(); i++) {
            // 토핑 리스트에 있다면 수량 1 감소
            if (extraNo == extras.get(i).getExtraNo()) {
                price -= Extra.getExtra(extraNo).getPrice();
                extras.get(i).subQuantity();
                // 남은수량이 0개 이하면 리스트에서 삭제
                if (extras.get(i).getQuantity() <= 0) {
                    extras.remove(i);
                }
                break;
            }
        }
    }
    
    public void addVeggie(int veggieNo) {
        for (Veggie veggie : veggies) {
            if (veggieNo == veggie.getVeggieNo()) {
                return;
            }
        }
        veggies.add(Veggie.getVeggie(veggieNo));
    }
    
    public void subVeggie(int veggieNo) {
        for (int i = 0; i < veggies.size(); i++) {
            if (veggieNo == veggies.get(i).getVeggieNo()) {
                veggies.remove(i);
                break;
            }
        }
    }
    
    public void addSauce(int sauceNo) {
        for (Sauce sauce : sauces) {
            if (sauceNo == sauce.getSauceNo()) {
                return;
            }
        }
        sauces.add(Sauce.getSauce(sauceNo));
    }
    
    public void subSauce(int sauceNo) {
        for (int i = 0; i < sauces.size(); i++) {
            if (sauceNo == sauces.get(i).getSauceNo()) {
                sauces.remove(i);
                break;
            }
        }
    }
    
    public boolean isContainExtra(int extraNo) {
        boolean result = false;
        for (Extra extra : extras) {
            if (extra.getExtraNo() == extraNo) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    public boolean isContainSauce(int sauceNo) {
        boolean result = false;
        for (Sauce sauce : sauces) {
            if (sauce.getSauceNo() == sauceNo) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    public static ArrayList<Sandwich> getAllSandwich() {
        ArrayList<Sandwich> result = new ArrayList<>();
//        result.add(Sandwich.getSandwich(HAM_15CM));
//        result.add(Sandwich.getSandwich(HAM_30CM));
//        result.add(Sandwich.getSandwich(MEATBALL_15CM));
//        result.add(Sandwich.getSandwich(MEATBALL_30CM));
//        result.add(Sandwich.getSandwich(ROAST_BEEF_15CM));
//        result.add(Sandwich.getSandwich(ROAST_BEEF_30CM));
//        result.add(Sandwich.getSandwich(SPICY_ITALIAN_15CM));
//        result.add(Sandwich.getSandwich(SPICY_ITALIAN_30CM));
//        result.add(Sandwich.getSandwich(CHICKEN_BACON_RANCH_15CM));
//        result.add(Sandwich.getSandwich(CHICKEN_BACON_RANCH_30CM));
//        result.add(Sandwich.getSandwich(ROASTED_CHICKEN_15CM));
//        result.add(Sandwich.getSandwich(ROASTED_CHICKEN_30CM));
//        result.add(Sandwich.getSandwich(SEAFOOD_15CM));
//        result.add(Sandwich.getSandwich(SEAFOOD_30CM));
//        result.add(Sandwich.getSandwich(STEAK_AND_CHEESE_15CM));
//        result.add(Sandwich.getSandwich(STEAK_AND_CHEESE_30CM));
        return result;
    }
    
    public int getExtraQuantity(int extraNo) {
        int result = 0;
        for (Extra extra : extras) {
            if (extra.getExtraNo() == extraNo) {
                result = extra.getQuantity();
                break;
            }
        }
        return result;
    }
    
    public Extra getExtraRef(int extraNo) {
        Extra result = null;
        for (Extra extra : extras) {
            if (extra.getExtraNo() == extraNo) {
                result = extra;
                break;
            }
        }
        return result;
    }
    
    public Veggie getVeggieRef(int veggieNo) {
        Veggie ref = null;
        for (Veggie veggie : veggies) {
            if (veggie.getVeggieNo() == veggieNo) {
                ref = veggie;
                break;
            }
        }
        return ref;
    }
    
    public Sauce getSauceRef(int sauceNo) {
        Sauce ref = null;
        for (Sauce sauce : sauces) {
            if (sauce.getSauceNo() == sauceNo) {
                ref = sauce;
                break;
            }
        }
        return ref;
    }
    
    public String getKorName() {
        return korName;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }
    
    public int getSandwichNo() {
        return sandwichNo;
    }
    
    public Bread getBread() {
        return bread;
    }

    public void setBread(int breadNo) {
        this.bread = Bread.getBread(breadNo);
    }

    public ArrayList<Extra> getExtras() {
        return extras;
    }

    public ArrayList<Veggie> getVeggies() {
        return veggies;
    }

    public ArrayList<Sauce> getSauces() {
        return sauces;
    }

    public void setExtras(ArrayList<Extra> extras) {
        this.extras = extras;
    }

    public void setVeggies(ArrayList<Veggie> veggies) {
        this.veggies = veggies;
    }

    public void setSauces(ArrayList<Sauce> sauces) {
        this.sauces = sauces;
    }

    public int getPrice() {
        return price;
    }
}
