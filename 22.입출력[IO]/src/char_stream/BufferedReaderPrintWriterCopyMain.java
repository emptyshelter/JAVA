package char_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedReaderPrintWriterCopyMain {

	public static void main(String[] args) throws Exception{
		String fileName="19.Overriding[¿Á¡§¿«].txt";
		int dotIndex = fileName.lastIndexOf(".");
		String fileNameNoExt = fileName.substring(0,dotIndex);
		String ext = fileName.substring(dotIndex+1);
		String copyFileName=fileNameNoExt+"_PrintWriter_copy"+"."+ext;
		BufferedReader br=
				new BufferedReader(new FileReader(fileName));
		PrintWriter pw=
				new PrintWriter(new FileWriter(copyFileName));
		/*
		public String readLine()
                throws IOException
			- Reads a line of text. 
			  A line is considered to be terminated by 
			  	any one of a line feed ('\n'), 
			  	a carriage return ('\r'), 
			  	or a carriage return followed immediately by a linefeed.
		Returns:
			A String containing the contents of the line,
			not including any line-termination characters, 
			or null if the end of the stream has been reached
		 */
		int lineNumber=0;
		while (true) {
			String readLine=br.readLine();
			if(readLine==null)break;
			lineNumber++;
			pw.println(lineNumber+":"+readLine);
		}
		pw.flush();
		pw.close();
		System.out.println("-----------BufferedReaderPrintWriterCopy-----------------");
		
	}

}









