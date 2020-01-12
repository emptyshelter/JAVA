package com.itwill.account;

import java.util.ArrayList;

public interface AccountDao {

	/*
	 * CREATE
	 */
	void create(Account account) throws Exception;

	/*
	 * iSDuplicateNo
	 */
	boolean isDuplicateNo(int no) throws Exception;

	/*
	 * READ ALL
	 */
	ArrayList<Account> readAll() throws Exception;

	/*
	 * READ ONE
	 */
	Account readOne(int no) throws Exception;

	/*
	 * READ NAME
	 */
	ArrayList<Account> readName(String name) throws Exception;

	/*
	 * READ BALANCE
	 */
	ArrayList<Account> readBalance(int balance) throws Exception;

	/*
	 * READ IYUL
	 */
	ArrayList<Account> readIyul(double iyul) throws Exception;

	/*
	 * ipGum
	 */
	Account ipGum(int no, int money) throws Exception;

	/*
	 * chulGum
	 */
	Account chulGum(int no, int money) throws InsufficientBalanceException, Exception;

	void update(Account updateAccount) throws Exception;

	/*
	 * DELETE
	 */
	void delete(int no) throws Exception;

}