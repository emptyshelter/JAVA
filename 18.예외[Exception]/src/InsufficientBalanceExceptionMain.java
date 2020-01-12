
public class InsufficientBalanceExceptionMain {

	public static void main(String[] args) {
		Account account = new Account(1111, "김은희", 45000, 0.3);
		/*
		 * boolean isSuccess = account.chulGum(50000); if (isSuccess) {
		 * System.out.println("출금성공"); }else { System.out.println("출금실패");
		 * account.print(); }
		 */
		 try {
			account.chulGum(50000);
		} catch (InsufficientBalanceException e) {
			System.out.println("잔고부족예외:" +e.getMessage());
		}
		 System.out.println("next....");
		 

	}

}
