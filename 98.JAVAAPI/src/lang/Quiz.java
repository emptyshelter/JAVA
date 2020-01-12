package lang;

public class Quiz {
	public static void main(String[] args) {
		System.out.println("---------Quiz--------------------");
		String[] idArray = { "guard", "7up", "test", "dfdj", "my id","12345678910", };
		for (int i = 0; i < idArray.length; i++) {
			if ((idArray[i].length()>=3 && idArray[i].length() <=7)) {
			}
			char checkId = idArray[i].charAt(i);
			for (int j = 0; j < idArray.length; j++) {
				if ((checkId >= 'a' && checkId <= 'z')|| 
					(checkId >= 'A' && checkId <= 'Z')|| 
					(checkId >= '0' && checkId <= '9')||
					(j==0 && checkId>='0' && checkId<='9')){
				}else {
					System.out.println(idArray[i]+"은(는)아이디로 적합하지 않습니다");
				}
			}
		}
		
		for (int i = 0; i < idArray.length; i++) {
			char checkId = idArray[i].charAt(i);
			if ((checkId >= 'a' && checkId <= 'z')|| 
				(checkId >= 'A' && checkId <= 'Z')|| 
				(checkId >= '0' && checkId <= '9')&&
				(idArray[i].length()>= 3 && idArray[i].length()<= 7)) {
			} else {
				System.out.println(idArray[i]+"은(는)아이디로 적합하지 않습니다");
			}
		}
		System.out.println();
		
		for (int i = 0; i < idArray.length; i++) {
			char checkId = idArray[i].charAt(i);
			if ((idArray[i].length()>= 3 && idArray[i].length()<= 7)&&
				((checkId >= 'a' && checkId <= 'z')|| 
				(checkId >= 'A' && checkId <= 'Z')|| 
				(checkId >= '0' && checkId <= '9')))
				{
				System.out.println(idArray[i]+"는 아이디로 적합합니다.");
			} else {
				System.out.println(idArray[i]+"은(는)아이디로 적합하지 않습니다");
			}
		}
		System.out.println();
			
		/*
		 * Quiz : 아이디로 적합한지 판단하시요.
		 * 	- 길이가 3~7사이여야 한다.
		 * 	- 영문, 숫자만 가능
		 * 	- 첫문자는 숫자가 올 수 없다.
		 *  - 
		 */
		
		System.out.println("-----------------Quiz : String---------------");
		
		for (String s: idArray) {
			if (s.length() < 3 || s.length() > 7 ) {
				System.out.println(s + " : 아이디의 길이는 3~7사이 입니다.");
				break;
			}
			
			for (int j = 0; j<s.length(); j++) {
				char tmpChar = s.charAt(j);
				if(tmpChar>='a' && tmpChar<='z' || 
						tmpChar>='A' && tmpChar<='Z' || 
						tmpChar>='0' && tmpChar<='9') {
					if (j==0 && tmpChar>='0' && tmpChar<='9') {
						System.out.println(s + " : 첫 글자는 숫자가 올 수 없습니다.");
						break;
					}
				} else {
					System.out.println(s + " : 아이디로 유효하지 않은 문자:" + tmpChar);
					break;
					
				}
			}
			
		}
			
			
			
		
		
	}
	

}
