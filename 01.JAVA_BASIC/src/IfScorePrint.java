
public class IfScorePrint {
	public static void main(String[] args) {
		/*
		 * �л�2�� ����Ÿ�� ������������
		 */
		/*
		 * �л�2�� ����Ÿ�� ������������
		 */
		int no1;
		String name1;
		int kor1, eng1, math1;
		int tot1;
		double avg1;
		char grade1;
		int rank1;

		int no2;
		String name2;
		int kor2, eng2, math2;
		int tot2;
		double avg2;
		char grade2;
		int rank2;

		/*
		 * �л�2�� �⺻����Ÿ���� �й�,�̸�,����,����,����
		 */
		no1 = 1997;
		name1 = "������";
		kor1 = 100;
		eng1 = 100;
		math1 = 99;
		rank1 = ' ';

		no2 = 1989;
		name2 = "����";
		kor2 = 90;
		eng2 = 80;
		math2 = 99;
		rank2 = ' ';


		/*
		 * �л�2�� �⺻����Ÿ�� ����ؼ� ���� ��� ��������� ����
		 * 
		 */

		tot1 = kor1 + eng1 + math1;
		avg1 = ((int)((tot1 /3.0)*100+5)/10)/10.0;
		grade1= ' ';
		if (avg1>=90) {
			grade1= 'A';
		}else if (avg1>=80) { 
			grade1= 'B';			
		}else if (avg1>=70) { 
			grade1= 'C';			
		}else if (avg1>=60) { 
			grade1= 'D';			
		}else { 
			grade1= 'F';			
		}

		
		tot2 = kor2 + eng2 + math2;
		avg2 = ((int)((tot2 /3.0)*100+5)/10)/10.0;
		grade2= ' ';
		if (avg2>=90) {
			grade2= 'A';
		}else if (avg2>=80) { 
			grade2= 'B';			
		}else if (avg2>=70) { 
			grade2= 'C';			
		}else if (avg2>=60) { 
			grade2= 'D';			
		}else { 
			grade2= 'F';			
		}
		if (avg1>avg2) {
			rank1= 1;
			rank2= 2;
		} else {
			rank1=2;
			rank2=1;

		}
		
		/*
		 * - 100���� �Ѵ� ���� ������ �ԷµǸ� �޼����� ����ϼ��� 
		 * - ����� �Ҽ������� 1�ڸ��������� ����ϼ���(�ݿø�) - �������
		 * ---------------�л� �������------------------- 
		 * �й�  �̸�  ���� ����  ����  ���� ��� ���� ����
		 * ----------------------------------------------- 
		 *  1 	���ȣ  45 	 56    78   334  34.8  A    3 
		 *  2 	����  45	 56    78   334  34.8  A    2 
		 * -----------------------------------------------
		 */
		System.out.println("---------------�л� �������-------------------");
		System.out.println("�й�  �̸�   ���� ���� ���� ���� ��� ���� ����");
		System.out.println("-----------------------------------------------");
		System.out.println(no1 + " " + name1 + "  " + kor1 + "  " + eng1 + "   " + math1 + "  " + tot1 + "  " + avg1
				+ "  " + grade1+"    "+rank1);
		System.out.println(no2 + " " + name2 + "   " + kor2 + "   " + eng2 + "   " + math2 + "  " + tot2 + "  " + avg2
				+ "  " + grade2+"    "+rank2);
		System.out.println("-----------------------------------------------");

	}

}


