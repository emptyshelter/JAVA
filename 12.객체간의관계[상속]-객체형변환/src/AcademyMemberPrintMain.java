
public class AcademyMemberPrintMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
				new AcademyStudent(1, "KIM", "JAVA"),	
				new AcademyStudent(2, "JIM", "JAVARA"),	
				new AcademyStudent(3, "MIM", "JAVABA"),	
				new AcademyGangsa(4, "����1", "����1"),
				new AcademyGangsa(5, "����2", "����2"),
				new AcademyStaff(6, "����1", "�μ�1"),	
				new AcademyOperator(7, "HONG", "PC����"),
				new AcademyOperator(8, "PARK", "��������")
			};
		AcademyMemberPrint amp = new AcademyMemberPrint();
		amp.setAcademyMembers(members);
		amp.memberPrint();
 
	}

}
