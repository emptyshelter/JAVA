
public class IfNested {

	public static void main(String[] args) {
		int kor=56;
		/*
		 * 1. �Է� ����Ÿ ��ȿ�� üũ
		 */
		if(kor<0 || kor>100){
			System.out.println("������ 1~100������ �����Դϴ�.");
			/*
			 * �����帧 return
			 */
			return;
		}
		/*
		 * �������� A,B,C,D,F
		 */
		char grade= ' ';
		if (kor >= 90) {
			grade='A';
		}else {
			if(kor>=80) {
				grade='B';
			}else {
				if (kor>=70) {
					grade='C';
				} else {
					if (kor>=60) {
						grade='D';
					}else {
						grade='F';
					}

				}
				
			}
			
		}		
		System.out.println("1.������ "+grade+"�Դϴ�.");	
		if(kor>=90) {
			
		}else if(kor>=80) {
			grade ='B';
		}else if(kor>=70) {
			grade ='C';			
		}else if(kor>=60) {
			grade ='D';			
		}else if(kor>=60) {
			grade ='E';			
		}else {
			grade ='F';			
		}
		System.out.println("2.������"+grade+"�Դϴ�.");
			
		/*
		 * Quiz : ���������� �޼����� ����ϼ���
		 * 		A+(98���̻�): �ֿ��
		 * 		A			: ���
		 * 		B			: ����
		 * 		C			: ���̱�~	
		 * 		D			: �����
		 * 		F			: �Ф�
		 */					
		return;
	}	
			
}
