/*
 * 단항연산자
 */
public class UnaryOperator {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		a = -a;
		b = +b;
		System.out.println(a);
		System.out.println(b);
		boolean isPlay = false;
		System.out.println(isPlay);
		isPlay = !isPlay;
		System.out.println(isPlay);
		/*
		 * 증가감소연산자
		 * ++,--
		 */
		int i=5;
		int j=5;
		//i = i+1;
		i++;
		j++;
		System.out.println("======================");
		System.out.println("i++ --> "+i);
		System.out.println("j++ --> "+j);
		i=5;
		j=5;
		++i;
		++j;
		System.out.println("++i --> "+i);
		System.out.println("++j --> "+j);
		
		i=5;
		j=5;
		// i = i-1;
		i--;
		j--;
		System.out.println("i-- --> "+i);
		System.out.println("j-- --> "+j);
		System.out.println("======================");
		i=5;
		j=5;
		int ir;
		int jr;
		ir= ++i;
		jr= j++;
		System.out.println("++ir --> "+ir);
		System.out.println("jr++ --> "+jr);
		
		System.out.println("++i --> "+i);
		System.out.println("j++ --> "+j);
		
		/*
		 *  2==> 00000000||00000000||00000000||00000010
		 * -2==> 11111111||11111111||11111111||11111101
		 */
		int bi = 2;
		System.out.println(bi);
		System.out.println(Integer.toBinaryString(bi));
		int bir = ~bi;
		System.out.println(bir);
		System.out.println(Integer.toBinaryString(bir));
		int bir2= bir+1;
		System.out.println(bir2);
		System.out.println(Integer.toBinaryString(bir2));
		
		

	}

}
