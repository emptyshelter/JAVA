
public class AccountConstructorMain {

	public static void main(String[] args) {		
		
		Account acc1=new Account();
		acc1.setAccountData(1000, "KIM", 340000, .3);
		
		Account acc2=new Account(2000,"LEE",90000,.7);		
		Account acc3=new Account(2000,"PARK",80000,.7);		
		Account acc4=new Account(2000,"CHOI",98000,.9);		
		Account acc5=new Account(2000,"LEE",90000,.7);		
		
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();
		
		acc1.ipGum(50);
		acc2.ipGum(50);
		acc3.ipGum(50);
		acc4.ipGum(50);
		acc5.ipGum(50);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();

	}

}
