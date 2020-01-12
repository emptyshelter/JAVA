
public class OverridingChildMain {

	public static void main(String[] args) {
		OverridingChild oc1 =new OverridingChild();
		oc1.method1();
		/*
		 * 상속받은 method2()는 은폐되고 재정의한 메소드만 호출
		 */
		oc1.method2();
		oc1.method3();
		
	
	}

}
