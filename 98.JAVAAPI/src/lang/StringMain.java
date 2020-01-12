package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 *  String ��ü�� ���������
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		boolean isEqual = name1==name2;
		System.out.println(isEqual);
		System.out.println("name1 �� name2�� �ּҰ��� ���������ʴ�:"+isEqual);
		/*
		 *  String ��ü�� �Ͻ�������
		 *  - "" ���λ���
		 */
		String str1="�ڹ�";
		String str2="�ڹ�";
		String str3=new String("�ڹ�");
		if(str1==str2) {
			System.out.println("str1�� str2�� �ּҰ������ϴ�");
		}
		if(str1=="�ڹ�") {
			System.out.println("str1�� \"�ڹ�\"�� �ּҰ������ϴ�");
		}
		if(str1!=str3) {
			System.out.println("str1�� str3�� �ּҰ����������ʴ�");
		}
		System.out.println("==========String��ü�� ���ڿ��� ��[equals]===========");
		
		/* public boolean equals(Object  anObject)
		 * 
		 * - �� ĳ���� ���ΰ� ������ ������Ʈ�� ���մϴ�. 
		 * - �μ��� null �� �ƴϰ�, �� ������Ʈ�� ���� ���� ������ ��Ÿ���� 
		 * 	 String ������Ʈ�� ��쿡��,����� true �� �˴ϴ�.
		 * - ���ڿ� �񱳷� ������
		 * 	 Overrides:
		 * 		equals in class Object
		 */
		boolean b = str1.equals(str2);
		System.out.println("str1�� str2�� ���ڿ��� �����ϳ�?" +b);
		if (str1.equals(str3)) {
			System.out.println("str1,str3�� ���ڿ��� �����ϴ�");
		}
		if (str1.equals("�ڹ�")) {
			System.out.println("str1,\"�ڹ�\"�� ���ڿ��� �����ϴ�");
		}
		if (str3.equals("�ڹ�")) {
			System.out.println("str1,\"�ڹ�\"�� ���ڿ��� �����ϴ�");
		}
		
		/*
		 * <<String>>
		 *  public String toString();
		 *  	-�ڽ��� ���ڿ��� ��ȯ�ϵ��� ������
		 */
		String str99= "���ڿ����~~~";
		String sr = str99.toString();
		System.out.println("toString:"+sr);
		System.out.println(str99);
		/*
		 * compareTo
		 * the value 0 if the argument string is equal to this string; 
		 * a value less than 0 if this string is lexicographically less than the string argument; 
		 * and a value greater than 0 if this string is lexicographically greater than the string argument.
		 */
		char c1= 'ȫ';
		char c2= '��';
		if (c1 > c2) {
			System.out.println((int)c1+">"+(int)c2);
		}
		if (c1-c2>0) {
			System.out.println((int)c1-(int)c2+">0");
		}
		String irum1 ="���ȣ";
		String irum2 ="����ȣ";
		if (irum1.compareTo(irum2)>0) {
			System.out.println("unicode����:"+irum1+">"+irum2);
			
		}
		System.out.println("���ȣ".compareTo("���ȣ"));
		System.out.println("���ȣ".compareTo("���ȣ"));
		
		
		

	}

}
