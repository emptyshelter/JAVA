public class Car {
	private int no;
	public String model;
	public Engine engine;	
	
	public Car() {
		
	}
	public Car(int no, String model, Engine engine) {
		this.no=no;
		this.model=model;
		this.engine=engine;
	}
	
	public void print() {
		/*System.out.println(this.no+" "+
						   this.model+" "+
						   this.engine.type+" "+
						   this.engine.cc);
						   */
		System.out.println(this.no+" "+this.model);
		//Private로 설정시 절대 접근 불가 
		this.engine.print();
	}
	public void setEngine(Engine engine) {
		this.engine=engine;		
	}
	public Engine getEngine() {
		return this.engine;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}


}
