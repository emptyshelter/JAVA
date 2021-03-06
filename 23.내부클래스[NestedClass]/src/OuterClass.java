
public class OuterClass {
	public InnerClass ic; //대부분의 Inner 클래스의
	public int outter_member_field;
	public void outter_member_method() {
		System.out.println("outer_member_method()");
	}
	/*
	 * 외부클래스에서 내부 클래스의 사용
	 */
	public void outter_inner_use() {
		/*
		 * InnerClass객체 생성
		 */
//		OuterClass.InnerClass ic = this.new InnerClass(); 생략이 가능 하다.
//		InnerClass ic = new InnerClass();
		this.ic = new InnerClass();
		
	}
	  
	/*******************Nested Class***********************/
	/*
	 * InnerClass의 사용이유 
	 * 	- 내부클래스(객체)에서 외부클래스(객체)의 멤버접근
	 * 	  쉽게 하기 위해
	 * 외부 클래스끼리 접근하기 위해서는 참조변수가 필요하지만 
	   내부에는 따로 그러한 작업이 필요하지 않아 
       외부에서 공통적으로 사용하는게 없다면 내부에 클래스를 생성하는게 편하다.
	 */
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method(){
			System.out.println("inner_member_method()");
		}
		
		public void inner_outter_access() {
//			OutterClass.this.outter_member_field=8989;
//			OutterClass.this.outter_member_method();
//			InnerClass에서의 this는 InnerClass를 의미한다.
			outter_member_field=8989;
			outter_member_method();
		}
	}
	/**********************************************/

}
