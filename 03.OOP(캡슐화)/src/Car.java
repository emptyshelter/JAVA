
public class Car {
	/*
	 * ��� ���� ���� (�Ӽ�)
	 */
	private static int	feePerHour=1000;
	private String no;//������ȣ
	private int inTime;//�����ð�
	private int outTime;//�����ð�
	private int fee;//�������
	
	/*
	 * ����޽��(����)
	 */
	
	//1. ����
	public void ipCha(String no, int inTime) {
		this.no= no;
		this.inTime= inTime;
		
		
		
	}
		//2.����
	public void chulCah(int outTime) {
		/*this.setOutTime(outTime);
		this.calculateFee();
		this.print();*/	
		this.outTime=outTime;
		this.fee=(this.outTime-this.inTime)*1000+1500;
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","������ȣ","�����ð�","�����ð�","�������");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
		
	}
	//2-1. �����ð� ����(����)
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	//2-2.��ݰ��(����)
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*Car.feePerHour;
	}
	//2-3.���������(����)
	public void print() {
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","������ȣ","�����ð�","�����ð�","�������");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
		
	}
	//getter setter
	
	public static int getFeePerHour() {
		return feePerHour;
	}
	public static void setFeePerHour(int feePerHour) {
		Car.feePerHour = feePerHour;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
}
