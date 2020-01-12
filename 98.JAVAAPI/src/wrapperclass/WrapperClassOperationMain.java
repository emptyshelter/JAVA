package wrapperclass;

public class WrapperClassOperationMain {

	public static void main(String[] args) {
		Integer wi1 = new Integer(89);
		Integer wi2 = new Integer(89);
		Integer wi3 = wi1;
		/*
		 * ref1 == ref2
		 * Wrapper 주소 비교연산(==)
		 * 	-	사용금지
		 * 	-	equals 메쏘드사용(값 비교로 재정의)
		 */
		
//		if (wi1==wi2) {
//			System.out.println("wi1과 wi2의 주소가 다르다");
//		}
//		if (wi1==wi3) {
//			System.out.println("wi1과 wi3의 주소가 같다");
//		}
		if (wi1.equals(wi2)) {
			System.out.println("wi1과 wi2의 값이 동일하다");
		}
		if (wi1.equals(wi3)) {
			System.out.println("wi1과 wi3의 값이 동일하다");
		}
		if (wi2.equals(wi3)) {
			System.out.println("wi2과 wi3의 값이 동일하다");
		}
		if (wi2.equals(89)) {
			System.out.println("wi2과 89의 값이 동일하다");
		}
		System.out.println("-------Wrapper 객체 기본형비교-------");
		if (wi1==89) {
			System.out.println("wi1.intValue()==89");
		}
		if (wi1>56) {
			System.out.println("wi.intValue() > 56");
		}
		if (wi1>=wi2) {
			System.out.println("wi1.intValue() >= wi2.intValue()");
		}
		int result = wi1-7;
		System.out.println(result);
		result = wi1 - wi2;
		System.out.println(result);
		result= wi1/wi2;
		System.out.println(result);
		result= wi1*wi2;
		System.out.println(result);
		
		
	}

}
