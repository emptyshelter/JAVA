
public class AcademyMemberConstructorMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyGangsa gs1=new AcademyGangsa(2, "LEE", "OFFICE");
		AcademyStaff sf1=new AcademyStaff(3, "CHOI", "MARKETING");
		
		st1.studentPrint();
		gs1.gangsaPrint();
		sf1.staffPrint();
		
		st1.print();
		System.out.println();
		gs1.print();
		System.out.println();
		sf1.print();
		System.out.println();
		
		System.out.println("------array------");
		AcademyStudent[] students=new AcademyStudent[3];
		AcademyGangsa[] gangsas=new AcademyGangsa[2];
		AcademyStaff[] staffs= new AcademyStaff[1];
		students[0]= st1;
		students[1]= new AcademyStudent(4, "�л�4", "JAVA");
		students[2]= new AcademyStudent(5, "�л�5", "ANDROID");
		
		gangsas[0]=gs1;
		gangsas[1]=new AcademyGangsa(6, "���ӽ�", "��ȭ�� ����");
		
		staffs[0]=sf1;
		
		System.out.println("=============AcademyMember��ü���==============");
		System.out.println("=============Student==============");
		for (int i = 0; i < staffs.length; i++) {
			students[i].studentPrint();
		}
		System.out.println("=============Gangsa==============");
		for (int i = 0; i < staffs.length; i++) {
			gangsas[i].gangsaPrint();
		}
		System.out.println("=============Staff==============");
		for (int i = 0; i < staffs.length; i++) {
		}
		AcademyStaff tempStaff = staffs[0];
		tempStaff.setName("����");
		tempStaff.staffPrint();
	
		
		
	}

}










