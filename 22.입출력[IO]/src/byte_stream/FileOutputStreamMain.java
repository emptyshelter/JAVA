package byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
  1. ����Ÿ ������(target)����(����)
  2. ��½�Ʈ����ü����(FileOutputStream)
  3. ��½�Ʈ���� ����ؼ� 1����Ʈ������.
  4. ��½�Ʈ���� �ݴ´�.
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
		fos.write('��');
		for (int i = 0; i < 256; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("FileOutputStream write!!");
		

	}

}
