
public class AcademyMemberPrint {
	/*
	 * ����Ÿ�Ը� �����ϰ� �Ǹ� �������� �ٰ�
	 * ������������ ���ȴ�.
	 */
	private AcademyMember[] academyMembers;
	
	public void setAcademyMembers(AcademyMember[] acdemyMembers) {
		this.academyMembers=acdemyMembers;
	}
	public AcademyMember[] getAcademyMembers() {
		return this.academyMembers;
	}
	public void memberPrint() {
		for (int i = 0; i < academyMembers.length; i++) {
			academyMembers[i].print();
		}
	}

}
