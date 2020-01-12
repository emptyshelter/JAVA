package byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
1. 데이타 소스(source)선정(파일)
2. 입력스트림객체생성(FileInputStream)
3. 입력스트림을 사용해서 1바이트씩 읽는다.
4. 입력스트림을 닫는다.
*/
public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("fileOut.txt");
		/*
		 public abstract int read() throws IOException;
			- Reads the next byte of data from the input stream.
			- The value byte is returned 
			  as an int in the range 0 to 255. 
			- If no byte is available because the end of the stream has been reached, 
			  the value -1 is returned. 
			- This method blocks until input data is available, 
			  the end of the stream is detected, 
			  or an exception is thrown.
			- A subclass must provide an implementation of this method.
		Returns:
			the next byte of data,
			or -1 if the end of the stream is reached.
		 */
		int readByte = fis.read();
		System.out.println("1.byte:"+Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("2.byte:"+Integer.toBinaryString(readByte));
		while((readByte = fis.read())!=-1) {
			readByte = fis.read();
			System.out.print(readByte);
			System.out.print((char)readByte);
			System.out.println(Integer.toBinaryString(readByte)+",");
		}
		fis.close();
		System.out.println("***********FileInputStream read!!!************");
		FileInputStream imageFis=new FileInputStream("album.jpg");
		while (true) {
			int readImageByte = imageFis.read();
			if(readImageByte==-1)break;
			System.out.println(Integer.toBinaryString(readImageByte));
		}
		imageFis.close();
		System.out.println("***********FileInputStream image read!!!************");
		FileInputStream exeFis=new FileInputStream("eclipse-inst-win64.exe");
		while (true) {
			int readExeByte = exeFis.read();
			if(readExeByte==-1)break;
			System.out.println(Integer.toBinaryString(readExeByte));
		}
		exeFis.close();
		System.out.println("***********FileInputStream exe read!!!************");
		
		
	}

}







