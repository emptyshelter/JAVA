
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1.����
		 */
		Car c1=new Car();
		Car c2=new Car();
		c1.ipCha("1234", 12);
		c2.ipCha("4321", 12);
		
		/*
		 * 14�� ����
		 */

		c1.chulCah(19);
		c2.chulCah(21);
		c2.print();		
		
		/*
		 * Car c3= c2;
		 * c2=null;//�޸� �������� ���� 
		 */
		

	}

}
