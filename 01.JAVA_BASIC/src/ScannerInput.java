import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.레벨을입력하세요: ");
		/*
		 * 실행흐름이 키보드로부터 입력대기
		 * 키보드로 입력후 enter key 치면 다음라인실행
		 */
		int level = scanner.nextInt();
		System.out.println("입력하신 레벨은 "+level+"입니다.");
		System.out.print("2.이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println("입력하신 이름은 "+name+"입니다.");

	}

}
