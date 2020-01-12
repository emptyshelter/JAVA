package myway.product;

import java.util.ArrayList;
import java.util.Date;

import myway.product.sandwich.Sandwich;
import myway.product.sandwich.bread.Bread;
import myway.product.sandwich.extra.Extra;
import myway.stock.StockManager;

public class ProductManager {
    /* Variable */
    Product product;
    ProductDAO productDAO;
    StockManager stockMgr;
    
    /* Constructor */
    public ProductManager() throws Exception {
        product = new Product();
        productDAO = new ProductDAO();
        stockMgr = new StockManager();
    }
    
    /* Method */
    public void completeOrder(
    		Sandwich sandwich,Date soldTime,int soldPrice) throws Exception {
        //�Ǹ� ��� ����
        productDAO.insert(sandwich , soldTime, soldPrice);
        //�Ǹ� ��ǰ�� �� ��� ���� 
        stockMgr.sub(sandwich.getBread().getBreadNo(),1);
        //�Ǹ� ��ǰ�� extra ��� ���� 
        for (Extra extra : sandwich.getExtras()) {
            stockMgr.sub(extra.getExtraNo(), extra.getQuantity());
        }
    }
    
    public void printMap() throws Exception {
        System.out.println(stockMgr.selectAll());
    }
    
    public ArrayList<Product> productList() throws Exception{
		ArrayList<Product> stockList = productDAO.select();
		return stockList;
	}
    
    
}
