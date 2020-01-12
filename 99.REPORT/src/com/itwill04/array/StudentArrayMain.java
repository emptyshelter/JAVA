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
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
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
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");

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
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 4. 번호3번 학생한명 출력  
		 */
		System.out.println("4. 번호3번 학생한명 출력  ");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==3) {
				students[i].print();				
			}
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade()=='A') {
				students[i].print();
			}
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 이름 KIM인 학생들 출력");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName()=="KIM") {
				students[i].print();
			}
		}
		
		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");
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
		 * 7. 7번학생 이름을 제임스딘으로 변경
		 */
		System.out.println("7. 7번학생 이름을 제임스딘으로 변경");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getNo()==7) {
				students[i].setName("제임스딘");
				students[i].print();
			}
		}
		
		/*
		 *8. 학생이름순으로 오름차순정렬
		 */
		System.out.println("8. 학생이름순으로 오름차순정렬");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if (students[j].getName().compareTo(students[j+1].getName())<0) {	
					//String 정렬은 사전순 정렬로 .comparaTo를 하면 
					//앞문자의 유니코드에서 뒷문자의 유니코드를 빼준다
					Student tempName = students[j];
					students[j]=students[j+1];
					students[j+1]=tempName;						
			}
		}
			students[students.length-1-i].print();
			
		}
	}

}
