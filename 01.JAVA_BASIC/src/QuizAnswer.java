
public class QuizAnswer {

	public static void main(String[] args) {
		/*
		 * 1. Quiz :���⿩��>
		 * 	- 4�ǹ��
		 * 	- 100�ǹ���� �ƴѼ�
		 * 	- 400�� ���
		 */	
		
		int y = 2019;
		boolean isLeapYear = false;
		
		isLeapYear = ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);				
		if (isLeapYear) {
			System.out.println(y+"���� �����Դϴ�.\n");
				
		}else {
			System.out.println(y+"���� ����Դϴ�./n");
			
		}
				/*
		 * 2. Quiz: �����Ǵ�
		 * 	1. �ѱۿ���
		 * 	2. ���ĺ��빮��, �ҹ���, ����
		 */	
		
		char kor ='��';
		if (kor>='��' &&kor <='�R') {
			System.out.println(kor+"��(��) �ѱ��Դϴ�.");
		} 
		if (kor>='A' &&kor <='Z') {
			System.out.println(kor+"��(��) �����Դϴ�.");
		}	
		if (kor>='0') {
			System.out.println(kor+"��(��) �����Դϴ�.");
		}
		/*
		 * 3. Quiz: �������ڴ� ���̵��� ù�����Դϴ�
		 * 		 �̹��ڰ� ���̵��� ù���ڷ� ��ȿ���� �Ǵ� �� ����ϼ���
		 * 		 - ���̵��� ù���ڴ� ���ĺ��빮�� �̰ų� �ҹ����̴�
		 */

	}

}
