package com.itwill04.array;


public class DvdMember {
	private int no;//ȸ����ȣ
	private String name;//ȸ���̸�
	private String tel;//��ȭ��ȣ
	private Dvd[] dvd;//dvd
	
	public DvdMember(int no, String name, String tel, Dvd[] dvd) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.dvd = dvd;
	}
	public void print() {
		System.out.println(no+"\t"+name+"\t"+tel);
		System.out.println("============�뿩���============");
		for (int i = 0; i < this.dvd.length; i++) {
			this.dvd[i].print();
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Dvd[] getDvd() {
		return dvd;
	}

	public void setDvd(Dvd[] dvd) {
		this.dvd = dvd;
	}


	
}
