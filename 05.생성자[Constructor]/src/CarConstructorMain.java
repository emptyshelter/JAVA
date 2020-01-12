
public class CarConstructorMain {
	public static void main(String[] args) {
		Car.setFeePerHour(500);
		Car c1=new Car();
		c1.ipCha("1111", 12);
		Car c2=new Car("2222", 13);
		Car c3=new Car("3333", 14, 0, 0);
		
		c1.chulCha(16);
		c2.chulCha(16);
		c3.chulCha(16);
		
		c1.calculateFee();
		c2.calculateFee();
		c3.calculateFee();
		
		c1.print();
		c2.print();
		c3.print();
	}
}
