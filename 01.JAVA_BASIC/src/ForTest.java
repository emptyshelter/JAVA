/*
	for��
	     -����:
	       	       
	       for(1;2;3){
	       	//1.�ݺ�����(����,�ʱ�ȭ����)
	       	//2.�ݺ������� ���ǰ˻�(��������Ÿ)
	       	//3.�ݺ�������,��(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>���ѷ���
	       for(;;){
	       	
	       }
	
*/
public class ForTest {

	public static void main(String[] args) {
		System.out.println("============while i����=============");
		int k =0;
		while (k<10) {
			System.out.println("k="+k);
			k++;
		}
		System.out.println("============for i����=============");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}
		System.out.println("============for i����=============");
		for (int i = 10; i > 0; i--) {
			System.out.println("i="+i);
		}
		System.out.println("============Ȧ�����[1~10]=============");
		for (int i = 0; i <= 10; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}					
		}
		System.out.println("============Ȧ�����[1~10]cotinue=============");
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				continue;
				/*
				 * continue�� ������ �ڵ带 �������� �ʰ� ���� �ݺ��� ����
				 */
			}
			System.out.println(i+" ");
		}	
		System.out.println();
		System.out.println("============¦�����[1~10]=============");
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}			
		}
		System.out.println();
		System.out.println("============3,4�� �ּҰ����[break]=============");
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");				
				/*
				 * �ݺ����� ��������
				 */
				break;
			}	
		}
		System.out.println();
		System.out.println("Ȧ�� ¦�� ��[1~100]");
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		for (int i = 0; i <= 100; i++) {
			if (i%2==0) {
				evenTot+=i;
			} else {
				oddTot+=i;
			}
			tot+=i;
		}
		System.out.println("��ü��:"+tot);
		System.out.println("Ȧ����:"+oddTot);
		System.out.println("¦����:"+evenTot);
		System.out.println("============�������============");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c=='z') continue;
			System.out.print(",");										
		}
		System.out.println();
		System.out.println("============�������[continue]===========");
		for (int c = 'a', count=0; c <= 'z'; c++) 
			// ���� ���������� ���� Ÿ���ϰ�� �����ϴ�.		
		{
			System.out.print((char)c);			
			if (c=='z')
				continue;
			System.out.print(",");
			count++;
			if(count%4==0)
				System.out.println();
			
			
		}

	}

}
