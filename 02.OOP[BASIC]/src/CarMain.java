
public class CarMain {

	public static void main(String[] args) {
		Car c1;
		//�����ڸ� ȣ���Ͽ� ����ü ���� �� �ּ� car1 ���� ������ ����
		c1= new Car();
		//�� ��ü�� no��������� "1234" ����	
		c1.no="1234";
		//�� ��ü�� inTime��������� 12 ����	
		c1.inTime=12;
		
		Car c2 =new Car();
		c2.no ="5678";
		c2.inTime=13;
		
		/*
		 * 2.14�ÿ� 1234,5678�� ���� ����
		 */
		c1.outTime=14;
		c2.outTime=14;
		/*
		 * 2-1.������� ���
		 */
		c1.fee= (c1.outTime-c1.inTime)*1000;
		c2.fee= (c2.outTime-c2.inTime)*1000;
		/*
		 * 2-2 ������ ���
		 */
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","������ȣ","�����ð�","�����ð�","�������");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",c1.no,c1.inTime,c1.outTime,c1.fee);
		System.out.printf("%7s %7d %9d %7d",c2.no,c2.inTime,c2.outTime,c2.fee);
		
				

	}

}
