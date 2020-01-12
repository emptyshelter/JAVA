package com.itwill06.service.student;

import java.util.Scanner;

public class StudentServiceUIMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		StudentService studentService=new StudentService();
		System.out.println("*****************************");
		System.out.println("�л������������α׷�");
		System.out.println("*****************************");
		while (run) {
			System.out.println("------------�޴�-------------");
			System.out.println("0. ��ü�л����");
			System.out.println("1. ��ü�л�����,���,�������");
			System.out.println("2. ��ü�л� �������� �������");
			System.out.println("3. ��ȣ��   �˻�");
			System.out.println("4. �������� �˻�");
			System.out.println("5. �̸����� �˻�");
			System.out.println("6. �л��������� ������������");
			System.out.println("7. �л��̸����� ������������");
			System.out.println("8. ����");
			System.out.println("----------------------------");
			System.out.print("�޴���ȣ����> ");
			
			int menuNo =scanner.nextInt();
			if(menuNo==0) {
				//0. ��ü�л����
				studentService.print();
			}else if(menuNo==1) {
				//1. ��ü�л�����,���,�������
				studentService.calculate();
			studentService.print();
			}else if(menuNo==2) {
				//2. ��ü�л� �������� �������
				studentService.findByRank();
				studentService.print();
			}else if(menuNo==3) {
				//3. ��ȣ��   �˻�
				System.out.print("��ȣ�� �Է��ϼ���: ");
				int no = scanner.nextInt();
				Student findStudent = studentService.findByNo(no);
				if (findStudent!= null) {
					Student.headerPrint();
					findStudent.print();
				}else {
					System.out.println(no+ "�� �л��� �������� �ʽ��ϴ�.");
				}
			}else if(menuNo==4) {
				//4. �������� �˻�
				System.out.print(" >> ������ �Է��ϼ��� : ");
				String gradeStr = scanner.next();
				char grade = gradeStr.charAt(0);
			}else if(menuNo==5) {
				//5. �̸����� �˻�
				System.out.print("�̸��� �Է��ϼ���");
				String name = scanner.next();
				studentService.findByName(name);
			}else if(menuNo==6) {
				//6. �л��������� ������������
				Student findStudent = studentService.asByTot();
			}else if(menuNo==7) {
				//7. �л��̸����� ������������
				Student findStudent = studentService.asByName();
			}else if(menuNo==8) {
				run=false;
				System.out.println("�л������������α׷��� �����մϴ�.");
			}
			
			
			
		}

	}

}
