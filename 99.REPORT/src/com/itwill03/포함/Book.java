package com.itwill03.����;

public class Book {
	/*
	 * å��ȣ
	 * å�̸�
	 * å����
	 * å�з�
	 * å����
	 */
	private int b_no;
	private String b_name;
	private String b_title;
	private String b_type;
	private String b_exp;
	
	public Book() {
		
	}
	

	public Book(int bno, String bname, String btitle, String btype, String bexp) {
		super();
		this.b_no = bno;
		this.b_name = bname;
		this.b_title = btitle;
		this.b_type = btype;
		this.b_exp = bexp;
	}


	public void print() {
		System.out.println("å��ȣ: "+b_no +
						   " å�̸�: "+b_name+
						   " å�帣: "+b_type+
						   " å����: "+b_exp);
	}
	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_type() {
		return b_type;
	}

	public void setB_type(String b_type) {
		this.b_type = b_type;
	}

	public String getB_exp() {
		return b_exp;
	}

	public void setB_exp(String b_exp) {
		this.b_exp = b_exp;
	}
	
}
