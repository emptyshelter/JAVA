package myway.stock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

import myway.SubwayMain;
import myway.product.sandwich.bread.Bread;
import myway.product.sandwich.extra.Extra;

public class StockDao {

    private File dir;
    private File stockFile;

    public StockDao() throws Exception {
        dir = new File(SubwayMain.class.getResource("").getPath() + "data");
        stockFile = new File(dir, "sandStock.ser");
        
        if (!stockFile.exists()) {
            stockFile.createNewFile();
            stockInicialize();// 여기서 재고 수량 초기화
            //빵번호를 받아서 이름 
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(stockFile));
            oos.writeObject(stockInicialize());
            oos.close();
        }
    }

    // File 읽기 작업
    HashMap<Integer, StockVO> stockFileRead() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(stockFile));
        HashMap<Integer, StockVO> stockList = (HashMap<Integer, StockVO>) ois.readObject();

        //		ois.close();
        return stockList;
    }

    // File 쓰기 작업
    void stockFileWrite(HashMap<Integer, StockVO> writeStock) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(stockFile));
        oos.writeObject(writeStock);
        oos.close();
    }

    // 재고 초기화 메소드
    public HashMap<Integer, StockVO> stockInicialize() {
        HashMap<Integer, StockVO> stockMap = new HashMap<>();

        stockMap.put(Bread.FLAT_BREAD, new StockVO(Bread.FLAT_BREAD, 30, 1000, StockVO.TYPE_BREAD));
        stockMap.put(Bread.HEARTY_ITALIAN,
                new StockVO(Bread.HEARTY_ITALIAN, 30, 1300, StockVO.TYPE_BREAD));
        stockMap.put(Bread.HONEY_OAT, new StockVO(Bread.HONEY_OAT, 30, 1500, StockVO.TYPE_BREAD));
        stockMap.put(Bread.PARMESAN_OREGANO,
                new StockVO(Bread.PARMESAN_OREGANO, 30, 1800, StockVO.TYPE_BREAD));
        stockMap.put(Bread.WHEAT, new StockVO(Bread.WHEAT, 30, 1100, StockVO.TYPE_BREAD));
        stockMap.put(Bread.WHITE, new StockVO(Bread.WHITE, 30, 900, StockVO.TYPE_BREAD));
        stockMap.put(Extra.AVOCADO, new StockVO(Extra.AVOCADO, 30, 500, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.BACON, new StockVO(Extra.BACON, 30, 800, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.CHEESE, new StockVO(Extra.CHEESE, 30, 800, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.CHICKEN_BREAST,
                new StockVO(Extra.CHICKEN_BREAST, 30, 750, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.CHICKEN_STRIP,
                new StockVO(Extra.CHICKEN_STRIP, 30, 750, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.CHICKEN_TERIYAKI,
                new StockVO(Extra.CHICKEN_TERIYAKI, 30, 750, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.DOUBLE_MEAT,
                new StockVO(Extra.DOUBLE_MEAT, 30, 900, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.EGG, new StockVO(Extra.EGG, 30, 450, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.HAM, new StockVO(Extra.HAM, 30, 500, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.MEATBALL, new StockVO(Extra.MEATBALL, 30, 800, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.PEPPERONI, new StockVO(Extra.PEPPERONI, 30, 400, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.ROAST_BEEF, new StockVO(Extra.ROAST_BEEF, 30, 800, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.SALAMI, new StockVO(Extra.SALAMI, 30, 1000, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.SEAFOOD, new StockVO(Extra.SEAFOOD, 30, 1300, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.SMOKED_HAM, new StockVO(Extra.SMOKED_HAM, 30, 1200, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.STEAK, new StockVO(Extra.STEAK, 30, 1500, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.TUNA, new StockVO(Extra.TUNA, 30, 2000, StockVO.TYPE_EXTRA));
        stockMap.put(Extra.TURKEY, new StockVO(Extra.TURKEY, 30, 2000, StockVO.TYPE_EXTRA));

        return stockMap;
    }

    // 전체 조회하는 작업
    public HashMap<Integer, StockVO> selectAll() throws Exception {
        HashMap<Integer, StockVO> findList = this.stockFileRead();
        return findList;
    }

    // 검색하는 작업
    public StockVO selectByNo(int stockNo) throws Exception {
        StockVO result = null;
        HashMap<Integer, StockVO> stockMap = stockFileRead();
        Set<Integer> keySet = stockMap.keySet();
        for (Integer key : keySet) {
            StockVO tmpStock = stockMap.get(key);
            if (stockNo == tmpStock.getNo()) {
                result = tmpStock;
                break;
            }
        }
        return result;
    }
    
    // update
    public void update(StockVO updateStock) throws Exception {
        HashMap<Integer, StockVO> stockMap = stockFileRead();
        stockMap.put(updateStock.getNo(), updateStock);
        stockFileWrite(stockMap);
    }
    
    //add구현
//    public void add(StockVO addStock, int quantity) throws Exception{
//    	HashMap<Integer, StockVO> stockMap = stockFileRead();
//    	Set<Integer> keyset = stockMap.keySet();
//    	for (Integer key : keyset ) {
//			if (stockMap.get(key).getNo()==addStock.getNo()) {
//				addStock.add(quantity);
//				break;
//			}
//		}
//    	stockFileWrite(stockMap);
//    }
    
    
    //sub구현
//    public void sub(StockVO subStock, int quantity) throws Exception{
//    	HashMap<Integer, StockVO> stockMap = stockFileRead();
//    	Set<Integer> keyset = stockMap.keySet();
//    	for (Integer key : keyset ) {
//			if (stockMap.get(key).getNo()==subStock.getNo()) {
//				subStock.sub(quantity);
//				break;
//			}
//		}
//    	stockFileWrite(stockMap);
//    }

}
