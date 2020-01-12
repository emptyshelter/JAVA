
public class CarFactoryMain {

	public static void main(String[] args) {
		Engine e1= new Engine("A", 2390);
		Car c1=new Car();
		c1.setNo(1);
		c1.setModel("K7");
		c1.setEngine(e1);
		c1.print();
		
		Car c2=new Car(2, "k9", new Engine("X", 3950));
		c2.print();
		Car c3=new Car(3, "TICO",null);
		c3.setEngine(new Engine("T", 900));
		c3.print();
		
		System.out.println("-----------engine°Ë»ç----------------");
		Engine tempEngine=c1.getEngine();
		tempEngine.print();
		c2.getEngine().print();
		c3.getEngine().print();
		
		
		
		

	}

}
