/*
 �迭Ÿ��:  
      - ��������Ÿ���� ���� ������(����)�������� ����Ÿ�� 
      - �迭������ ��������
           ����ŸŸ��[] �̸�; 
           int[] ia;
	  - ���: 
	       1.�迭��ü�ǻ���	
		   2.�迭��ü�� �ʱ�ȭ 
      -Ư¡   
		  1.��� �迭���� ������ ���������̴�.
		    (�迭�� ��ü��.)
		  2.����Ÿ�Ը� ���ǰ������ϴ� 
		  3.���̰� �����Ǿ��ִ�. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int pi;
		pi=34;
		
		int[] ia;//�⺻���迭
		//int ia[]; �̷������� ���⵵�� 
		ia = new int[5];
		ia[0]=1;
		ia[1]=2;
		ia[2]=3;
		ia[3]=4;
		ia[4]=5;
		System.out.println("===============================");
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		
		System.out.println("�迭��ü �����:"+ia.length);
		for (int i = 0; i < ia.length; i++) {
			ia[i]=i+1;
		}
		for (int i = 0; i < ia.length; i++) {
			System.out.println("ia[+"+i+"]-->"+ia[i]);			
		}
		System.out.println("==========�⺻��1�����迭===========");	
		int[] korArray = new int[10];
		korArray[0]=89;
		korArray[1]=98;
		korArray[2]=56;
		korArray[3]=78;
		korArray[4]=90;
		korArray[5]=71;
		korArray[6]=59;
		korArray[7]=52;
		korArray[8]=73;
		korArray[9]=79;
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot+=korArray[i];			
		}
		System.out.println(korTot);
		System.out.println("�� �������"+korTot/korArray.length);
		char[] ca= new char[6];
		ca[0]='H';
		ca[1]='e';
		ca[2]='l';
		ca[3]='l';
		ca[4]='o';
		ca[5]='!';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		String[] nameArray= new String[5];
		nameArray[0]="�����";
		nameArray[1]="�̹���";
		nameArray[2]="�ֹ���";
		nameArray[3]="�ڹ���";
		nameArray[4]="������";
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		
		System.out.println();
		System.out.println("==========�迭��ü�ʱ�ȭ{}===========");	
		int[] scoreArray= {90,45,67,63,99};
		char[] gradeArray= {'A','B','F','C','A'};
		boolean[] marriedArray= {true,false,true,false,false};
		String[] irumArray= {"KIM","LEE","PARK","CHOI","SIM"};
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.printf("%d %c %b %s %n", 
					scoreArray[i],
					gradeArray[i],
					marriedArray[i],
					irumArray[i]);
			
	
			 
		}
	}

}
