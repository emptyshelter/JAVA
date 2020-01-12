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
	0. �� ��ü���ڷι޾Ƽ� ������ �������п��ι�ȯ
	     - �������� �����̸� ��������
	     - ������ȣ�ߺ�üũ
	*/
	public boolean ipChar(Car inCar) {
		boolean isSuccess=false;
		for (int i = 0; i < carArray.length; i++) {
			if (i==carArray.length-1 && 
				carArray[i]!=null) {
				System.out.println("�����Դϴ�.");
				return isSuccess;
			}else if (carArray[i] != null&&
				inCar.getNo().equals(carArray[i].getNo())){
				System.out.println(inCar.getNo()+"������ �̹� �����Ǿ��ֽ��ϴ�.");
				break;
			}else if (carArray[i] == null) {
				carArray[i]=inCar;
				isSuccess=true;
				carArray[i].print();
				System.out.println(inCar.getNo()+" �� ���� �����Ϸ�");
				break;
			}
		}	
		return isSuccess;
	}
	/*
	1. ��ü�������
	*/
	public void carPrint() {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null) {
				carArray[i].print();			
			}
		}
	}
	/*
	1-1 ��ü������ȯ
	*/
	public Car[] carReturn() {
		return carArray;
	}
	/*
	2. ������ȹ����ȯ
	*/
	public int totJuChar() {
		return carArray.length;
	}
	/*
	3. ��������������ȹ����ȯ
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
	 *4. ������ȣ(4567��) ���ڹ޾Ƽ� ����ü�Ѵ� ����������ȯ
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
	 *5. �����ð�(8������)���ڹ޾Ƽ� ����ü�迭 ����������ȯ 
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
	6. ������ȣ(7891��),�����ð�(12��)���ڷ� �޾Ƽ� ����");
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
