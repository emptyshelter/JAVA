import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.�������Է��ϼ���: ");
		/*
		 * �����帧�� Ű����κ��� �Է´��
		 * Ű����� �Է��� enter key ġ�� �������ν���
		 */
		int level = scanner.nextInt();
		System.out.println("�Է��Ͻ� ������ "+level+"�Դϴ�.");
		System.out.print("2.�̸��� �Է��ϼ���: ");
		String name = scanner.next();
		System.out.println("�Է��Ͻ� �̸��� "+name+"�Դϴ�.");

	}

}
