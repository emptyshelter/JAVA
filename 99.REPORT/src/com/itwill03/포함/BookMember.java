package com.itwill03.포함;


public class BookMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린책
	
	private int mNum; 
	private String mName; 
	private String pNum; 
	private Book Book;
	
	public BookMember() {
		
	}
	public BookMember(int mNum, String mName, String pNum,Book book) {
		super();
		this.mNum = mNum;
		this.mName = mName;
		this.pNum = pNum;	
		this.Book = book;
	}
	public void Print() {			
		
		System.out.println(mNum + " " + mName + " " + pNum + " " );
		System.out.println("===========대여목록===========");	
		Book.print();		
	}	
	
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		this.Book = book;
	}
	
	
}
