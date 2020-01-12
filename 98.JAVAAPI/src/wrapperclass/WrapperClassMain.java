package wrapperclass;
/*
- Wrapper Ŭ����

	�ڹٵ���Ÿ���� �⺻����Ÿ���� ���۷��� ����Ÿ ������ ���е˴ϴ�.
	�⺻����Ÿ�����δ� int,boolean,double ���� �����˴ϴ�.
	�̷��⺻ ����Ÿ���� ��ü�� ����Ҽ��ִ� ������� 
	Wrapper Ŭ������ �����˴ϴ�.
	Wrapper Ŭ������ ���������� ��ɵ��� �޼���� �����������ִٴ�
	�������ֽ��ϴ�.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		/*
		 * Wrapper class����
		 */
		//Boxing
		Integer wi1=null;
		wi1=new Integer(89);
		Integer wi2=new Integer("89");
		//UnBoxing
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		System.out.println("i1:"+i1);
		System.out.println("i1:"+i2);
		//Boxing
		Double wd1=new Double(3.14159);
		Double wd2=new Double("3.14159");
		//UnBoxing
		System.out.println(wd1.doubleValue());
		System.out.println(wd2.doubleValue());
		//Boxing
		Boolean wb1=new Boolean(true);
		Boolean wb2=new Boolean("false");
		//UnBoxing
		System.out.println(wb1.booleanValue());
		System.out.println(wb2.booleanValue());
		
		/*
		 * auto boxing(wrapping) 
		 */
		Integer wi3 = 89;
		Integer wi4 = 89;
		Boolean wb3=true;
		Boolean wb4=false;
		Double wd3=3.14159;
		Double wd4=3.14159;
		/*
		 * auto unboxing
		 */
		int i11 = wi1;//intValue();�� �ڵ����� ȣ��
		int i22 = wi2;
		double d11 = wd1;
		double d22= wd2;
		boolean b11 = wb1;
		boolean b22 = wb2;
		
		System.out.println("*************AUTO BOXING**************");
		Integer ia = 89;
		Integer ib = 45;
		Integer ic = 78;
		Integer id = 99;
		System.out.println("*************UPCASTING**************");
		Object oa = ia ;
		Object ob = ib ;
		Object oc = ic ;
		Object od = id ;
		System.out.println("*******AUTO BOXING --> UPCASTING*******");
		Object ooa=89;		
		Object oob=45;		
		Object ooc=78;		
		Object ood=99;		

		Object [] scoreArray= new Object[10];
		scoreArray[0]=89;
		scoreArray[1]=43;
		scoreArray[2]=33;
		scoreArray[3]=53;
		scoreArray[4]=11;
		scoreArray[5]=20;
		scoreArray[6]=77;
		scoreArray[7]=66;
		scoreArray[8]=44;
		scoreArray[9]=99;
		
		for (int i = 0; i < scoreArray.length; i++) {
//			Integer wi = (Integer)scoreArray[i];
//			int tempScore = wi.intValue();
//			System.out.println(tempScore+" ");
			int tempScore = (Integer)scoreArray[i];
			System.out.println(tempScore);
		}
		System.out.println();
		
		
		
	}

}











