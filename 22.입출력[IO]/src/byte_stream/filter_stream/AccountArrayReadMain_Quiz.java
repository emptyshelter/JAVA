package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class AccountArrayReadMain_Quiz {

	public static void main(String[] args) throws Exception{
		
		DataInputStream accountsDis=
				new DataInputStream(
						new FileInputStream("accounts.ser"));
		int accountLength = accountsDis.readInt();
		System.out.println("account °¹¼ö:"+accountLength);
		Account [] accounts = new Account[accountLength];
		for (int i = 0; i < accounts.length; i++) {
			Account readAccount = 
					new Account(accountsDis.readInt(),
								accountsDis.readUTF(),
								accountsDis.readInt(),
								accountsDis.readDouble());
			accounts[i]=readAccount;
		}
		System.out.println("-----read accounts.ser--> Account[]---");
		Account.headerPrint();
		for (Account account : accounts) {
			account.print();
		}

//		while (true) {
//			try {
//				Account account = 
//						new Account(accountsDis.readInt(), 
//						     		accountsDis.readUTF(),
//						     		accountsDis.readInt(),
//						     		accountsDis.readDouble());
//				account.print();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//				e.getMessage();
//				break;
//			}
//		}
		
		

	}

}
