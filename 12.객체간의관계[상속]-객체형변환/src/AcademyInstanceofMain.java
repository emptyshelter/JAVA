
public class AcademyInstanceofMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
			new AcademyStudent(1, "KIM", "JAVA"),	
			new AcademyStudent(1, "JIM", "JAVARA"),	
			new AcademyStudent(1, "MIM", "JAVABA"),	
			new AcademyGangsa(4, "����1", "����1"),
			new AcademyGangsa(5, "����2", "����2"),
			new AcademyStaff(6, "����1", "�μ�1")			
		};
		/*
		 * instanceof
		 * 	-�������� instanceof Ŭ�����̸�
		 */
		
		AcademyMember am = members[(int)(Math.random()*6)];
		boolean b = am instanceof AcademyStudent; 
		am.print();
		System.out.println("am�� AcademyStudent�� ��ü��?"+b);
		System.out.println("===========��,����,�μ�============");
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) members[i];
				System.out.println("�л�:"+tempStudent.getBan());				
			}
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
				System.out.println("����:"+tempGangsa.getSubject());				
			}
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff) members[i];
				System.out.println("����:"+tempStaff.getDepart());				
			}
		}
		System.out.println("=============�л��� ���============");
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				members[i].print();				
			}
		}
	}

}
