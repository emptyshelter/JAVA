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
public class SwitchTest {

	public static void main(String[] args) {
		int level = 4
				; //1~7������ ����
		String msg="";//���ڿ��� ""����Ѵ� ������ �Է����� �ʾƵ� �����ϴ�
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
