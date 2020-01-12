package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * java.lang package
		 *  Math Ŭ����
		 *    - �����Լ��� �������ִ� Ŭ����
		 *    - ���޽�尡 �����޽�� ��ü�������̻�밡��
		 *    - ��������  ���������� private 
		 *      (�ܺο��� ��ü���� �Ұ���)
		 */
		//The constructor Math() is not visible
		//Math m=new Math();

		int r = Math.abs(-2323);
		System.out.println(r);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.max(34,78));
		System.out.println(Math.min(36546,544));
		System.out.println(Math.round(33.5555));
		System.out.println(Math.round(45.5678*10)/10.0);
		System.out.println(Math.pow(2,10));
		
		/*
		 * public static double random()
			- Returns a double value with a positive sign,
				 greater than or equal to 0.0 and less than 1.0. 
		 */
		double dResult = Math.random();
		System.out.println(dResult);
		System.out.println("1~10������ ���� �����ϰ� ����");
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*10+1));
		System.out.println("�ζ� ��ȣ����");
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
	}

}









