/* OOP �� ��� 
 *   1. ĸ��ȭ
 *   2. ��Ӽ�
 *   3. ������(�����ε�,���ٶ��̵�,��ü����ȯ)
 */

/*
 * 1. ĸ��ȭ
 *    - �ܺ�Ŭ�������� ��������� ������ ����
 *      ��� �޽�忡�� �����Ҽ��ֵ��� Ŭ������ �����ϴ¹��
 *    - ���� : ������� �� ���������ڸ� private ���������
 *             ���������ڴ� public �����Ѵ�. 
 *             public ==> � �ܺ�Ŭ������������ ���ٰ���
 *             private==> � �ܺ�Ŭ������������ ���ٺҰ���
 */
public class Encapsulation {
	
	private String member1;
	private int member2;
	private char member3;
	private double member4;
	private boolean member5;
	
	public void setEncapsulationData(String member1,
									 int member2,
									 char member3,
									 double member4,
									 boolean member5) {
		this.member1=member1;
		this.member2=member2;
		this.member3=member3;
		this.member4=member4;
		this.member5=member5;			
	}
	public void print() {
		System.out.println(member1+" "+member2+" "+member3+" "+member4+" "+member5 );
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member4);
		System.out.println(member5);
	
	}
	//getter method
	public String getMember1() {
		return this.member1;
	}
	public int getMember2() {
		return member2;
	}
	public char getMember3() {
		return member3;
	}
	public double getMember4() {
		return member4;
	}
	public boolean isMember5() {
		return member5;
	}
	//setter method 
	public void setMember1(String member1) {
		this.member1=member1;		
	}
		
	public void setMember2(int member2) {
		this.member2 = member2;
	}
	public void setMember3(char member3) {
		this.member3 = member3;
	}
	public void setMember4(double member4) {
		this.member4 = member4;
	}
	public void setMember5(boolean member5) {
		this.member5 = member5;
	}

}
