package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1="Have a nice day!!!";
		String str2="오늘은 수요일 추상클래스를 공부할거여요.";
		int length1=str1.length();
		System.out.println(length1);
		System.out.println(str2.length());
		System.out.println("자바가 재미있네요".length());
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
				"오늘은 수요일 추상클래스를 공부할 거여요."
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
				System.out.print("아이디로 유효한문자"+tempChar);
			}else {
				System.out.println("아이디로 유효하지 않은 문자"+tempChar);
			}
			System.out.println();
		}
		/*
		 * Quiz: 아이디로 적합한지 판단하시오
		 * 	- 길이가 3~7사이여야 한다.
		 * 	- 영문(대소문자상관없이), 숫자이루어져 있어야한다.
		 * 	- 첫글자가 숫자여서는 안된다.		 * 
		 */
		System.out.println("---------Quiz--------------------");
		String[] idArray= {"guard","7up","test","dfdj","my id"};
		for (int i = 0; i < idArray.length; i++) {
				char checkId = idArray[i].charAt(i);
				if ((idArray[i].length()>=3 && idArray[i].length()<=7)||
						(checkId>='a' && checkId <='z')||
						(checkId>='A' && checkId <='Z')||
						(checkId>='0' && checkId <='9')){					 
					System.out.print("아이디로 유효한문자"+idArray[i]);
				}else {
					System.out.println("아이디로 유효하지 않은 문자"+idArray[i]);
				}System.out.println();
		}
			
		
		
		System.out.println("==========String.split===========");
		String cardNo="123-3466-8977";		
		String [] cardNoArray = cardNo.split("-");
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(cardNoArray[i]);
		}
		System.out.println("---------String.replace(char,char)--------------------");
		String str3="우리는 자바를 공부합니다. 자바는 객체지향언어입니다.";
		String result3 = str3.replace('자', '저');
		System.out.println(result3);
		String result4 = str3.replace("자바", "파이썬");
		System.out.println(result4);
		String result5 = str3.replaceFirst("자바", "파이썬");
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
		String copyFileName=fileNameNoExt+"-복사본."+fileExt;
		System.out.println(fileName);
		System.out.println(copyFileName);
		System.out.println("===============startWith, endWith================");
		String fileName2="yyy.gif";
		if (fileName2.endsWith(".gif")|| fileName2.endsWith(".jpg")) {
			System.out.println(fileName2+ " 는 이미지 파일입니다.[gif, jpg]");
		}
		String[] names=
			{"김민태","이민태","장민태","박민태","김태민"};
		
		int count=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				System.out.print(names[i]+" ");
				count++;
			}
		}
		System.out.println();
		
		String[] kimArray=new String[count];
		int index=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
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
		String name2= "김  민  태";
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








