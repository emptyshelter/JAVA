package myway.product;

import java.io.Serializable;
import java.util.Date;

import myway.product.sandwich.Sandwich;

public class Product implements Serializable{
    /* Variable */
    private Sandwich sandwich;
    private Date soldTime; 
    private int soldPrice;
    
    /* Method */
    public Sandwich getSandwich() {
        return sandwich;
    }
    
    public Date getSoldTime() {
        return soldTime;
    }
    
    public int getSoldPrice(){
    	return soldPrice;
    }
    
    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
    
    public void setSoldTime(Date soldTime){
    	this.soldTime=soldTime;
    }
    
    public void setSoldPrice(int soldPrice){
    	this.soldPrice=soldPrice;
    }
}
