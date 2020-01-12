import java.util.Arrays;

public class AcademyMemberCastingMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyGangsa gs1=new AcademyGangsa(2, "LEE", "OFFICE");
		AcademyStaff sf1=new AcademyStaff(3, "CHOI", "MARKETING");
		
		st1.print();
		gs1.print();
		sf1.print();
		
		AcademyMember[] members = new AcademyMember[6];
		members[0] =st1;
		members[1] = new AcademyStudent(4, "JIM", "자바반");
		members[2] = new AcademyStudent(5, "SIM", "웹디자인");
		
		members[3] = gs1;
		members[4] = new AcademyGangsa(6,"김강사","오피스");
		
		members[5] = sf1;
		
		System.out.println("==============AcdemyMemver print==============");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		
		
		
		
		
	}

}










