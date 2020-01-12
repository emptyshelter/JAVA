package com.itwill06.service.student;

public class StudentService {
	private Student[] students={
			new Student(1,"KIM",89,93,94),
			new Student(2,"HIM",88,77,98),
			new Student(3,"AIM",65,87,99),
			new Student(4,"KIM",75,97,60),
			new Student(5,"XIM",85,98,90),
			new Student(6,"TIM",95,88,77),
			new Student(7,"KIM",99,93,95),
			new Student(8,"LIM",83,80,99),
			new Student(9,"QIM",73,90,80),
			
	};
	/*
	 *  0.전체학생출력
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		Student[]addStudent = new Student[students.length+1];
		for (int i = 0; i < students.length; i++) {
			addStudent[i]=students[i];
		}
		addStudent[addStudent.length-1]= student;
		students=addStudent;
	}
	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public Student calculate() {
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTot();
			students[i].calculateAvg();
			students[i].calculateGrade();			
		}
		return findStudent;
	}
	
	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	public Student findByRank() {
		
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			int rank=1;
			for (int j = 0; j < students.length; j++) {
				if (students[i].getTot()<students[j].getTot()) {
					rank++;
					students[i].setRank(rank);
				}				
			}
		}
		return findStudent;
	}
	/*
	 * 3. 전체학생반환
	 */
	/*
	 * 4. 번호3번 학생한명 반환  
	 */
	public Student findByNo(int no) {
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==no) {
				findStudent=students[i];
				students[i].print();
				break;
			}
		}
		return findStudent;
	}	
	public Student [] findByName (String name) {
		Student [] findStudent=null;
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				count++;
			}
		}
		findStudent=new Student[count];
		count=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				findStudent[count++]=students[i];
				students[i].print();
			}
		}
		return findStudent;
	}	
	/*
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findByGrade(char grade) {
		Student [] findStudent=null;
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()==grade) {
				count++;
			}
		}
		findStudent=new Student[count];
		count=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()==grade) {
				findStudent[count++]=students[i];
				students[i].print();
			}
		}
		return findStudent;
	}
	/*
	 * 6. 학생총점으로 오름차순정렬
	 */
	public Student asByTot(){
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getTot()-students[j+1].getTot()< 0) {
					Student tempTot = students[j];
					students[j]=students[j+1];
					students[j+1]=tempTot;
				}
			}
			students[students.length-1-i].print();
		}
		return findStudent;
	}
	/*
	  7. 학생학점순으로 오름차순정렬
	 */
	public Student asByGrade(){
		Student findStudent=null;
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getGrade()-students[j+1].getGrade()< 0) {
					Student tempTot = students[j];
					students[j]=students[j+1];
					students[j+1]=tempTot;
				}
			}
			students[students.length-1-i].print();
		}
		return findStudent;
	}
	/*
	 8. 학생이름순으로 오름차순정렬
	 */
	public Student asByName() {
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if (students[j].getName().compareTo(students[j+1].getName())<0) {	
					Student tempName = students[j];
					students[j]=students[j+1];
					students[j+1]=tempName;						
				}
			}
			students[students.length-1-i].print();
		}
		return findStudent;
	}
}