import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReadThreadBlockMain3 {

	public static void main(String[] args) throws Exception {
		
		DataInputStream consoleIn = 
				new DataInputStream(System.in);
		System.out.println("1. 데이터 읽을 수 있을때까지 쓰레드대기");
		/*
		 * DateOutputStream.writeUTF()로 쓰고
		 * DateOutputStream.readUTF()로 읽는다.
		 */
		String readStr = consoleIn.readUTF();
		System.out.println("readStr:" + readStr);
		System.out.println("2. 쓰레드실행 읽은 데이타-->>>"+readStr);

	}

}
