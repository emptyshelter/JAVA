import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReadThreadBlockMain3 {

	public static void main(String[] args) throws Exception {
		
		DataInputStream consoleIn = 
				new DataInputStream(System.in);
		System.out.println("1. ������ ���� �� ���������� ��������");
		/*
		 * DateOutputStream.writeUTF()�� ����
		 * DateOutputStream.readUTF()�� �д´�.
		 */
		String readStr = consoleIn.readUTF();
		System.out.println("readStr:" + readStr);
		System.out.println("2. ��������� ���� ����Ÿ-->>>"+readStr);

	}

}
