package generic;

public class Account implements Comparable<Account>{
	/*
	 * 속성
	 * 	- 멤버필드
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	
	/*
	 * 행위(operation)
	 *  - 멤버메쏘드
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}



	/*
	 * 계좌데이타set메쏘드
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul = iyul;
	}
	/*
	 * 입금
	 */
	public void ipGum(int m) {
		//this.balance+=m;
		this.balance=this.balance+m;
	}
	/*
	 * 출금
	 */
	public boolean chulGum(int m) {
		boolean isSuccess=false;
		this.balance=this.balance-m;
		if(this.balance < 0) {
			this.balance = this.balance+m;
			isSuccess=false;
		}else {
			isSuccess=true;
		}
		return isSuccess;
	}
	/*
	 * header print
	 */
	public static void headerPrint() {
		System.out.println("-------------------------");
		System.out.printf("%s %s %s %s%n","번호","계좌주","잔고","이율");
		System.out.println("-------------------------");
	}
	/*
	 * 출력
	 */
	public void print() {
		
		System.out.printf("%d %6s %6d %4.1f%n",this.no,this.owner,this.balance,this.iyul);
	}
	@Override
	public int compareTo(Account nextAccount) {
		int r = nextAccount.balance - this.balance;
		return r;
	}
	/*
	 * getter,setter 단축키
	 *   << alt + shift + s >> --> r
	 */
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}



	



	
	
	
	
}









