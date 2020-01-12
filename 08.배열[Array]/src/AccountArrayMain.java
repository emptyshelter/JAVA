
public class AccountArrayMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "KIM", 45000, 1.2);
		
		Account[] accounts= {
			acc1,
			new Account(2222, "AIM", 45000, 8.2),	
			new Account(3333, "SIM", 32000, 2.2),	
			new Account(4444, "DIM", 12500, 1.3),	
			new Account(5555, "FIM", 97000, 4.2),	
			new Account(6666, "QIM", 78000, 5.2),	
			new Account(7777, "WIM", 42000, 1.4),	
			new Account(8888, "EIM", 33000, 7.5),	
			new Account(9999, "RIM", 120000, 0.2),	
		};
		
		System.out.println("1.은행총계좌수: "+accounts.length);
		System.out.println("2.전체은행계좌 출력");
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("3.은행계좌들 총잔고");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance+=accounts[i].getBalance();
		}
		System.out.println(totBalance);
		System.out.println("4.은행계좌들중에서 계좌번호가 3333번인 계좌를 찾아서 출력하시오");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.은행계좌들중에서 계좌잔고가 50000원 이상인 계좌들을 찾아서 출력하시오");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>=50000) {
				accounts[i].print();
			}
		}
		System.out.println("6.은행계좌들중에서 계좌이율이 5.0 이상인 계좌들을 찾아서 출력하시오");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul()>=5.0) {
				accounts[i].print();
			}
		}
		System.out.println("7.6666번 계좌에 5000원 입금");
		
		for (int i = 0; i < accounts.length; i++) {
			
			if (accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].ipGum(5000);
				accounts[i].print();
			}
		}
		System.out.println("8.8888번 계좌에 3000원 출금");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==8888) {
				accounts[i].chulGum(3000);
			}
		}
		System.out.println("9.계좌를 잔고순으로 오름(내림)차순 정렬");	
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1-i; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
			accounts[accounts.length-1-i].print();
		} 		
		
		
		
		
		System.out.println("10.6666계좌의 이율을 9.0으로 변경");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].setIyul(9.0);
				accounts[i].print();
				
			}
		}
			
		
	
				
	}

}
