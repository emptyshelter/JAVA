import java.util.Scanner;

/*
		switch ��
		 - ����
		    switch(����){
		    	case ��_1:
		    	  stmt1;
		    	  break;
		    	case ��_2:
		    	  stmt2;
		    	  break;  
		        case ��_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(����)  �������� byte,short,int, char,String 
		              ���̿ü��ִ�.(long ���ȵ�)
*/
public class SwitchInputTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(1~7����������) --> ");
		int level = scanner.nextInt();	
				
		String msg="";
		
		switch (level) {
		case 1:
			msg="�ʺ�";
			break;
		case 2:
			msg="�߼�";
			break;
		case 3:
			msg="���";
			break;
		case 4:			
		case 5:
		case 6:
		case 7:		
			msg="�κδ�";
			break;

		default:
			msg="�������� 1~7������ ����";
			break;
		}
		System.out.println(msg);

	}

}
