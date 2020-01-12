
public class ParameterReferenceValuePrintMain {

	public static void main(String[] args) {
		
		ParameterReferenceValuePrint p = new ParameterReferenceValuePrint();
		Account acc1=new Account(1, "ONE", 340000,4.5);
		p.printAccount(acc1);
		Account acc2=null;
		p.printAccount(acc2);
		

	}

}
