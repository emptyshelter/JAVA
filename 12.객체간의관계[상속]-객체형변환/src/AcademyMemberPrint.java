
public class AcademyMemberPrint {
	/*
	 * 상위타입만 참조하게 되면 의존성이 줄고
	 * 유지보수성이 향상된다.
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
