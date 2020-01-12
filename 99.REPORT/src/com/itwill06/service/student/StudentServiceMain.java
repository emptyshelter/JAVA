package com.itwill06.service.student;



public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		studentService.print();
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.findByRank();
		studentService.print();
		/*
		 * 3. 전체학생반환
		 */
		System.out.println("3. 전체학생출력 ");
		studentService.print();
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		Student findStudent = studentService.findByNo(3);
		System.out.println(findStudent);
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		Student [] findStudents= studentService.findByGrade('A');
		for (int i = 0; i < findStudents.length; i++) {
			System.out.println(findStudents[i]);
		}
		/*
		 * 5. 이름KIM 인 학생들 반환
		 */
		System.out.println("5.  이름KIM 인 학생들 반환");
		Student [] findStudents2=studentService.findByName("KIM");
		for (int i = 0; i < findStudents2.length; i++) {
			System.out.println(findStudents2[i]);
		}
		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");
		studentService.asByTot();
		/*
		 * 7. 학생이름순으로 오름차순정렬
		 */
		
		System.out.println("7. 학생이름으로 오름차순정렬");
		studentService.asByName();

	}

}
