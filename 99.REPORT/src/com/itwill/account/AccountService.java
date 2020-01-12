package com.itwill.account;

import java.util.ArrayList;

/*
 * 은행 업무를 실행할클래스
 *  - Account객체를 사용(의존성관계)
 *  - 업무실행시 DataAccess가 필요하면 AccounDao를 사용한다.
 *  - AccountDao 객체를 사용해서 업무실행.
 *  - AccountDao 객체를 포함하고있다.
 */
 
public class AccountService {
	private AccountDao accountDao;
	
	public AccountService() throws Exception{
//		accountDao= new AccountDaoFileImpl();
		accountDao= new AccountDaoDBImpl();
	}
	/*
	 * 계좌생성
	 *  - 계좌번호중복을 체크하고  중복안되면 생성
	 */
	public boolean addAccount(Account addAccount) throws Exception{
		boolean isCreate=false;
		if(!accountDao.isDuplicateNo(addAccount.getNo())) {
			accountDao.create(addAccount);
			isCreate=true;
		}else {
			isCreate=false;
		}
		return isCreate;
	}
	
	/*
	 * 계좌번호로 1개검색후반환
	 */
	
	public Account findByNo(int no) throws Exception{
		Account findAccount = accountDao.readOne(no);
		return findAccount;
	}
	
	/*
	 * 계좌여러개 전체검색
	 * 계좌여러개 이름으로검색
	 * 계좌여러개 잔고로검색
	 * 계좌여러개 이율로검색
	 */
	/*
	 계좌여러개 전체검색
	 */
	public ArrayList<Account> findAllAccount() throws Exception{
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList= accountDao.readAll();
		return findAccountList;
	}
	/*
	 * 계좌여러개 이름으로검색
	 */
	public ArrayList<Account> findByOwner(String owner) throws Exception{
		ArrayList<Account> findAccountList=accountDao.readName(owner);
		return findAccountList;
	} 
	/*
	 * 계좌여러개 잔고로 검색
	 */
	public ArrayList<Account> findByBalance(int balance) throws Exception{
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList=accountDao.readBalance(balance);
		return findAccountList;
	}
	/*
	 * 계좌여러개 이율로 검색 
	 */
	public ArrayList<Account> findByIyul(double iyul) throws Exception{
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList = accountDao.readIyul(iyul);
		return findAccountList;
	}	
	/*
	 * 입금
	 */
	public Account ipGum(int no,int money) throws Exception{
		Account acc=null;
		acc= accountDao.ipGum(no, money);
		return acc;
	}
	
	/*
	 * 출금
	 */
	public Account chulGum(int no,int money) throws Exception{
		Account acc=null;
		acc = accountDao.chulGum(no, money);
		return acc;
	}
	/*
	 * 계좌수정
	 */
	public void updateAccount(Account updateAccount) throws Exception {
		 accountDao.update(updateAccount);
	}
	/*
	 * 계좌삭제
	 */
	public void deleteAccount(int no) throws Exception{
		accountDao.delete(no);
	}
	
}















