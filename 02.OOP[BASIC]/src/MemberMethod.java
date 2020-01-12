/*
 * class 선언
 *  - 형식
 *       접근제한자  class  클래스이름{
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  -구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(인자){
 *           -인자: 나를 호출한놈(객체, 클래스)이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */

public class MemberMethod {
	int member1;
	void method1() {
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		System.out.println("method1()");
		return;
	}	
	void method2(int count) {		
		for (int i = 0; i < count; i++) {
			System.out.println("method2()");
			}
	}
	void method3(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("method3("+msg+")");			
		}
	}
	void method4(String name,String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name+"님"+msg);
			
		}
	}
	void method5() {
		System.out.println("method5()");
	}

}
