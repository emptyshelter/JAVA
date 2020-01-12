package com.itwill02.constructor;



public class StudentConstructorMain {

	public static void main(String[] args) {
		
		/*
		 학생객체생성(3명)
		  -1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1= new Student();
		st1.setStudentData(90, "가나다", 98, 77, 88);
		Student st2= new Student(80, "라마바", 88, 77, 66);
		Student st3= new Student(60, "사아자", 45, 85, 64);		
		
		/*
		 * 학생총점계산 메쏘드 호출 
		 * 학생평균계산 메쏘드 호출 
		 * 학생평점계산 메쏘드 호출
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
		 * 학생데이타 출력메쏘드 호출
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		System.out.println();
		/*
		 * 학생 stu1의 grade출력
		 */
		System.out.println("학생 stu1의 grade는"+st1.getGrade()+"입니다.");
		

	}
	

}
