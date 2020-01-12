
public class Car {
	/*
	 * 차량의 총생산대수
	 */
	public static int count;
	private String model;
	private String color;
	public Car() {
		Car.count++;		
		//this.count++;
		//count++;

	}
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		count++;//== Car.count++;
	}
	public void Print() {
		System.out.println(model+"\t"+color);
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Car.count = count;
	}
	public void print() {
		System.out.println(model+"\t"+color);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
