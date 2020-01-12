
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 수를 입력 받아서 짝수 홀수 판별
		 */
		int inputNo =12;
		if(inputNo%2==0) {
			System.out.printf("%d 는 짝수 입니다.\n",inputNo);
			//%d 정수 %f 실수 %s 문자
		}else {
			System.out.printf("%d 는 홀수 입니다.\n",inputNo);			
		}
		/*
		 * 수를 받아서 4의 배수 판변
		 */
		if (inputNo%4==0) {
			System.out.printf("%d 는 4의 배수\n", inputNo);
			
		} else {
			System.out.printf("%d 는 4의 배수 아님\n", inputNo);
		}
		/*
		 * 공배수
		 */
		if(inputNo%3==0 && inputNo%4==0) {
			System.out.println(inputNo+" 는 3의 배수이면서 4의배수\n");
		}
		/*
		 * 정수의 유효성체크
		 */
		int kor = -89;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d 는 유효한 점수입니다\n", kor);			
		}else {
			System.out.printf("%d 는 유효한 점수가 아닙니다\n", kor);						
		}
		/*
		 * 윤년여부출력
		 */
		int year = 2019;
		if(true) {
			System.out.printf("%d는 윤년\n", year);
		}else {
			System.out.printf("%d는 평년\n", year);			
		}
		/*
		 * Quiz: 문자판단
		 * 	1. 한글여부
		 * 	2. 알파벳대문자, 소문자, 숫자
		 */
		char c='김';
		/*
		 * Quiz: 다음문자는 아이디의 첫글자입니다
		 * 		 이문자가 아이디의 첫글자로 유효한지 판단 후 출력하세요
		 * 		 - 아이디의 첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter='김';
		if(true) {
			System.out.println("아이디로 적합");
		}else {
			System.out.println("아이디로 부적합");
		}

	}

}
