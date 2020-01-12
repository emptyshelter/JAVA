
public class ClassNotFoundExceptionCatchMain {

	public static void main(String[] args) {
		System.out.println("stmt1");
		try {
			
			System.out.println("try1");
			Class.forName("Fourth");
			System.out.println("try2");
			
		} catch (ClassNotFoundException e) {
			/*
			 * 예외발생시 쓰레드 실행블록
			 * 	- 예외의 메세지 출력
			 * 	- 예외복구코드 
			 * 	- 여러개도 넣을수 있다 상위 타입으로 기술시
			 */
			System.out.println("catch1");
			System.out.println("msg:"+e.getMessage());
			System.out.println("catch2");
		}
		System.out.println("stmt2");
		
		
		
	}

}
