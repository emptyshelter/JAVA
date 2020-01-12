public class AcademyGangsa extends AcademyMember {
	private String subject;//°ú¸ñ
	public AcademyGangsa() {
	}
	public AcademyGangsa(int no,String name,String subject) {
		super(no, name);
		this.subject = subject;
	}
	public void print() {
		super.print();
		System.out.println(subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
