
public class ClassNotFoundExceptionMain {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("stmt1");
		Class.forName("Fourth");
		System.out.println("stmt2");
		
	}

}
