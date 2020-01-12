
public class SwitchUse {
	
	public static void main(String []args) {
		/*
		 * 홀수짝수 판별
		 */
		int number =23;
		switch (number%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		/*
		 * 4의 배수 판별
		 */
		int number2 =41;
		switch (number2%4) {
		case 0:
			System.out.println(number2+" 은(는) 4의 배수 입니다.");
			break;

		default:
			System.out.println(number2+" 은(는) 4의 배수 가아닙니다.");
			break;
		}
		/*
		 * 문자비교
		 * A: Left
		 * D: Right
		 * W: Up
		 * Z: Down
		 * S: Rotate
		 */
		char direction='A';
		switch (direction) {
		case 'A': //Block을 설정 할수 있으나 보통 안쓴다.
			System.out.println("Left로 이동");
			break;
		case 'D':			
			System.out.println("Right로 이동");
			break;
		case 'W':			
			System.out.println("Up으로 이동");
			break;
		case 'Z':			
			System.out.println("Down으로 이동");
			break;
		case 'S':			
			System.out.println("Rotate 한다");
			break;

		default:
			break;
		}
		
	}

}
