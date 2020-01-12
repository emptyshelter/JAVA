/**
 * 
 * 계좌객체를 추상화한 클래스
 * @author 김경호
 * @version 0.01
 */
public class Account {
	/*
	 * 속성
	 * 	- 멤버필드
	 */
	/**
	 * 계좌번호
	 */
	private int no;//계좌번호
	/**
	 * 계좌주
	 */
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	
	/*
	 * 행위(operation)
	 *  - 멤버메쏘드
	 */
	
	/*
	 * 계좌데이타set메쏘드
	 */
	/**
	 * 계좌데이타를 set 하는메쏘드
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
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
	/**
	 * 입금
	 * @param m 입금할돈
	 */
	public void ipGum(int m) {
		//this.balance+=m;
		this.balance=this.balance+m;
	}
	/*
	 * 출금
	 */
	/**
	 * 출금
	 * @param m 출금액
	 * @return if true 출금성공 else 출금실패
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
	/**
	 * 계좌헤더출력
	 */
	public static void headerPrint() {
		System.out.println("-------------------------");
		System.out.printf("%s %s %s %s%n","번호","계좌주","잔고","이율");
		System.out.println("-------------------------");
	}
	/*
	 * 출력
	 */
	/**
	 * 계좌정보출력
	 */
	public void print() {
		
		System.out.printf("%d %6s %d %4.1f%n",this.no,this.owner,this.balance,this.iyul);
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









