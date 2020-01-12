package myway.stock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class StockVO implements Serializable {


    //	private HashMap<String,StockVO> stock = new HashMap<String, StockVO>();
    private int quantity;
    private int price;
    private String stockType ;
    private int no;
    
    public static final String TYPE_BREAD = "빵";
    public static final String TYPE_EXTRA = "토핑";
    
    

    public StockVO() {
        // TODO Auto-generated constructor stub
    }

    public StockVO(int no ,int quantity, int price, String stockType) {
        super();
        this.no = no;
        this.quantity = quantity;
        this.price = price;
        this.stockType = stockType;
    }

    @Override
    public String toString() {
        String result = "Stock : " + quantity + "    Price : " + price;
        return result;
    }
    
    public void add(int quantity) {
        this.quantity += quantity;
    }
    
    public void sub(int quantity) {
        this.quantity -= quantity;
    }
    
    public void update(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}
	
	public int getNo() {
	    return no;
	}

    /*
     * 재고량과 가격을 책정하고
     * 맵으로 키에는 재료 이름이 들어가고
     * 값에는 stockVO를 넣는다
     * stockVO는 해당 재료의 가격,재고를 넣는다
     */



}
