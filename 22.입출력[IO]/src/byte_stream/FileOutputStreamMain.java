package byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
  1. 데이타 목적지(target)선정(파일)
  2. 출력스트림객체생성(FileOutputStream)
  3. 출력스트림을 사용해서 1바이트씩쓴다.
  4. 출력스트림을 닫는다.
 */
public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=
				new FileOutputStream("fileOut.txt");
		/*
		public abstract void write(int b) throws IOException;
			- Writes the specified byte to this output stream.
			- The general contract for write is 
			  	that one byte is written to the output stream. 
			- The byte to be written is the eight low-order bits of the argument b.
			    The 24 high-order bits of b are ignored.
			- Subclasses of OutputStream must 
			    provide an implementation for this method.
			Parameters:
			b - the byte.
		 */
		fos.write(65);
		fos.write(2147483647);
		fos.write(255);
		fos.write('A');
		fos.write('B');
		fos.write('김');
		for (int i = 0; i < 256; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("FileOutputStream write!!");
		

	}

}
