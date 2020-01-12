
public class CarFactoryMain {

	public static void main(String[] args) {
		Car.setCount(1000);
		
		Car c1 =new Car("SM1","REDVELVET");
		Car c2 =new Car("SM2","YELLOW");
		Car c3 =new Car("SM3","WHITE");
		Car c4 =new Car("SM4","BLACK");
		//Car.count++;
		System.out.println("차량생산대수:"+Car.getCount());
		System.out.println("차량생산대수:"+c1.getCount());
		System.out.println("차량생산대수:"+c2.getCount());
		System.out.println("차량생산대수:"+c3.getCount());
		System.out.println("차량생산대수:"+c4.getCount());
	}

}
