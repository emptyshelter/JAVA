
public class AcademyInstanceofMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
			new AcademyStudent(1, "KIM", "JAVA"),	
			new AcademyStudent(1, "JIM", "JAVARA"),	
			new AcademyStudent(1, "MIM", "JAVABA"),	
			new AcademyGangsa(4, "강사1", "과목1"),
			new AcademyGangsa(5, "강사2", "과목2"),
			new AcademyStaff(6, "스탭1", "부서1")			
		};
		/*
		 * instanceof
		 * 	-참조변수 instanceof 클래스이름
		 */
		
		AcademyMember am = members[(int)(Math.random()*6)];
		boolean b = am instanceof AcademyStudent; 
		am.print();
		System.out.println("am은 AcademyStudent의 객체냐?"+b);
		System.out.println("===========반,과목,부서============");
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) members[i];
				System.out.println("학생:"+tempStudent.getBan());				
			}
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
				System.out.println("강사:"+tempGangsa.getSubject());				
			}
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff) members[i];
				System.out.println("스탭:"+tempStaff.getDepart());				
			}
		}
		System.out.println("=============학생만 출력============");
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				members[i].print();				
			}
		}
	}

}
