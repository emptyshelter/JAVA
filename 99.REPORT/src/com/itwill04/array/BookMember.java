package com.itwill04.array;


public class BookMember {
	//ȸ����ȣ
	private int no;
	//ȸ���̸�
	private String name;
	//��ȭ��ȣ
	private String phoneNumber;
	//����å��
	private Book[] books;
	public BookMember() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BookMember(int no, String name, String phoneNumber, Book[] books) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.books = books;
	}
	public void print() {
		System.out.println(no + " " + name + " " + phoneNumber);
		System.out.println("=====�뿩���=====");
		for (int i = 0; i < this.books.length; i++) {
			this.books[i].print();
		}
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	
	
}
