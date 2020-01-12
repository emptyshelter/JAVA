package byte_stream.filter_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class AccountArrayWriteMain {

	public static void main(String[] args) throws Exception{
		Account[] accounts= {
				new Account(1111, "MIN", 89000, 5.9),	
				new Account(2222, "AIM", 45000, 2.7),
				new Account(3333, "XIM", 34000, 3.7),
				new Account(4444, "ZIM", 12000, 1.7),
				new Account(5555, "SIM", 97000, 5.7),
				new Account(6666, "BIM", 88000, 3.7),
				new Account(7777, "CIM", 11000, 9.7),
				new Account(8888, "YIM", 21000, 8.7),
				new Account(9999, "QIM", 71000, 2.7)
			};
		DataOutputStream accountsDos=
				new DataOutputStream(
						new FileOutputStream("accounts.ser"));
		accountsDos.writeInt(accounts.length);
		for (Account account:accounts) {
			accountsDos.writeInt(account.getNo());
			accountsDos.writeUTF(account.getOwner());
			accountsDos.writeInt(account.getBalance());
			accountsDos.writeDouble(account.getIyul());
			accountsDos.flush();
		}
		accountsDos.close();
		System.out.println("------Account[] write--> accounts.ser");
	}

}








