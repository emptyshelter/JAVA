package com.itwill02.constructor;



public class StudentConstructorMain {

	public static void main(String[] args) {
		
		/*
		 �л���ü����(3��)
		  -1���� �⺻�����ڻ��
		      �л���ü����Ÿ(��ȣ, �̸�, ����, ����, ����)�Է¸޽��ȣ��
		  - 2���� ����5�� �����ڻ��
		 */
		Student st1= new Student();
		st1.setStudentData(90, "������", 98, 77, 88);
		Student st2= new Student(80, "�󸶹�", 88, 77, 66);
		Student st3= new Student(60, "�����", 45, 85, 64);		
		
		/*
		 * �л�������� �޽�� ȣ�� 
		 * �л���հ�� �޽�� ȣ�� 
		 * �л�������� �޽�� ȣ��
		 */
		st1.calculateTotal();
		st2.calculateTotal();
		st3.calculateTotal();
		
		st1.calculateAvg();
		st2.calculateAvg();
		st3.calculateAvg();
		
		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();
		/*
		 * �л�����Ÿ ��¸޽�� ȣ��
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		System.out.println();
		/*
		 * �л� stu1�� grade���
		 */
		System.out.println("�л� stu1�� grade��"+st1.getGrade()+"�Դϴ�.");
		

	}
	

}
