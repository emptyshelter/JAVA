package myway.stock;

import java.util.HashMap;

public class StockManager {
    /* Variable */
	StockDao stockDao;
	HashMap<Integer, StockVO> stockMap;

	/* Constructor */
	public StockManager() throws Exception {
		stockDao = new StockDao();
		stockMap = new HashMap<>();
	}
	
	/* Method */
	// ���� ����
	public void update(int stockNo, int quantity) throws Exception {
	    stockMap = stockDao.stockFileRead();
	    StockVO stock = stockDao.selectByNo(stockNo);
	    stock.update(quantity);
	    stockMap.put(stock.getNo(), stock);
	    stockDao.update(stock);
	}
	// ���� ����
	public void add(int stockNo, int quantity) throws Exception {
	    stockMap = stockDao.stockFileRead();
	    StockVO stock = stockDao.selectByNo(stockNo);
	    stock.add(quantity);
	    stockMap.put(stock.getNo(), stock);
	    stockDao.update(stock);
	}
	// ���� ����
	public void sub(int stockNo, int quantity) throws Exception {
//	    stockDao.selectByNo(stockNo).sub(quantity);
		stockMap = stockDao.stockFileRead();
	    StockVO stock = stockDao.selectByNo(stockNo);
	    stock.sub(quantity);
	    stockMap.put(stock.getNo(), stock);
	    stockDao.update(stock);
	}
	// ��ü map
	public HashMap<Integer, StockVO> selectAll() throws Exception {
	    return stockDao.selectAll();
	}
	
	// ���԰� �ؽ�������
//	public void stockInsert(String name, int storage) throws Exception {
//		HashMap<Integer, StockVO> insertMap = stockDao.stockFileRead();
//		
//		
//		for (int i = Bread.FLAT_BREAD; i <= Bread.WHITE; i++) {
//			if (Bread.getName().equals(name)) {
//				int totalStock = insertMap.get(i).getQuantity() + storage;
//				insertMap.get(name).setQuantity(totalStock);
//				break;
//			}
//		}
//		
//		for (int i = 5; i < 25; i++) {
//			if (Extra.getExtra(i).getName().equals(name)) {
//				int totalStock = insertMap.get(i).getQuantity() + storage;
//				insertMap.get(name).setQuantity(totalStock);
//			}
//		}
//		stockDao.stockFileWrite(insertMap);
//	}
//
//	/*
//	 * ��ȸ
//	 */
//	//��縮��Ʈ
//	public HashMap<Integer, StockVO> stockList() throws Exception{
//		HashMap<Integer, StockVO> stockList = stockDao.selectAll();
//		return stockList;
//	}
//	//�˻����
//	public StockVO stockList(int name) throws Exception{
//		StockVO findStock = stockDao.select(name);
//		return findStock;
//	}
//	
//	// ��� �����۾�
//	public void subStock(int keyNo) throws Exception {
//	    subStock(keyNo, 1);
//	}
//	
//	public void subStock(int keyNo, int quantity) throws Exception {
//	    stockMap = stockList();
//	    StockVO target = stockMap.get(keyNo);
//	    target.setQuantity(target.getQuantity() - 1);
//	    stockDao.stockFileWrite(stockMap);
//	}

}
