/*
 * ����ȯ(TypeCasting)--> �����������Ͱ����� ����
	   - ���� :  (����ŸŸ��)���� or ���ͷ�;
	   - �ڵ�����ȯ(��������Ÿ-->ū����Ÿ) upcasting
	     	byte-->short-->int-->long-->float-->double
	   - �ڵ�����ȯ �ȵ�(ū����Ÿ-->��������Ÿ) demotion
	     	double--> float-->long-->int-->short-->byte	   
*/ //float�� ����� �����Ѵ� double���� ������ ����. 
//Refactor --> Rename ��ɾ�� class �̸��� �ϰ������� ������ �� �ִ�.(��, �����Ͽ����� ������) 
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
		 * �ڵ�����ȯ
		 */
		double dr = b;
		dr=s;
		dr=c;
		dr=i;
		dr=f;
		/*
		 * �ڵ��ຯȯ�ȵ�(�����Ͽ���)
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
		 * ������� ����ȯ
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
