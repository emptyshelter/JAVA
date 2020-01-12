
public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany accountMany=new AccountMany();
		accountMany.acc0= new Account(4234, "KIM", 50000, 3.4);
		accountMany.acc1= new Account(5644, "LIM", 52000, 4.4);
		accountMany.acc2= new Account(2346, "MIN", 34000, 7.4);
		accountMany.acc3= new Account(7888, "OIM", 12000, 2.4);
		accountMany.acc4= new Account(9012, "PIM", 90000, 1.4);
		
		Account.headerPrint();
		accountMany.acc0.print();
		accountMany.acc1.print();
		accountMany.acc2.print();
		accountMany.acc3.print();
		accountMany.acc4.print();

	}

}
