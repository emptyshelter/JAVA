package com.itwill07.collection;


import java.util.ArrayList;
import java.util.Collections;

public class StudentServiceArrayList {
	
	private ArrayList<Student> studentList;
	
	
	public StudentServiceArrayList() {
		studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"KIM",89,93,94));
		studentList.add(new Student(2,"HIM",88,77,98));
		studentList.add(new Student(3,"AIM",65,87,99));
		studentList.add(new Student(4,"KIM",75,97,60));
		studentList.add(new Student(5,"XIM",85,98,90));
		studentList.add(new Student(6,"TIM",95,88,77));
		studentList.add(new Student(7,"KIM",99,93,95));
		studentList.add(new Student(8,"LIM",83,80,99));
		studentList.add(new Student(9,"QIM",73,90,80));
	}
	/*
	 * 0.�л���ü�޾Ƽ� �߰�
	 */
	public void addStudent(Student student) {
		studentList.add(student);
	}
	/*
	 * 1. ��ü�л�����,���,�������
	 */
	public void calculate() {
		for (Student student : studentList) {
			student.calculateTot();
			student.calculateAvg();
			student.calculateGrade();
		}
		
	}
	/*
	 * 2. ��ü�л� �������� �������
	 */
	public void calculateRank() {
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = 0; j < studentList.size(); j++) {
				if(studentList.get(i).getTot()<studentList.get(j).getTot()) {
					studentList.get(i).setRank(studentList.get(i).getRank()+1);
				}
			}
		}
		
		
	}
	
	/*
	 * 3. ��ü�л���ȯ
	 */
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	/*
	 * 4. ��ȣ3�� �л��Ѹ� ��ȯ  
	 */
	public Student findByStudent(int no) {
		Student findStudent=null;
		for (Student student : studentList) {
			if ((student.getNo())==no) {
				findStudent=student;
			}
		}
		return findStudent;
	}
	/*
	 * 5. ����A�� �л��� ��ȯ
	 */
	public ArrayList<Student> findByGrade(char grade) {
		ArrayList<Student> findStudents=new ArrayList<Student>();
		for (Student student : studentList) {
			if (student.getGrade()==grade) {
				findStudents.add(student);
			}
		}
		return findStudents;
	}
	/*
	 * 5. �̸�KIM �л��� ��ȯ
	 */
	public ArrayList<Student> findByName(String name) {
		ArrayList<Student> findStudents=new ArrayList<Student>();
		for (Student student : studentList) {
			if (student.getName().equals(name)) {
				findStudents.add(student);
			}
		}
		return findStudents;
	}
	
	/*
	 * 6. �л��������� ������������
	 */
	public void sortByTotAsc() {
		Collections.sort(studentList,new ComparatorTotAsc());
		
	}
	
	
	
	/*
	 8. �л��̸������� ������������
	 */
	public void sortByNameAsc() {
		Collections.sort(studentList,new ComparatorStudentsNameAsc());
		
		
		
	}
	
}
