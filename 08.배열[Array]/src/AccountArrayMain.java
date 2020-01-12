
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
		
		System.out.println("1.�����Ѱ��¼�: "+accounts.length);
		System.out.println("2.��ü������� ���");
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("3.������µ� ���ܰ�");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance+=accounts[i].getBalance();
		}
		System.out.println(totBalance);
		System.out.println("4.������µ��߿��� ���¹�ȣ�� 3333���� ���¸� ã�Ƽ� ����Ͻÿ�");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.������µ��߿��� �����ܰ� 50000�� �̻��� ���µ��� ã�Ƽ� ����Ͻÿ�");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>=50000) {
				accounts[i].print();
			}
		}
		System.out.println("6.������µ��߿��� ���������� 5.0 �̻��� ���µ��� ã�Ƽ� ����Ͻÿ�");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul()>=5.0) {
				accounts[i].print();
			}
		}
		System.out.println("7.6666�� ���¿� 5000�� �Ա�");
		
		for (int i = 0; i < accounts.length; i++) {
			
			if (accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].ipGum(5000);
				accounts[i].print();
			}
		}
		System.out.println("8.8888�� ���¿� 3000�� ���");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==8888) {
				accounts[i].chulGum(3000);
			}
		}
		System.out.println("9.���¸� �ܰ������ ����(����)���� ����");	
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
		
		
		
		
		System.out.println("10.6666������ ������ 9.0���� ����");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].setIyul(9.0);
				accounts[i].print();
				
			}
		}
			
		
	
				
	}

}
