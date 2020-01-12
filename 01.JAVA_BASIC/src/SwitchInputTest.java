import java.util.Scanner;

/*
		switch 문
		 - 형식
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(변수)  변수값은 byte,short,int, char,String 
		              값이올수있다.(long 은안됨)
*/
public class SwitchInputTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("레벨을 입력하세요(1~7사이의정수) --> ");
		int level = scanner.nextInt();	
				
		String msg="";
		
		switch (level) {
		case 1:
			msg="초보";
			break;
		case 2:
			msg="중수";
			break;
		case 3:
			msg="고수";
			break;
		case 4:			
		case 5:
		case 6:
		case 7:		
			msg="싸부님";
			break;

		default:
			msg="레벨값은 1~7사이의 정수";
			break;
		}
		System.out.println(msg);

	}

}
