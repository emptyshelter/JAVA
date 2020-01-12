package com.itwill06.service.account;

import java.text.FieldPosition;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {
	public static final int ASCENDING=0;
	public static final int DESCENDING=1;
	
	private Account[] accounts= {
			new Account(1111, "KIM", 85632, 5.9),
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2),
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2),
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2),
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2)
	};
	/*
	 * 0.계좌객체인자로 받아서 추가
	 */
	public void addAccount(Account newAccount) {
		Account[] nAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			nAccounts[i] = accounts[i];
		}
		nAccounts[nAccounts.length - 1] = newAccount;
		accounts = nAccounts;		
	}
	/*
	 * 0.계좌번호 인자로받아서 삭제해줘
	 */
	public void deleteAccount(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				accounts[i]=null;
				break;
			}
		}
		int count = 0;
		Account[] dAccounts = new Account[accounts.length-1];
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				dAccounts[count++] = accounts[i];
			}
		}
		this.accounts = dAccounts;
	}
	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getAccountNumber() {
		return accounts.length;
	}
	/*
	 * 2.은행계좌들 전체출력
	 */
	public void print() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotalBalance() {
		int tot=0;
		for (int i = 0; i < accounts.length; i++) {
			tot=tot+accounts[i].getBalance();
		}
		return tot;
	}
	
	/*
	 * 4.계좌번호(3333)를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account  findByNo(int no) {
		Account findAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				findAccount=accounts[i];
				break;
			}
		}		
		return findAccount;
	}
	/*
	 * 5.계좌잔고(50000원)인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		Account[] findAccounts= null;		
		/*
		 * A.만족하는객체의갯수구하기
		 * findAccounts=new Account[3];
		 */
		int count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>=balance) {
				count++;
			}
		}
		findAccounts= new Account[count];		
		/*
		 * B.만족하는객체주소담기
		 */
		count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>= balance) {
				findAccounts[count++]= accounts[i];
			}
		}
		return findAccounts;
	}
	/*
	 * 6.계좌이율(5.0)인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByIyul(double iyul) {
		Account[] findAccounts = null;
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= iyul) {
				count++;
			}
		}
		findAccounts = new Account[count];
		count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= iyul) {
				findAccounts[count] = accounts[i];
				count++;
			}
		}
		return findAccounts;
	}
	
	/*
	 * 7.계좌주이름(AIM) 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByOwner(String owner) {
		Account[] findAccounts = null;
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals(owner)) {
				count++;
			}
		}		findAccounts = new Account[count];
		count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner() .equals(owner)) {
				findAccounts[count] = accounts[i];
				count++;
			}
		}
		return findAccounts;
	}
	/*
	 * 8.계좌번호(6666번)와 입금할돈(4000원)인자로받아서 입금
	 */
	public void ipGum(int no,int m) {
		Account findAccount = this.findByNo(no);
		findAccount.print();
		findAccount.ipGum(m);
		findAccount.print();
	}
	/*
	 * 9.계좌번호(1111번)와 출금할돈(5000원)인자로받아서 출금
	 */
	public void chulGum(int no, int m ) {
		Account findAccount = this.findByNo(no);
		findAccount.print();
		findAccount.chulGum(m);
		findAccount.print();
	}
	
	
	/*
		10.계좌를 잔고순으로 오름차순정렬
		11.계좌를 잔고순으로 내림차순정렬
	*/
	public void sortByBalance(int type) {
		if(type==AccountServiceReturn.ASCENDING) {
			for (int i = 0; i < accounts.length-1; i++) {
				for (int j = 0; j < accounts.length -1 -i; j++) {
					if(accounts[j].getBalance() > accounts[j + 1].getBalance()) {
						Account tempBalance = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = tempBalance;
					}
				}
			}
		}else if(type==AccountServiceReturn.DESCENDING) {
			for (int i = 0; i < accounts.length-1; i++) {
				for (int j = 0; j < accounts.length -1 -i; j++) {
					if(accounts[j].getBalance() < accounts[j + 1].getBalance()) {
						Account tempTot = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = tempTot;
					}
				}
			}
		}
		
	}
//		13.계좌를 예금주이름순(사전순)으로 오름차순정렬
	public void sorByOwner(int type) {
		if (type==AccountServiceReturn.ASCENDING) {
			for (int i = 0; i < accounts.length-1; i++) {
				for (int j = 0; j < accounts.length -1 -i; j++) {
					if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner())>0) {
						Account tempOwner = accounts[j];
						accounts[j] = accounts[j+1];
						accounts[j+1] = tempOwner;							
					}
				}	
			}
		}
	}
	
	public void updateAccount(Account updateAccount) {
		int no = updateAccount.getNo();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() ==no) {
				accounts[i]= updateAccount;
				accounts[i].setOwner(updateAccount.getOwner());
				accounts[i].setBalance(updateAccount.getBalance());
				accounts[i].setIyul(updateAccount.getIyul());
				break;
			}
		}
	}
		
}
