package char_stream;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("fileWriter.txt");
		/*
		public void write(int c)throws IOException
			- Writes a single character. 
			- The character to be written is contained 
			  in the 16 low-order bits of the given integer value; 
			  the 16 high-order bits are ignored.
		 */
		fw.write(44457);
		fw.write('��');
		fw.flush();
		
		for (int i = 0; i < 65536; i++) {
			fw.write(i);
			if (i%100==0) {
				fw.write('\n');
			}
		}
		fw.write("���ڿ��� ����� ���!!!");
		fw.write("\n");
		fw.write("�̼����� �����!!!");
		fw.write("\n");
		fw.write("����ȸ�� �����!!!");
		fw.write("\n");
		fw.flush();
		fw.close();
		System.out.println("--------------FileWriter.write----------------");

	}

}
