
public class Operator {
	
	public static void main(String[]args) {
		int a = 1;
		int b = 2;
		char ca = 'A';
		char cz = 'Z';
		int result;
		/*
		 * �������
		 */
		result = a + b;
		System.out.println("a+b="+result);
		result = a - b;
		System.out.println("a-b="+result);
		result = a/b;
		System.out.println("a/b="+result);
		result = a*b;
		System.out.println("a*b="+result);
		/*
		 * %������ ������
		 */
		result = a%b;
		System.out.println("a%b="+result);
		
		int year = 2019;
		result = year%4;
		System.out.println("year%4="+result);
		result = year%100;
		System.out.println("year%100="+result);
		result = year%400;
		System.out.println("year%400="+result);
		System.out.println("=========���ڿ���==========");
		result = ca + 1;
		System.out.println("ca+1="+result);
		char cb = (char)result; //����, ����տ� type�� ������ �ش� type�� ���ŵȴ�.
		System.out.println("cb="+cb);
		result = cz-1;
		System.out.println("cz-1="+result);
		System.out.println("cz-1="+(char)result);
		
		int c = 1;
		/*
		 * 1--> 00000000|00000000|00000000|00000001
		 * 1--> 00000000|00000000|00000000|00000010
		 */
		result = c << 1;
		System.out.println("c << 1 =" +result);
		result = c << 2;
		System.out.println("c << 2 =" +result);
		
		int d = 128;
		/*
		 * 128--> 00000000|00000000|00000000|10000000
		 * 64-->  00000000|00000000|00000000|01000000 
		 * 32-->  00000000|00000000|00000000|00100000 
		 */
		result = d >> 1;
		System.out.println("d >> 1 ="+result);
		result = d >> 2;
		System.out.println("d >> 2 ="+result);
		/*
		 ����(��)����
		     - ����:  >,<,>=,<=,==,!=
		     - ���迬���� ������� ���� ����Ÿ�̴�(true,false)
		*/
		int e=10;
		int f=20;
		boolean bresult;
		bresult = e > f;
		System.out.println("10 > 20= "+bresult);
		bresult = e < f;
		System.out.println("10 < 20= "+bresult);
		bresult = e >= f;
		System.out.println("10 >= 20= "+bresult);
		bresult = e <= f;
		System.out.println("10 <= 20= "+bresult);
		bresult = e == f;
		System.out.println("10 == 20= "+bresult);
		bresult = e != f;
		System.out.println("10 != 20= "+bresult);
		
		char munja1 = '��';
		char munja2 = '�R';
		char munja3 = 'A';
		char munja4 = 'B';
		bresult = munja1 > munja2;
		System.out.println("'��' < '�R'= "+bresult);
		System.out.println("�� unicode -->" + (int)munja1);
		System.out.println("�R unicode -->" + (int)munja2);
		System.out.println("�ѱ��ѱ��ڼ�: "+(munja2-munja1+1));
		bresult = munja3 > munja4;
		System.out.println("'A' > 'B' --> "+bresult);
		/*
		��������
		   - ����:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - �¿��������� ��������Ÿ�̴�.
           - ����� ��������Ÿ�̴�.
		    ex> true || false, false && false

		*/
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = true;
		boolean result3 ;
		/*
		 * Logical OR(����)||
		 */
		result3 = b1 || b2;
		System.out.println("false || false -->"+result3);
		/*
		 * Logical AND(����) ||
		 */
		result3 =b3 && b4;
		System.out.println("true && true -->"+result3);
		System.out.println("==========||,&&=========");
		
		int kor=90;
		int math=78;
		
		boolean isPass = kor >=90 || math >=90;
		System.out.println("�հݿ���(||)"+isPass);
		isPass = kor >=90 && math>=90;
		System.out.println("�հݿ���(||)"+isPass);
		
		boolean isVaild;
		int eng = -45;
		
		isVaild = eng >= 0 && eng <= 100;
		System.out.println("isVaild:"+isVaild);
		
		/*
		 * Quiz :���⿩��>
		 * 	- 4�ǹ��
		 * 	- 100�ǹ���� �ƴѼ�
		 * 	- 400�� ���
		 */	
		int y = 2019;
		
		boolean isLeapYear = false;
		
		System.out.println(y+" �� ���⿩��:"+isLeapYear);

	}
}
