package com.itwill06.service.car;
public class CarServiceMain {
	public static void main(String[] args) {
		CarService carService=new CarService(10);
		System.out.println("0.CarService��ü�� ����ü���ڷ��ٲ� ����������");
		boolean isSuccess = carService.ipChar(new Car("2344",3 ));
		carService.ipChar(new Car("2344",3));
		carService.ipChar(new Car("7891",4 ));
		carService.ipChar(new Car("2341",8 ));
		carService.ipChar(new Car("4567",9 ));
		carService.ipChar(new Car("7791",10 ));
		carService.ipChar(new Car("7091",4 ));
		carService.ipChar(new Car("7491",9 ));
		carService.ipChar(new Car("7591",9 ));
		carService.ipChar(new Car("71291",8 ));
		carService.ipChar(new Car("7691",19 ));
		carService.ipChar(new Car("8691",20 ));
		carService.ipChar(new Car("1691",3 ));
		
//		boolean isSuccess = false;
//		String[] carNo = {"2344","4566", "4566","2341","4567","7891"};
// 		int[] carIntime = {3,4,9,8,9,10};
// 		
// 		for(int i = 0; i < carNo.length; i++ ) {
// 			isSuccess = carService.ipChar(new Car(carNo[i],carIntime[i]));
// 			if(!isSuccess) {
// 				System.out.println("����..");
// 			 			}
// 		}
 		
		
		
		
		System.out.println("1.CarService��ü�� ��ü�����������");
		carService.carPrint();
		System.out.println("2.CarService��ü�� ��ü������ȹ����ȯ����");
		System.out.println(carService.totJuChar());		
		System.out.println("3.CarService��ü�� ��������������ȹ����ȯ����");
		System.out.println(carService.juChar());		
		System.out.println("5.CarService��ü�� ������ȣ(4567��) ���ڷ��ٲ�  ����ü�Ѵ� ����������ȯ����");
		Car [] findcar=carService.findByCar("4567");
		for (int i = 0; i < findcar.length; i++) {
			System.out.println(findcar[i]);
		}
		System.out.println("6.CarService��ü�� �����ð�(8������) ���ڷ��ٲ� ����ü�迭 ����������ȯ����");
		Car [] findcar2= carService.findByNo(8);
		for (int i = 0; i < findcar2.length; i++) {
			System.out.println(findcar2[i]);
		}
		System.out.println("7.CarService��ü�� ������ȣ(7891��) �����ð�(12��)���ڷ��ٲ� ����������");
		carService.findCarChulcha("7891", 12);
	}

}