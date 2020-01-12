package char_stream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WebClientMain {

	public static void main(String[] args) throws Exception{
		URL url=new URL("https://m.naver.com/");
		InputStream in = url.openStream();
		InputStreamReader isr=new InputStreamReader(in,"UTF-8");
		while (true) {
			int readChar = isr.read();
			if(readChar==-1)break;
			System.out.print((char)readChar);
		}
		
	}

}
