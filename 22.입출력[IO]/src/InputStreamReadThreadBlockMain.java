import java.io.InputStream;

public class InputStreamReadThreadBlockMain {

	public static void main(String[] args) throws Exception {
		InputStream consoleIn = System.in;
		while (true) {
		System.out.println("1.Thread blocking");
		int readByte = consoleIn.read();
		/*
		- Reads the next byte of data from the input stream.
		- The value byte is returned as an int in the range 0 to 255.
		- If no byte is available because the end of the stream has been reached, 
			the value -1 is returned.
		- This method blocks until input data is available, 
		    the end of the stream is detected, or an exception is thrown. 


		 */
		
		System.out.println("readByte:"+(char)readByte);
		System.out.println("2.Thread ����");
		}

	}

}
