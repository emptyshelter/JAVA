/**
���
   1. if ��
       -���� : 
	      stmt0;
		  if(���ǹ� ){
		      //���ǹ� -->   ��������Ÿ�� ��ȯ�Ǵ� ���� 
			  //                   Ȥ�� �������
			  stmt1;
		   }else{
		      stmt2;
		   }
		   stmt3;

		   ���ǵ���Ÿ�� true�ΰ��  stmt0-->stmt1-->stmt3;
		   ���ǵ���Ÿ�� false�ΰ��  stmt0-->stmt2-->stmt3;
 */
public class IfTest {

	public static void main(String[] args) {
		System.out.println("stmt0");
		if(true) {
			System.out.println("stmt1-1");
		}else {
			System.out.println("stmt1-2");
			
		}
		boolean condition = false;
		if(condition) {
			System.out.println("stmt2-1");
		}else {	
			System.out.println("stnt2-2");

	}
		int x=21;
		int y=30;
		if(x > y){
			System.out.println("stmt3-1: 21 > 30:");			
		}else {
			System.out.println("stmt3-2: 21 > 30");
		}
		if( x< y) {
			System.out.println("stmt4: 21 < 30");			
		}
		if(x!=y) {
			System.out.println("stmt6: x!=y");
		}
		if(x > 20)  
		System.out.println("stmt7-1: x > 20");
		//System.out.println("stmt7-2: x > 20");
		else  
		System.out.println("stmt7-2: x >20");
		System.out.println("stmt8: if��������(�׻����)");
		/*
		 * �鿩���� ����Ű 
		 	ctrl + shift +f 
		 */
		if(y>20)
			System.out.println("stmt9: y >20");
		System.out.println("");
		
		System.out.println("======�ڿ������� ����======");
		int a=90;
		if(true) {
			int b=80;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
		System.out.println("a="+a);
//		System.out.println("b="+b);
		System.out.println("stmt99");
		return;
//	    System.out.println("after return"); Unrechable Code
  }
}
