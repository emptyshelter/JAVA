
public class UserDefineDataTypeMain {

	public static void main(String[] args) {
		/*
		 * �⺻�� Ÿ�� ���� ����
		 */
		int intType;
		/*
		 * ���������ͷ�����
		 */
		intType = 3432;
		
		/*
		 * ��ü(����)Ÿ�� ��������
		 */
		UserDefineDataType userType;
		/*
		 * Ŭ������ ����ؼ� ��ü�� �������Ŀ�
		 * ��ü�� �ּҰ�����
		 */
		userType = new UserDefineDataType();
		
		
		userType.member1 =1213;
		userType.member2 =12.13;
		userType.member3 ='��';
		userType.member4 ="���ڿ� �ٵ� ������";
		 
		System.out.println(userType.member1);
		System.out.println(userType.member2);
		System.out.println(userType.member3);
		System.out.println(userType.member4);

	}

}
