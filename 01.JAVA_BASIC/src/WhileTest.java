
/*
반복문
     stmt1;
     while(조건문){
		 //조건문--> 논리형변수(데이타),논리형 데이타를 반환하는 연산 
		stmt2;
	 }
	 stmt3;
     
	 흐름  stmt1 -->조건식의 데이타가 true인동안실행--> stmt3

*/

public class WhileTest {

	public static void main(String[] args) {
		System.out.println("stmt1");
		System.out.println("1.================논리형 리터럴=================");
		int k=0;
		while (true) {
			System.out.println("stmt2:k= "+k);
			k++;
			if(k>=10) {
				//반복문을 빠져나감				
				break;
			}
		}
		
		System.out.println("2.=================논리형 변수==================");
		boolean condition=true;
		int i=0;//While 외부에 선언 반복 변수
		while (condition) {
			System.out.println("stmt3:i= "+i);
			i++;
			if(i==10) {
				condition=false;
			}
		}
		System.out.println("3.==============비교연산(조건식)================");
		int j =0;
		while (j < 10) {
			System.out.println("stmt4:j= "+j);
			j++;			
		}
		
		System.out.println("stmt99");
		

	}

}
