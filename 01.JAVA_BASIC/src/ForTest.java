/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
*/
public class ForTest {

	public static void main(String[] args) {
		System.out.println("============while i증가=============");
		int k =0;
		while (k<10) {
			System.out.println("k="+k);
			k++;
		}
		System.out.println("============for i증가=============");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}
		System.out.println("============for i감소=============");
		for (int i = 10; i > 0; i--) {
			System.out.println("i="+i);
		}
		System.out.println("============홀수출력[1~10]=============");
		for (int i = 0; i <= 10; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}					
		}
		System.out.println("============홀수출력[1~10]cotinue=============");
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				continue;
				/*
				 * continue문 이후의 코드를 실행하지 않고 다음 반복을 실행
				 */
			}
			System.out.println(i+" ");
		}	
		System.out.println();
		System.out.println("============짝수출력[1~10]=============");
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}			
		}
		System.out.println();
		System.out.println("============3,4의 최소공배수[break]=============");
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");				
				/*
				 * 반복문을 빠져나옴
				 */
				break;
			}	
		}
		System.out.println();
		System.out.println("홀수 짝수 합[1~100]");
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		for (int i = 0; i <= 100; i++) {
			if (i%2==0) {
				evenTot+=i;
			} else {
				oddTot+=i;
			}
			tot+=i;
		}
		System.out.println("전체합:"+tot);
		System.out.println("홀수합:"+oddTot);
		System.out.println("짝수합:"+evenTot);
		System.out.println("============문자출력============");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c=='z') continue;
			System.out.print(",");										
		}
		System.out.println();
		System.out.println("============문자출력[continue]===========");
		for (int c = 'a', count=0; c <= 'z'; c++) 
			// 다중 변수선언은 같은 타입일경우 가능하다.		
		{
			System.out.print((char)c);			
			if (c=='z')
				continue;
			System.out.print(",");
			count++;
			if(count%4==0)
				System.out.println();
			
			
		}

	}

}
