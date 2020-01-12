
public class ParameterReferenceValuePrint {
	public void printAccount(Account acc) {
		if(acc!=null) {
		acc.headerPrint();
		acc.print();
		}else {
			System.out.println("null값은 출력할 수 없습니다.");
		}
	}

}
