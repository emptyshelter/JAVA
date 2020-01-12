package file;

import java.io.File;
import java.io.IOException;

public class FileMain {
	public static void main(String[] args) {
		System.out.println("1.���ϱ�����:"+File.separator);
		/*
		 * �����
		 * eclipse --> C:\JAVA_SPRINT\workspaceSE\22.�����[IO]
		 */
		File file1=new File("album.jpg");
		File file2=new File("sample/B.������PATHȯ�溯��.txt");
		File file3=new File("sample","A.JDK_DOWNLOAD_URL.txt");
		/*
		 * ������
		 */
		String str = "\"";
		String str1 = "\\"; 
		File file4 = new File("C:\\JAVA_SPRING\\workspaceSE\\22.�����[IO]\\sample\\A.ũ�Ҵٿ�ε�URL.txt");
		
		System.out.println("2.file path:"+file1.getPath());
		System.out.println("2.file path:"+file2.getPath());
		System.out.println("2.file path:"+file3.getPath());
		System.out.println("2.file path:"+file4.getPath());
		
		System.out.println("3.file name:"+file1.getName());
		System.out.println("3.file name:"+file2.getName());
		System.out.println("3.file name:"+file3.getName());
		System.out.println("3.file name:"+file4.getName());
		
		System.out.println("4.file parent:"+file1.getParent());
		System.out.println("4.file parent:"+file2.getParent());
		System.out.println("4.file parent:"+file3.getParent());
		System.out.println("4.file parent:"+file4.getParent());
		
		System.out.println("5.file absolute pate:"+file1.getAbsolutePath());
		System.out.println("5.file absolute pate:"+file2.getAbsolutePath());
		System.out.println("5.file absolute pate:"+file3.getAbsolutePath());
		System.out.println("5.file absolute pate:"+file4.getAbsolutePath());
		
		File dir1 = new  File("sample");
		File dir2 = new  File("sample/subsample1");
		File dir3 = new  File("sample","subsample2");
		System.out.println("6.isDirectory:"+dir1.isDirectory());
		System.out.println("6.isDirectory:"+file1.isDirectory());
		System.out.println("6.isDirectory:"+dir1.isFile());
		System.out.println("6.isDirectory:"+file1.isFile());
		
		if(dir1.isDirectory()) {
			System.out.println("DIRECTORY NAME:"+dir1.getName());
			System.out.println("\t������:"+dir1.getAbsolutePath());
		}else {
			System.out.println("FILE NAME:"+dir1.getName());
		}
		System.out.println("8.DIRECTORY ����(���丮) ���String[]");
		String [] fileNameList = dir1.list();
		for (int i = 0; i < fileNameList.length; i++) {
			System.out.println("\t"+fileNameList[i]);
		}
		System.out.println("9.DIRECTORY ����(���丮)��� File[]");
		File [] fileList = dir1.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				System.out.println("\td:"+fileList[i].getName());
				File[] subfileList = fileList[i].listFiles();
				for (int j = 0; j < subfileList.length; j++) {
					System.out.println("\t\t"+subfileList[j].getName());
				}
				
			}else if (fileList[i].isFile()){
				System.out.println("\tf:"+fileList[i].getName());
			}
		}	
			System.out.println("10.root directory ���");
			File[] rootDirs = File.listRoots();
			for (File file : rootDirs) {
				System.out.println(file.getPath());
			}
			
			File rootC =new File ("c:\\");
			File [] rootFiles = rootC.listFiles();
			for (int i = 0; i < rootFiles.length; i++) {
				if (rootFiles[i].isDirectory()) {
					System.out.println("\tD:"+rootFiles[i].getName());
				}else {
					System.out.println("\tF:"+rootFiles[i].getName());
				}
			}
			System.out.println("11.Directory ����");
			File newDir1= new File("newDir1");
			File newDir2= new File("newDir2");
			File newDir3= new File("sample","subsample3");
			System.out.println("newDir1�� ���翩��:"+newDir1.exists());
			boolean success = newDir1.mkdir();
			System.out.println("newDir1�� ��������:"+success);
			newDir2.mkdir();
			newDir3.mkdir();
			System.out.println("12.Directory �̸�����");
			newDir2.renameTo(new File("renameDir2"));
			System.out.println("13.Directory ����");
			newDir3.delete();
			newDir3.deleteOnExit();
			System.out.println("14.File����");
			File newFile = new File("newDir1","newFile.txt");
			try {
				boolean isCreate= newFile.createNewFile();
				System.out.println(">>���ϻ�������"+isCreate);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
