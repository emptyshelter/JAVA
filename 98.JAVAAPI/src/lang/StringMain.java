package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 *  String 객체의 명시적생성
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		boolean isEqual = name1==name2;
		System.out.println(isEqual);
		System.out.println("name1 와 name2의 주소값이 동일하지않다:"+isEqual);
		/*
		 *  String 객체의 암시적생성
		 *  - "" 으로생성
		 */
		String str1="자바";
		String str2="자바";
		String str3=new String("자바");
		if(str1==str2) {
			System.out.println("str1과 str2의 주소가동일하다");
		}
		if(str1=="자바") {
			System.out.println("str1과 \"자바\"의 주소가동일하다");
		}
		if(str1!=str3) {
			System.out.println("str1과 str3의 주소가동일하지않다");
		}
		System.out.println("==========String객체의 문자열의 비교[equals]===========");
		
		/* public boolean equals(Object  anObject)
		 * 
		 * - 이 캐릭터 라인과 지정된 오브젝트를 비교합니다. 
		 * - 인수가 null 가 아니고, 이 오브젝트와 같은 문자 순서를 나타내는 
		 * 	 String 오브젝트인 경우에만,결과는 true 가 됩니다.
		 * - 문자열 비교로 재정의
		 * 	 Overrides:
		 * 		equals in class Object
		 */
		boolean b = str1.equals(str2);
		System.out.println("str1과 str2의 문자열이 동일하냐?" +b);
		if (str1.equals(str3)) {
			System.out.println("str1,str3의 문자열이 동일하다");
		}
		if (str1.equals("자바")) {
			System.out.println("str1,\"자바\"의 문자열이 동일하다");
		}
		if (str3.equals("자바")) {
			System.out.println("str1,\"자바\"의 문자열이 동일하다");
		}
		
		/*
		 * <<String>>
		 *  public String toString();
		 *  	-자신의 문자열을 반환하도록 재정의
		 */
		String str99= "문자여어얼~~~";
		String sr = str99.toString();
		System.out.println("toString:"+sr);
		System.out.println(str99);
		/*
		 * compareTo
		 * the value 0 if the argument string is equal to this string; 
		 * a value less than 0 if this string is lexicographically less than the string argument; 
		 * and a value greater than 0 if this string is lexicographically greater than the string argument.
		 */
		char c1= '홍';
		char c2= '김';
		if (c1 > c2) {
			System.out.println((int)c1+">"+(int)c2);
		}
		if (c1-c2>0) {
			System.out.println((int)c1-(int)c2+">0");
		}
		String irum1 ="콩경호";
		String irum2 ="강경호";
		if (irum1.compareTo(irum2)>0) {
			System.out.println("unicode차이:"+irum1+">"+irum2);
			
		}
		System.out.println("김경호".compareTo("장경호"));
		System.out.println("장경호".compareTo("김경호"));
		
		
		

	}

}
