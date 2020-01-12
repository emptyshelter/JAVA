import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReadThreadBlockMain2 {

	public static void main(String[] args) throws Exception {
		BufferedReader consoleIn= new BufferedReader(
									new InputStreamReader(
										System.in));
		while(true) {
			System.out.println("1. main thread block");
			String readLine = consoleIn.readLine();
			System.out.println("readLine-->>>"+readLine);
			System.out.println("2. main thread execute");
		}

	}

}
