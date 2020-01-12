/*
 * static 제한자(제어자,modifier)
 *   1.멤버변수나,메쏘드 앞에 붙일수있다
 * 	 2.static 제한자가 붙어있는 변수나메쏘드는
 *     객체생성 없이도 사용이가능하다.
 *   3.클래스가 가지고있는 변수나메쏘드이다.
 *     -->클래스변수,클래스메쏘드라고도한다.
 *   4.클래스로부터 생성되는 객체들이 공유하는
 *     변수(메쏘드)이다.      
 *     -->공용변수(메쏘드)라고도한다.
 *     
 *  -형식: 
 *  	멤버변수: public static int i;
 * 		멤버메쏘드:public static void print(){}
 * 
 */


public class Static {
	public int instance_memeber_field=100;
	public static int static_member_field=200;
	
	public void instance_method() {
		System.out.println("난 인스턴스(객체) 메소드(this 사용 가능)");
	}
	public static void static_method() {
		System.out.println("난 정적(static)메소드(this 사용 불가능)");
		//System.out.println("난 정적(static)메소드"+this);
		// - Cannot use this in a static context
	}

}
