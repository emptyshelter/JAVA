
public class SwitchUse {
	
	public static void main(String []args) {
		/*
		 * Ȧ��¦�� �Ǻ�
		 */
		int number =23;
		switch (number%2) {
		case 0:
			System.out.println("¦��");
			break;
		case 1:
			System.out.println("Ȧ��");
			break;
		}
		/*
		 * 4�� ��� �Ǻ�
		 */
		int number2 =41;
		switch (number2%4) {
		case 0:
			System.out.println(number2+" ��(��) 4�� ��� �Դϴ�.");
			break;

		default:
			System.out.println(number2+" ��(��) 4�� ��� ���ƴմϴ�.");
			break;
		}
		/*
		 * ���ں�
		 * A: Left
		 * D: Right
		 * W: Up
		 * Z: Down
		 * S: Rotate
		 */
		char direction='A';
		switch (direction) {
		case 'A': //Block�� ���� �Ҽ� ������ ���� �Ⱦ���.
			System.out.println("Left�� �̵�");
			break;
		case 'D':			
			System.out.println("Right�� �̵�");
			break;
		case 'W':			
			System.out.println("Up���� �̵�");
			break;
		case 'Z':			
			System.out.println("Down���� �̵�");
			break;
		case 'S':			
			System.out.println("Rotate �Ѵ�");
			break;

		default:
			break;
		}
		
	}

}
