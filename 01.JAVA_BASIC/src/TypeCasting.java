/*
 * 형변환(TypeCasting)--> 숫자형데이터간에만 가능
	   - 형식 :  (데이타타입)변수 or 리터럴;
	   - 자동형변환(작은데이타-->큰데이타) upcasting
	     	byte-->short-->int-->long-->float-->double
	   - 자동형변환 안됨(큰데이타-->작은데이타) demotion
	     	double--> float-->long-->int-->short-->byte	   
*/ //float의 사용은 지양한다 double보다 오류가 많다. 
//Refactor --> Rename 명령어로 class 이름을 일괄적으로 변경할 수 있다.(단, 컴파일오류가 없을시) 
public class TypeCasting {

	public static void main(String[] args) {
		
		byte b = (byte)123;
		short s = 32767;
		char c = 'A';
		int i = 2147483647;
		long l = 2147483647L;
		float f = 3.14F;
		double d = 3.14;
		/*
		 * 자동형변환
		 */
		double dr = b;
		dr=s;
		dr=c;
		dr=i;
		dr=f;
		/*
		 * 자동행변환안됨(컴파일에러)
		 */
		/*
		int iresult = 0;
		iresult =(int)l;
		iresult =(int)f;
		iresult =(int)d;
		*/
		double davg = 85.665;
		System.out.println(davg);
		int iavg = (int)davg;
		System.out.println(iavg);
		/*
		 * 연산시의 형변환
		 */
		double iresult2 = 23+ 45 + 0.1;
		
		int tot = 67 + 89 + 91;
		System.out.println("tot: "+tot);
		double avg =tot/3.0;
		System.out.println("avg1: "+avg);
		int tavg=(int)(avg*10);				
		System.out.println("avg2: "+tavg);
		avg = tavg/10.0;
		System.out.println("avg3: "+avg);
		
	
			
		

	}

}
