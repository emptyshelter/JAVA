package com.itwill07.collection;


import java.util.ArrayList;

public class StudentServiceArrayListMain {

	public static void main(String[] args) {
		StudentServiceArrayList studentServiceArrayList=new StudentServiceArrayList();
		/*
		 * 1. ��ü�л�����,���,�������
		 */
		System.out.println("1. ��ü�л�����,���,�������");
		studentServiceArrayList.calculate();
		/*
		 * 2. ��ü�л� �������� �������
		 */
		System.out.println("2. ��ü�л� �������� �������");
		studentServiceArrayList.calculateRank();
		
		/*
		 * 3. ��ü�л���ȯ
		 */
		System.out.println("3. ��ü�л���� ");
		ArrayList<Student> studentList=
				studentServiceArrayList.getStudentList();
		for (Student student : studentList) {
			student.print();
		}
		/*
		 * 4. ��ȣ3�� �л��Ѹ� ��ȯ  
		 */
		System.out.println("4.��ȣ3�� �л��Ѹ� ��ȯ  ");
		Student findStudent=studentServiceArrayList.findByStudent(3);
		findStudent.print();
		/*
		 * 5. ����A�� �л��� ��ȯ
		 */
		System.out.println("5. ����A�� �л��� ��ȯ");
		studentList=studentServiceArrayList.findByGrade('A');
		for (Student student : studentList) {
			student.print();
		}
		/*
		 * 5. �̸�KIM �� �л��� ��ȯ
		 */
		System.out.println("5.  �̸�KIM �� �л��� ��ȯ");
		studentList=studentServiceArrayList.findByName("KIM");
		for (Student student : studentList) {
			student.print();
		}
		/*
		 * 6. �л��������� ������������
		 */
		System.out.println("6. �л��������� ������������");
		studentServiceArrayList.sortByTotAsc();
		studentList=studentServiceArrayList.getStudentList();
		for (Student student : studentList) {
			student.print();
		}
		/*
		 8. �л��̸������� ������������
		 */
		System.out.println("8. �л��̸������� ������������");
		studentServiceArrayList.sortByNameAsc();
		studentList=studentServiceArrayList.getStudentList();
		for (Student student : studentList) {
			student.print();
		}
		
	
		
	}

}
