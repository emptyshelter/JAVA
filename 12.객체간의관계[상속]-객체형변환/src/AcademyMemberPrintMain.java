
public class AcademyMemberPrintMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
				new AcademyStudent(1, "KIM", "JAVA"),	
				new AcademyStudent(2, "JIM", "JAVARA"),	
				new AcademyStudent(3, "MIM", "JAVABA"),	
				new AcademyGangsa(4, "강사1", "과목1"),
				new AcademyGangsa(5, "강사2", "과목2"),
				new AcademyStaff(6, "스탭1", "부서1"),	
				new AcademyOperator(7, "HONG", "PC정비"),
				new AcademyOperator(8, "PARK", "서버관리")
			};
		AcademyMemberPrint amp = new AcademyMemberPrint();
		amp.setAcademyMembers(members);
		amp.memberPrint();
 
	}

}
