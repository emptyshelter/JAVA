package wrapperclass;

import javax.print.DocFlavor.CHAR_ARRAY;

public class WrapperClass유용한메소드 {

	public static void main(String[] args) {
		int y=2147483647;
		String ystr = Integer.toString(y);
		System.out.println("int-->String:"+ystr);
		String ystr2 = y+"";
		System.out.println("int-->String:"+ystr2);
		String ystr3 = Integer.toBinaryString(y);
		System.out.println("int-->String:"+ystr3);
		
		System.out.println("String--> 기본형");
		int i = Integer.parseInt("565656");
		System.out.println(i);
		double d = Double.parseDouble("3.14159");
		System.out.println(d);
		boolean b = Boolean.parseBoolean("tdsfsd");
		System.out.println(b);
		/*
		 * + 연산자 오버로딩
		 * 		- 항이 문자열일 경우 concat
		 */
		int number = 454534;
		String numStr = number+"";
		String numStr2 =1+2+3+4+5+"문자열";
		String numStr3 =""+1+2+3+4+5+"문자열";
		System.out.println("1+2+3+4+5+\"문자열\"="+numStr2);
		System.out.println("\"\"+1+2+3+4+5+\"문자열\"="+numStr3);
		double dNumber = 3.14159;
		String numStr4 = dNumber+"";
		System.out.println(numStr4);
		for (int j = 0; j < numStr4.length(); j++) {
			char tc = numStr4.charAt(j);
			System.out.print(tc+" ");
		}
		System.out.println();
		System.out.println("-----------Character----------");
		Character wc = new Character('김');
		char c = wc.charValue();
		Character wc1 = '김';
		char c1 = wc1.charValue();
		char c2 = wc1;
		System.out.println(wc1);
		System.out.println("------------String-->char,char[]----------");
		char fc = "김민태".charAt(0);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(fc);
		char [] ca = "오늘은 크리스마스이브".toCharArray();
		System.out.println("ca:"+ca);
		String str = "오늘은 크리스마스이브";
		char[] dst= new char[str.length()] ; 
		str.getChars(0, str.length(), dst, 0);
		System.out.println("dst:"+dst.length);
		for (int j = 0; j < dst.length; j++) {
			System.out.print(dst[j]+",");
		}
		System.out.println();
		System.out.println("------------char,char[]-->String----------");
		char c90='김';
		String s90= String.valueOf(c90);
		String s91= c90+ "";
		char [] c92 = {'김','민','태'};
		String s92 = String.valueOf(c92);
		System.out.println(c92);
		String s93 = new String(c92);
		
		String strs = "Hello Java!!@@##!!&!()1234 김민태";
		
		for (int j = 0; j < strs.length(); j++) {
			char tc= strs.charAt(j);
			int type = Character.getType(tc);
			System.out.println("type: "+type);
			if (type==Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER: "+tc);
			}
			if (type==Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER: "+tc);
			}
			if (type==Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER: "+tc);
			}
			if (type==Character.SPACE_SEPARATOR) {
				System.out.println("SPACE_SEPARATOR: "+tc);
			}
			if (Character.isSpaceChar(tc)) {
				System.out.println("Character.isSpaceChar: "+ tc);
			}
			if (Character.isAlphabetic(tc)) {
				System.out.println("Character.isAlphabetic(tc): "+ tc);
			}
			
		}
	}

}
