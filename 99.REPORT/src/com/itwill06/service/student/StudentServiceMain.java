package com.itwill06.service.student;



public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. ��ü�л�����,���,�������
		 */
		System.out.println("1. ��ü�л�����,���,�������");
		studentService.calculate();
		studentService.print();
		/*
		 * 2. ��ü�л� �������� �������
		 */
		System.out.println("2. ��ü�л� �������� �������");
		studentService.findByRank();
		studentService.print();
		/*
		 * 3. ��ü�л���ȯ
		 */
		System.out.println("3. ��ü�л���� ");
		studentService.print();
		/*
		 * 4. ��ȣ3�� �л��Ѹ� ��ȯ
		 */
		System.out.println("4.��ȣ3�� �л��Ѹ� ��ȯ  ");
		Student findStudent = studentService.findByNo(3);
		System.out.println(findStudent);
		/*
		 * 5. ����A�� �л��� ��ȯ
		 */
		System.out.println("5. ����A�� �л��� ��ȯ");
		Student [] findStudents= studentService.findByGrade('A');
		for (int i = 0; i < findStudents.length; i++) {
			System.out.println(findStudents[i]);
		}
		/*
		 * 5. �̸�KIM �� �л��� ��ȯ
		 */
		System.out.println("5.  �̸�KIM �� �л��� ��ȯ");
		Student [] findStudents2=studentService.findByName("KIM");
		for (int i = 0; i < findStudents2.length; i++) {
			System.out.println(findStudents2[i]);
		}
		/*
		 * 6. �л��������� ������������
		 */
		System.out.println("6. �л��������� ������������");
		studentService.asByTot();
		/*
		 * 7. �л��̸������� ������������
		 */
		
		System.out.println("7. �л��̸����� ������������");
		studentService.asByName();

	}

}
