public abstract class Employee {
	private int no;
	private String name;
	private int pay;

	public Employee() {
	}
	
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
		�޿����
		  - ���������۾� �Ұ���
		  - �ڽİ�ü���� �������ؾ��ϴ� �޽��
		  - ������ ����
	 */
	public abstract void calculatePay();

	public void print() {
		System.out.print(no+"\t"+name+"\t"+pay+"\t");
	}
	
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	

}
