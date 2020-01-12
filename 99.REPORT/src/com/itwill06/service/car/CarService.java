package com.itwill06.service.car;


public class CarService {
	private Car[] carArray;
	
	public CarService() {
		carArray=new Car[30];
	}
	public CarService(int count) {
		carArray=new Car[count];
	}
	/*
	0. 차 객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	public boolean ipChar(Car inCar) {
		boolean isSuccess=false;
		for (int i = 0; i < carArray.length; i++) {
			if (i==carArray.length-1 && 
				carArray[i]!=null) {
				System.out.println("만차입니다.");
				return isSuccess;
			}else if (carArray[i] != null&&
				inCar.getNo().equals(carArray[i].getNo())){
				System.out.println(inCar.getNo()+"차량은 이미 입차되어있습니다.");
				break;
			}else if (carArray[i] == null) {
				carArray[i]=inCar;
				isSuccess=true;
				carArray[i].print();
				System.out.println(inCar.getNo()+" 번 차량 입차완료");
				break;
			}
		}	
		return isSuccess;
	}
	/*
	1. 전체차량출력
	*/
	public void carPrint() {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null) {
				carArray[i].print();			
			}
		}
	}
	/*
	1-1 전체차량반환
	*/
	public Car[] carReturn() {
		return carArray;
	}
	/*
	2. 주차구획수반환
	*/
	public int totJuChar() {
		return carArray.length;
	}
	/*
	3. 주차가능주차구획수반환
	*/
	public int juChar() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				count++;				
			}else {
				break;
			}
		}
		return carArray.length-count;
	}				
	/*
	 *4. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car []findByCar(String no) {
		Car [] findCar = null;
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!= null && carArray[i].getNo() == no) {
				count++;
			}
		}
		findCar= new Car[count];
		count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!= null && carArray[i].getNo() == no) {
				findCar[count++]=carArray[i];
				carArray[i].print();
			}
		}
		return findCar;
	}
	/*
	 *5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환 
	 */
	public Car [] findByNo(int inTime) {
		Car [] findCar = null;
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getInTime() >=inTime ) {
				count++;
			}
		}
		findCar= new Car[count];
		count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getInTime() >=inTime ){
				findCar[count++]=carArray[i];
				carArray[i].print();
			}
		}
		return findCar;
	}
	/*
	6. 차량번호(7891번),출차시간(12시)인자로 받아서 출차");
	*/
	public Car findCarChulcha(String no, int outTime) {
		Car findCar = null;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo()==no){					
					carArray[i].chulCha(outTime);
					carArray[i].print();
					carArray[i]= null;
			}
		}
		return findCar;
	}
}
