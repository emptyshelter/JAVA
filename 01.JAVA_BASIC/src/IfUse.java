
public class IfUse {

	public static void main(String[] args) {
		/*
		 * ���� �Է� �޾Ƽ� ¦�� Ȧ�� �Ǻ�
		 */
		int inputNo =12;
		if(inputNo%2==0) {
			System.out.printf("%d �� ¦�� �Դϴ�.\n",inputNo);
			//%d ���� %f �Ǽ� %s ����
		}else {
			System.out.printf("%d �� Ȧ�� �Դϴ�.\n",inputNo);			
		}
		/*
		 * ���� �޾Ƽ� 4�� ��� �Ǻ�
		 */
		if (inputNo%4==0) {
			System.out.printf("%d �� 4�� ���\n", inputNo);
			
		} else {
			System.out.printf("%d �� 4�� ��� �ƴ�\n", inputNo);
		}
		/*
		 * �����
		 */
		if(inputNo%3==0 && inputNo%4==0) {
			System.out.println(inputNo+" �� 3�� ����̸鼭 4�ǹ��\n");
		}
		/*
		 * ������ ��ȿ��üũ
		 */
		int kor = -89;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d �� ��ȿ�� �����Դϴ�\n", kor);			
		}else {
			System.out.printf("%d �� ��ȿ�� ������ �ƴմϴ�\n", kor);						
		}
		/*
		 * ���⿩�����
		 */
		int year = 2019;
		if(true) {
			System.out.printf("%d�� ����\n", year);
		}else {
			System.out.printf("%d�� ���\n", year);			
		}
		/*
		 * Quiz: �����Ǵ�
		 * 	1. �ѱۿ���
		 * 	2. ���ĺ��빮��, �ҹ���, ����
		 */
		char c='��';
		/*
		 * Quiz: �������ڴ� ���̵��� ù�����Դϴ�
		 * 		 �̹��ڰ� ���̵��� ù���ڷ� ��ȿ���� �Ǵ� �� ����ϼ���
		 * 		 - ���̵��� ù���ڴ� ���ĺ��빮�� �̰ų� �ҹ����̴�
		 */
		char idFirstLetter='��';
		if(true) {
			System.out.println("���̵�� ����");
		}else {
			System.out.println("���̵�� ������");
		}

	}

}
