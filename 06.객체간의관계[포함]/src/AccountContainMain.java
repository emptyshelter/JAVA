
public class AccountContainMain {

	public static void main(String[] args) {
		AccountContain accountContain=new AccountContain();
		accountContain.setNumber(9999);
		Account ta=new Account(3333, "»ï»ï",30000, 3.3);
		accountContain.setAccount(ta);
		
		
		int number = accountContain.getNumber();
		Account account = accountContain.getAccount();
		account.print();
		
		
		AccountContain accountContain2=
				new AccountContain(67676,
						new Account(4534, "ÈÞÈÞÈÞ", 90000000, 3.5));
		
		accountContain2.getAccount().print();
		
	}

}
