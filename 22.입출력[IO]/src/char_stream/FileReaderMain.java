package char_stream;

import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("fileWriter.txt");
		/*
		public int read()throws IOException
			- Reads a single character. 
			- This method will block until a character is available, an I/O error occurs, or the end of the stream is reached.
			- Subclasses that intend to support efficient single-character input should override this method.
		Returns:
			 The character read, 
			 as an integer in the range 0 to 65535 (0x00-0xffff), 
			 or -1 if the end of the stream has been reached
		 */
		
		int readChar = fr.read();
		System.out.println("1. "+(char)readChar);
		readChar=fr.read();
		System.out.println("2. "+(char)readChar);
		while (true) {
			readChar= fr.read();
			if (readChar== -1)break;
			System.out.print((char)readChar);
		}
		fr.close();
		System.out.println("--------------FileReader.read-----------");

	}

}
