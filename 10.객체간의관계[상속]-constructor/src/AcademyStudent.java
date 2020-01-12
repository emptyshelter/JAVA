public class AcademyStudent extends AcademyMember {
	public String ban;
	public AcademyStudent() {
		super();
		
	}
	public AcademyStudent(int no, String name,String ban) {
		super();
		/*
		this.no=no;
		this.name=name;
		this.ban=ban;		
		*/
		this.setNo(no);
		this.setName(name);
		this.ban=ban;				
	}
	public void studentPrint() {
		this.print();
		System.out.println(ban);
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}

}
