
public class AcademyOperator extends AcademyMember {
	private String technic;
	
	public AcademyOperator() {
	
	}
	public AcademyOperator(int no, String name, String technic) {
		super(no,name);
		this.technic=technic;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(technic);
	}
	public String getTechnic() {
		return technic;
	}
	public void setTechnic(String technic) {
		this.technic = technic;
	}
	

}
