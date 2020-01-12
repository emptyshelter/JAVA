package com.itwill04.array;


public class StudentArrayMain {

	public static void main(String[] args) {
		
		Student st1= new Student();
		Student[] students={
				new Student(1,"KIM",89,93,94),				
				new Student(2,"HIM",88,77,98),
				new Student(3,"AIM",65,87,99),
				new Student(4,"BIM",75,97,60),
				new Student(5,"KIM",85,98,90),
				new Student(6,"TIM",95,88,77),
				new Student(7,"ZIM",99,93,95),
				new Student(8,"LIM",83,80,99),
				new Student(9,"QIM",73,90,80),
				
		};
		
		
		/*
		 * 1. ��ü�л�����,���,�������
		 */
		System.out.println("1. ��ü�л�����,���,�������");
		int tot=0;
		double avg=0;
		char grade=' ';
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			tot += students[i].getTot();
			students[i].calculateAvg();
			avg +=students[i].getAvg();
			students[i].calculateGrade();
			grade += students[i].getGrade();
			students[i].print();
		}			
		/*
		 * 2. ��ü�л� �������� �������
		 */
		System.out.println("2. ��ü�л� �������� �������");

		for (int i = 0; i < students.length; i++) {
			int rank=1;
			for (int j = 0; j < students.length; j++) {
				if (students[i].getTot()<students[j].getTot()) {
					rank++;
					students[i].setRank(rank);
				}				
			}
			students[i].print();
		}
			
		
		/*
		 * 3. ��ü�л����
		 */
		System.out.println("3. ��ü�л���� ");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 4. ��ȣ3�� �л��Ѹ� ���  
		 */
		System.out.println("4. ��ȣ3�� �л��Ѹ� ���  ");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==3) {
				students[i].print();				
			}
		}
		/*
		 * 5. ����A�� �л��� ���
		 */
		System.out.println("5. ����A�� �л��� ���");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade()=='A') {
				students[i].print();
			}
		}
		/*
		 * 5. ����A�� �л��� ���
		 */
		System.out.println("5. �̸� KIM�� �л��� ���");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName()=="KIM") {
				students[i].print();
			}
		}
		
		/*
		 * 6. �л��������� ������������
		 */
		System.out.println("6. �л��������� ������������");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getTot()-students[j+1].getTot()> 0) {
					Student tempTot = students[j];
					students[j]=students[j+1];
					students[j+1]=tempTot;
				}
			}
			students[students.length-1-i].print();
		} 	
		
		/*
		 * 7. 7���л� �̸��� ���ӽ������� ����
		 */
		System.out.println("7. 7���л� �̸��� ���ӽ������� ����");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getNo()==7) {
				students[i].setName("���ӽ���");
				students[i].print();
			}
		}
		
		/*
		 *8. �л��̸������� ������������
		 */
		System.out.println("8. �л��̸������� ������������");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if (students[j].getName().compareTo(students[j+1].getName())<0) {	
					//String ������ ������ ���ķ� .comparaTo�� �ϸ� 
					//�չ����� �����ڵ忡�� �޹����� �����ڵ带 ���ش�
					Student tempName = students[j];
					students[j]=students[j+1];
					students[j+1]=tempName;						
			}
		}
			students[students.length-1-i].print();
			
		}
	}

}
