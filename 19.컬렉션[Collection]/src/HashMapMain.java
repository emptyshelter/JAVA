import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {
	public static void main(String[] args) {
		HashMap carMap = new HashMap();
		System.out.println("map size: "+carMap.size());
		System.out.println("************1.put**************");
		Car c1 = new Car("1111",12);
		carMap.put(c1.getNo(), c1);
		carMap.put("2222",new Car("2222",13));
		carMap.put("3333",new Car("3333",15));
		carMap.put("4444",new Car("4444",17));
		carMap.put("5555",new Car("5555",20));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		/*
		 * Key∞¥√º∞° µø¿œ «œ∏È (equals) ∞¥√º∞° πŸ≤Ô¥Ÿ.
		 */
		System.out.println("map size: "+carMap.size());
		carMap.put(new String("3333"),new Car("ªÔªÔªÔªÔ",18));
		System.out.println(carMap);
		System.out.println("************2-1.get**************");
		Car getCar = (Car)carMap.get(new String("3333"));
		getCar.setOutTime(22);
		getCar.calculateFee();
		getCar.print();
		System.out.println("************2-2.remove**************");
		Car removeCar =(Car)carMap.remove("3333");
		System.out.println("map size: "+carMap.size());
		System.out.println("************3.containskey**************");
		if (carMap.containsKey("4444")) {
			Car gCar = (Car)carMap.get("4444");
			gCar.print();
		}
		System.out.println("************4.clear**************");
//		carMap.clear();
		System.out.println("map size: "+carMap.size());
		System.out.println("************5.empty**************");
		if (carMap.isEmpty()) {
			System.out.println("carMap.isEmpty():"+carMap.isEmpty());
		}
		System.out.println("************Iteration**************");
		Set keyset = carMap.keySet();
		Iterator keyIter = keyset.iterator();
		while (keyIter.hasNext()) {
			String tempKey = (String)keyIter.next();
//			System.out.println(tempKey);
			Car tempCar = (Car)carMap.get(tempKey);
			tempCar.print();
		}
		System.out.println("**********key[Wrapper,String]**********");
		
		HashMap carMap2 = new HashMap();
		carMap2.put(new Integer(1), new Car("1111",12));
		carMap2.put(new Integer(2), new Car("2222",17));
		carMap2.put(new Integer(3), new Car("3333",18));
		carMap2.put(new Integer(4), new Car("4444",19));
		System.out.println(carMap2);
		Car car = (Car)carMap2.get(1);
		car.print();
		carMap2.clear();
//		Account acc1 = new Account(1,"KIM",34,0.1);
//		carMap2.put(acc1,new Car("1111",12));
//		carMap2.put(new Account(1,"KIM",34,0.1),new Car("1111",12));
//		carMap2.put(new Account(1,"KIM",34,0.1),new Car("1111",12));
//		carMap2.put(new Account(1,"KIM",34,0.1),new Car("1111",12));
//		System.out.println(carMap2);
//		Car gCar= (Car)carMap2.get(acc1);
//		gCar.print();
	}

}
