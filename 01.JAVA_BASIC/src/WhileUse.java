
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 1~10사이의 정수 출력
		 */
		int i = 0;
		while (i < 10) {
			int su = i + 1;
			System.out.println(su);
			i++;

		}
		System.out.println();

		/*
		 * 1~10사이의 정수중 홀수만 출력
		 */
		i = 0;
		while (i < 10) {
			int su = i + 1;
			if (su % 2 == 1) {
				System.out.print(su + ",");

			}
			i++;
		}
		System.out.println();

		/*
		 * 1~10정수중에서 4의 배수만 출력
		 */
		i = 0;
		while (i < 10) {
			int su = i + 1;
			if (su % 4 == 0) {
				System.out.print(su + ",");
			}
			i++;

		}
		System.out.println();
		/*
		 * 1~100사이의 정수중에서 3의배수이면서 4의 배수만 출력
		 */
		i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + ",");
			}
			i++;
		}
		System.out.println();
		/*
		 * 1~100사이의 정수의 합
		 */
		i = 1;
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		while (i<= 100) {			
			tot += i;
			if (i % 2 == 0) {
				evenTot += i;
			} else {
				oddTot += i;
			}
			i++;
		}
		System.out.println("1~100사이의 정수의 합: " + tot);
		System.out.println("1~100사이의 짝수의 합: " + evenTot);
		System.out.println("1~100사이의 홀수의 합: " + oddTot);
	    
		/*
		 * 문자출력
		 */
		char c1=0;
		while(c1< 655535) {
			System.out.print(c1);
			if ((c1+1)%100==0) {
				System.out.println();
			}
			c1++;
		}
		System.out.println();
		char c2='가';
		int count=0;
		while (c2<='힣') {
			System.out.print(c2);
			count++;
			if(count%10==0) {
				System.out.print("\n");											
			}
			c2++;
			
		}
		
	}
	
}

	

