package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1="Have a nice day!!!";
		String str2="������ ������ �߻�Ŭ������ �����Ұſ���.";
		int length1=str1.length();
		System.out.println(length1);
		System.out.println(str2.length());
		System.out.println("�ڹٰ� ����ֳ׿�".length());
		String nullStr ="";
		System.out.println(nullStr.length());
		if(nullStr.equals("")) {
			System.out.println("nullStr.equals(\"\") :true");
		}
		String id=null;
		if(id==null || id.equals("")) {
			System.out.println("id==null || id.equals(\"\") :true");
		}
		System.out.println("----String.substring()--------");
		/*
		 * public String substring(int beginIndex,int endIndex)
			 - Returns a string that is a substring of this string. 
			 - The substring begins at the specified beginIndex 
			   and extends to the character at index endIndex - 1.
			 - Thus the length of the substring is endIndex-beginIndex.
		 	Parameters: beginIndex the beginning index, inclusive.
		            	endIndex the ending index, exclusive.
		 */
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("Have a nice day!!!".substring(7,11).length());
		System.out.println(
				"������ ������ �߻�Ŭ������ ������ �ſ���."
				.substring(8,13));
		System.out.println("=============String.charAt(index)===============");
		String userid= "test#00";
		char firstChar = userid.charAt(0);
		System.out.println(firstChar);
		for (int i = 0; i < userid.length(); i++) {
			char tempChar = userid.charAt(i);
			System.out.print(tempChar+" ");
			if ((tempChar>='a' && tempChar<='z')||
				(tempChar>='A' && tempChar<='Z')||
				(tempChar>='0' && tempChar<='9')){
				System.out.print("���̵�� ��ȿ�ѹ���"+tempChar);
			}else {
				System.out.println("���̵�� ��ȿ���� ���� ����"+tempChar);
			}
			System.out.println();
		}
		/*
		 * Quiz: ���̵�� �������� �Ǵ��Ͻÿ�
		 * 	- ���̰� 3~7���̿��� �Ѵ�.
		 * 	- ����(��ҹ��ڻ������), �����̷���� �־���Ѵ�.
		 * 	- ù���ڰ� ���ڿ����� �ȵȴ�.		 * 
		 */
		System.out.println("---------Quiz--------------------");
		String[] idArray= {"guard","7up","test","dfdj","my id"};
		for (int i = 0; i < idArray.length; i++) {
				char checkId = idArray[i].charAt(i);
				if ((idArray[i].length()>=3 && idArray[i].length()<=7)||
						(checkId>='a' && checkId <='z')||
						(checkId>='A' && checkId <='Z')||
						(checkId>='0' && checkId <='9')){					 
					System.out.print("���̵�� ��ȿ�ѹ���"+idArray[i]);
				}else {
					System.out.println("���̵�� ��ȿ���� ���� ����"+idArray[i]);
				}System.out.println();
		}
			
		
		
		System.out.println("==========String.split===========");
		String cardNo="123-3466-8977";		
		String [] cardNoArray = cardNo.split("-");
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(cardNoArray[i]);
		}
		System.out.println("---------String.replace(char,char)--------------------");
		String str3="�츮�� �ڹٸ� �����մϴ�. �ڹٴ� ��ü�������Դϴ�.";
		String result3 = str3.replace('��', '��');
		System.out.println(result3);
		String result4 = str3.replace("�ڹ�", "���̽�");
		System.out.println(result4);
		String result5 = str3.replaceFirst("�ڹ�", "���̽�");
		System.out.println(result5);
		System.out.println();
		System.out.println("------String.toUpperCase,toLowercase");
		System.out.println("jaVA".toUpperCase());
		System.out.println("jaVA".toLowerCase());
		System.out.println("==========equals.,equalsIgnoreCase===========");
		System.out.println("yes".equalsIgnoreCase("Yes"));
		System.out.println("==========String.indexOf===========");
		String fileName="xxx.gif";
		int dotIndex = fileName.indexOf(".");
		System.out.println("dot index:"+ dotIndex);
		String fileNameNoExt = fileName.substring(0,dotIndex);
		String fileExt = fileName.substring(dotIndex+1);
		String copyFileName=fileNameNoExt+"-���纻."+fileExt;
		System.out.println(fileName);
		System.out.println(copyFileName);
		System.out.println("===============startWith, endWith================");
		String fileName2="yyy.gif";
		if (fileName2.endsWith(".gif")|| fileName2.endsWith(".jpg")) {
			System.out.println(fileName2+ " �� �̹��� �����Դϴ�.[gif, jpg]");
		}
		String[] names=
			{"�����","�̹���","�����","�ڹ���","���¹�"};
		
		int count=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("��")) {
				System.out.print(names[i]+" ");
				count++;
			}
		}
		System.out.println();
		
		String[] kimArray=new String[count];
		int index=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("��")) {
				kimArray[index] = names[i];
				index++;
			}
		}
		System.out.println("------------");
		System.out.println(kimArray.length);
		for (int i = 0; i < kimArray.length; i++) {
			System.out.println(kimArray[i]);
		}
		System.out.println();
		System.out.println("----------------trin()-----------");
		String id2= "   guard     ";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		String name2= "��  ��  ��";
		System.out.println(name2.length());
		System.out.println(name2.trim().length());
		String spaceStr="              ";
		if (spaceStr.trim().equals("")) {
			System.out.println("spaceStr.trim().equals(\"\")");
		}
		if (spaceStr.trim().length()==0) {
			System.out.println("spaceStr.trim().length()==0");
		}
	

	
	}
	

}








