import org.omg.PortableInterceptor.SUCCESSFUL;

public class AccountMain {

	public static void main(String[] args) {
		Account acc1=new Account();
		acc1.setAccountData(1111, "KIM", 50000, 0.5);
		acc1.print();
		acc1.ipGum(5500);
		acc1.print();
		boolean iSuccess =acc1.chulGum(333);
		if (iSuccess) {
			System.out.println(acc1.getOwner()+"¥‘¿« ¿‹∞Ì∞° ∫Œ¡∑«’¥œ¥Ÿ");
		}
		iSuccess = acc1.chulGum(100000);
		if (iSuccess) {
			System.out.println(acc1.getOwner()+"¥‘¿« ¿‹∞Ì∞° ∫Œ¡∑«’¥œ¥Ÿ");
		}
		acc1.print();
		System.out.println("acc1¿« ¿‹∞Ì ¡∂»∏:"+ acc1.getBalance());
		acc1.headerPrint();
		acc1.print();		
		
		System.out.println("==========================");
		Account acc2 =new Account();
		acc2.setAccountData(2222, "LEE", 45000, 2.3);
		Account acc3 =new Account();
		acc3.setAccountData(3333, "PARK", 780000, 1.7);
		Account acc4 =new Account();
		acc4.setAccountData(4444, "SIM", 12000, 0.3);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
	}

}
