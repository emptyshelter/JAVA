public class AcademyStaff extends AcademyMember {
	private String depart;//ºÎ¼­
	public AcademyStaff() {
	}
	public AcademyStaff(int no,String name,String depart) {
		super(no, name);
		this.depart = depart;
	}
	public void print() {
		super.print();
		System.out.println(depart);
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
