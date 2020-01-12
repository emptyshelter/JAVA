
public class MemberMethod2 {
	/*
	 * 멤버필드 (변수)	  
	 */
	
	int member1;
	int member2;
	
	void method1() {
	/*
	 * 로컬변수(local)
	 * 	- 메쏘드 블록 안에서만 유효한 변수	
	 */
		int i=800;
		int j=900;
		System.out.println("local변수 i= "+j);
		System.out.println("local변수 j= "+i);
		return;
	}
	
	void method2() {
		/*
		 * member1 ,member2 멤버변수에 값을 대입 
		 * this
		 * 	-self 참조변수
		 * 	-method2를 가지고있는 객체의 주소값
		 */
		this.member1= 8888;
		this.member2= 9999;
	}
	void method3(int member1, int member2) {
		this.member1=member2;
		this.member2=member1;
	}
	public void print() {
		System.out.println("========print-->this  주소값("+this+")=========");
		System.out.println("member1="+this.member1);		
		System.out.println("member2="+this.member2);		
		System.out.println("=====================================");
				
	}
}
	