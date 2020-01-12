
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형(1byte)
		 * -논리형 변수
		 * -논리형 리터럴(true,false)		 
		 */
		boolean bool1,bool2,bool3;
		bool1=true;
		bool2=false;
		/*
		 * Type mismatch : cannot convert from int to boolean
		 * bool3=123;
		 */
		
		/*
		 * 문자한개형(2byte)
		 * 	-문자형태의 리터럴('A','가')
		 */
		char munja1, munja2, munja3, munja4,munja5,munja6;
		int munja33,munja22;
		munja1= 'A';
		munja2='가';
		munja22=munja2;	
		munja3= 65;
		munja33=65;		
		munja4=44032;
		munja5='\u0041';
		munja6='\uAC00';
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja22);
		System.out.println(munja3);
		System.out.println(munja33);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		/*
		 * 숫자
		 * 	1. 정수형
		 * 		-정수형리터럴(1,2,56,67)
		 * 	2. 실수형
		 * 		-실수형리터럴(0.1, 3.14159, .12, 3E3, 0.01E3)
		 */
		byte b1,b2,b3,b4;
		b1=0;
		b2=-128;
		b3=127;
		/*
		 * Type mismatch : cannot convert from int to byte
		 * b4=200;
		 */
		int bi=0;
		/*
		 * Type mismatch : cannot convert from int to byte
		b4 = bi;
		*/
		short s1, s2, s3, s4;
		s1 = -32768;
		s2 = 32767;		
		//s3 = 32768;		
		int si = 32767;
		//s4=si;
		
		int i1, i2, i3, i4;
		i1 = -2147483648;
		i2 = 2147483647;
		System.out.println(Integer.toBinaryString(i2));
		/*
		 * The literal 2147483648 of type int is out of range 
		 * i3 =2147483648;
		 */
		
		long l1,l2,l3,l4;
		l1= -2147483649l;
		l2= 2147483648L;
		System.out.println(Long .toBinaryString(l2));
		
		float f1,f2; //4byte
		
		
		double d1, d2, d3, d4; //8byte
		d1 = 1.14159;
		d2 = 3e6;
		d3 = 3e-6;
		d4 = .12345;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println("=========정밀도==========");
		double dd = 0.123456789123546789;
		float ff = 0.123456789123456879F;
		System.out.println(dd);		
		System.out.println(ff);		
		
		String str1="오늘은";
		String str2="목요일";
		String str3="변수를 공부합니다.";
		
		int month = 12;
		int day = 5;
		String str4 = str1 + str2 + str3;
		String str5 = str1+ month +"월"+ day+"일입니다.";
		System.out.println(str4);
		System.out.println(str5);
		
				
				
				
	}	

}
