
public class AcademyMemberStaticPrintMain {

	public static void main(String[] args) {
		
		AcademyStudent st1=new AcademyStudent(11, "김", "자바");
		AcademyOperator op1=new AcademyOperator(33, "오피1", "PC수리");
		AcademyMemberStaticPrint.memberPrint(st1);
		AcademyMemberStaticPrint.memberPrint(op1);
		

	}

}
