
/*
�ݺ���
     stmt1;
     while(���ǹ�){
		 //���ǹ�--> ��������(����Ÿ),���� ����Ÿ�� ��ȯ�ϴ� ���� 
		stmt2;
	 }
	 stmt3;
     
	 �帧  stmt1 -->���ǽ��� ����Ÿ�� true�ε��Ƚ���--> stmt3

*/

public class WhileTest {

	public static void main(String[] args) {
		System.out.println("stmt1");
		System.out.println("1.================���� ���ͷ�=================");
		int k=0;
		while (true) {
			System.out.println("stmt2:k= "+k);
			k++;
			if(k>=10) {
				//�ݺ����� ��������				
				break;
			}
		}
		
		System.out.println("2.=================���� ����==================");
		boolean condition=true;
		int i=0;//While �ܺο� ���� �ݺ� ����
		while (condition) {
			System.out.println("stmt3:i= "+i);
			i++;
			if(i==10) {
				condition=false;
			}
		}
		System.out.println("3.==============�񱳿���(���ǽ�)================");
		int j =0;
		while (j < 10) {
			System.out.println("stmt4:j= "+j);
			j++;			
		}
		
		System.out.println("stmt99");
		

	}

}
