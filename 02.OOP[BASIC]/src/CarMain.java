
public class CarMain {

	public static void main(String[] args) {
		Car c1;
		//생성자를 호출하여 차객체 생성 후 주소 car1 참조 변수에 대입
		c1= new Car();
		//차 객체의 no멤버변수에 "1234" 대입	
		c1.no="1234";
		//차 객체의 inTime멤버변수에 12 대입	
		c1.inTime=12;
		
		Car c2 =new Car();
		c2.no ="5678";
		c2.inTime=13;
		
		/*
		 * 2.14시에 1234,5678번 차량 출차
		 */
		c1.outTime=14;
		c2.outTime=14;
		/*
		 * 2-1.주차요금 계산
		 */
		c1.fee= (c1.outTime-c1.inTime)*1000;
		c2.fee= (c2.outTime-c2.inTime)*1000;
		/*
		 * 2-2 영수증 출력
		 */
		System.out.println("--------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("--------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",c1.no,c1.inTime,c1.outTime,c1.fee);
		System.out.printf("%7s %7d %9d %7d",c2.no,c2.inTime,c2.outTime,c2.fee);
		
				

	}

}
