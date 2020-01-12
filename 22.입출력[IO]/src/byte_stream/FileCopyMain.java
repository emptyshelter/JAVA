package byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("eclipse-inst-win64.exe");
		FileOutputStream fos = new FileOutputStream("eclipse-inst-win64_copy.exe");
		int count = 0;
		int lineCount = 0;
		while (true) {
			int readByte = fis.read();
			if (readByte ==-1 )break;
			count++;
			if (count%1024 ==0 ) {
				System.out.print("¡Ú");
				lineCount++;
				if(lineCount%40==0) {
					System.out.println();
				}
			}
			fos.write(readByte);
		}
		System.out.println();
		fis.close();
		fos.close();
		System.out.println(count+" byte copy!!!");
		System.out.println("FileCopy !!!");
	}

}
