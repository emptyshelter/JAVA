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
					System.out.println(idArray[i]+"��(��)���̵�� �������� �ʽ��ϴ�");
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
				System.out.println(idArray[i]+"��(��)���̵�� �������� �ʽ��ϴ�");
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
				System.out.println(idArray[i]+"�� ���̵�� �����մϴ�.");
			} else {
				System.out.println(idArray[i]+"��(��)���̵�� �������� �ʽ��ϴ�");
			}
		}
		System.out.println();
			
		/*
		 * Quiz : ���̵�� �������� �Ǵ��Ͻÿ�.
		 * 	- ���̰� 3~7���̿��� �Ѵ�.
		 * 	- ����, ���ڸ� ����
		 * 	- ù���ڴ� ���ڰ� �� �� ����.
		 *  - 
		 */
		
		System.out.println("-----------------Quiz : String---------------");
		
		for (String s: idArray) {
			if (s.length() < 3 || s.length() > 7 ) {
				System.out.println(s + " : ���̵��� ���̴� 3~7���� �Դϴ�.");
				break;
			}
			
			for (int j = 0; j<s.length(); j++) {
				char tmpChar = s.charAt(j);
				if(tmpChar>='a' && tmpChar<='z' || 
						tmpChar>='A' && tmpChar<='Z' || 
						tmpChar>='0' && tmpChar<='9') {
					if (j==0 && tmpChar>='0' && tmpChar<='9') {
						System.out.println(s + " : ù ���ڴ� ���ڰ� �� �� �����ϴ�.");
						break;
					}
				} else {
					System.out.println(s + " : ���̵�� ��ȿ���� ���� ����:" + tmpChar);
					break;
					
				}
			}
			
		}
			
			
			
		
		
	}
	

}
