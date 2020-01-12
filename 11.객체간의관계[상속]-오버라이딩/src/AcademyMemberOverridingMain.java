
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyGangsa gs1=new AcademyGangsa(2, "LEE", "OFFICE");
		AcademyStaff sf1=new AcademyStaff(3, "CHOI", "MARKETING");
		
		st1.print();
		gs1.print();
		sf1.print();
		
		System.out.println("------array------");
		AcademyStudent[] students=new AcademyStudent[3];
		AcademyGangsa[] gangsas=new AcademyGangsa[2];
		AcademyStaff[] staffs= new AcademyStaff[1];
		students[0]= st1;
		students[1]= new AcademyStudent(4, "학생4", "JAVA");
		students[2]= new AcademyStudent(5, "학생5", "ANDROID");
		
		gangsas[0]=gs1;
		gangsas[1]=new AcademyGangsa(6, "제임스", "영화의 이해");
		
		staffs[0]=sf1;
		
		System.out.println("=============AcademyMember전체출력==============");
		System.out.println("=============Student==============");
		for (int i = 0; i < staffs.length; i++) {
			students[i].print();
		}
		System.out.println("=============Gangsa==============");
		for (int i = 0; i < staffs.length; i++) {
			gangsas[i].print();
		}
		System.out.println("=============Staff==============");
		for (int i = 0; i < staffs.length; i++) {
		}
		AcademyStaff tempStaff = staffs[0];
		tempStaff.setName("변경");
		tempStaff.print();
	
		
		
	}

}










