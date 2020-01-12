
public class Car {
	/*
	 * 멤버 변수 선언 (속성)
	 */
	String no;//차량번호
	int inTime;//입차시간
	int outTime;//출차시간
	int fee;//주차요금
	
	/*
	 * 멤버메쏘드(행위)
	 */
	
	//1. 입차
	void ipCha(String no, int inTime) {
		this.no= no;
		this.inTime= inTime;
		
		
		
	}
	//2.출차
	void chulCah(int outTime) {
		/*this.setOutTime(outTime);
		this.calculateFee();
		this.print();*/	
		this.outTime=outTime;
		this.fee=(this.outTime-this.inTime)*1000+1500;
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
		
	}
	//2-1. 출차시간 대입(출차)
	void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	//2-2.요금계산(출차)
	void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000+1500;
	}
	//2-3.영수증출력(출차)
	void print() {
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
		
	}
}
