
public class InsufficientBalanceExceptionMain {

	public static void main(String[] args) {
		Account account = new Account(1111, "������", 45000, 0.3);
		/*
		 * boolean isSuccess = account.chulGum(50000); if (isSuccess) {
		 * System.out.println("��ݼ���"); }else { System.out.println("��ݽ���");
		 * account.print(); }
		 */
		 try {
			account.chulGum(50000);
		} catch (InsufficientBalanceException e) {
			System.out.println("�ܰ��������:" +e.getMessage());
		}
		 System.out.println("next....");
		 

	}

}
