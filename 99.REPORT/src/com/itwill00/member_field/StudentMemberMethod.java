package com.itwill00.member_field;

public class StudentMemberMethod{
	
	//�Ӽ�
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	public void stData(int no, String name, int kor, int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;	
		//�հ�
		this.tot = this.kor+this.eng+this.math;
		
		//���
		this.avg= (double)tot/3;
		
		//����
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade='A';
		break;
		case 8:
			grade='B';
		break;
		case 7:
			grade='C';
		break;
		case 6:
			grade='D';
		break;		
		default: grade='F';
		break;
		}
		//���		
		System.out.println("---------------�л� �������-------------------");
		System.out.printf("%s %s %4s %s %s %s %s %s%n",
				"�й�" , "�̸�" , "����", "����", "����", "����" , "���", "����");					
		System.out.printf("%d %3s %3d %4d %4d %5d %3.1f %3c",this.no,name,kor,eng,math,this.tot,avg,grade);
		System.out.println();
		System.out.println("-----------------------------------------------");
	}
	//�޼ҵ� �и� 
	public void Data(int no, String name, int kor, int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;	
	}
	int tot () {
		this.tot = this.kor+this.eng+this.math;
		return tot;
	}
	double avg() {
		this.avg= (double)tot/3;
		return avg;
	}
	void grade() {
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade='A';
		break;
		case 8:
			grade='B';
		break;
		case 7:
			grade='C';
		break;
		case 6:
			grade='D';
		break;		
		default: grade='F';
		break;
		}
	}	
	public void headprint() {
		System.out.println("---------------�л� �������-------------------");		
	}
	public void printdata() {
		System.out.printf("%s %s %4s %s %s %s %s %s%n",
				"�й�" , "�̸�" , "����", "����", "����", "����" , "���", "����");				
		System.out.printf("%d %3s %3d %4d %4d %5d %3.1f %3c",this.no,name,kor,eng,math,this.tot,avg,grade);
		System.out.println();
	}
	public void taleprint() {
		System.out.println("-----------------------------------------------");
	}
	/*
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	*/

}