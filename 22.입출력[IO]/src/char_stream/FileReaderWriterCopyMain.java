package char_stream;

import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterCopyMain {

	public static void main(String[] args) throws Exception{
		String fileName="14.Overloading[다중정의].txt";
		/*
		int dotIndex = fileName.lastIndexOf(".");
		String fileNameNoExt = fileName.substring(0,dotIndex);
		String ext = fileName.substring(dotIndex+1);
		String copyFileName=fileNameNoExt+"_copy"+"."+ext;
		*/
		String copyFileName="14.Overloading[다중정의]_copy.txt";
		FileReader fr= new FileReader(fileName);
		FileWriter fw= new FileWriter(copyFileName);
		while (true) {
			int readChar=fr.read();
			if(readChar==-1)break;
			fw.write(readChar);
		}
		fr.close();
		fw.flush();
		fw.close();
		System.out.println("-----------FileReaderWriterCopy-----------------");
	}

}









