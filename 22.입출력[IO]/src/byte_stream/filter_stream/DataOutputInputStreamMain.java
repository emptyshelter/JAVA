package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception{
		DataOutputStream dos = 
				new DataOutputStream(
						new FileOutputStream("dataOut.txt"));
		int intData= 2147483647;
		dos.write(intData>>24);
		dos.write(intData>>16);
		dos.write(intData>>8);
		dos.write(intData);
//		dos.writeInt(intData);
		
		dos.writeByte(127);
		dos.writeDouble(3.14);
		dos.writeBoolean(true);
		dos.writeChar('��');
		/*
		 * ���ڿ��� UTF-8(modified) �������� write
		 */
		dos.writeUTF("������ ��Ʈ���� ���ϴ�.");
		dos.close();
		System.out.println("---------------DataOutputStream wirteXXX---------------");
		DataInputStream dis =
				new DataInputStream(
						new FileInputStream("dataOut.txt"));
		System.out.println("int: "+ dis.readInt());
		System.out.println("byte: "+ dis.readByte());
		System.out.println("Double: "+ dis.readDouble());
		System.out.println("Boolean: "+ dis.readBoolean());
		System.out.println("Char: "+ dis.readChar());
		System.out.println("UTF: "+ dis.readUTF());
		System.out.println("---------------DataInputStream readXXX---------------");
		System.out.println("---------------Account ��ü���� �а���---------------");
		Account account = new Account(1,"��̼�",5600 , 3.4);
		DataOutputStream accountDos=
				new DataOutputStream(
						new FileOutputStream("account.ser"));
		
		accountDos.writeInt(account.getNo());
		accountDos.writeUTF(account.getOwner());
		accountDos.writeInt(account.getBalance());
		accountDos.writeDouble(account.getIyul());
		
		/*<< public void flush() throws IOException>>
		 - Flushes this data output stream. 
		 - This forces any buffered output bytes 
		   to be written out to the stream.
		 
		 */
		accountDos.flush();
		accountDos.close();
		System.out.println(">>>> write Account data --> account.ser ����");
		
		DataInputStream accountDis=
				new DataInputStream(
						new FileInputStream("account.ser"));
		Account readAccount = 
				new Account(accountDis.readInt(), 
							accountDis.readUTF(), 
							accountDis.readInt(), 
							accountDis.readDouble());
		System.out.println(">>>> account.ser -->read Account data -->" );
		readAccount.print();
		accountDis.close();
		
		
		
				

	}

}
