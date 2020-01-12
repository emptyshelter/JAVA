public class AcademyStudent extends AcademyMember {
	private String ban;
	public AcademyStudent() {
		super();
		
	}
	public AcademyStudent(int no, String name,String ban) {
		super();
		/*
		this.no=no;
		this.name=name;
		*/
		this.setNo(no);
		this.setName(name);
		this.ban=ban;				
	}
	public void print() {
		super.print();
		System.out.println(ban);
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}

}
