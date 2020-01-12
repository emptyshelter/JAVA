
public class AcademyMemberStaticPrint {
	private AcademyMemberStaticPrint() {
	}
	public static void memberPrint(AcademyMember member) {
		member.print();
	}
	public static void memberPrint(AcademyMember[] members) {
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
	}
	/*
	public static void studentPrint(AcademyStudent student) {
		student.print();
	}
	public static void staffPrint(AcademyStaff staff) {
		staff.print();
	}
	public static void gangsaPrint(AcademyGangsa gangsa) {
		gangsa.print();
	}
	*/
}
