
public class QuizAnswer {

	public static void main(String[] args) {
		/*
		 * 1. Quiz :윤년여부>
		 * 	- 4의배수
		 * 	- 100의배수가 아닌수
		 * 	- 400의 배수
		 */	
		
		int y = 2019;
		boolean isLeapYear = false;
		
		isLeapYear = ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);				
		if (isLeapYear) {
			System.out.println(y+"년은 윤년입니다.\n");
				
		}else {
			System.out.println(y+"년은 평년입니다./n");
			
		}
				/*
		 * 2. Quiz: 문자판단
		 * 	1. 한글여부
		 * 	2. 알파벳대문자, 소문자, 숫자
		 */	
		
		char kor ='김';
		if (kor>='가' &&kor <='힣') {
			System.out.println(kor+"은(는) 한글입니다.");
		} 
		if (kor>='A' &&kor <='Z') {
			System.out.println(kor+"은(는) 영어입니다.");
		}	
		if (kor>='0') {
			System.out.println(kor+"은(는) 숫자입니다.");
		}
		/*
		 * 3. Quiz: 다음문자는 아이디의 첫글자입니다
		 * 		 이문자가 아이디의 첫글자로 유효한지 판단 후 출력하세요
		 * 		 - 아이디의 첫글자는 알파벳대문자 이거나 소문자이다
		 */

	}

}
