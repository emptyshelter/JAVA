
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		int pi=90;

		
		int[] ia=new int[5];
		ia[0]=90;
				
		Account acc1 = new Account(5432, "FIM", 44400, 1.2);//Account 참조타입
		
		Account[] accaArray=new Account[5]; //Account 배열타입(객체안의 멤버 변수,주소변수의 선언)
		
		accaArray[0]= new Account(1111, "KIM", 45000, 1.2);
		accaArray[1]= new Account(5644, "LIM", 52000, 4.4);
		accaArray[2]= new Account(2346, "MIN", 34000, 7.4);
		accaArray[3]= new Account(7183, "DIM", 61000, 2.4);
		accaArray[4]= new Account(7888, "OIM", 12000, 4.5);
		Account.headerPrint();
		for (int i = 0; i < accaArray.length; i++) {
			accaArray[i].print();
			
		}
		
	}
	
	

}


