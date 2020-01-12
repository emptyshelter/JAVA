package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * java.lang package
		 *  Math 클래스
		 *    - 수학함수를 가지고있는 클래스
		 *    - 모든메쏘드가 정적메쏘드 객체생성없이사용가능
		 *    - 생성자의  접근제어자 private 
		 *      (외부에서 객체생성 불가능)
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
		System.out.println("1~10사이의 정수 랜덤하게 생성");
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*10+1));
		System.out.println((int)(Math.random()*10+1));
		System.out.println("로또 번호생성");
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
	}

}









