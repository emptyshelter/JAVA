package wrapperclass;

public class WrapperClassOperationMain {

	public static void main(String[] args) {
		Integer wi1 = new Integer(89);
		Integer wi2 = new Integer(89);
		Integer wi3 = wi1;
		/*
		 * ref1 == ref2
		 * Wrapper �ּ� �񱳿���(==)
		 * 	-	������
		 * 	-	equals �޽����(�� �񱳷� ������)
		 */
		
//		if (wi1==wi2) {
//			System.out.println("wi1�� wi2�� �ּҰ� �ٸ���");
//		}
//		if (wi1==wi3) {
//			System.out.println("wi1�� wi3�� �ּҰ� ����");
//		}
		if (wi1.equals(wi2)) {
			System.out.println("wi1�� wi2�� ���� �����ϴ�");
		}
		if (wi1.equals(wi3)) {
			System.out.println("wi1�� wi3�� ���� �����ϴ�");
		}
		if (wi2.equals(wi3)) {
			System.out.println("wi2�� wi3�� ���� �����ϴ�");
		}
		if (wi2.equals(89)) {
			System.out.println("wi2�� 89�� ���� �����ϴ�");
		}
		System.out.println("-------Wrapper ��ü �⺻����-------");
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
