
public class UserDefineDataTypeMain {

	public static void main(String[] args) {
		/*
		 * 기본형 타입 변수 선언
		 */
		int intType;
		/*
		 * 정수형리터럴대입
		 */
		intType = 3432;
		
		/*
		 * 객체(참조)타입 변수선언
		 */
		UserDefineDataType userType;
		/*
		 * 클래스를 사용해서 객체를 생성한후에
		 * 객체의 주소값대입
		 */
		userType = new UserDefineDataType();
		
		
		userType.member1 =1213;
		userType.member2 =12.13;
		userType.member3 ='김';
		userType.member4 ="문자열 근데 졸리당";
		 
		System.out.println(userType.member1);
		System.out.println(userType.member2);
		System.out.println(userType.member3);
		System.out.println(userType.member4);

	}

}
