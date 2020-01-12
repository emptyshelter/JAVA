/*
 1. RuntimeException    :throw�������� �� �ڵ�ó��
	   		    ==>���α׷����� �Ǽ������� Exception 
	   		    ex> NullPointerException,ArrayIndexOutOfBoundsException
 */
public class RuntimeExceptionMain {
	/*
	 * ��� �޼ҵ忡�� throws RuntimeException ������ �����Ǿ��ִ�.
	 */

	public static void main(String[] args)/*throws RuntimeException*/ {
		/*
		 * NullPointException
		 */
		System.out.println("1.-----------------");
		String str =null;
		System.out.println("2.-----------------");
		if (str!= null) {
			int length = str.length();
			System.out.println("str.length():"+length);
		}
		System.out.println("3.-----------------");
		/*
		 * ArithmathicException
		 */
		int a=9;
		int b=0;
		if (b!=0) {
			int r=a/b;
			System.out.println("r: "+r);
		}
		System.out.println("4.-----------------");
		/*
		 * IndexOutOfBoundsException
		 */
		int[] ia = new int[2];
//		ia [2] =90;
		ia[ia.length-1]=90;
		System.out.println("5.-----------------");
		/*
		 * ClassCastException
		 */
		Object f = new First();
		if(f instanceof String) {
			String s = (String)f;
			System.out.println(s.charAt(0));
			
		}
		System.out.println("6.-----------------");
		
	}

}
