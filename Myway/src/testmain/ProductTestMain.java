package testmain;

import java.util.ArrayList;
import java.util.Date;

import myway.menu.Menu;
import myway.product.ProductManager;
import myway.product.sandwich.Sandwich;
import myway.product.sandwich.bread.Bread;
import myway.product.sandwich.extra.Extra;

public class ProductTestMain {
	
	public static void main(String[] args) throws Exception {
		Sandwich s1 = new Sandwich();
		Sandwich s2 = new Sandwich();
		Sandwich s3 = new Sandwich();
		Sandwich s4 = new Sandwich();
		Sandwich s5 = new Sandwich();
		Sandwich s6 = new Sandwich();
		Sandwich s7 = new Sandwich();
		Sandwich s8 = new Sandwich();
		ProductManager pm = new ProductManager();
		s1.setMenuSize(Menu.BLT);
		s1.setBread(Bread.FLAT_BREAD);
		s1.setExtras(new ArrayList<Extra>(Extra.AVOCADO));
		Date today = new Date();
		String todayTime = today.toString();
		pm.completeOrder(s1, new Date(), 8000);
//		pm.completeOrder(s2, new Date(), 8000);
//		pm.completeOrder(s3, new Date(), 8000);
//		pm.completeOrder(s4, new Date(), 8000);
//		pm.completeOrder(s5, new Date(), 8000);
//		pm.completeOrder(s6, new Date(), 8000);
//		pm.completeOrder(s7, new Date(), 8000);
//		pm.completeOrder(s8, new Date(), 8000);
	}

}
