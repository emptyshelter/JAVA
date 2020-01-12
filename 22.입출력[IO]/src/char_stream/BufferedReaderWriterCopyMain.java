package char_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterCopyMain {

	public static void main(String[] args) throws Exception{
		String fileName="19.Overriding[재정의].txt";
		
		int dotIndex = fileName.lastIndexOf(".");
		String fileNameNoExt = fileName.substring(0,dotIndex);
		String ext = fileName.substring(dotIndex+1);
		String copyFileName=fileNameNoExt+"_copy"+"."+ext;
//		String copyFileName="19.Overriding[재정의]_copy.txt";
		BufferedReader br=
				new BufferedReader(new FileReader(fileName));
		BufferedWriter bw=
				new BufferedWriter(new FileWriter(copyFileName));
		/*
		 public String readLine()throws IOException
			- Reads a line of text. 
			  A line is considered to be terminated by 
			  any one of a line feed ('\n'), 
			  a carriage return ('\r'), 
			  or a carriage return followed immediately by a linefeed.
		 Returns:
			 - A String containing the contents of the line, 
			   not including any line-termination characters, 
			   or null if the end of the stream has been reached
		 */
		int lineNumber = 0;
		while (true) {
			String readLine=br.readLine();
			if(readLine==null)break;
			lineNumber++;
			bw.write(lineNumber+":"+readLine);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		System.out.println("-----------BufferedReaderPrintWriterCopy-----------------");
	}

}









