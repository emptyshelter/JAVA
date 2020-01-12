package com.itwill07.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;



/*
 * Account객체전체에관련된 업무를 실행할클래스
 */
public class AccountServiceArrayList {
	private ArrayList<Account> accountList;
	public AccountServiceArrayList() {
		accountList=new ArrayList();
		accountList.add(new Account(1111, "KIM", 89007, 1.3));
		accountList.add(new Account(2222, "AIM", 45000, 2.7));
		accountList.add(new Account(3333, "FIM", 23000, 4.7));
		accountList.add(new Account(4444, "XIM", 34000, 6.7));
		accountList.add(new Account(5555, "HIM", 78000, 3.7));
		accountList.add(new Account(6666, "AIM", 99000, 5.7));
		accountList.add(new Account(7777, "PIM", 89000, 4.7));
		accountList.add(new Account(8888, "QIM", 91000, 1.7));
		accountList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 23000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "HIM", 78000, 3.7),
			new Account(6666, "AIM", 99000, 5.7),
			new Account(7777, "PIM", 89000, 4.7),
			new Account(8888, "QIM", 91000, 1.7),
			new Account(9999, "MIM", 12000, 0.7),
	};
	*/
	/*
	 * 계좌전체반환
	 */
	public ArrayList <Account> getAccountList() {
		return accountList;
	}
	/*
	 * 계좌추가
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	/*
	 * 계좌번호로 계좌삭제
	 */
	public void deleteByAccountNo(int no) {
		
	}
	/*
	 1.은행계좌들 총계좌수반환메쏘드정의
	 */

	public int totAccountNumber() {
		return accountList.size();
		
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드정의
	 */
	public void print() {
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
	}
	/*
	 * 3.은행계좌들 총잔고 반환메쏘드 정의
	 */
	public int totBalance(){
		int totBalance=0;
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			totBalance= totBalance+tempAccount.getBalance();
		}
		
		return totBalance;
	}
	/*
	 4.계좌번호 인자로받아서 인계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) {
		Account findAccount= null;
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount= accountList.get(i);
			if (tempAccount.getNo()==no) {
				findAccount=tempAccount;
				break;
			}
		}
		return findAccount;
	}
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들반환
	 */
	public ArrayList <Account>  findByBalance(int balance) {
		ArrayList <Account> findAccountList=new ArrayList<Account> ();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getBalance()>=balance) {
				findAccountList.add(tempAccount);
			}
		}
		return findAccountList;
	}
	
	/*
	 *  8.6666번계좌 4000원 입금
	 */
	public void ipGum(int no,int m) {
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getNo()==no) {
				tempAccount.ipGum(m);
			}
		}
	}
	/*
	 *  9.1111번계좌 5000원 출금
	 */
	public void chulGum(int no,int m) throws InsufficientBalanceException{
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo() == no) {
				tempAccount.chulGum(m);
				tempAccount.print();
			}
		}
	}
	/*
	 7.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	*/
	public ArrayList findByName(String owner) {
		ArrayList findAccountList=new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if (tempAccount.getOwner().equals(owner)) {
				findAccountList.add(tempAccount);
			}
		}
		return findAccountList;
	}
	/*
	 9.VIP계좌(잔고 70000원이상)들 반환
	 */
	public ArrayList findByVip(int  balance) {
		ArrayList findAccountList = new ArrayList();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getBalance() > balance) {
				findAccountList.add(tempAccount);
			}
		}
		return findAccountList;
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	*/
	public void sortByBalanceAsc() {
		Collections.sort(accountList,new ComparatorBalanceAsc());
	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDesc() {
		Collections.sort(accountList,new ComparatorBalanceDesc());
		
	}
	
	/*
	 * 
	 15.6666번계좌의 이름,잔고,이율 수정(update)
	 15.6666번계좌의 이름,잔고,이율 수정(update)
	 15.6666번계좌의 이름,잔고,이율 수정(update)
	 */
	public void updateAccount(int no,String owner,int balance,double iyul) {
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getNo()==no) {
				tempAccount.setAccountData(no, owner, balance, iyul);
			}
		}
	}
	
	public void updateAccount(Account updateAccount) {
		for (Account account : accountList) {
			if (account.getNo()==updateAccount.getNo()) {
				account.setAccountData(updateAccount.getNo(), 
									   updateAccount.getOwner(), 
									   updateAccount.getBalance(), 
									   updateAccount.getIyul());
			}
		}
	}
	
	
}















