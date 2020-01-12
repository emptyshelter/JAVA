/*
 객체참조변수형변환
   1. 부모자식관계에있는 클래스 들에서만 가능하다.
   2. 자식객체참조변수를 부모클래스타입 참조변수로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체참조변수를 자식클래스타입 참조변수로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
public class ParentChildObjectTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("-------------Child---------------");
		Child c1=new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		/*
		 2. 자식객체참조변수를 부모클래스타입 참조변수로 형변환
	       - 자동으로 이루어진다(묵시적)
		       Child c = new Child();
		       Parent pppp = c; 
		 */
		Parent p1 = c1;
		p1.method1();
		p1.method2();
		p1.method3();
		
		/*
		p1.method4();
		p1.method5();  
		 */
		System.out.println("==============Parent-->Child==============");
		Parent p2 = new Parent();
		
		//Child c2 =p2;
		//Type mismatch: cannot convert from Parent to Child
		/*
		<<실행시에 예외발생>>
		Child c2 = (Child)p2;
		Exception in thread "main" java.lang.ClassCastException: Parent cannot be cast to Child
		*/
		//- 부모의 탈을쓴 자식객체 는 가능하다.
		
		Parent p3 = new Child();
		p3.method1();
		/*
		 * 재정의된 메소드는 Parent type으로도 자식의메소드 호출이 가능하다
		 */
		p3.method2();
		p3.method3();
		/*
		p3.method4();
		p3.method5();
		*/
		Child c3 = (Child)p3;
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
	}

}










