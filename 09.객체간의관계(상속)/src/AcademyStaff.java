public class AcademyStaff extends AcademyMember {
	public String depart;//ºÎ¼­
	public AcademyStaff(int no, String name, String depart) {
		
	}
	public void staffPrint() {
		this.print();
		System.out.println(depart);
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	

}
