
public class Car {
	/*
	 * ��� ���� ���� (�Ӽ�)
	 */
	String no;//������ȣ
	int inTime;//�����ð�
	int outTime;//�����ð�
	int fee;//�������
	
	/*
	 * ����޽��(����)
	 */
	
	//1. ����
	void ipCha(String no, int inTime) {
		this.no= no;
		this.inTime= inTime;
		
		
		
	}
	//2.����
	void chulCah(int outTime) {
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
	void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	//2-2.��ݰ��(����)
	void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000+1500;
	}
	//2-3.���������(����)
	void print() {
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","������ȣ","�����ð�","�����ð�","�������");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",this.no,inTime,outTime,fee);
		
	}
}
