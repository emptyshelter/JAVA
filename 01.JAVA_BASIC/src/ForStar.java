import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		Scanner msg = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int num= msg.nextInt();
		
		
		/*
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		*/
		for (int i= 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("��");
			}
			System.out.println();
		}
		System.out.println("====================");
	
		/*
		�١ڡڡڡ�
		�ڡ١ڡڡ�
		�ڡڡ١ڡ�
		�ڡڡڡ١�
		�ڡڡڡڡ�
		*/
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i==j)
				System.out.print("��");
				else
					System.out.print('��');
			}
			System.out.println();
				
			
		}
		System.out.println("====================");
		
		/*
		��
		�ڡ�
		�ڡڡ�
		�ڡڡڡ�
		�ڡڡڡڡ�
		*/
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(j<i)
					System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("====================");
		/*
		�ڡڡڡڡ�
		�ڡڡڡ�
		�ڡڡ�
		�ڡ�
		��
		*/
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i<j)
					System.out.print("��");
			}
			System.out.println();
		}	
		/*
		�ڡڡڡڡ�
		  �ڡڡڡ�
		    �ڡڡ�
		      �ڡ�
		        ��
		 */
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (i<j)
					System.out.print("��");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (i<j)
					System.out.print("��");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
