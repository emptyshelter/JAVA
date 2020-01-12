package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamCopyMain {
	public static void main(String[] args)throws Exception {
		
		FileInputStream fis = 
				new FileInputStream("eclipse-inst-win64.exe");
		BufferedInputStream bis =
				new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("eclipse-inst-win64_buffer_copy.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int count = 0;
		int lineCount = 0;
		
		while(true) {
			int readByte = bis.read();
			if (readByte==-1) break;
			bos.write(readByte);
			count++;
			if (count%1024==0) {
				System.out.print("¡Ú");
				lineCount++;
				if (lineCount%40==0) {
					System.out.println();
				}
			}
		}
		bos.close();
		bis.close();
		fis.close();
		fos.close();
		System.out.println();
		System.out.println("BufferedReader read!!");
		System.out.println(count + " Byte read!!!");
	}
}
