
public class Account {
	/*
	 * 속성
	 * 	-멤버필드
	 */
	private int no; //계좌번호
	private String owner;
	private int balance; //잔고
	private double iyul;//이율			
	
	
	/*
	 * 행위(Operation)
	 *  -멤버메쏘드
	 */
	public Account() {		
	}

	public Account(int no, String owner, int balance, double iyul) {	
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
}
	
	
	/*
	 * 계좌데이터 set메소드
	 */
	
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}		
	/*
	 * 입금
	 */
	public void ipGum(int m) {
		this.balance=this.balance+m;
	}
	/*
	 * 출금
	 */
	public boolean chulGum(int m) {
		boolean isSuccess=false;
		this.balance=this.balance-m;
		if (this.balance<0) {
			this.balance=this.balance+m;
			isSuccess=false;
		}else {
			isSuccess=true;			
		}
		return isSuccess;
	}
	/*
	 * header print
	 */
	public void headerPrint() {
		System.out.println("=====================");
		System.out.printf("%s %s %s %s%n","번호","계좌주","잔고","이율");		
		System.out.println("=====================");
	}
	/*
	 * 출력
	 */
	public void print() {
		System.out.printf("%d %s %d %4.1f%n", this.no,this.owner,this.balance,this.iyul);		
	}
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
