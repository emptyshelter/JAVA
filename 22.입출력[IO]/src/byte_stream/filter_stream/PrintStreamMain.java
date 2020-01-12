package byte_stream.filter_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		PrintStream ps = 
				new PrintStream(
						new FileOutputStream("printOut.txt"));
		ps.write(49);
		ps.write('1');
		ps.println();
		ps.print(49);
		ps.println();
		ps.write('4');
		ps.write('9');
		ps.println();
		boolean b = true;
		ps.print(b);
		ps.println();
		String sb = b+"";
		for (int i = 0; i < sb.length(); i++) {
			ps.write(sb.charAt(i));
		}
		ps.println();
		ps.print(123456789);
		ps.println();
		ps.write('1');
		ps.write('2');
		ps.write('3');
		ps.write('4');
		ps.write('5');
		ps.write('6');
		ps.write('7');
		ps.write('8');
		ps.write('9');
		ps.println();
		ps.write(49);
		ps.write(50);
		ps.write(51);
		ps.write(52);
		ps.write(53);
		ps.write(54);
		ps.write(55);
		ps.write(56);
		ps.write(57);
		ps.println();
		ps.print(3.14159);
		ps.println();
		ps.write('3');
		ps.write('.');
		ps.write('1');
		ps.write('4');
		ps.write('1');
		ps.write('5');
		ps.write('9');
		ps.println();
		ps.println("문자열도 찍어요!!!");
//		ps.write('문');
//		ps.write('자');
//		ps.write('열');
//		ps.write('도');
//		ps.write('찍');
//		ps.write('어');
//		ps.write('요');
//		ps.write('!');
//		ps.write('!');
//		ps.write('!');
		
		System.out.println("--------------PrintStream printOut.txt----------------");

	}

}
