
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 1~10������ ���� ���
		 */
		int i = 0;
		while (i < 10) {
			int su = i + 1;
			System.out.println(su);
			i++;

		}
		System.out.println();

		/*
		 * 1~10������ ������ Ȧ���� ���
		 */
		i = 0;
		while (i < 10) {
			int su = i + 1;
			if (su % 2 == 1) {
				System.out.print(su + ",");

			}
			i++;
		}
		System.out.println();

		/*
		 * 1~10�����߿��� 4�� ����� ���
		 */
		i = 0;
		while (i < 10) {
			int su = i + 1;
			if (su % 4 == 0) {
				System.out.print(su + ",");
			}
			i++;

		}
		System.out.println();
		/*
		 * 1~100������ �����߿��� 3�ǹ���̸鼭 4�� ����� ���
		 */
		i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + ",");
			}
			i++;
		}
		System.out.println();
		/*
		 * 1~100������ ������ ��
		 */
		i = 1;
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		while (i<= 100) {			
			tot += i;
			if (i % 2 == 0) {
				evenTot += i;
			} else {
				oddTot += i;
			}
			i++;
		}
		System.out.println("1~100������ ������ ��: " + tot);
		System.out.println("1~100������ ¦���� ��: " + evenTot);
		System.out.println("1~100������ Ȧ���� ��: " + oddTot);
	    
		/*
		 * �������
		 */
		char c1=0;
		while(c1< 655535) {
			System.out.print(c1);
			if ((c1+1)%100==0) {
				System.out.println();
			}
			c1++;
		}
		System.out.println();
		char c2='��';
		int count=0;
		while (c2<='�R') {
			System.out.print(c2);
			count++;
			if(count%10==0) {
				System.out.print("\n");											
			}
			c2++;
			
		}
		
	}
	
}

	

