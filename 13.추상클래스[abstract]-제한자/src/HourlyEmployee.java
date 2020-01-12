public class HourlyEmployee extends Employee {
	private int worksHour;//���ѽð�
	private int payPerHour;//�ñ�
	public HourlyEmployee() {
	}
	public HourlyEmployee(int no,String name,int worksHour, int payPerHour) {
		super(no,name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}
	@Override
	public void calculatePay() {
		this.setPay(worksHour*payPerHour);
	}
	@Override
	public void print() {
		super.print();
		System.out.println(worksHour+"\t"+payPerHour);
	}
	//getter,setter
	public int getWorksHour() {
		return worksHour;
	}
	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
}








