
public class ClassNotFoundExceptionCatchMain {

	public static void main(String[] args) {
		System.out.println("stmt1");
		try {
			
			System.out.println("try1");
			Class.forName("Fourth");
			System.out.println("try2");
			
		} catch (ClassNotFoundException e) {
			/*
			 * ���ܹ߻��� ������ ������
			 * 	- ������ �޼��� ���
			 * 	- ���ܺ����ڵ� 
			 * 	- �������� ������ �ִ� ���� Ÿ������ �����
			 */
			System.out.println("catch1");
			System.out.println("msg:"+e.getMessage());
			System.out.println("catch2");
		}
		System.out.println("stmt2");
		
		
		
	}

}
