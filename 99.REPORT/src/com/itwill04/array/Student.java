package com.itwill04.array;

/*
 - ����ó�������� �ʿ��� �л���ü�� ����� ���� Ŭ����
 - Ŭ�����ۼ��� ĸ��ȭ�ϼ���
 
 */
public class Student {

	/*
	 * << ����������� >>
	 */
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank=1;
	/*
	 * <<�����ڸ޽�� ����[�����ε�]>>
	 *  - ���� 0��¥�� ������(�⺻�����ڼ���) 
	 *  - ���� 5��¥��(��ȣ �̸� ���� ���� ����) �����ڼ���
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot= kor+eng+math;
	}
	/*
	 * <<����޽�弱�� >>
	 */

	public void setStudentData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void calculateTotal() {
		this.tot = this.kor + this.eng + this.math;
	}

	public void calculateAvg() {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}

	public char calculateGrade() {

		if (this.avg >= 90)
			this.grade = 'A';
		else if (this.avg < 90 && this.avg >= 80)
			this.grade = 'B';
		else if (this.avg < 80 && this.avg >= 70)
			this.grade = 'C';
		else if (this.avg < 70 && this.avg >= 60)
			this.grade = 'D';
		else
			this.grade = 'F';

		return grade;
	}

	public void headerPrint() {
		System.out.println("--------------------------�л� �������-----------------------------");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����\t����");
		System.out.println("--------------------------------------------------------------------");
	}

	public void print() {

		System.out.println(no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg + "\t"
				+ grade + "\t" + rank);
	}
	/*
	 * << getter, setter�޽�弱��>>
	 */

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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
}
