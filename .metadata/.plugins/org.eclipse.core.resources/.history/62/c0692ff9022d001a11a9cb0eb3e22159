package myway.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

import myway.SubwayMain;
import myway.product.sandwich.Sandwich;

/*
 * 판매한 상품을 파일로 저장, 불러오는 클래스
 */
public class ProductDAO {
	/* Variable */
	private File file;
	private File dir;
	private Product product;

	/* Constructor */
	public ProductDAO() throws Exception {
	    dir = new File(SubwayMain.class.getResource("").getPath() + "data");
	    file = new File (dir, "soldList.ser");
	    
		if (!file.exists()) {
			file.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(new ArrayList<Product>());
			oos.close();
		}
	}

	/* Method */
	// File read
	private ArrayList<Product> fileRead() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		ArrayList<Product> soldList = (ArrayList<Product>) ois.readObject();
		ois.close();
		return soldList;
	}

	// File write
	private void fileWrite(ArrayList<Product> soldList) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(soldList);
		oos.close();
	}

	// Create
	public void insert(
			Sandwich sandwich, Date soldTime, int soldPrice) throws Exception {
		ArrayList<Product> soldList = fileRead();
		product = new Product(); 
		product.setSandwich(sandwich);
		product.setSoldTime(soldTime);
		product.setSoldPrice(soldPrice);
		soldList.add(soldList.size(), product);

		fileWrite(soldList);
	}

	// Read
	public ArrayList<Product> select() throws Exception {
		return fileRead();
	}

}
